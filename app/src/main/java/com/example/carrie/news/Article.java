package com.example.carrie.news;

import java.io.Serializable;

public class Article implements Serializable {
    String author, title, description, url, urlToImage, publishedAt;

    public Article() {

    }

    @Override
    public String toString() {
        return "Article{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}