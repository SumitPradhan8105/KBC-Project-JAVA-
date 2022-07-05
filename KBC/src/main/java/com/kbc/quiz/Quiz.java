package com.kbc.quiz;

public class Quiz {
	private int id;
	private String qno;
	public Quiz(int id, String qno, String question, String option1, String option2, String option3, String option4,
			String answer, int prize) {
		super();
		this.id = id;
		this.qno = qno;
		Question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.prize = prize;
	}

	public String getQno() {
		return qno;
	}

	public void setQno(String qno) {
		this.qno = qno;
	}

	private String Question;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String answer;
	private int prize;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getQuestion() {
		return Question;
	}
	
	public void setQuestion(String question) {
		Question = question;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}

	public Quiz(int id, String question, String option1, String option2, String option3, String option4, String answer,
			int prize) {
		super();
		this.id = id;
		Question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.prize = prize;
	}

	
	
}
