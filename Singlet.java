//Singleton 
//Double ckeck

public class Singlet{

private static Singlet instance;

private Singlet(){
}

public static Singlet getInstance(){
	if(instance == null){
    //	synchronized(Singlet.class){
    //	if(instance == null){
	instance= new Singlet();
       }
//  }}
return instance;
}}