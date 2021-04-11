package br.com.java.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
		
		private static List<Empresa> lista = new ArrayList<>(); //n�o escrevi Empresa em ArrayList, por se referir a mesma Empresa de List<Empresa>. Por isso n�o h� a necessidade, o programa reconhece.
		
		//simulando um banco est�tico, ou seja, criar duas empresas no programa para n�o ter que cadastrar toda vez que reiniciar o servidor.
		static {
			Empresa empresa = new Empresa();
			empresa.setNome("Alura");
			Empresa empresa2 = new Empresa();
			empresa2.setNome("Caelum");
			lista.add(empresa);
			lista.add(empresa2);
		}
		
		
		public void adiciona(Empresa empresa) {
			Banco.lista.add(empresa); //a classe acessa a lista e adiciona a empresa.
		}
		
		public List<Empresa> getEmpresas(){ //a lista mostra as empresas salvas e retorna o dado.
			return Banco.lista; //a classe acessa a lista e devolve o dado da empresa.
		}
}
		
	