package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="Location")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Location {
	@Id
	@GeneratedValue
	@Column(name = "LOCATION_ID")
	private int id;

	@Column(name = "LOCATION_NAME")
	private String name;
}
