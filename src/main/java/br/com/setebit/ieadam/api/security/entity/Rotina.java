package br.com.setebit.ieadam.api.security.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
/**
 * 
 * @author altitdb
 */
@Entity
@Table(name = "saa_rotina")
public class Rotina implements Serializable {

	private static final long serialVersionUID = 55549693990924773L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRotina;

	@Column(length = 100, nullable = false)
	private String imagem;

	@Column(length = 100, nullable = false)
	private String nome;

	@Column(length = 100, nullable = false)
	private String acao;

	@Column(length = 1, nullable = false)
	private byte status;

	@ManyToOne
	@JoinColumn(name = "id_sistema")
	private Sistema sistema;

	@Lob
	@Column(name = "logomarca")
	private byte[] logomarca;

	//@Transient
	//private StreamedContent streamedContent;

	@Transient
	private boolean checked;

	public int getIdRotina() {
		return idRotina;
	}

	public void setIdRotina(int idRotina) {
		this.idRotina = idRotina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isChecked() {
		return checked;
	}

	public void setChecked(boolean checked) {
		this.checked = checked;
	}

	public String getImagem() {
		return imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}

	public byte[] getLogomarca() {
		return logomarca;
	}

	public void setLogomarca(byte[] logomarca) {
		this.logomarca = logomarca;
	}
	/*

	public StreamedContent getStreamedContent() {
		return Util.converterBytesToStreamedContent(getLogomarca());
	}

	public void setStreamedContent() {
		this.streamedContent = Util.converterBytesToStreamedContent(getLogomarca());
	}*/

}