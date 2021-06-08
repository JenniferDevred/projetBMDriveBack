package com.projetBMDrive.entities;
// Generated 8 juin 2021 � 11:44:16 by Hibernate Tools 5.0.6.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TSupportmedia generated by hbm2java
 */
@Entity
@Table(name = "T_SUPPORTMEDIA", schema = "BMDRIVE")
public class TSupportmedia implements java.io.Serializable {

	private TSupportmediaId id;
	private TArticle TArticle;

	public TSupportmedia() {
	}

	public TSupportmedia(TSupportmediaId id, TArticle TArticle) {
		this.id = id;
		this.TArticle = TArticle;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "supType", column = @Column(name = "SUP_TYPE", nullable = false, length = 20)),
			@AttributeOverride(name = "supDuree", column = @Column(name = "SUP_DUREE", nullable = false, precision = 22, scale = 0)),
			@AttributeOverride(name = "supObjetId", column = @Column(name = "SUP_OBJET_ID", nullable = false, precision = 22, scale = 0)) })
	public TSupportmediaId getId() {
		return this.id;
	}

	public void setId(TSupportmediaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SUP_OBJET_ID", nullable = false, insertable = false, updatable = false)
	public TArticle getTArticle() {
		return this.TArticle;
	}

	public void setTArticle(TArticle TArticle) {
		this.TArticle = TArticle;
	}

}
