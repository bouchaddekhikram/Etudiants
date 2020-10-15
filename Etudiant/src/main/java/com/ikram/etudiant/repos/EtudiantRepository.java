package com.ikram.etudiant.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ikram.etudiant.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long> {

}
