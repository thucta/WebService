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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Room generated by hbm2java
 */
@XmlRootElement(name = "room")
@Entity
@Table(name = "ROOM")
//@XmlAccessorType(XmlAccessType.NONE)
public class Room {
	//@XmlElement(name = "id")
	private int id;
	//@XmlElement(name = "information")
	private Information information;
	//@XmlElement(name = "type")
	private String type;
	//@XmlElement(name = "detail")
	private String detail;
	//@XmlElement(name = "quanlity")
	private int quanlity;
	//@XmlElement(name = "image")
	private String image;
	//@XmlElement(name = "maxpeople")
	private int maxpeople;
	//@XmlElement(name = "price")
	private int price;
	
	private Set<Booking> bookings = new HashSet<Booking>(0);

/*	private String inforName = information.getName();
	

	public String getInforName() {
		return inforName;
	}

	public void setInforName(String inforName) {
		this.inforName = inforName;
	}
*/
	public Room() {
	}

	public Room(int id, Information information, String type, int maxpeople, int price) {
		this.id = id;
		this.information = information;
		this.type = type;
		this.maxpeople = maxpeople;
		this.price = price;
	}

	public Room(int id, Information information, String type, String detail, int quanlity,
			int maxpeople, int price, Set<Booking> bookings, String image) {
		this.id = id;
		this.information = information;
		this.type = type;
		this.detail = detail;
		this.quanlity = quanlity;
		this.maxpeople = maxpeople;
		this.price = price;
		this.bookings = bookings;
		this.image = image;

	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "infor", nullable = false)
	@XmlTransient
	public Information getInformation() {
		return this.information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	@Column(name = "type", nullable = false)
	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Column(name = "image", nullable = false)
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	

	@Column(name = "detail")
	public String getDetail() {
		return this.detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Column(name = "quanlity")
	public int getQuanlity() {
		return this.quanlity;
	}

	public void setQuanlity(int quanlity) {
		this.quanlity = quanlity;
	}

	@Column(name = "maxpeople", nullable = false)
	public int getMaxpeople() {
		return this.maxpeople;
	}

	public void setMaxpeople(int maxpeople) {
		this.maxpeople = maxpeople;
	}

	@Column(name = "price", nullable = false, scale = 4)
	public int getPrice() {
		return this.price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
	@XmlTransient
	public Set<Booking> getBookings() {
		return this.bookings;
	}

	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}

	
}
