package com.ikram.etudiant.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Etudiant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idEtudiant;
	private String nomEtudiant;
	private Double Moyenne;
	private Date dateNais;
	
	public Etudiant() {
	super();
	}
	public Etudiant(String  nomEtudiant, Double Moyenne, Date dateNais) {
	super();
	this.nomEtudiant = nomEtudiant;
	this.Moyenne = Moyenne;
	this.dateNais = dateNais;
	}
	public Long getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(Long idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public String getNomEtudiant() {
		return nomEtudiant;
	}
	public void setNomEtudiant(String nomEtudiant) {
		this.nomEtudiant = nomEtudiant;
	}
	public Double getMoyenne() {
		return Moyenne;
	}
	public void setMoyenne(Double moyenne) {
		Moyenne = moyenne;
	}
	public Date getDateNais() {
		return dateNais;
	}
	public void setDateNais(Date dateNais) {
		this.dateNais = dateNais;
	}
	
	@Override
	public String toString() {
	return "Etudiant [idEtudiant=" + idEtudiant + ", nomEtudiant=" +
			nomEtudiant + ", Moyenne=" + Moyenne
	+ ", dateNais=" + dateNais + "]";
	}

}
