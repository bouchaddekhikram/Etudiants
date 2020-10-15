package com.ikram.etudiant.controllers;


	
	import java.text.ParseException;
	import java.text.SimpleDateFormat;
	import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.ModelMap;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import com.ikram.etudiant.entities.Etudiant;
	import com.ikram.etudiant.service.EtudiantService;
	@Controller
	public class EtudiantController {
	@Autowired
	EtudiantService EtudiantService;
	@RequestMapping("/showCreate")
	public String showCreate()
	{
	return "createEtudiant";
	}
	@RequestMapping("/saveEtudiant")
	public String saveEtudiant(@ModelAttribute("etudiant") Etudiant etudiant,
	 @RequestParam("date") String date,
	 ModelMap modelMap) throws
	ParseException
	{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateNais = dateformat.parse(String.valueOf(date));
	 etudiant.setDateNais(dateNais);

	Etudiant saveEtudiant = EtudiantService.saveEtudiant(etudiant);
	String msg ="Etudiant enregistré avec Id "+saveEtudiant.getIdEtudiant();
	modelMap.addAttribute("msg", msg);
	return "createEtudiant";
	}
	
	
	@RequestMapping("/ListeEtudiant")
	public String listeEtudiant(ModelMap modelMap)
	{
	List<Etudiant> etud = EtudiantService.getAllEtudiant();
	modelMap.addAttribute("Etudiant", etud);
	return "listeEtudiant";
	}
	
	
	@RequestMapping("/supprimerEtudiant")
	public String supprimerEtudiant(@RequestParam("id") Long id,
	 ModelMap modelMap)
	{
	EtudiantService.deleteEtudiantById(id);
	List<Etudiant> etud = EtudiantService.getAllEtudiant();
	modelMap.addAttribute("Etudiant", etud);
	return "listeEtudiant";
	}
	
	
	@RequestMapping("/modifierEtudiant")
	public String editerEtudiant(@RequestParam("id") Long id,ModelMap modelMap)
	{
		Etudiant e= EtudiantService.getEtudiant(id);
	modelMap.addAttribute("produit", e);
	return "editerEtudiant";
	}
	@RequestMapping("/updateEtudiant")
	public String updateEtudiant(@ModelAttribute("Etudiant") Etudiant etudiant,
	@RequestParam("date") String date,
	ModelMap modelMap) throws ParseException
	{
	//conversion de la date
	 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
	 Date dateNais = dateformat.parse(String.valueOf(date));
	 etudiant.setDateNais(dateNais);

	 EtudiantService.updateEtudiant(etudiant);
	 List<Etudiant> etud = EtudiantService.getAllEtudiant();
	 modelMap.addAttribute("Etudiant", etud);
	return "listeEtudiants";
	}

	
	
	
	
	}


