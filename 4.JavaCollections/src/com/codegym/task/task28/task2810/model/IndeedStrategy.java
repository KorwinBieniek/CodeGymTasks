package com.codegym.task.task28.task2810.model;

import com.codegym.task.task28.task2810.vo.JobPosting;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IndeedStrategy implements Strategy {

    private static final String URL_FORMAT = "https://www.indeed.com/jobs?q=java+%s&start=%d";

    @Override
    public List<JobPosting> getJobPostings(String searchString) {
        List<JobPosting> allVacancies = new ArrayList<>();

        int page = 0;
        try {
            do {
                Document doc = getDocument(searchString, page);

                Elements vacanciesHtmlList = doc.getElementsByAttributeValue("data-tn-component", "organicJob");

                if (vacanciesHtmlList.isEmpty()) break;

                for (Element element : vacanciesHtmlList) {
                    Elements title = element.getElementsByTag("a");
                    Elements locations = element.getElementsByClass("location");
                    Elements companyName = element.getElementsByClass("company");

                    JobPosting vacancy = new JobPosting();
                    vacancy.setWebsiteName("indeed.com");
                    vacancy.setTitle(title.get(0).attr("title"));
                    vacancy.setUrl(title.get(0).attr("href"));
                    vacancy.setCity(locations.size() > 0 ? locations.get(0).text() : "");
                    vacancy.setCompanyName(companyName.get(0).text());

                    allVacancies.add(vacancy);
                }

                page+=10;
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return  allVacancies;
    }

    protected Document getDocument(String searchString, int start) throws IOException {
        return Jsoup.connect(String.format(URL_FORMAT, searchString, start))
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36")
                .get();
    }
}
