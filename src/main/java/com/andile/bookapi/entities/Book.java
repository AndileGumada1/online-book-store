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
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name = "BOOK")
@Setter
@Getter
@ToString
public class Book {
	
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
	///
	@JoinColumn(foreignKey = @ForeignKey(name="category_id") 	, nullable=false)
	private BookCategory category;


	public Book(Long id, String sku, String name, String description, double unitPrice, String imageUrl, boolean active,
			int unitsInStock, LocalDateTime createdOn, LocalDateTime updatedOn, BookCategory category) {

		this.id = id;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.imageUrl = imageUrl;
		this.active = active;
		this.unitsInStock = unitsInStock;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.category = category;
	}
	public Book() {
		
	}
	public void setCategory(String string) {
		// TODO Auto-generated method stub
		
	}

}
