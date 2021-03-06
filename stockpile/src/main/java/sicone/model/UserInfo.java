package sicone.model;

import java.io.Serializable;

/**
 * classe responsavel por manter as informacoes do usuario logado.
 * 
 * @author Dodo
 *
 */

public class UserInfo implements Serializable {
	private static final long serialVersionUID = 569870439550269476L;

	private String profile;
	private boolean logado;
	private String nome;

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public boolean isLogado() {
		return logado;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
