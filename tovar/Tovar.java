package tovar;

public abstract class Tovar {
	
	public String vrsta;
	public double tezina;
	
	
	
	
	public String getVrsta() {
		return vrsta;
	}


	public void setTezina(double tezina) {
		this.tezina = tezina;
	}
	
	public double getTezina() {
		return tezina;
	}

	@Override
	public String toString() {
		return "Tovar [vrsta=" + vrsta + ", tezina=" + tezina + "]";
	}
	
}
