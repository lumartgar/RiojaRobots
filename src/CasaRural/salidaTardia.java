package CasaRural;

public class salidaTardia extends importe{

	public salidaTardia(casaRural casaRural) {
		super.casaRural = casaRural;
	}
	
	public String getNombre() {
		return casaRural.getNombre() + " + salidaTardia";
	}
	
	public double getCoste() {
		return 100 + casaRural.getCoste();
	}

}
