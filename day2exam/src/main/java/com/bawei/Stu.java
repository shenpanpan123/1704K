package com.bawei;

public class Stu {
	
	private Integer id;
	private String sno;
	private String name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", sno=" + sno + ", name=" + name + "]";
	}
	public Stu(Integer id, String sno, String name) {
		super();
		this.id = id;
		this.sno = sno;
		this.name = name;
	}
	public Stu() {
		super();
	}
	
	
	
}
