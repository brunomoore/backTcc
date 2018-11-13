/**
 * 
 */
package com.serv.entities;

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
@Table(name="Balance")
public class Balance {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id ;
	
	@ManyToOne
	@JoinColumn(name="receipt_id")
	private Receipt receipt ;

	@ManyToOne
	@JoinColumn(name="expense_id")
	private Expense expense ;

	@Column(name="balance_value")
	private Float balanceValue;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	

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
	 * @return the receipt
	 */
	public Receipt getReceipt() {
		return receipt;
	}

	/**
	 * @param receipt the receipt to set
	 */
	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}

	/**
	 * @return the expense
	 */
	public Expense getExpense() {
		return expense;
	}

	/**
	 * @param expense the expense to set
	 */
	public void setExpense(Expense expense) {
		this.expense = expense;
	}

	/**
	 * @return the balanceValue
	 */
	public Float getBalanceValue() {
		return balanceValue;
	}

	/**
	 * @param balanceValue the balanceValue to set
	 */
	public void setBalanceValue(Float balanceValue) {
		this.balanceValue = balanceValue;
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
	
	

	
	
	
	
}
