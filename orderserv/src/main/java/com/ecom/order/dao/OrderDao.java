package com.ecom.order.dao;

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
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@NamedEntityGraph(name = "Order.lineitems",
//    attributeNodes = @NamedAttributeNode("lineitems")
//)
 //@EntityGraph(value = "Item.characteristics")
public class OrderDao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String customerId;
	
	@Column(name="status_code")
	private OrderStatus status;
	@Column(
	        name = "created_on",
	        nullable = false,
	        updatable = false
	)
	private Date dateOfPurchase;
	 //@OneToMany(mappedBy = "teacher",fetch = FetchType.EAGER)
	 @OneToMany(cascade = CascadeType.PERSIST)
	 @JoinColumn(name = "order_id")
    private List<LineitemDao> lineitems;

}
