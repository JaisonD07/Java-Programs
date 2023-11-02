public class Swap{
public static void main(String args[]){

int i=10, j=20,t;

System.out.println("Before Swap :" +i+ " "+j);
//one way
 /*    t=i;
       i=j;
       j=t;    */

//2nd way

     i=i+j;
     j=i-j;
     i=i-j;
	

System.out.print("After swap :" +i+ " "+j);

}}