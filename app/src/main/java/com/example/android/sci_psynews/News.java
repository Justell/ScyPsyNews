package com.example.android.sci_psynews;

public class News {

    private String mTitle;
    private String mTime;
    private String mUrl;

    public News(String title, String time, String url) {
        mTitle = title;
        mTime = time;
        mUrl = url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getTime() {
        return mTime;
    }

    public String getUrl() {
        return mUrl;
    }
}
