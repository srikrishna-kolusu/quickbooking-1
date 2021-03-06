package com.booking.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.booking.form.ProviderEnrollmentForm;

import javax.persistence.*;

/**
 * Created by raghuramn on 6/16/16.
 */
@Entity
@Table(name="PROVIDER")
public class Provider implements Serializable{

	@Id
	@GeneratedValue
	@Column(name = "ID")
	Long id;
	@Column(name = "FIRST_NAME")
	String firstName;
	@Column(name = "MIDDLE_NAME")
	String middleName;
	@Column(name = "LAST_NAME")
	String lastName;
	@Column(name = "EMAIL")
	String email;
	@Column(name = "PASSWORD")
	String password;
	@Column(name = "PRIMARY_PHONE")
	String primaryPhone;
	@Column(name = "ALTERNATE_PHONE")
	String alternatePhone;

	@OneToMany(cascade=CascadeType.ALL, mappedBy = "provider")
	Set<Property> properties = new HashSet<Property>();

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "provider")
	List<ProviderImageFile> photos = new ArrayList<ProviderImageFile>();



	public Provider() {
	}
	
	public Provider(ProviderEnrollmentForm form) {
		this.firstName = form.getFirstName();
		this.lastName = form.getLastName();
		this.email = form.getEmail();
		this.password = form.getPassword();
		this.primaryPhone = form.getPrimaryPhone();
		this.alternatePhone = form.getAlternatePhone();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrimaryPhone() {
		return primaryPhone;
	}

	public void setPrimaryPhone(String primaryPhone) {
		this.primaryPhone = primaryPhone;
	}

	public String getAlternatePhone() {
		return alternatePhone;
	}

	public void setAlternatePhone(String alternatePhone) {
		this.alternatePhone = alternatePhone;
	}

	public Set<Property> getProperties() {
		return properties;
	}

	public void setProperties(HashSet<Property> properties) {
		this.properties = properties;
	}

	public List<ProviderImageFile> getPhotos() {
		return photos;
	}

	public void setPhotos(List<ProviderImageFile> photos) {
		this.photos = photos;
	}
}
