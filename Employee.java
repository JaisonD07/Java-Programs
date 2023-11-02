public class Employee{

int id,age;
String name,address;
																											  
public Employee(int age){

this.age=age;
	}
public Employee(int id, int age){

this.id=id;
this.age=age;

	}
public Employee(int id,int age, String name, String address){

this(id, age);
this.name=name;
this.address=address;

	}
public static void main(String args[]){

Employee e= new Employee(105, 55, "jaison", "sakleshpur");

System.out.println("Id :"+e);
System.out.println("age :" +e);
System.out.println("Name :"+e);
System.out.println("Address: "+e);
	}
}