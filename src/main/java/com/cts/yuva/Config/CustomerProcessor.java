package com.cts.yuva.Config;

import org.springframework.batch.item.ItemProcessor;

import com.cts.yuva.Entity.Customer;


public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

    @Override
    public Customer process(Customer customer) throws Exception {
//        if(customer.getCountry().equals("United States")) {
//            return customer;
//        }else{
//            return null;
//        }
        return customer;
    }
}