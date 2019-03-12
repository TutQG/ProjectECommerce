package fr.adaming.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="orders")
public class Order implements Serializable {

	
	//déclaration attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idOrder")
	private int id;
	private Date orderDate;
	
	//constructeurs
	public Order() {
		super();
	}
	public Order(Date orderDate) {
		super();
		this.orderDate = orderDate;
	}
	public Order(int id, Date orderDate) {
		super();
		this.id = id;
		this.orderDate = orderDate;
	}
	
	//getter et setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	
	
}
