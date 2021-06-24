package br.com.sunsystem.projetojsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.sunsystem.projetojsf.dtos.UsuarioDTO;

@ManagedBean
@SessionScoped
public class SessionController {

	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void inicializar() {
		
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
}
