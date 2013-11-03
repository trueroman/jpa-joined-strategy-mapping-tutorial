package com.jpa.joined.strategy.mapping.tutorial.domain;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "releases")
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "release_type")
public abstract class Release {

	@Id
	@Column(name = "release_id")
	private int id;

	@Column(name = "release_name")
	private String name;

	@Column(name = "release_year")
	private int year;

	@Column(name = "release_length")
	private String length;

    protected Release() {

	}

	protected Release(int id, String name, int year, String length) {
		this.id = id;
		this.name = name;
		this.year = year;
		this.length = length;
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Release{" +
				"id=" + id +
				", name='" + name + '\'' +
				", year=" + year +
				", length='" + length + '\'' +
				'}';
	}
}
