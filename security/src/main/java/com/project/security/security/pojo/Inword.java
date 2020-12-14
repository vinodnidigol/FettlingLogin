package com.project.security.security.pojo;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;
@Component 
@Entity
@Table(name="inword")
public class Inword {
	@Id
	@Column(name="kfilno")
	private int kfilno ;
	
	 
	@Column(name="kfildate")
	private Date indate ;
	
	@Column(name="descname")
	private String descname ;
	
	@Column(name="qty")
	private int qty ;
	
	@Column(name="infet")
	private int infet ;
	
	@Column(name="inrsb")
	private int inrsb ;

	@Column(name="inpnt")
	private int inpnt ;
	
	@Column(name="inavg")
	private int inavg ;
	
	@Column(name="injolt")
	private int injolt ;
	
	@Column(name="indcwj")
	private int indcwj ;
	
	@Column(name="inrw")
	private int inrw ;
	
	@Column(name="inpsb")
	private int inpsb ;
	
	@Column(name="vehcileno")
	private String vehcileno ;
	
	@Column(name="eway")
	private String eway ;
	
	
	public Inword() {
		super();
	}
	
	public Inword(int kfilno, Date indate, String descname, int qty, int infet, int inrsb, int inpnt,
			int inavg, int injolt, int indcwj, int inrw, int inpsb, String vehcileno, String eway) {
		super();
		this.kfilno = kfilno;
		this.indate = indate;
		this.descname = descname;
		this.qty = qty;
		this.infet = infet;
		this.inrsb = inrsb;
		this.inpnt = inpnt;
		this.inavg = inavg;
		this.injolt = injolt;
		this.indcwj = indcwj;
		this.inrw = inrw;
		this.inpsb = inpsb;
		this.vehcileno = vehcileno;
		this.eway = eway;
	}
	public int getKfilno() {
		return kfilno;
	}
	public void setKfilno(int kfilno) {
		this.kfilno = kfilno;
	}
	public Date getIndate() {
		return indate;
	}       
	public void setIndate(Date indate) {
		this.indate = indate;
	}
	public String getDescname() {
		return descname;
	}
	public void setDescname(String descname) {
		this.descname = descname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getInfet() {
		return infet;
	}
	public void setInfet(int infet) {
		this.infet = infet;
	}
	public int getInrsb() {
		return inrsb;
	}
	public void setInrsb(int inrsb) {
		this.inrsb = inrsb;
	}
	public int getInpnt() {
		return inpnt;
	}
	public void setInpnt(int inpnt) {
		this.inpnt = inpnt;
	}
	public int getInavg() {
		return inavg;
	}
	public void setInavg(int inavg) {
		this.inavg = inavg;
	}
	public int getInjolt() {
		return injolt;
	}
	public void setInjolt(int injolt) {
		this.injolt = injolt;
	}
	public int getIndcwj() {
		return indcwj;
	}
	public void setIndcwj(int indcwj) {
		this.indcwj = indcwj;
	}
	public int getInrw() {
		return inrw;
	}
	public void setInrw(int inrw) {
		this.inrw = inrw;
	}
	public int getInpsb() {
		return inpsb;
	}
	public void setInpsb(int inpsb) {
		this.inpsb = inpsb;
	}
	public String getVehcileno() {
		return vehcileno;
	}
	public void setVehcileno(String vehcileno) {
		this.vehcileno = vehcileno;
	}
	public String getEway() {
		return eway;
	}
	public void setEway(String eway) {
		this.eway = eway;
	}
	
	
	

}
