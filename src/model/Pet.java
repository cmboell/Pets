package model;

import java.util.Date;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Oct 3, 2021
 */
//Colby Boell
public class Pet {
	//variables
	private String petName;
	private Date visitDate;
	private String petType;
	
	/**
	 * 
	 */
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * @param petName
	 * @param visitDate
	 * @param petType
	 */
	public Pet(String petName, Date visitDate, String petType) {
		super();
		this.petName = petName;
		this.visitDate = visitDate;
		this.petType = petType;
	}
	//getters/setters



	/**
	 * @return the petName
	 */
	public String getPetName() {
		return petName;
	}



	/**
	 * @param petName the petName to set
	 */
	public void setPetName(String petName) {
		this.petName = petName;
	}



	/**
	 * @return the visitDate
	 */
	public Date getVisitDate() {
		return visitDate;
	}



	/**
	 * @param visitDate the visitDate to set
	 */
	public void setVisitDate(Date visitDate) {
		this.visitDate = visitDate;
	}



	/**
	 * @return the petType
	 */
	public String getPetType() {
		return petType;
	}



	/**
	 * @param petType the petType to set
	 */
	public void setPetType(String petType) {
		this.petType = petType;
	}
}
