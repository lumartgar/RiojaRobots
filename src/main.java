
public class main {

	static double distancia = 5;
	static double velocidad = 100;

	static void testRioja(RiojaRobotsInterface Rioja) {
		Rioja.velocidadActualEnKmh();
		Rioja.salta(distancia);
	}

	public static void main(String[] args) {

		USRobotsInterface USR = new UnUSRobot(velocidad);
		RiojaRobotsInterface adapter = new AdapterUSToRio(USR);

		System.out.println("El robot US dice...");

		System.out.println(USR.currentSpeedInMilesPerHour());
		//USR.spin(angle);
		USR.jump(distancia);

		System.out.println("\nEl Adapter Rioja dice...");

		testRioja(adapter);

	}

}
