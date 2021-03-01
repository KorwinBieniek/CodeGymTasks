package com.codegym.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
    private static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {
        if (args == null || args.length < 1)
            throw new RuntimeException();

        Date birthdayDate;
        Person person;
        switch (args[0]) {
            case "-c":
                birthdayDate = simpleDateFormat.parse(args[3]);

                if (args[2].equals("m")) {
                    allPeople.add(Person.createMale(args[1], birthdayDate));
                } else {
                    allPeople.add(Person.createFemale(args[1], birthdayDate));
                }

                System.out.println(allPeople.size() - 1);
                break;

            case "-u":
                person = allPeople.get(Integer.parseInt(args[1]));
                person.setName(args[2]);
                person.setSex(getSex(args[3]));
                person.setBirthDate(simpleDateFormat.parse(args[4]));
                break;
            case "-d":
                int id1 = Integer.parseInt(args[1]);
                allPeople.get(id1).setName(null);
                allPeople.get(id1).setSex(null);
                allPeople.get(id1).setBirthDate(null);
                break;
            case "-i":
                int id2 = Integer.parseInt(args[1]);
                System.out.print(allPeople.get(id2).getName() + " " + (allPeople.get(id2).getSex() == Sex.MALE ? "m" : "f") + " " + simpleDateFormat2.format(allPeople.get(id2).getBirthDate()));
                break;
        }
    }

    public static Sex getSex(String sexParam) {
        return sexParam.equals("m") ? Sex.MALE : Sex.FEMALE;
    }
}
