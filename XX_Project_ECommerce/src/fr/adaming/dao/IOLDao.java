package fr.adaming.dao;

import java.util.List;

import fr.adaming.entities.OrderLine;

public interface IOLDao {

	public List<OrderLine> getAllOL(OrderLine ol);

	public OrderLine addOL(OrderLine ol);

	public int updateOL(OrderLine ol);

	public int deleteOL(OrderLine ol);
}
