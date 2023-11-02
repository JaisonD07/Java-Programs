import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Strea{

public static void main(String args[]){

List<String> num= Arrays.asList("jaison", "joslin", "naveen", "Bharath");

List<String> str=num.stream().filter(x->x.toUpperCase()).collect(Collectors.toList());

System.out.println(str);
}}
