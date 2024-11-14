package com.xworkz.hotel.dto;

import java.io.Serializable;

public class HotelDTO implements Serializable {

	private int id;
	private String hotelName;
	private String ownerName;
	private boolean veg;
	private String areaName;
	private String streetName;
	private String partnerName;
	private String timings;
	private boolean sundayAvailablity;
	private int ratings;

	public HotelDTO() {

		System.out.println("no arg const of HotelDTO");
	}

	public HotelDTO(int id, String hotelName, String ownerName, boolean veg, String areaName, String streetName,
			String partnerName, String timings, boolean sundayAvailablity, int ratings) {
		super();
		this.id = id;
		this.hotelName = hotelName;
		this.ownerName = ownerName;
		this.veg = veg;
		this.areaName = areaName;
		this.streetName = streetName;
		this.partnerName = partnerName;
		this.timings = timings;
		this.sundayAvailablity = sundayAvailablity;
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "HotelDTO [id=" + id + ", hotelName=" + hotelName + ", ownerName=" + ownerName + ", veg=" + veg
				+ ", areaName=" + areaName + ", streetName=" + streetName + ", partnerName=" + partnerName
				+ ", timings=" + timings + ", sundayAvailablity=" + sundayAvailablity + ", ratings=" + ratings + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areaName == null) ? 0 : areaName.hashCode());
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + id;
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		result = prime * result + ((partnerName == null) ? 0 : partnerName.hashCode());
		result = prime * result + ratings;
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + (sundayAvailablity ? 1231 : 1237);
		result = prime * result + ((timings == null) ? 0 : timings.hashCode());
		result = prime * result + (veg ? 1231 : 1237);
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
		HotelDTO other = (HotelDTO) obj;
		if (areaName == null) {
			if (other.areaName != null)
				return false;
		} else if (!areaName.equals(other.areaName))
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (id != other.id)
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		if (partnerName == null) {
			if (other.partnerName != null)
				return false;
		} else if (!partnerName.equals(other.partnerName))
			return false;
		if (ratings != other.ratings)
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (sundayAvailablity != other.sundayAvailablity)
			return false;
		if (timings == null) {
			if (other.timings != null)
				return false;
		} else if (!timings.equals(other.timings))
			return false;
		if (veg != other.veg)
			return false;
		return true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public boolean isVeg() {
		return veg;
	}

	public void setVeg(boolean veg) {
		this.veg = veg;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getTimings() {
		return timings;
	}

	public void setTimings(String timings) {
		this.timings = timings;
	}

	public boolean isSundayAvailablity() {
		return sundayAvailablity;
	}

	public void setSundayAvailablity(boolean sundayAvailablity) {
		this.sundayAvailablity = sundayAvailablity;
	}

	public int getRatings() {
		return ratings;
	}

	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
}
