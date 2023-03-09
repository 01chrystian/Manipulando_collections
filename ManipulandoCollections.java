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
		lista1.add(p4);
		lista1.add(p3);
		lista1.add(p6);
		
		List<Pessoas> lista2 = new ArrayList<Pessoas>();
		lista2.add(p1);
		lista2.add(p2);
		lista2.add(p4);
		lista2.add(p5);
		lista2.add(p3);
		
		List<Pessoas> lista3 = new ArrayList<Pessoas>();
		lista3.add(p6);
				
		 System.out.println("é lista1 disjunta a lista2 : " +
                 Collections.disjoint(lista1, lista2)); //contem elementos semelhantes : false
		 
		 System.out.println("é lista1 disjunta a lista3 : " +
                 Collections.disjoint(lista1, lista3)); //contem elementos semelhantes : false
		 
		 System.out.println("é lista2 disjunta a lista3 : " +
                 Collections.disjoint(lista2, lista3)); //nao contem elementos semelhantes : true
		
	}
}
