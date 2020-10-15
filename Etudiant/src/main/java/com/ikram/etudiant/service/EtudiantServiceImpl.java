package com.ikram.etudiant.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikram.etudiant.entities.Etudiant;
import com.ikram.etudiant.repos.EtudiantRepository;
@Service
public class EtudiantServiceImpl implements EtudiantService {
@Autowired
EtudiantRepository EtudiantRepository;
public Etudiant saveEtudiant(Etudiant e) {
return EtudiantRepository.save(e);
}
public Etudiant updateEtudiant(Etudiant e) {
return EtudiantRepository.save(e);
}
public void deleteEtudiant(Etudiant e) {
	EtudiantRepository.delete(e);
}
 public void deleteEtudiantById(Long id) {
	 EtudiantRepository.deleteById(id);
}
public Etudiant getEtudiant(Long id) {
return EtudiantRepository.findById(id).get();
}
public List<Etudiant> getAllEtudiant() {
return EtudiantRepository.findAll();
}
public Etudiant updateEtudiant1(Etudiant e) {
	// TODO Auto-generated method stub
	return null;
}
}