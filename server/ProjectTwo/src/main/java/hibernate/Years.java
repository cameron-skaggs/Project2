package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="YEARS")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Years {

	@Id
	@GeneratedValue
	@Column(name="YEAR_ID")
	private int id;
	
	@Column(name="YEAR")
	private int year;
}
