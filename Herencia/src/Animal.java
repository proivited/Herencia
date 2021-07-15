
public abstract class Animal {
	
	int edad;
	String nombre;
	
	public Animal(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	public abstract String comer();
	
	public String dormir() {
		return "zzzzz";
	}

}
