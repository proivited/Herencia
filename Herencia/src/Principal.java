
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Animal animal = new Animal();
		//System.out.println("Super clase:" animal.comer());
		
		Perro canelo = new Perro("solovino", 2 , "de la calle");
		System.out.println(canelo.ladrar());
		System.out.println(canelo.comer());
		System.out.println(canelo.nombre);
		System.out.println(canelo.raza);
		System.out.println(canelo.irAlBano());
		
		Gato pulgas = new Gato("misifus",2,"cafe");
		System.out.println(pulgas.comer());
	}

}
