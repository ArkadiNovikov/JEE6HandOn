/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.arkadinovikov.jee6handon;

import com.github.arkadinovikov.jee6handon.entities.Customer;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author Novikov
 */
@Stateless
@Named
@LocalBean
@Path("/customers")
public class CustomerSessionBean
{
	@PersistenceContext
	EntityManager em;
	
	public List<Customer>getCustomers()
	{
		return (List<Customer>) em.createNamedQuery("Customer.findAll").getResultList();
	}
	
	// Add business logic below. (Right-click in editor and choose
	// "Insert Code > Add Business Method")
	@GET
	@Path("/customer/{id}")
	@Produces({"application/xml", "application/json"})
	public Customer getCustomer(@PathParam("id") Integer id)
	{
		return (Customer)em.createNamedQuery("Customer.findByCustomerId").setParameter("customerId", id).getSingleResult();
	}
}
