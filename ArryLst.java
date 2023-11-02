import java.util.*;
class ArryLst{

public static void main (String args[])
{
ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(4);
arr.add(9);
arr.add(2);
arr.add(6);
arr.add(1);
arr.add(5);
arr.add(3);
arr.add(7);
System.out.println("default list is:" +arr);
Collections.sort(arr);
System.out.println("Sorted lis is:" +arr);

Collections.sort(arr,Collections.reverseOrder());
System.out.println("List in disending order :"+arr);
}}
