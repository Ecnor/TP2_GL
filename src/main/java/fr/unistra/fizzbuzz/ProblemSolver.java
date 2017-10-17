package fr.unistra.fizzbuzz;

public class ProblemSolver {
	
	private Int2String converter;
	private Displayer printer;
	
	public ProblemSolver(Int2String conv, Displayer print) {
		this.converter = conv;
		this.printer = print;
	}
	
	public void solve(int max) {
		for(int i = 1; i <= max; i++) {
			printer.display(converter.convert(i));
		}
	}
}
