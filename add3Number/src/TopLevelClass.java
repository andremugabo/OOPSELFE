
public class TopLevelClass {
	

	    void accessMembers(InnerOuterClass outer) {     
	        // Compiler error: Cannot make a static reference to the non-static
	        //     field OuterClass.outerField
	        // System.out.println(OuterClass.outerField);
	        System.out.println(outer.outerField);
	        System.out.println(InnerOuterClass.staticOuterField);
	    }  
	

}
