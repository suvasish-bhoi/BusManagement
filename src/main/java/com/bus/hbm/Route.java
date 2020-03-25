package com.bus.hbm;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "route")
public class Route {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "startto")
	private String startTo;

	@Column(name = "endfrom")
	private String endFrom;

	@Column(name = "day")
	private String day;

	@Column(name = "departuretiming")
	private Date departureTiming;

	@Column(name = "arrivaltiming")
	private Date ArrivingTiming;

	@ManyToOne
	@JoinColumn(name = "CreatedBy")
	private Users createdBy;

	@ManyToOne
	@JoinColumn(name = "BusID")
	private Bus bus;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ArrivingTiming == null) ? 0 : ArrivingTiming.hashCode());
		result = prime * result + ((bus == null) ? 0 : bus.hashCode());
		result = prime * result + ((createdBy == null) ? 0 : createdBy.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((departureTiming == null) ? 0 : departureTiming.hashCode());
		result = prime * result + ((endFrom == null) ? 0 : endFrom.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((startTo == null) ? 0 : startTo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Route other = (Route) obj;
		if (ArrivingTiming == null) {
			if (other.ArrivingTiming != null)
				return false;
		} else if (!ArrivingTiming.equals(other.ArrivingTiming))
			return false;
		if (bus == null) {
			if (other.bus != null)
				return false;
		} else if (!bus.equals(other.bus))
			return false;
		if (createdBy == null) {
			if (other.createdBy != null)
				return false;
		} else if (!createdBy.equals(other.createdBy))
			return false;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (departureTiming == null) {
			if (other.departureTiming != null)
				return false;
		} else if (!departureTiming.equals(other.departureTiming))
			return false;
		if (endFrom == null) {
			if (other.endFrom != null)
				return false;
		} else if (!endFrom.equals(other.endFrom))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (startTo == null) {
			if (other.startTo != null)
				return false;
		} else if (!startTo.equals(other.startTo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Route [id=" + id + ", startTo=" + startTo + ", endFrom=" + endFrom + ", day=" + day
				+ ", departureTiming=" + departureTiming + ", ArrivingTiming=" + ArrivingTiming + ", createdBy="
				+ createdBy + ", bus=" + bus + "]";
	}

}
