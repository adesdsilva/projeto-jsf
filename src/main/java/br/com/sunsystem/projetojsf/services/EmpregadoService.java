package br.com.sunsystem.projetojsf.services;

import java.util.ArrayList;
import java.util.List;

import br.com.sunsystem.projetojsf.entity.Empregado;

public class EmpregadoService {
	
	/**
	 * 
	 * @author Adelino
	 * @Return {@link Empregado} lista de empregados.
	 */
	public List<Empregado> listarEmpregados() {
		
		List<Empregado> lista = new ArrayList<Empregado>();
		
		Empregado e1 = new Empregado();
		e1.setNome("Diego");
		e1.setSobrenome("Souza");
		e1.setApelido("Dinossauro");
		e1.setCargo("Meia-Atacante");
		e1.setStatus(true);
		
		Empregado e2 = new Empregado();
		e2.setNome("Neymar");
		e2.setSobrenome("Júnior");
		e2.setApelido("Cai-cai");
		e2.setCargo("Atacante");
		e2.setStatus(true);
		
		Empregado e3 = new Empregado();
		e3.setNome("Gabriel");
		e3.setSobrenome("Menino");
		e3.setApelido("Multifunção");
		e3.setCargo("Volante");
		e3.setStatus(true);
		
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		return lista;
	}

}
