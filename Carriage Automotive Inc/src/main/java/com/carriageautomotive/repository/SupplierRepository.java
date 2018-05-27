package com.carriageautomotive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.carriageautomotive.model.Supplier;
import com.carriageautomotive.model.User;

public interface SupplierRepository extends JpaRepository<Supplier, String> {
	
}
