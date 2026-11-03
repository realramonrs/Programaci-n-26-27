package repasoPOO;

public class Festival {

	private String nombre;
	private int duracion;
	private float costeTotal;
	private Grupo[] gs;
	
	public Festival(String nombre) {
		this.nombre = nombre;
		gs = new Grupo[10];
	}
	
	public Festival(String nombre,int numeroGrupos) {
		this.nombre = nombre;
		gs = new Grupo[numeroGrupos];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public float getCosteTotal() {
		return costeTotal;
	}
	
	public void addGrupo(Grupo g) {
		
		for(int i = 0;i<this.gs.length;i++) {
			if(gs[i]==null) {
				gs[i] = g;
				//Actualizar la duración del festival
				this.setDuracion();
				//Actualizar el coste
				this.setCosteTotal();
				break;
			}
		}
	}

	private void setDuracion() {
		for(Grupo g : gs) {
			if(g!=null) {
				this.duracion+=g.getTiempoActuacion();
			}
			else {
				break;
			}
		}
	}

	private void setCosteTotal() {
		for(Grupo g : gs) {
			if(g!=null) {
				this.costeTotal+=g.getCoste();
			}
			else {
				break;
			}
		}
	}
	
	public Grupo dameGrupo(int pos) {
		if(pos>=0 && pos <this.gs.length) {
			return gs[pos];
		}
		return null;
		
	}
	
	public Grupo dameGrupo(String nombre) {
		for(Grupo g : gs) {
			if(g!=null) {
				if(g.getNombre().equals(nombre)) {
					return g;
				}
			}
		}
		
		return null;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		String mensaje ="";
		for(Grupo g : gs) {
			
			if(g!=null) {
				mensaje += "*************************\n";
				mensaje+= this.nombre;
				mensaje+= " " + g.getNombre() + "\n\n";
				mensaje+="*************************\n";
				mensaje+= g.toString() + "\n";
			}
		}
		
		mensaje+="Duracion " + this.duracion + "\n";
		mensaje+="Coste total " + this.costeTotal;
		return mensaje;
	}
	
	
	
	
	
	
}
