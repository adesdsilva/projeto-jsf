package br.com.sunsystem.projetojsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import br.com.sunsystem.projetojsf.dtos.UsuarioDTO;

@ManagedBean(name = "loginControl")
public class LoginController {

	private String usuario;
	
	private String password;
	
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;	
	
	public void logar() {
		if (usuario.equals("admin") && password.equals("12345")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redirecionar("home.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", 
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "Página não encontrada!", ""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuário/Password incorreto(s)", ""));
		}
	}
	
	private void redirecionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public SessionController getSessionController() {
		return sessionController;
	}

	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
	
	
	
}
