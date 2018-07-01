package com.example.android.sci_psynews;

public class News {

    private String mTitle;
    private String mAuthor;
    private String mTime;
    private String mUrl;

    public News(String title, String author, String time, String url) {
        mTitle = title;
        mAuthor = author;
        mTime = time;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getTime() {
        return mTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
