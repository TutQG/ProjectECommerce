package fr.adaming.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderLines")
public class OrderLine {

	//attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int quatity;
	private double price;
	
	//constructeurs
	public OrderLine() {
		super();
	}
	public OrderLine(int quatity, double price) {
		super();
		this.quatity = quatity;
		this.price = price;
	}
	
	//getter et setter
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
