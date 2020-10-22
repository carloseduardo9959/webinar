package webinar.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Instrutor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;
	
	private String email;
	private double salario;
	
	@Enumerated(EnumType.STRING)
	private Formacao formacao;

	public Instrutor() {
	}

	public Instrutor(String nome, Endereco endereco, String email, double salario, Formacao formacao) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.salario = salario;
		this.formacao = formacao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Formacao getFormacao() {
		return formacao;
	}

	public void setFormacao(Formacao formacao) {
		this.formacao = formacao;
	}

}
