package com.ikram.etudiant;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.ikram.etudiant.entities.Etudiant;
import com.ikram.etudiant.repos.EtudiantRepository;





@SpringBootTest
class EtudiantApplicationTests {

	@Autowired
	private EtudiantRepository EtudiantRepository;
	
	
	@Test
	public void testCreateEtudiant() {	
	Etudiant etud = new Etudiant("Asma",14.50,new Date());
	EtudiantRepository.save(etud);
	}
	
	
	@Test
	public void testFindEtudiantt()
	{
	Etudiant e = EtudiantRepository.findById(1L).get();
	System.out.println(e);
	}
	
	
	@Test
	public void testUpdateEtudiant()
	{
		Etudiant e = EtudiantRepository.findById(1L).get();
	e.setMoyenne(1000.0);
	EtudiantRepository.save(e);
	}

	@Test
	public void testDeleteEtudiant()
	{
		EtudiantRepository.deleteById(1L);;
		}
	
	
	@Test
	public void testListerTousEtudiants()
	{
	List<Etudiant> prods = EtudiantRepository.findAll();
	for (Etudiant p : prods)
	{
	System.out.println(p);
	}
	}

}
