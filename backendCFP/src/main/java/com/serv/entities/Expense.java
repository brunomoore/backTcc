/**
 * 
 */
package com.serv.entities;

import java.util.Date;

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
@Table(name="Expense")
public class Expense {

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
	private ExpenseType type;
	
	@Column(name="expense_date")
	private Date expenseDate;
	
	@Column(name="expense_expire_date")
	private Date expireDate;
	
	@Column(name="expense_pay")
	private Boolean pay = false;
	
	@Column(name="parcela")
	private Integer parcela;
	
	@Column(name="nr_parcela")
	private Integer numeroParcela;
	
	@Column(name="ativo")
	private Boolean ativo;
	
	@Column(name="valor_total")
	private Float valorTotal;
	
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
	public ExpenseType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(ExpenseType type) {
		this.type = type;
	}

	/**
	 * @return the expenseDate
	 */
	public Date getExpenseDate() {
		return expenseDate;
	}

	/**
	 * @param expenseDate the expenseDate to set
	 */
	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}

	/**
	 * @return the expireDate
	 */
	public Date getExpireDate() {
		return expireDate;
	}

	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(Date expireDate) {
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

	/**
	 * @return the parcela
	 */
	public Integer getParcela() {
		return parcela;
	}

	/**
	 * @param parcela the parcela to set
	 */
	public void setParcela(Integer parcela) {
		this.parcela = parcela;
	}

	/**
	 * @return the numeroParcela
	 */
	public Integer getNumeroParcela() {
		return numeroParcela;
	}

	/**
	 * @param numeroParcela the numeroParcela to set
	 */
	public void setNumeroParcela(Integer numeroParcela) {
		this.numeroParcela = numeroParcela;
	}

	/**
	 * @return the ativo
	 */
	public Boolean getAtivo() {
		return ativo;
	}

	/**
	 * @param ativo the ativo to set
	 */
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}

	/**
	 * @return the valorTotal
	 */
	public Float getValorTotal() {
		return valorTotal;
	}

	/**
	 * @param valorTotal the valorTotal to set
	 */
	public void setValorTotal(Float valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	

	
	
	
	
}
