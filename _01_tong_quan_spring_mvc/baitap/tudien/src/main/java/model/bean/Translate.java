package model.bean;

public class Translate {
    private String vietnam;
    private String english;

    public Translate(){

    }

    public Translate(String vietnam, String english) {
        this.vietnam = vietnam;
        this.english = english;
    }

    public String getVietnam() {
        return vietnam;
    }

    public void setVietnam(String vietnam) {
        this.vietnam = vietnam;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }
}
