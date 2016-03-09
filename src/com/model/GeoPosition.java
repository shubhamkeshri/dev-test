/**
 * Model Package
 */
package com.model;

/**
 * @author shubham Model class container of GeoPosition Attributes
 */
public class GeoPosition {

	public GeoPosition() {

		this._id = 0;
		this.name = "";
		this.type = "";
		this.latitude = "";
		this.longitude = "";

	}

	/**
	 * @param _id
	 * @param name
	 * @param type
	 * @param latitude
	 * @param longitude
	 */
	public GeoPosition(int _id, String name, String type, String latitude, String longitude) {
		this._id = _id;
		this.name = name;
		this.type = type;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public int _id;
	public String name, type, latitude, longitude;

	/**
	 * @return the _id
	 */
	public int get_id() {
		return _id;
	}

	/**
	 * @param _id
	 *            the _id to set
	 */
	public void set_id(int _id) {
		this._id = _id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * @param latitude
	 *            the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude
	 *            the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

}
