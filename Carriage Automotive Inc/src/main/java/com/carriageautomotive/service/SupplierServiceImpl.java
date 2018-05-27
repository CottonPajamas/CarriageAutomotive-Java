package com.carriageautomotive.service;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.carriageautomotive.model.Supplier;
import com.carriageautomotive.model.User;
import com.carriageautomotive.repository.SupplierRepository;


@Service
public class SupplierServiceImpl implements SupplierService {
	
	@Resource
	SupplierRepository supplierRepository;
	

	@Override
	@Transactional
	public ArrayList<Supplier> findAllSupplier(){
		ArrayList<Supplier> supplierList = (ArrayList<Supplier>) supplierRepository.findAll();
		return supplierList;
	}
	

	@Override
	@Transactional
	public Supplier findSupplierById(String supplierId) {
		return supplierRepository.findOne(supplierId);
	}


	@Override
	@Transactional
	public Supplier createSupplierRecord(Supplier supplier) {
		return supplierRepository.saveAndFlush(supplier);
	}


	@Override
	@Transactional
	public Supplier updateSupplierRecord(Supplier supplier) {
		return supplierRepository.saveAndFlush(supplier);
	}


	@Override
	@Transactional
	public void deleteSupplierRecord(Supplier supplier) {
		supplierRepository.delete(supplier);
	}
	
	public boolean supplierAlreadyExists(Supplier supplier) {
		if (findSupplierById(supplier.getSupplierID()) != null)
			return true;
		else
			return false;
	}

}
