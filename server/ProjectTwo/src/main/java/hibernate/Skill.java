package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="SKILL")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Skill {
	
	@Id
	@GeneratedValue
	@Column(name = "SKILL_ID")
	private int id;

	@Column(name = "SKILL_NAME")
	private String name;
}
