package com.anand.resttemplete;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserData {
	@Id
	public String id;
    public String userName;
    public String data;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "UserData [id=" + id + ", userName=" + userName + ", data=" + data + "]";
	}
    
}
