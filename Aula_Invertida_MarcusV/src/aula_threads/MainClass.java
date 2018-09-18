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
		
		Thread t1 = new Thread(racer1);
		Thread t2 = new Thread(racer2);
		Thread t3 = new Thread(racer3);
		Thread t4 = new Thread(racer4);
		Thread t5 = new Thread(racer5);
		Thread t6 = new Thread(racer6);
		Thread t7 = new Thread(racer7);
		Thread t8 = new Thread(racer8);
		Thread t9 = new Thread(racer9);
		Thread t10 = new Thread(racer10);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		t10.start();
	}
}
