package com.gomalmarket.shop.core.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Table(name = "LOANERS")
@Entity(name = "Loaner")
@Setter
@Getter
public class Loaner extends BaseEntity  {
	
	@TableGenerator(name = "TABLE_GENERATOR",table = "ID_TABLE",
			pkColumnName = "ID_TABLE_NAME",
			pkColumnValue = "LOANER_ID",
			valueColumnName = "ID_TABLE_VALUE",allocationSize = 1)
	@GeneratedValue(strategy =  GenerationType.TABLE,generator = "TABLE_GENERATOR")

	@Id
	@Column(name ="ID" )
	private int id ;
	
    @Column(name = "NAME")
    private String name;

    @Column(name = "LOAN_ACCOUNT_ID")
    private int loanAccountId;
 

}
