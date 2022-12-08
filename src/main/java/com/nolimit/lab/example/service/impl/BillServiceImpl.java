package com.nolimit.lab.example.service.impl;


import com.nolimit.lab.example.service.BillService;

public class BillServiceImpl implements BillService {

	@Resource
    private BillMapper billMapper;

	public List<Bill> listBill() {

		List<Bill> billList = null;
		return billList;
	}

	public List<Bill> addBill(Bill bill){

		List<Bill> billList = null;
		return billList;
	}

	public Bill updateBIll(Bill bill){

		if(bill == null) {
			return null;
		}
	}

	public Bill syncBill(List<Bill> bill, Date date, List<Bill> foreignBill){
		
	}


}
