package main.java.ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors {
	public Scissors vs(Paper paper) {return this;}
	public Rock vs(Rock rock) {return rock;}
	public Scissors vs(Scissors scissors) {return scissors;}
}
