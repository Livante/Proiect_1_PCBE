package threadisor;

public class TestThread {

	   public static void main(String args[]) {
	      RunnableDemo R1 = new RunnableDemo( "Costica");
	      R1.start();
	      
	      RunnableDemo R2 = new RunnableDemo( "Vasile");
	      R2.start();
	      
	      RunnableDemo R3 = new RunnableDemo( "Petru");
	      R3.start();
	      
	      RunnableDemo R4 = new RunnableDemo( "Dorel");
	      R4.start();
	   }   
	}
