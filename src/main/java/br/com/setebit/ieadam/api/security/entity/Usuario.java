package br.com.setebit.ieadam.api.security.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.com.setebit.ieadam.api.security.enums.ProfileEnum;

/**
 * 
 * @author altitdb
 */
@Entity
@Table(name = "saa_usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -7789936704890560797L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUsuario;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "usuarioPerfilPk.usuario")
	private List<UsuarioPerfil> usuarioPerfil = new ArrayList<UsuarioPerfil>();

	@Column(unique = true, length = 30)
	private String login;

	@Column
	private String senha;

	@Column(name = "status", length = 1, columnDefinition = "CHAR(1)", nullable = false)
	private String status;

	private boolean zona;

	private boolean area;

	private boolean nucleo;
	
	private boolean in_privilegio;
	
	 @Lob 
	 @Column(name = "logomarca")  
	 private byte[] logomarca;  
	
	@Column
	private String telefone;
	
	@Column
	private String email;
	
	@OneToMany(mappedBy = "sistema")
	private List<Perfil> perfils;
	
	@Column
	private Integer idMembro;

	@Column
	private String nome;
	
	@Column
	private ProfileEnum profile;
	
	public Usuario() {}
	
	public Usuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Transient
	public UsuarioPerfil getUsuarioPerfilByPerfil(Perfil perfil) {
		for (UsuarioPerfil up : usuarioPerfil) {
			if (up.getUsuarioPerfilPk().getPerfil().equals(perfil)) {
				return up;
			}
		}
		return null;
	}

	@Transient
	public boolean containsPerfil(Perfil perfil) {
		return getUsuarioPerfilByPerfil(perfil) != null;
	}

	public List<UsuarioPerfil> getUsuarioPerfil() {
		return usuarioPerfil;
	}

	public void setUsuarioPerfil(List<UsuarioPerfil> usuarioPerfil) {
		this.usuarioPerfil = usuarioPerfil;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isZona() {
		return zona;
	}

	public void setZona(boolean zona) {
		this.zona = zona;
	}

	public boolean isArea() {
		return area;
	}

	public void setArea(boolean area) {
		this.area = area;
	}

	public boolean isNucleo() {
		return nucleo;
	}

	public void setNucleo(boolean nucleo) {
		this.nucleo = nucleo;
	}

	public Integer getIdMembro() {
		return idMembro;
	}

	public void setIdMembro(Integer idMembro) {
		this.idMembro = idMembro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isIn_privilegio() {
		return in_privilegio;
	}

	public void setIn_privilegio(boolean in_privilegio) {
		this.in_privilegio = in_privilegio;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte[] getLogomarca() {
		return logomarca;
	}

	public void setLogomarca(byte[] logomarca) {
		this.logomarca = logomarca;
	}

	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}
}