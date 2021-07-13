package com.projetBMDrive.entities;
// Generated 29 juin 2021 � 14:18:41 by Hibernate Tools 5.0.6.Final

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * BmdAdherent generated by hbm2java
 */
@Entity
@Table(name = "BMD_ADHERENT", schema = "BMDRIVE")
public class BmdAdherent implements java.io.Serializable {

	private BigDecimal adhId;
	private BmdIdentite bmdIdentite;
	private String adhMotDePasse;
	private String adhNomUtilisateur;
	private BmdPanier bmdPaniers;

	public BmdAdherent() {
	}

	public BmdAdherent(BigDecimal adhId, BmdIdentite bmdIdentite, String adhMotDePasse, String adhNomUtilisateur) {
		this.adhId = adhId;
		this.bmdIdentite = bmdIdentite;
		this.adhMotDePasse = adhMotDePasse;
		this.adhNomUtilisateur = adhNomUtilisateur;
	}

	public BmdAdherent(BigDecimal adhId, BmdIdentite bmdIdentite, String adhMotDePasse, String adhNomUtilisateur,
			BmdPanier bmdPaniers) {
		this.adhId = adhId;
		this.bmdIdentite = bmdIdentite;
		this.adhMotDePasse = adhMotDePasse;
		this.adhNomUtilisateur = adhNomUtilisateur;
		this.bmdPaniers = bmdPaniers;
	}

	@Id
	//@SequenceGenerator(name="BMD_ADHERENT_SEQ", sequenceName = "BMD_ADHERENT_SEQ", allocationSize = 1)
    //@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="BMD_ADHERENT_SEQ")
	@Column(name = "ADH_ID", unique = true, nullable = false, precision = 22, scale = 0)
	public BigDecimal getAdhId() {
		return this.adhId;
	}

	public void setAdhId(BigDecimal adhId) {
		this.adhId = adhId;
	}

	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "ADH_ID_IDENTITE", nullable = false)
	public BmdIdentite getBmdIdentite() {
		return this.bmdIdentite;
	}

	public void setBmdIdentite(BmdIdentite bmdIdentite) {
		this.bmdIdentite = bmdIdentite;
	}

	@Column(name = "ADH_MOT_DE_PASSE", nullable = false, length = 320)
	public String getAdhMotDePasse() {
		return this.adhMotDePasse;
	}

	public void setAdhMotDePasse(String adhMotDePasse) {
		this.adhMotDePasse = adhMotDePasse;
	}

	@Column(name = "ADH_NOM_UTILISATEUR", nullable = false, length = 320)
	public String getAdhNomUtilisateur() {
		return this.adhNomUtilisateur;
	}

	public void setAdhNomUtilisateur(String adhNomUtilisateur) {
		this.adhNomUtilisateur = adhNomUtilisateur;
	}

	@OneToOne(fetch = FetchType.EAGER, mappedBy = "bmdAdherent")
	public BmdPanier getBmdPaniers() {
		return this.bmdPaniers;
	}

	public void setBmdPaniers(BmdPanier bmdPaniers) {
		this.bmdPaniers = bmdPaniers;
	}

}
