package io.spring.ouathbasic;

public class Meetup {

	private String speaker;
	private String title;
	public String getSpeaker() {
		return speaker;
	}
	public void setSpeaker(String speaker) {
		this.speaker = speaker;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Meetup [speaker=" + speaker + ", title=" + title + "]";
	}
	public Meetup(String title, String speaker) {
		super();
		this.speaker = speaker;
		this.title = title;
	}
	public Meetup() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
