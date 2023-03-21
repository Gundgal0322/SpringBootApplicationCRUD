package com.csi.services;

import com.csi.model.Customer;

import java.util.List;

public interface CustomereServices {

    public void saveData(Customer customer);

    public Customer getDataById(int custId);

    public List<Customer> getAlldata();

    public void updateData(int custId, Customer customer);

    public void deleteData(int custId);
}
