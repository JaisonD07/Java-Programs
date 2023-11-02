class A{
public void A(){
System.out.print(" I'm");
}}

class B extends A{
public void B(){

System.out.print(" going to");
}}

class C extends B{
public void C(){

System.out.print(" Market");
}}

class Inheritence extends C{
public static void main(String arg[]){
Inheritence d=new Inheritence();
d.A();
d.B();
d.C();
}}

