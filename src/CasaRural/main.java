package CasaRural;

public class main {

	public static void main(String[] args) {
		casaRural casaRural = new alojamiento();
		 
		System.out.println("La casa rural " + casaRural.getNombre() + " tiene un coste de " + casaRural.getCoste());
		
		casaRural = new excursion1(casaRural);
		//casaRural = new excursion2(casaRural);
		casaRural = new salidaTardia(casaRural);
		
		System.out.println("\nLa casa rural " + casaRural.getNombre() + " y tiene un coste de " + casaRural.getCoste());
	}
}
