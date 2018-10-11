package com.example.carrie.news;

import java.io.Serializable;
import java.util.ArrayList;

public class Source implements Serializable {
    String id, name, description, url, category, language, country;
    UrlsToLogos urlsToLogos;
    ArrayList<String> sortBysAvailable;

    @Override
    public String toString() {
        return "Source{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Source() {

    }
}