import java.util.function.*;
class Lamdas
{
	public static void main(String arg[])
	{
   Function<Integer,Integer> f=i->i*i;
   System.out.println("The Square of 40:"+f.apply(40));
   System.out.println("The Square of 50:"+f.apply(50));
}
}