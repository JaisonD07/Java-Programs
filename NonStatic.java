class NonStatic{

int i=20;
int b=30;
public static void main (String args[]){

NonStatic s1=new NonStatic();

System.out.println(s1.i);
	s1.test();
}

public void test(){
System.out.println(100);
}
}