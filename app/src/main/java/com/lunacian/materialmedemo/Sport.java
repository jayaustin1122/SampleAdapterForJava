package com.lunacian.materialmedemo;
public class Sport {
    // Member variables representing the title and information about the sport.
    private String title;
    private String info;
    private String details;
    private final int imageResource;
    Sport(String title, String info, String details, int imageResource) {
        this.title = title;
        this.info = info;
        this.details = details;
        this.imageResource = imageResource;
    }
    String getTitle() {
        return title;
    }
    String getDetails() {
        return details;
    }
    String getInfo() {
        return info;
    }
    public int getImageResource(){
        return imageResource;
    }
}





