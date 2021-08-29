package mail.model.bean;

public class Mail {
    private String[] language;
    private int[]size;
    private String spamFillter;
    private String signature;

    public Mail(){

    }

    public Mail(String[] language, int[] size, String spamFillter, String signature) {
        this.language = language;
        this.size = size;
        this.spamFillter = spamFillter;
        this.signature = signature;
    }

    public String[] getLanguage() {
        return language;
    }

    public void setLanguage(String[] language) {
        this.language = language;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }

    public String getSpamFillter() {
        return spamFillter;
    }

    public void setSpamFillter(String spamFillter) {
        this.spamFillter = spamFillter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
