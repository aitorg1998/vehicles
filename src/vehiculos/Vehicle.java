package vehiculos;

public class Vehicle {
	private static int VELOCIDAD_MAXIMA = 120;
	public int cilindrada, puertas, velocidad_actual,marxes=5, marxaActual;

	
	public Vehicle() {

		this.velocidad_actual = 0;
		this.marxaActual=0;
	}


	public void Accelerar(){
		
		velocidad_actual=velocidad_actual+10;
	}
	public void accelerar(){
		
		if (velocidad_actual <=VELOCIDAD_MAXIMA){
			velocidad_actual=velocidad_actual+10;
		}
		
	}
	public void Desaccelerar(){
		
		if (velocidad_actual > 0){
			velocidad_actual = velocidad_actual-10;
		}
	}
	public void pujaMarxa(){
		if (marxaActual<5){
			marxaActual++;
		}
	}
	public void baixaMarxa(){
		if (marxaActual>0){
			marxaActual--;
		}
	}
}

