package com.educandoweb.course.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.entities.Product;

@Embeddable // indica que é uma class composta
public class OrderItemPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne // relacionamento muitos para 1
	@JoinColumn(name = "order_id") // nome da chave estrangeira
	private Order order;

	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	/* Class especial sem contrutor */

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		return Objects.hash(order, product);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItemPK other = (OrderItemPK) obj;
		return Objects.equals(order, other.order) && Objects.equals(product, other.product);
	}

}
