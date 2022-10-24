package ceMail;



import java.util.ArrayList;
import java.util.PriorityQueue;
import edu.princeton.cs.algs4.StdOut;

/**
 * Test Client
 * @author Gavin Barrett
 *
 */
	public class DemoHeap 
	{
	
	
		/**
		 * Main Method
		 * @param args
		 */
		public static void main(String[] args) 
		{
			
			
			ArrayList<Mail> list = new ArrayList<>();//push into an array
			for  (int i = 0; i < 25; i++) 
			{
				list.add(randomMail());
			}
			
			StdOut.println(" ");
			StdOut.println("25 Random Mail Objects:");
			StdOut.println("-----------------------");
			
			for (Mail m : list) 
			{
				StdOut.println(m);
			}
			
			StdOut.println(" ");
			StdOut.println("Remove elements one by one from the priority queue:");
			StdOut.println("-----------------------");
			
			PriorityQueue<Mail> heap = new PriorityQueue<>();	
			heap.addAll(list);
			

			while(!heap.isEmpty()) 
			{
				Mail highestPriortyMail = heap.remove();
				StdOut.println(highestPriortyMail);
			}
			
			
			
		}
	
		/**
		 * method to get the Mail object 
		 * @return
		 */
		private static Mail randomMail() 
		{
			return new Mail();
		}
		
		
	}