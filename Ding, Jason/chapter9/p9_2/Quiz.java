package p9_2;

import p9_1.Measurable;

public class Quiz implements Measurable
{
	private String letterGrade;
	private double score;
	public Quiz(String letterGrade, Integer score)
	{
		this.score = score;
		this.letterGrade = letterGrade;
	}
	
	public double getMeasure()
	{
		return score;
	}
	
	public String toString()
	{
		return letterGrade + ": " + score;
	}
}
