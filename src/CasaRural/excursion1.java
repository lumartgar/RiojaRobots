package CasaRural;

public class excursion1 extends importe {

	public excursion1(casaRural casaRural) {
		super.casaRural = casaRural;
	}
	
	public String getNombre() {
		return casaRural.getNombre() + " + excursión 1";
	}
	
	public double getCoste() {
		return 25 + casaRural.getCoste();
	}

}
