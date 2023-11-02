public class SingletMain{

public static void main(String arg[]){

Singlet instance1 =Singlet.getInstance();
System.out.println(instance1);

Singlet instance2 =Singlet.getInstance();
System.out.println(instance2);
Singlet instance3 =Singlet.getInstance();
System.out.println(instance3);
}}