package br.cefet.aps.bnf;

public class Constant extends Term{
	private final double constant;
	
	public Constant(double constant){
		super();
		this.constant = constant;
	}
	
	@Override
	public double calculate() {
		return constant;
	}
	

}
