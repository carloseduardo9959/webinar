package webinar.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Seminario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private int numero;
	private double taxa;
	
	@OneToMany
	private List<Instrutor> instrutores;
	
	@OneToMany(mappedBy = "seminario")
	Set<InscricaoSeminario> inscricoes = new HashSet<>();
	
	

	public Seminario() {
		this.instrutores = new ArrayList<Instrutor>();
	}

	public Seminario(String nome, int numero, double taxa, List<Instrutor> instrutores) {
		this.nome = nome;
		this.numero = numero;
		this.taxa = taxa;
		this.instrutores = instrutores;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public List<Instrutor> getInstrutores() {
		return instrutores;
	}

	public void setInstrutores(List<Instrutor> instrutores) {
		this.instrutores = instrutores;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutores.add(instrutor);
	}
	
	public Set<InscricaoSeminario> getInscricoes() {
		return inscricoes;
	}

	public void setInscricoes(Set<InscricaoSeminario> inscricoes) {
		this.inscricoes = inscricoes;
	}
}


