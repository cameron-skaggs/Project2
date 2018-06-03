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
@Table(name="SKILL")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
public class Skill {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SKILL_SEQ")
	@SequenceGenerator(name="SKILL_SEQ", sequenceName="SKILL_SEQ", allocationSize=1)
	@Column(name = "SKILL_ID")
	private int id;

	@Column(name = "SKILL_NAME")
	private String name;

	public Skill(String name) {
		super();
		this.name = name;
	}
	public Skill(int id, String name) {
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
	
}
