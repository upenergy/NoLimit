package com.nolimit.lab.example.service;

import org.springframework.stereotype.Service;

@Service
public interface BillService extends BaseService {

	List<Bill> listBill();
	List<Bill> addBill(Bill bill);
	Bill editBIll(Bill bill);
	
    
}
