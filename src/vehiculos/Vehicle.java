package vehiculos;

public class Vehicle {
	private static int VELOCIDAD_MAXIMA = 120;
	public int cilindrada, puertas, velocidad_actual;
	public void Accelerar(){
		
		velocidad_actual=velocidad_actual+10;
	}
}
