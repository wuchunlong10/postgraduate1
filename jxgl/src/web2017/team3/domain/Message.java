package web2017.team3.domain;

public class Message {

	private int messageid;
	private String title;
	private String context;
	private String lefttime;
	private String wholeft;
	 private String reply;


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

	@Override
	public String toString() {
		return "Message [messageid=" + messageid + ", title=" + title
				+ ", context=" + context + ", lefttime=" + lefttime
				+ ", wholeft=" + wholeft + "]";
	}

	public String getReply() {
		return reply;
	}

	public void setReply(String reply) {
		this.reply = reply;
	}

}
