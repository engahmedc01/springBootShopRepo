package com.gomalmarket.shop.core.entities.customers;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import com.gomalmarket.shop.core.entities.basic.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Table(name ="CUSTOMERS")
@Entity(name ="Customer")
@Setter
@Getter
public class Customer extends BaseEntity  {
	@TableGenerator(name = "TABLE_GENERATOR",table = "ID_TABLE",
			pkColumnName = "ID_TABLE_NAME",
			pkColumnValue = "CUSTOMER_ID",
			valueColumnName = "ID_TABLE_VALUE",allocationSize = 1)
	@GeneratedValue(strategy =  GenerationType.TABLE,generator = "TABLE_GENERATOR")

 
	@Id
	@Column(name ="ID" )
	private int id ;
	@Column(name = "NAME")
	private String name;

	@Column(name = "ADDRESS")
	private String address;

	@Column(name = "PHONE")
	private String phone;

	@ManyToOne
	@JoinColumn(name = "TYPE_ID")
	private CustomerType type;
	
}