package com.gomalmarket.shop.core.entities.basic;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;
import java.util.Date;
@MappedSuperclass
@Setter
@Getter
 
public abstract class BaseEntity implements ISysInfo {
	

	@Column(name = "CHANGER_ID")
	private Integer changerId;

	@Column(name = "TIMESTAMP_")
	private Timestamp timestamp;

	@Column(name = "CHANGE_DATE")
	private Date changeDate;

	@Column(name = "CHANGED")
	private Integer changed=1;

	
	public BaseEntity() {
		
		  this.changed=1;
		 this.timestamp=new Timestamp(new Date().getTime()); 
		  this.changeDate=new Date(); //
		  this.changerId=0;
		  
		 
	}


	

}
