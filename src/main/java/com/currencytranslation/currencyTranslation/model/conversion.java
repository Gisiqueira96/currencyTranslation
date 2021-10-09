package com.currencytranslation.currencyTranslation.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;


@Entity
@Table(name = "currency_translation")
public class conversion {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long idUser;
	
	@NotBlank
	@Size (max =3)
	private String currencyOrigin;

	@Positive
	private double sourceValue;

	@NotBlank
	@Size (max =3)
	private String destinationCurrency;

	@Positive
	private double conversionRate;
	
	@Temporal(TemporalType.TIMESTAMP) 
	private Date date =  new java.sql.Date(System.currentTimeMillis());
	

	public long getIdUser() {
		return idUser;
	}
	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}
	public String getCurrencyOrigin() {
		return currencyOrigin;
	}
	public void setCurrencyOrigin(String currencyOrigin) {
		this.currencyOrigin = currencyOrigin;
	}
	public double getSourceValue() {
		return sourceValue;
	}
	public void setSourceValue(double sourceValue) {
		this.sourceValue = sourceValue;
	}
	public String getDestinationCurrency() {
		return destinationCurrency;
	}
	public void setDestinationCurrency(String destinationCurrency) {
		this.destinationCurrency = destinationCurrency;
	}
	public double getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
