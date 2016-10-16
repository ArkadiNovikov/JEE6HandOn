/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.arkadinovikov.jee6handon;

import com.github.arkadinovikov.jee6handon.entities.Customer;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Novikov
 */
@Stateless
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
}
