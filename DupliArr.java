import java.util.*;

class DupliArr
{

public static void main(String args[])

{

ArrayList<Integer> arr=new ArrayList<Integer>();

arr.add(1);
arr.add(1);
arr.add(2);
arr.add(3);

System.out.println("Enter Lisr:" +arr);

Set<Integer> s =new HashSet<Integer>(arr);
arr.clear();
arr.addAll(s);
System.out.println("After Removing: "+arr);
}}