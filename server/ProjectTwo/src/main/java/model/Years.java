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
@Table(name="YEARS")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Years {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="YEARS_SEQ")
	@SequenceGenerator(name="YEARS_SEQ", sequenceName="YEARS_SEQ", allocationSize=1)
	@Column(name="YEAR_ID")
	private int id;
	
	@Column(name="YEAR")
	private int year;

	public Years(int id, int year) {
		super();
		this.id = id;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
