package View;

public class Instancia {

	public static void main(String[] args) {
		
		Veiculo carro = new Veiculo();
		carro.Modelo = "Fusca";
		carro.Marca = "Volkswagen";
		carro.Cor = "Azul";
		carro.ano = 1945;
		carro.Placa = "POO123";
		
		Animal gato = new Animal();
		gato.ra�a = "Siam�s";
		gato.Cor = "Cinza";
		gato.peso = 1.5f;
		gato.tamanho = 0.30f;
		gato.g�nero = "Macho";
		
		Pessoa Gabriel = new Pessoa();
		Gabriel.nome = "Gabriel";
		Gabriel.altura = 1.78f;
		Gabriel.idade = 19;
		Gabriel.peso = 69;
		Gabriel.etinia = "Pardo";
		
		carro.Acelerar();
		carro.Buzinar();
		carro.Freiar();
		System.out.println("    ");
		gato.Comer();
		gato.Brincar();
		gato.Beber();
		System.out.println("    ");
		Gabriel.Dormir();
		Gabriel.Estudar();
		Gabriel.Trabalhar();
		System.out.println("    ");
		
//========================================================	
		
		Veiculo moto = new Veiculo();
		moto.ano = 2010;
		moto.Marca = "Yamaha";
		moto.Modelo = "XJ6";
		moto.Cor = "preto";
		moto.Placa = "POO567";
		
		Animal cachorro = new Animal();
		cachorro.tamanho = 0.40f;
		cachorro.Cor = "Preto";
		cachorro.g�nero = "F�mea";
		cachorro.peso = 10f;
		cachorro.ra�a = "Labrador";
		
		Pessoa An�nimo = new Pessoa();
		An�nimo.altura = 1.80f;
		An�nimo.etinia = "Branco";
		An�nimo.nome = "An�nimo";
		An�nimo.peso = 75f;
		An�nimo.idade = 29;

		moto.Acelerar();
		moto.Buzinar();
		moto.Freiar();
		System.out.println("    ");
		
		cachorro.Comer();
		cachorro.Brincar();
		cachorro.Beber();
		System.out.println("    ");
		An�nimo.Dormir();
		An�nimo.Estudar();
		An�nimo.Trabalhar();
		
//======================================================	
		

	}

}
