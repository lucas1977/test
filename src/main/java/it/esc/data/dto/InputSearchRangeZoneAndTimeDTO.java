package it.esc.data.dto;

import java.io.Serializable;

public class InputSearchRangeZoneAndTimeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6193230680326538078L;

	private Double maxLat;
	
	private Double minLat;
	
	private Double maxLng;
	
	private Double minLng;
	
	private String startDate;
	
	private String endDate;

	/**
	 * @return the maxLat
	 */
	public Double getMaxLat() {
		return maxLat;
	}

	/**
	 * @param maxLat the maxLat to set
	 */
	public void setMaxLat(Double maxLat) {
		this.maxLat = maxLat;
	}

	/**
	 * @return the minLat
	 */
	public Double getMinLat() {
		return minLat;
	}

	/**
	 * @param minLat the minLat to set
	 */
	public void setMinLat(Double minLat) {
		this.minLat = minLat;
	}

	/**
	 * @return the maxLng
	 */
	public Double getMaxLng() {
		return maxLng;
	}

	/**
	 * @param maxLng the maxLng to set
	 */
	public void setMaxLng(Double maxLng) {
		this.maxLng = maxLng;
	}

	/**
	 * @return the minLng
	 */
	public Double getMinLng() {
		return minLng;
	}

	/**
	 * @param minLng the minLng to set
	 */
	public void setMinLng(Double minLng) {
		this.minLng = minLng;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
