package com.lunacian.materialmedemo;

public class Sport {
    // Member variables representing the title and information about the sport.
    private String title;
    private String info;
    private final int imageResource;

    Sport(String title, String info, int imageResource) {
        this.title = title;
        this.info = info;
        this.imageResource = imageResource;
    }
    /** Gets the title of the sport.
     * @return The title of the sport.    */
    String getTitle() {
        return title;
    }

    /**Gets the info about the sport.
     * @return The info about the sport.  */
    String getInfo() {
        return info;
    }

    public int getImageResource(){
        return imageResource;
    }
}





