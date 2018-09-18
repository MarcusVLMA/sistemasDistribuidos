package aula_threads;

public class MainClass {
	
	public static void main(String[] args) {
//		ThreadRacer racer1 = new ThreadRacer ("Fátima");
//		ThreadRacer racer2 = new ThreadRacer ("Cortez");
//		ThreadRacer racer3 = new ThreadRacer ("Helano");
//		ThreadRacer racer4 = new ThreadRacer ("Dedel299");
//		ThreadRacer racer5 = new ThreadRacer ("Jarbas");
//		ThreadRacer racer6 = new ThreadRacer ("Hilma");
//		ThreadRacer racer7 = new ThreadRacer ("George");
//		ThreadRacer racer8 = new ThreadRacer ("Marques");
//		ThreadRacer racer9 = new ThreadRacer ("Tarcísio");
//		ThreadRacer racer10 = new ThreadRacer ("Michela");
		
		RunnableRacer racer1 = new RunnableRacer ("Lincoln");
		RunnableRacer racer2 = new RunnableRacer ("Trinta");
		RunnableRacer racer3 = new RunnableRacer ("Windson");
		RunnableRacer racer4 = new RunnableRacer ("João Paulo");
		RunnableRacer racer5 = new RunnableRacer ("Ana Teresa");
		RunnableRacer racer6 = new RunnableRacer ("Emanuele");
		RunnableRacer racer7 = new RunnableRacer ("Bento");
		RunnableRacer racer8 = new RunnableRacer ("Creto");
		RunnableRacer racer9 = new RunnableRacer ("Zé Maria");
		RunnableRacer racer10 = new RunnableRacer ("Cláudia");

		racer1.run();
		racer2.run();
		racer3.run();
		racer4.run();
		racer5.run();
		racer6.run();
		racer7.run();
		racer8.run();
		racer9.run();
		racer10.run();
	}
}
