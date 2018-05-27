package com.carriageautomotive.service;

import java.util.ArrayList;

import com.carriageautomotive.model.Supplier;
import com.carriageautomotive.model.User;

public interface SupplierService {

	ArrayList<Supplier> findAllSupplier();

	Supplier findSupplierById(String supplierId);

	Supplier createSupplierRecord(Supplier supplier);

	Supplier updateSupplierRecord(Supplier supplier);

	void deleteSupplierRecord(Supplier supplier);
	
	boolean supplierAlreadyExists(Supplier supplier);

}