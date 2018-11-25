/**
 * 
 */
package com.serv.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Bruno Moore
 *
 */

@Entity
@Table(name="Receipt")
public class Receipt {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id ;
	
	@Column(name="name")
	private String name ;

	@Column(name="value")
	private Float value ;

	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="type_id")
	private ReceiptType type;
	
	@Column(name="receipt_date")
	private LocalDate receiptDate;
	
	@Column(name="receipt_expire_date")
	private LocalDate expireDate;
	
	@Column(name="receipt_pay")
	private Boolean pay;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value
	 */
	public Float getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Float value) {
		this.value = value;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the type
	 */
	public ReceiptType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ReceiptType type) {
		this.type = type;
	}

	/**
	 * @return the receiptDate
	 */
	public LocalDate getReceiptDate() {
		return receiptDate;
	}

	/**
	 * @param receiptDate the receiptDate to set
	 */
	public void setReceiptDate(LocalDate receiptDate) {
		this.receiptDate = receiptDate;
	}

	/**
	 * @return the expireDate
	 */
	public LocalDate getExpireDate() {
		return expireDate;
	}

	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
	}

	/**
	 * @return the pay
	 */
	public Boolean getPay() {
		return pay;
	}

	/**
	 * @param pay the pay to set
	 */
	public void setPay(Boolean pay) {
		this.pay = pay;
	}
	
	

	
	
	
	
}
