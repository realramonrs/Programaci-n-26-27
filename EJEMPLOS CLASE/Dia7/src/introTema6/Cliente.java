package introTema6;

public class Cliente {

	private String dni;
	private String nombre;
	private String email;
	private String telefono;
	
	
	//Constructores
	
	public Cliente() {
		super();//Llamada al constructor de la clase base
	}
	
	public Cliente(String dni, String nombre, String email, String telefono) {
		
		setDni(dni);
		this.nombre = nombre;
		this.email = email;
		this.telefono = telefono;
	}

	
	// *******************************  Métodos de acceso set y get **********************************//
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		
		//Validar el dni
		
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	//****************************** Método toString ****************************************//

	@Override
	public String toString() {
		return "dni=" + dni + "\nnombre=" + nombre + "\nemail=" + email + "\ntelefono=" + telefono;
	}
	
	
	
	
}
