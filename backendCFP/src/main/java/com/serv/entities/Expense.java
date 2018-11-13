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
	
	

	
	
	
	
}
