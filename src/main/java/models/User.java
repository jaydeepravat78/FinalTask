package models;

import java.io.InputStream;
import java.util.List;

public class User {
	private int id;
	public String name;
	private String email;
	private String password;
	private String phone;
	private String gender;
	private String game;
	private String[] lang;
	private String secQues;
	private InputStream photo;
	private String base64Photo;
	private List<Address> addresses;
	private boolean isAdmin;

	public String getBase64Photo() {
		return base64Photo;
	}

	public void setBase64Photo(String base64Photo) {
		this.base64Photo = base64Photo;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public String getSecQues() {
		return secQues;
	}

	public InputStream getPhoto() {
		return photo;
	}

	public void setPhoto(InputStream photo) {
		this.photo = photo;
	}

	public void setSecQues(String secQues) {
		this.secQues = secQues;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public String[] getLang() {
		return lang;
	}

	public void setLang(String[] lang) {
		this.lang = lang;
	}

}
