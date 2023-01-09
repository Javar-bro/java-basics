
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
// ^^^^^^^^^^^^if Statrmenr^^^^^^^^^^^^^^^//
     int a = sc.nextInt();
  
  
  
  
  //______________________________________
  //  int b = 4;                                                         |
      //if(a == b){                                                     |
    //  	System.out.print("very good");          | 
  //   }                                                                      |
    //  else{                                                              | 
      //	System.out.println("mc");                    | 
 //     }                                                                      |
 //______________________________________/
      
  //  ^^^^^^^^  if else if  ^^^^^^^^^^ //
  
//  if(a ==1 ){
  //   System.out.println("Hello");
 // } else if (a == 2){
 //    System.out.println("Namestay");
  //}
   //else if (a == 3 ){
   //	System.out.println("Hola");
 //  }
  // else{
//   	System.out.print("Invalid");
   	
//   }


// ^^^^^^^^^^^^^^ Switch ^^^^^^^^^^//

  switch(a){
  	case 1 : System.out.print("hello");
  	break;
  	case 2 : System.out.print("namestay");
  	break;
  	case 3 : System.out.print("hola");
  	break;
  	default: System.out.print("hlo");
  	
  }


	}
}