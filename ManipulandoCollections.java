import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import br.com.angular.projeto.model.Pessoas;

public class ManipulandoCollections {

	public static void main(String[] args) {
		
		Pessoas p1 = new Pessoas((long) 1,"p1", 1234, "role_adm");
		Pessoas p2 = new Pessoas((long) 5,"p2", 12345, "role_user");
		Pessoas p3 = new Pessoas((long) 3,"p3", 123456, "role_adm");
		Pessoas p4 = new Pessoas((long) 4,"p4", 1234567, "role_user");
		Pessoas p5 = new Pessoas((long) 2,"p5", 12345678, "role_user");
		Pessoas p6 = new Pessoas((long) 6,"p6", 123456789, "role_adm");
		
		List<Pessoas> lista1 = new ArrayList<Pessoas>();
		lista1.add(p1);
		lista1.add(p2);
		lista1.add(p4);
		lista1.add(p5);
		lista1.add(p3);
		lista1.add(p6);
		lista1.add(p1);
		
		int freq = Collections.frequency(lista1, p1);
		
		 System.out.println(freq);  // 2
		
	}
}
