/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.arkadinovikov.jee6handon.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

/**
 *
 * @author Novikov
 */
@Embeddable
public class Address implements Serializable
{

	private static final long serialVersionUID = 1L;
	
	@Size(max = 30)
    @Column(name = "ADDRESSLINE1")
	private String addressline1;
	@Size(max = 30)
    @Column(name = "ADDRESSLINE2")
	private String addressline2;
	@Size(max = 25)
    @Column(name = "CITY")
	private String city;
	@Size(max = 2)
    @Column(name = "STATE")
	private String state;
	@JoinColumn(name = "ZIP", referencedColumnName = "ZIP_CODE")
    @ManyToOne(optional = false)
	private MicroMarket zip;

	public String getAddressline1()
	{
		return addressline1;
	}

	public void setAddressline1(String addressline1)
	{
		this.addressline1 = addressline1;
	}

	public String getAddressline2()
	{
		return addressline2;
	}

	public void setAddressline2(String addressline2)
	{
		this.addressline2 = addressline2;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

	public MicroMarket getZip()
	{
		return zip;
	}

	public void setZip(MicroMarket zip)
	{
		this.zip = zip;
	}
	
}
