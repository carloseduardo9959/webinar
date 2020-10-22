package app;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import webinar.dao.InstutorDao;
import webinar.dao.JPAUtil;
import webinar.model.Aluno;
import webinar.model.Endereco;
import webinar.model.Formacao;
import webinar.model.InscricaoSeminario;
import webinar.model.Instrutor;
import webinar.model.Seminario;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();	
		
		/*
		Endereco end1 = new Endereco("Rua Expedicionários, 1160", "Serrania");
		Aluno a1 = new Aluno("200566181","Carlos", end1 , "carlos@gmail.com");
		Aluno a2 = new Aluno("205669841","Maria", new Endereco("Quinzinho", "Serrania"), "maria@gmail.com");
		
		Instrutor int1 = new Instrutor("Antonio", new Endereco("Escorrega","Serrania"), "ant@gmail.com", 1500.00, Formacao.DOUTORADO);
		Instrutor int2 = new Instrutor("José", new Endereco("Samba","Serrania"), "jos@gmail.com", 2500.00, Formacao.DOUTORADO);		
			
		List<Instrutor> lstI = new ArrayList<Instrutor>();
		lstI.add(int1);
		lstI.add(int2);
		
		Seminario sem = new Seminario("Ciencia", 3 , 27.5, lstI);
		
		Seminario semcon = em.find(Seminario.class, 1);
		Aluno alucon = em.find(Aluno.class, 1);
		
		
		InscricaoSeminario inscricao = new InscricaoSeminario(alucon, semcon);
		*/
		
		List<Instrutor> instrutores = new InstutorDao().getAllbyFormacao(Formacao.DOUTORADO);
		for (Instrutor instrutor : instrutores) {
			System.out.println(instrutor.getNome());
		}
		
		em.getTransaction().begin();
		//em.persist(end1);
		//em.persist(a1);
		//em.persist(a2);
		//em.persist(int1);
		//em.persist(int2);
		//em.persist(sem);
		//em.persist(inscricao);
		em.getTransaction().commit();
		
		JPAUtil.shutdown();
		
	}

}
