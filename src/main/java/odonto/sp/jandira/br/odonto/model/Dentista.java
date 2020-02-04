package odonto.sp.jandira.br.odonto.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_dentista")
public class Dentista {

	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long codigo;

	private String nome;
	private String cro;
	private String email;
	private String telefone;

	/* Getters e Setters */
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCro() {
		return cro;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Dentista [codigo=" + codigo + ","
				+ " nome=" + nome + ", cro=" + cro + ","
				+ " email=" + email + ", telefone=" + telefone + "]";
	}

}
