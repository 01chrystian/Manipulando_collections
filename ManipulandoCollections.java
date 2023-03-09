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
		
		List<Pessoas> listaEmbaralhada = new ArrayList<Pessoas>();

		List<Pessoas> listaInicial = new ArrayList<Pessoas>();
		listaInicial.add(p1);
		listaInicial.add(p2);
		listaInicial.add(p4);
		listaInicial.add(p5);
		listaInicial.add(p3);
		
		System.out.println("---------Lista inicial-------------");
		//filtra atraves da presenca do 'role_user' e adiciona sem ordem na listaEmbaralhada
		listaInicial.forEach(i -> {
			if(i.getRole().contains("role_user"))
				listaEmbaralhada.add(i);		
			System.out.println(i);
		});
		
		System.out.println("---------Lista embaralhada-------------");
		listaEmbaralhada.forEach(i ->{
			System.out.println(i);	
		});
		
		System.out.println("---------Lista decrescente-------------");
		//mostra a lista decrescente 
		List<Pessoas> dcL = decrescenteLista(listaEmbaralhada);
		dcL.forEach(i -> {
			System.out.println(i);
		});
		
		System.out.println("-----------Lista crescente-----------");
		//mostra a lista crescente corrigindo o id de cada elemento ordenadamente
		List<Pessoas> cL = crescenteLista(listaEmbaralhada);
		cL.forEach(i -> {
			cL.forEach(j -> {
				if(cL.indexOf(i) != j.getId())
					i.setId((long) cL.indexOf(i)+1);
			});
			System.out.println(i);
		});
	}
	
	public static List<Pessoas> crescenteLista(List<Pessoas> ps){
	    return ps.stream().sorted((p1, p2) -> 
	            p1.getSenha()
	           .compareTo(p2.getSenha()))
	           .collect(Collectors.toList());
	}
	
	public static List<Pessoas> decrescenteLista(List<Pessoas> ps) {
		Collections.sort(ps, Collections.reverseOrder((p1, p2) -> 
		p1.getSenha()
		.compareTo(p2.getSenha())));
		return ps;
	}
}
