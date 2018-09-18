package aula_threads;

public class Racer {
	private String i;
	
	public Racer(String i)
	{
		this.i = i;
	}
	
	public void run()
	{
		System.out.println("Racer " + i + " está correndo. Vrruuuummmm");
	}
	
	public String getName()
	{
		return this.i;
	}
}
