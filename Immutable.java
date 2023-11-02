//own immutable class
public final class Immutable{

int id;
String name;

Immutable(int id,String name){
this.id=id;
this.name=name;
}

public int getId(){
return id;
}
public String getName(){
return name;
}

public static void main(String args[]){
Immutable A =new Immutable(01, "Jaison");

int a1=A.getId();
String a2=A.getName();

System.out.println("Id: " +a1);
System.out.println("Name: " +a2);
}}