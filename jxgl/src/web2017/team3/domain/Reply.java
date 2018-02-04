package web2017.team3.domain;

public class Reply {
	
	private String context;
	private int messageid;

	public int getMessageid() {
		return messageid;
	}

	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "reply [messageid=" + messageid + ", context=" + context + "]";
	}
}
