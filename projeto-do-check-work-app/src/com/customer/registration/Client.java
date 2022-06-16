package com.customer.registration;

public class Client {
	private String name;
	private String identificationRecord;
	private char sex;
	private String email;
	private String telephone;
	
	public String getNome() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getRg() {
		return identificationRecord;
	}
	public void setRg(String identificationRecord) {
		this.identificationRecord = identificationRecord;
	}
	public char getSexo() {
		return sex;
	}
	public void setSexo(char sex) {
		this.sex = sex;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telephone;
	}
	public void setTelefone(String telephone) {
		this.telephone = telephone;
	}
	
	public String nomeCliente(String name) {
		return this.name = name;
	}
	
	public String rgCliente(String identificationRecord) {
		return this.identificationRecord = identificationRecord;
	}
	
	public void sexoClinte() {
		
		if(this.sex == 'M' && this.sex == 'm') {
			System.out.println("Sexo: [ M ]");
		}
		else if(this.sex == 'F' && this.sex == 'f') {
			System.out.println("Sexo: [ F ]");
		}
		else {
			System.out.println("Digite um sexo valído.");
		}
	}
	
	public String customerPhone(String telephone) {
		return this.telephone = telephone;
	}

}
