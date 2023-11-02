class Largest{

public static void main(String arg[]){

int arr[]={-12,50,80,10,-2,21};

int max= arr[0];

for(int i=0;i<arr.length;i++){

if (arr[i]>max){
max=arr[i];
}}
System.out.println("Largest No is: "+max);
  }
}