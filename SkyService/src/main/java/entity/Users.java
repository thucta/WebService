package entity;
// Generated Mar 24, 2017 7:27:14 PM by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Users generated by hbm2java
 */
@XmlRootElement
@Entity
@Table(name = "USERS")
@XmlAccessorType(XmlAccessType.NONE)
public class Users {
	@XmlElement(name = "id")
	private int id;
	@XmlElement(name = "fullname")
	private String fullname;
	@XmlElement(name = "phone")
	private String phone;
	@XmlElement(name = "email")
	private String email;
	@XmlElement(name = "password")
	private String password;
	
	@XmlElement(name = "point")
	private int point;
	@XmlElement(name = "booking")
	private Set<Booking> bookings = new HashSet<Booking>(0);
	
	private Set<Information> informations = new HashSet<Information>(0);

	public Users() {
	}

	public Users(int id, String fullname, String phone, String email, String password, int point) {
		this.id = id;
		this.fullname = fullname;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.point = point;
	}

	public Users(int id, String fullname, String phone, String email, String password, int point, Set<Booking> bookings,
			Set<Information> informations) {
		this.id = id;
		this.fullname = fullname;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.point = point;
		this.bookings = bookings;

		this.informations = informations;

	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "fullname", nullable = false)

	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "phone", nullable = false)

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", nullable = false)

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false)

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "point", nullable = false)

	public int getPoint() {
		return this.point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	@Column(name = "booking", nullable = false)
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "RATING", joinColumns = {
			@JoinColumn(name = "users", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "infor", nullable = false, updatable = false) })
	public Set<Information> getInformations() {
		return this.informations;
	}

	public void setInformations(Set<Information> informations) {
		this.informations = informations;
	}

}
