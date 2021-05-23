package com.ecom.order.dao;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LineitemDao {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String itemId;
	private int qty;
	private int price;
//    @ManyToOne(fetch = FetchType.EAGER,optional = false,cascade = CascadeType.PERSIST)
//    @JoinColumn(name = "ORDER_ID", referencedColumnName = "ID")
//    private OrderDao order;

}
