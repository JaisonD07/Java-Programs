import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreaApi{

public static void main(String args[]){

List<String> num= Arrays.asList("jaison", "joslin", "naveen", "Bharath");

List<String> str=num.stream().filter(x->x.startWith("j")).collect(Collectors.toList());

System.out.println(str);
}}
