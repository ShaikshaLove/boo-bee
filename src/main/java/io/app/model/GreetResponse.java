package io.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class GreetResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int greetId;

	private String answers;

	public int getGreetId() {
		return greetId;
	}

	public void setGreetId(int greetId) {
		this.greetId = greetId;
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public GreetResponse(int greetId, String answers) {
		super();
		this.greetId = greetId;
		this.answers = answers;
	}

	public GreetResponse() {
		super();
	}

	@Override
	public String toString() {
		return "GreetResponse [greetId=" + greetId + ", answers=" + answers + "]";
	}
}
