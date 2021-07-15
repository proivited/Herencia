
public class Perro extends Animal implements Mascota, Veterinario {

	String raza = "";
	String color = "";
	float peso = 0;
	
	Perro (String nombre, int edad, String raza){
		
		super(nombre, edad);
		this.raza =  raza;
		
	}
	
	public String ladrar() {
		return "Guaf";
	}
	
	@Override
	public String comer() {
		return "Comiendo croquetas";
	}

	@Override
	public String trucos() {
		// TODO Auto-generated method stub
		return "Dar la pata";
	}

	@Override
	public String premios() {
		// TODO Auto-generated method stub
		return "Recibir premio";
	}

	@Override
	public String jugar() {
		// TODO Auto-generated method stub
		return "Jugar a la pelota";
	}

	@Override
	public String irAlVeterinario() {
		// TODO Auto-generated method stub
		return "Amonos al veterinario";
	}

	@Override
	public String paseo() {
		// TODO Auto-generated method stub
		return "Te saco a pasear";
	}

	@Override
	public String irAlBano() {
		// TODO Auto-generated method stub
		return "popo";
	}
}
