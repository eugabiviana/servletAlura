package br.com.java.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
		
		private static List<Empresa> lista = new ArrayList<>(); //n�o escrevi Empresa em ArrayList, por se referir a mesma Empresa de List<Empresa>. Por isso n�o h� a necessidade, o programa reconhece.
		private static Integer chaveSequencial = 1;
		
		
		//simulando um banco est�tico, ou seja, criar duas empresas no programa para n�o ter que cadastrar toda vez que reiniciar o servidor.
		static {
			Empresa empresa = new Empresa();
			empresa.setId(chaveSequencial++); //cria o Id assim que � cadastrada e reconhece que a pr�xima deve ser o n�mero +1.
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
			
			//se usar apenas o la�o for abaixo, ao demover o segundo elemento da lista d� erro 500. Esse Iterador corrige isso com o la�o while.
			Iterator<Empresa> it = lista.iterator();
			
			//mostra sempre a pr�xima empresa, quando houver.
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
		
	