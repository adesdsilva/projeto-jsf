package br.com.sunsystem.projetojsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.sunsystem.projetojsf.entity.Empregado;
import br.com.sunsystem.projetojsf.services.EmpregadoService;

@ManagedBean
@ViewScoped
public class EmpregadoController {

	private List<Empregado> empregados;
	
	private EmpregadoService empregadoService = new EmpregadoService();
	
	@PostConstruct
	public void inicializar() {
		this.consultarEmpregados();
	}
	
	public void consultarEmpregados() {
		this.empregados = this.empregadoService.listarEmpregados();
	}

	public List<Empregado> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(List<Empregado> empregados) {
		this.empregados = empregados;
	}
	
	
}
