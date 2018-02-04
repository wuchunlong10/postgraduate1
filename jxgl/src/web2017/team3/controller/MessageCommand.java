package web2017.team3.controller;

public class MessageCommand {

	private int messageid;
    private String title;
    private String context;
    private String lefttime;
    private String wholeft;
    public String getWholeft() {
        return wholeft;
    }
    public void setWholeft(String wholeft) {
        this.wholeft = wholeft;
    }
    public int getMessageid() {
        return messageid;
    }
    public void setMessageid(int messageid) {
        this.messageid = messageid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContext() {
        return context;
    }
    public void setContext(String context) {
        this.context = context;
    }
    public String getLefttime() {
        return lefttime;
    }
    public void setLefttime(String lefttime) {
        this.lefttime = lefttime;
    }

}
