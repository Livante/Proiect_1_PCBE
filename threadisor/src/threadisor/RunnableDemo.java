package threadisor;

class RunnableDemo implements Runnable {
	   private Thread t;
	   private String threadName;
	   
	   RunnableDemo( String name) {
	      threadName = name;
	      System.out.println("Intrarea la CCBMD (CORUPTIE, CAPITULARE, BIROCRATIE M. D. " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println(threadName+" sta la coada" );
	      try {
	         for(int i = 4; i > 0; i--) {
	        	switch(i) {
	        	case 1:
	        		System.out.println(threadName + "ia Certificatul de nastere " );
	        		break;
	        		
	        	case 2:
	        		System.out.println(threadName + "face rost de Certificatul de casatorie " );
	        		break;
	        		
	        	case 3:
	        		System.out.println(threadName + "face rost de Stampila Putin " );
	        		break;
	        		
	        	case 4:
	        		System.out.println(threadName + "face rost de cazier" );
	        		break;
	        		
	        	case 5:
	        		System.out.println(threadName + "face rost de testul de Corona" );
	        		break;
	        		
	        	}
	            System.out.println(threadName + " doc " + i);
	            // Let the thread sleep for a while.
	            double pauza= Math.random();
	            if(pauza<=0.4) {
	            	 System.out.println();
	 	            System.out.println("A prins pauza "+threadName);
	            	Thread.sleep(5000);
	            }
	           
	         }
	      } catch (InterruptedException e) {
	      }
	      System.out.println(threadName + " pleaca");
	   }
	   
	   public void start () {
	      System.out.println("Vine " +  threadName );
	      if (t == null) {
	         t = new Thread (this, threadName);
	         t.start ();
	      }
	   }
	}