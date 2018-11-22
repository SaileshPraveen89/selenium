	package Interview;

	import java.util.HashSet;
	import java.util.LinkedHashSet;
	import java.util.Set;
	import java.util.TreeSet;

	public class LearnCollectionsSet {
		
		
		/**
		 * 17 Dec 2017
		 * 
		 * Set is a Collection that cannot contain duplicate elements.
		 * The order of a map is defined as the order depends on implementation
		 * 
		 * Set implementations: HashSet, TreeSet, and LinkedHashSet.
		 * 
		 * HashSet, which stores its elements in a hash table, is the best-performing implementation; 
		 * however it makes no guarantees concerning the order of iteration.
		 * 
		 * Incase of ordered to be maintained, use LinkedHashSet
		 * 
		 * Methods we will learn today
		 * 
		 * size, add, remove, clear, isEmpty
		 * 
		 * 
		 */
		
		public static void main(String[] args) {
			
			// Create a set
			Set<String> mentors = new LinkedHashSet<String>();
			
			// Add mentors to the set -- Note the order
			mentors.add("Sailesh");
			mentors.add("Shamli");
			mentors.add("Dinesh");
			mentors.add("Sandiya");
			mentors.add("Nivedhitha");
			mentors.add("Tikshan");
			
			
			// Now get the count
			System.out.println("The total mentors are :"+mentors.size());
			
			// Try duplicate
			mentors.add("Sailesh");
			
			// Now get the count
			System.out.println("The total mentors are :"+mentors.size());
					
			// Print the name of all mentors -- you will notice the order in the list not maintained
			for (String mentor : mentors) {
				System.out.println(mentor);
			}
			
			// contains
			System.out.println("Is Sailesh is available "
					+ "in the set :"+mentors.contains("Sailesh"));
			
			// remove
			mentors.remove("Shamli");
			
			// contains
			System.out.println("Is Shamli is available in the set"
					+ " after removal :"+mentors.contains("Shamli"));
			
			// clear
			mentors.clear();
			
			// check if it empty
			System.out.println("The set is empty :"
					+ ""+mentors.isEmpty());		
		}
	}


