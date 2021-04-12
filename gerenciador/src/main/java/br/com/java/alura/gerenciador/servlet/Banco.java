package br.com.java.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
		
		private static List<Empresa> lista = new ArrayList<>(); //não escrevi Empresa em ArrayList, por se referir a mesma Empresa de List<Empresa>. Por isso não há a necessidade, o programa reconhece.
		private static Integer chaveSequencial = 1;
		
		
		//simulando um banco estático, ou seja, criar duas empresas no programa para não ter que cadastrar toda vez que reiniciar o servidor.
		static {
			Empresa empresa = new Empresa();
			empresa.setId(chaveSequencial++); //cria o Id assim que é cadastrada e reconhece que a próxima deve ser o número +1.
			empresa.setNome("Alura");
			Empresa empresa2 = new Empresa();
			empresa2.setId(chaveSequencial++);
			empresa2.setNome("Caelum");
			lista.add(empresa);
			lista.add(empresa2);
		}
		
		
		public void adiciona(Empresa empresa) {
			empresa.setId(Banco.chaveSequencial++);
			Banco.lista.add(empresa); //a classe acessa a lista e adiciona a empresa.
		}
		
		public List<Empresa> getEmpresas(){ //a lista mostra as empresas salvas e retorna o dado.
			return Banco.lista; //a classe acessa a lista e devolve o dado da empresa.
		}

		public void removeEmpresa(Integer id) {
			
			//se usar apenas o laço for abaixo, ao demover o segundo elemento da lista dá erro 500. Esse Iterador corrige isso com o laço while.
			Iterator<Empresa> it = lista.iterator();
			
			//mostra sempre a próxima empresa, quando houver.
			while(it.hasNext()) {
				Empresa emp = it.next();
				
				if (emp.getId() == id){
					it.remove();
				}
			}			
			
//			for (Empresa empresa : lista) {
//				if (empresa.getId() == id){
//					lista.remove(empresa);
//				}
//			}
			
	}

		public Empresa buscaEmpresaPeloId(Integer id) {
			for (Empresa empresa : lista) {
				if(empresa.getId() ==id) {
					return empresa;
				}
			}
			return null;
		}
}
		
	