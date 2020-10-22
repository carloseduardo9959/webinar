package webinar.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class InscricaoSeminario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "aluno_id")
	private Aluno aluno;
	
	@ManyToOne
	@JoinColumn(name = "seminario_id")
	private Seminario seminario;
	
	private String datainscricao;

	public InscricaoSeminario() {
	}

	public InscricaoSeminario(Aluno aluno, Seminario seminario) {
		this.aluno = aluno;
		this.seminario = seminario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Seminario getSeminario() {
		return seminario;
	}

	public void setSeminario(Seminario seminario) {
		this.seminario = seminario;
	}

	public String getDatainscricao() {
		return datainscricao;
	}

	public void setDatainscricao(String datainscricao) {
		this.datainscricao = datainscricao;
	}

}