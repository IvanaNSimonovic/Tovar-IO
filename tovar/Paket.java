package tovar;

import java.util.LinkedList;

public class Paket extends Tovar{
	
	private LinkedList<Predmet> paket;

	
	public Paket() {
		LinkedList<Predmet> p = new LinkedList<>();
		this.paket=p;
	}
	
	
	public void dodaj(Predmet p) {
		this.paket.add(p);
	}
}
