package com.collections;

import java.util.Comparator;

import com.oops.Customer;
import com.oops.CustomerForComparator;

public class CustomerNameComparator implements Comparator<CustomerForComparator>{

	@Override
	public int compare(CustomerForComparator o1, CustomerForComparator o2) {
		// TODO Auto-generated method stub
		return o1.getCustomerName().compareTo(o2.getCustomerName());
	}

}
