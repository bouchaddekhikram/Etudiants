package com.ikram.etudiant.service;

import java.util.List;

import com.ikram.etudiant.entities.Etudiant;

public interface EtudiantService {
	
	
		Etudiant saveEtudiant(Etudiant e);
		Etudiant updateEtudiant(Etudiant e);
		void deleteEtudiant(Etudiant e);
		 void deleteEtudiantById(Long id);
		 Etudiant getEtudiant(Long id);
		List<Etudiant> getAllEtudiant();
		}


