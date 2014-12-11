package com.equator.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DMACConfig")
public class DMACConfig {

	@Id
	private String configKey 				= "";
	
	private String configValue				= "";
	
	private String createdBy				= "";
	
	private String createdDate				= "";
	
	
	
}
