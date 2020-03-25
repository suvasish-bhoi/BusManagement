package com.bus.hbm;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bus")
public class Bus {
	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "model")
	private Integer modelNo;

	@Column(name = "seater")
	private Integer seater;

	@Column(name = "busno")
	private Integer busNo;

	@OneToMany
	private Set<Route> routes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getModelNo() {
		return modelNo;
	}

	public void setModelNo(Integer modelNo) {
		this.modelNo = modelNo;
	}

	public Integer getSeater() {
		return seater;
	}

	public void setSeater(Integer seater) {
		this.seater = seater;
	}

	public Integer getBusNo() {
		return busNo;
	}

	public void setBusNo(Integer busNo) {
		this.busNo = busNo;
	}

	public Set<Route> getRoutes() {
		return routes;
	}

	public void setRoutes(Set<Route> routes) {
		this.routes = routes;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", modelNo=" + modelNo + ", seater=" + seater + ", busNo=" + busNo + ", routes="
				+ routes + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((busNo == null) ? 0 : busNo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((modelNo == null) ? 0 : modelNo.hashCode());
		result = prime * result + ((routes == null) ? 0 : routes.hashCode());
		result = prime * result + ((seater == null) ? 0 : seater.hashCode());
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
		Bus other = (Bus) obj;
		if (busNo == null) {
			if (other.busNo != null)
				return false;
		} else if (!busNo.equals(other.busNo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (modelNo == null) {
			if (other.modelNo != null)
				return false;
		} else if (!modelNo.equals(other.modelNo))
			return false;
		if (routes == null) {
			if (other.routes != null)
				return false;
		} else if (!routes.equals(other.routes))
			return false;
		if (seater == null) {
			if (other.seater != null)
				return false;
		} else if (!seater.equals(other.seater))
			return false;
		return true;
	}
}
