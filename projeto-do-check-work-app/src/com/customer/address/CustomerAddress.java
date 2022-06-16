package com.customer.address;


public class CustomerAddress {
	private String road;
	private String district;
	private String City;
	private String state;
	private String country;
	
	public String getRua() {
		return road;
	}
	public void setRua(String rua) {
		this.road = rua;
	}
	public String getBairro() {
		return district;
	}
	public void setBairro(String district) {
		this.district = district;
	}
	public String getCidade() {
		return City;
	}
	public void setCidade(String City) {
		this.City = City;
	}
	public String getEstado() {
		return state;
	}
	public void setEstado(String state) {
		this.state = state;
	}
	public String getPais() {
		return country;
	}
	public void setPais(String country) {
		this.country =country;
	}

}
