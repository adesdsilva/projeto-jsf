package br.com.sunsystem.projetojsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
public class SessionClosedController {

	@PostConstruct
	public void inicializar() {
		System.out.println("Encerrando sessão...");
	}
	
	public void closedSession() {
		ExternalContext ex = FacesContext.getCurrentInstance().getExternalContext();
		ex.invalidateSession();
		
		try {
			this.redirecionar("login.xhtml");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void redirecionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
}
