package p9_2;

import p9_1.Measurable;

public class Quiz implements Measurable
{
	private String letterGrade;
	private Integer score;
	public Quiz(String letterGrade, Integer score)
	{
		this.score = score;
		this.letterGrade = letterGrade;
	}
	
	public Integer getScore()
	{
		return score;
	}
}
