
public class AdapterUSToRio implements RiojaRobotsInterface {
	
	USRobotsInterface USRobot;
	
	public AdapterUSToRio(USRobotsInterface USRobot) {
		this.USRobot= USRobot;
	}

	@Override
	public double velocidadActualEnKmh() {
		double km = USRobot.currentSpeedInMilesPerHour() * 1.6;
		System.out.println(km);
		return km;
	}

	@Override
	public void salta(double distancia) {
		USRobot.jump(distancia*0.3);
	}
	

}
