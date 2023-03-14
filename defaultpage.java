//save by A.java  
package com.java;  
  
public class A {  
  
 String msg="Try to access default variable outside the package";  
       
}  
//save by DefaultExample1.java  
package com.javatpoint;  
import com.java.A;  
  
public class DefaultExample1 {  
public static void main(String[] args) {  
    A a=new A();  
   System.out.println(a.msg);  
      
}  
}  
