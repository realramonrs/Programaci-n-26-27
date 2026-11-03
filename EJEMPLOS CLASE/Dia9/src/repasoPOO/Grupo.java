package repasoPOO;

public class Grupo {

	private String nombre;
	private int tiempoActuacion;
	private int popularidad;
	private float coste;
	
	
	
	public Grupo() {
		super(); //Llamada al constructor de la clase base (Object)
		// Piensa en Java -> Bruce Eckel
		// Head first Java -> 
	}
	
	public Grupo(String nombre, int tiempoActuacion, int popularidad, float coste) {
		super();
		this.nombre = nombre;
		setPopularidad(popularidad);
		this.tiempoActuacion = tiempoActuacion;
		this.coste = coste;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempoActuacion() {
		return tiempoActuacion;
	}

	public void setTiempoActuacion(int tiempoActuacion) {
		this.tiempoActuacion = tiempoActuacion;
	}

	public int getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(int popularidad) {
		
		if(popularidad>=1 && popularidad <=10) {
				this.popularidad = popularidad;
		}
		else
			this.popularidad = 0;
	}

	public float getCoste() {
		return coste;
	}

	public void setCoste(float coste) {
		this.coste = coste;
	}
	
	public float calcularCosteFinal() {
		float costeFinal = this.coste + (this.coste*this.popularidad)/100f;
		return costeFinal;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String mensaje = "";
		mensaje+="Nombre: " + this.nombre + "\n";
		mensaje+="Tiempo actuación: " + this.tiempoActuacion + "\n";
		mensaje+="Popularidad: " + this.popularidad + "\n";
		mensaje+="Coste: " + this.coste + "\n";
		mensaje+="Coste Final: " + calcularCosteFinal() + "\n";
		
		return mensaje;
	}
	
	
}
