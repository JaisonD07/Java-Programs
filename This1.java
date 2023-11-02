class This1{
int x=100;
static int y=200;
public static void main(String args[]){

Constructor1 j =new Constructor1();

System.out.println(j.x);

j.test1();
j.test2();

}
public void test1(){
System.out.println(this.x);
}
public void test2(){
System.out.println(this.y);
}
}