package com.andile.bookapi.entities;


import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.*;


@Entity
@Table(name = "BOOK")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Book implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	
	private String sku;
	
	private String name;
	
	private String description;
	
	@Column(name = "unit_price")
	private double unitPrice;
	@Column(name ="image_url")
	private String imageUrl;
	
	private boolean active;
	
	@Column(name = "unit_in_stock")
	private int unitsInStock;
	@Column(name = "date_created")
	private LocalDateTime createdOn;
	@Column(name = "last_updated")
	private LocalDateTime updatedOn;
	@ManyToOne
	@JoinColumn(foreignKey = @ForeignKey(name="category_id") 	, nullable=false)
	private BookCategory category;

}
