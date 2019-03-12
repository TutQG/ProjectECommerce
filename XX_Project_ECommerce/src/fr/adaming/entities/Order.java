package fr.adaming.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order implements Serializable {

	// déclaration attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idOrder")
	private int id;
	private Date orderDate;

	@OneToMany(mappedBy = "order", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	private List<Customer> listCusto;

	@ManyToMany
	@JoinTable(name = "joinOrder", joinColumns = @JoinColumn(name = "idOrder"), inverseJoinColumns = @JoinColumn(name = "productId"))
	private List<Product> listProd;

	// constructeurs
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

	// getter et setter
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

	public List<Customer> getListCusto() {
		return listCusto;
	}

	public void setListCusto(List<Customer> listCusto) {
		this.listCusto = listCusto;
	}

	public List<Product> getListProd() {
		return listProd;
	}

	public void setListProd(List<Product> listProd) {
		this.listProd = listProd;
	}

}
