package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="TRAINING_TYPE")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class TrainingType {

	@Id
	@GeneratedValue
	@Column(name="TRAINING_ID")
	private int id;
	
	@Column(name="TRAINING_NAME")
	private String name;
}
