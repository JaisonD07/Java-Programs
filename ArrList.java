	import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrList {
	public static void main(String arg[]) {
		List<String> num =Arrays.asList("jaison", "naveen", "Bharath","deep", "sujay","joslin");
		
		List<String> oddNum= num.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(oddNum);
		
	}

}
