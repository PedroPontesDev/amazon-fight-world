package com.amazon_figth_world.model.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Embeddable
public class Endereco {
	
	private String rua;
	
	private Integer numeroEnd;
	
	private String cep;
	
	private Double latitude;
	
	private Double longitude;

	public Endereco(String rua, Integer numeroEnd, String cep, Double latitude, Double longitude) {
		this.rua = rua;
		this.numeroEnd = numeroEnd;
		this.cep = cep;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumeroEnd() {
		return numeroEnd;
	}

	public void setNumeroEnd(Integer numeroEnd) {
		this.numeroEnd = numeroEnd;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
	
	
	

}
