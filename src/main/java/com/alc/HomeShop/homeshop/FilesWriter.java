package com.alc.HomeShop.homeshop;

import com.alc.HomeShop.homeshop.Writer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesWriter implements Writer {

    private String filename;
    private Path path;
    private String Content;

    public FilesWriter(String filename) {
        this.filename = filename;
    }




    @Override
    public void start() {
        path = Paths.get(filename);
        Content = "";
    }

    @Override
    public void writeLine(String line) {

        Content += line + "%n";



    }

    @Override
    public void stop() {

        try {
            Files.write(path,String.format(Content).getBytes());
        } catch (IOException e) {
            System.out.println("imposible de régiger cette facture.");
        }

    }
}
