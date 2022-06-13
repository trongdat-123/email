package com.example.email;

import android.view.View;
import android.widget.ImageView;

public class ItemModel {
    private String caption;
    private String time;
    private String content;


    public ItemModel( String caption, String time, String content) {
        this.caption = caption;
        this.time = time;
        this.content = content;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
