package fr.adaming.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class Product implements Serializable {

	
	//Déclaration des attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProduct")
	private int id;
	private String designation;
	private String description;
	private double price;
	private int quantity;
	private boolean select;
	private byte[] photo;
	
	//constructeurs
	public Product() {
		super();
	}

	public Product(String designation, String description, double price, int quantity, boolean select, byte[] photo) {
		super();
		this.designation = designation;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.select = select;
		this.photo = photo;
	}

	public Product(int id, String designation, String description, double price, int quantity, boolean select,
			byte[] photo) {
		super();
		this.id = id;
		this.designation = designation;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.select = select;
		this.photo = photo;
	}

	//getter et setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isSelect() {
		return select;
	}

	public void setSelect(boolean select) {
		this.select = select;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	
	
}
