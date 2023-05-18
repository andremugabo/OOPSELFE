//QUESTION 5
public class ClassMethodConv {
 
	    int id;  
	    String name;  
	    //constructor to initialize integer and string  
	    ClassMethodConv (int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //constructor to initialize another object  
	    ClassMethodConv (ClassMethodConv  s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	ClassMethodConv  s1 = new ClassMethodConv (111,"Karan");  
	    	ClassMethodConv  s2 = new ClassMethodConv (s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
	
	

