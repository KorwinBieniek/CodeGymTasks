package com.codegym.task.task31.task3110;

import com.codegym.task.task31.task3110.command.ExitCommand;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.file.Paths;

public class Archiver {

    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the full path to the archive file:");
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(bis.readLine()));

        System.out.println("Enter the full file name for archiving:");
        zipFileManager.createZip(Paths.get(bis.readLine()));

        new ExitCommand().execute();
    }
}
