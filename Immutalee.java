//Immutable

public final class Immutalee{
int id;
String name;

Immutalee(int id, String name){
this.id=id;
this.name=name;
	}

public int getId(){
return id;
	}
public String getName(){
return name;
	}
public static void main(String arg[]){
Immutalee I =new Immutalee(01,"jaiosn");
int i1 =I.getId();
String i2= I.getName();

System.out.println("ID: "+i1);
System.out.println("Name: "+i2);
}}