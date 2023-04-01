package com.xworkz.fine.dto;

import java.io.Serializable;
import java.util.Objects;

public class SoftwereDTO implements Serializable{
     private int id;
     private String name;
     private  String version;
     private String developedBy;
   
     public SoftwereDTO() {
		System.out.println("No args const");
	}

	public SoftwereDTO(int id, String name, String version, String developedBy) {
		super();
		this.id = id;
		this.name = name;
		this.version = version;
		this.developedBy = developedBy;
	}

	@Override
	public String toString() {
		return "SoftwereDTO [id=" + id + ", name=" + name + ", version=" + version + ", developedBy=" + developedBy
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof SoftwereDTO)) {
			return false;
		}
		SoftwereDTO other = (SoftwereDTO) obj;
		return id == other.id && Objects.equals(name, other.name);
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDevelopedBy() {
		return developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
     
}
