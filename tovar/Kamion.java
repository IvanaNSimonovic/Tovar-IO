package tovar;

import java.util.LinkedList;

public class Kamion {
	
	private String regBr;
	private LinkedList<Tovar> tovar;
	private double nosivost;
	private double teret;
	
	
	public Kamion (String s, double d) {
		regBr=s;
		nosivost=d;
		tovar= new LinkedList<Tovar>();
		teret=0;
	}
	
	public boolean stavi(Tovar t) {
		if(this.teret>=nosivost) return false;
		tovar.add(t);
		this.teret+=t.getTezina();
		return true;
	}
	
	public boolean skini() {
		if(tovar.size()==0) return false;
		else this.tovar.remove();
		return true;
	}

	@Override
	public String toString() {
		return "Kamion [regBr=" + regBr + ", tovar=" + tovar + ", nosivost=" + nosivost + ", teret=" + teret + "]";
	}
	
	

}






