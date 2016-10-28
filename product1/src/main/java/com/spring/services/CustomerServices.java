package com.spring.services;

import com.spring.model.Customer;

public interface CustomerServices {
void addCustomer(Customer customer);

Customer getCustomerByUsername(String username);
}





