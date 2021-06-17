package gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private static List<Empresa> listaEmpresas = new ArrayList<>();
	static {
		Banco.listaEmpresas.add( new Empresa(1,"Prodemge") );
		Banco.listaEmpresas.add( new Empresa(2,"Arsar") );
		Banco.listaEmpresas.add( new Empresa(3,"Semad") );
		Banco.listaEmpresas.add( new Empresa(4,"AGE") );
		Banco.listaEmpresas.add( new Empresa(5,"IMA") );
		Banco.listaEmpresas.add( new Empresa(5,"DEER") );
	}
	public void adcionar(Empresa empresa) {
		Banco.listaEmpresas.add( empresa );
	}

	public static List<Empresa> getListaEmpresas() {
		return Banco.listaEmpresas;
	}
	
}
