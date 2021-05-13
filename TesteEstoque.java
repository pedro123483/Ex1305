package EstoqueLoja;

import java.util.ArrayList;
import java.util.Collection;

public class TesteEstoque {

	public static void main(String[] args) {
		
		Collection <String> estoque = new ArrayList();
		
		estoque.add("arroz" +  9);
		estoque.add("feijão" +  17);
		estoque.add("miojo" +  5);
		
		System.out.println("Estoque atual: "  + estoque);
		System.out.println("Venda de 9 pacotes de arroz");
		estoque.remove("arroz" +  9);
		System.out.println("O estoque agora contém: "  + estoque);
		
		
		
		
		
		

	}

}
