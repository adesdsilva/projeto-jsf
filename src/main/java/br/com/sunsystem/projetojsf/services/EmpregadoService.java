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
		
		Empregado e4 = new Empregado();
		e4.setNome("Weverton");
		e4.setSobrenome("Silva");
		e4.setApelido("Paredão");
		e4.setCargo("Goleiro");
		e4.setStatus(true);
		
		Empregado e5 = new Empregado();
		e5.setNome("Matias");
		e5.setSobrenome("Viña");
		e5.setApelido("Cabuloso");
		e5.setCargo("Lateral Esquerdo");
		e5.setStatus(true);
		
		Empregado e6 = new Empregado();
		e6.setNome("Felipe");
		e6.setSobrenome("Melo");
		e6.setApelido("Pitbull");
		e6.setCargo("Zagueiro");
		e6.setStatus(true);
		
		Empregado e7 = new Empregado();
		e7.setNome("Patrick");
		e7.setSobrenome("Di Paula");
		e7.setApelido("PPK");
		e7.setCargo("Volante");
		e1.setStatus(true);
		
		Empregado e8 = new Empregado();
		e8.setNome("Rony");
		e8.setSobrenome("Moreira");
		e8.setApelido("Rony Rústico");
		e8.setCargo("Atacante");
		e8.setStatus(true);
		
		Empregado e9 = new Empregado();
		e9.setNome("Gustavo");
		e9.setSobrenome("Scarpa");
		e9.setApelido("Bigodin");
		e9.setCargo("Meio-de-campo");
		e9.setStatus(true);
		
		Empregado e10 = new Empregado();
		e10.setNome("José");
		e10.setSobrenome("Rafael");
		e10.setApelido("Zé");
		e10.setCargo("Meio campista");
		e10.setStatus(true);
		
		Empregado e11 = new Empregado();
		e11.setNome("Victor");
		e11.setSobrenome("Luís");
		e11.setApelido("Anão de jardim");
		e11.setCargo("Lateral esquerdo");
		e11.setStatus(true);
		
		Empregado e12 = new Empregado();
		e12.setNome("Luiz");
		e12.setSobrenome("Adriano");
		e12.setApelido("El Matador");
		e12.setCargo("Atacante");
		e12.setStatus(true);
		
		lista.add(e1);
		lista.add(e2);
		lista.add(e3);
		lista.add(e4);
		lista.add(e5);
		lista.add(e6);
		lista.add(e7);
		lista.add(e8);
		lista.add(e9);
		lista.add(e10);
		lista.add(e11);
		lista.add(e12);
		return lista;
	}

}
