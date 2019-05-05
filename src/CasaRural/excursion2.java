package CasaRural;

public class excursion2 extends importe{

	public excursion2(casaRural casaRural) {
		super.casaRural = casaRural;
	}
	
	public String getNombre() {
		return casaRural.getNombre() + " + excursión 2";
	}
	
	public double getCoste() {
		return 50 + casaRural.getCoste();
	}

}