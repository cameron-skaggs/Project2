package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Location")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Location {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="LOCATION_SEQ")
	@SequenceGenerator(name="LOCATION_SEQ", sequenceName="LOCATION_SEQ", allocationSize=1)
	@Column(name = "LOCATION_ID")
	private int id;

	@Column(name = "LOCATION_NAME")
	private String name;

	
	public Location(String name) {
		super();
		this.name = name;
	}

	public Location(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", name=" + name + "]";
	}
}
