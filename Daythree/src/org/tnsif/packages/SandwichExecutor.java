//driver class

package org.tnsif.packages;

public class SandwichExecutor {

	public static void main(String[] args) {
		
		// Object creation
		Sandwich s=new Sandwich();
        s.breadType="Brown bread";
        s.noOfSlice=4;
        //method call
        s.display();
	}

}
