package com.thirumal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Hello world!
 *
 */
public class CollectionConcept {
	
    public static void main( String[] args ) throws IOException  {
       Collection<String> collection = new ArrayList<String>();
       collection.add("fuck");collection.add("you");collection.add("God");
       System.out.println(collection);
       collection.remove(1); // Will not work
       System.out.println(collection);
       new FileWriter("sd");
    }
    
}
