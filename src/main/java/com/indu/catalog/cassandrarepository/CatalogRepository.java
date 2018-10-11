package com.indu.catalog.cassandrarepository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.stereotype.Repository;

import com.indu.catalog.beans.Product;

@Repository
public interface CatalogRepository extends CassandraRepository<Product, UUID> {

	@Query("Select * from product where id=?0")
	Product findByUUID(String id);

	@Query("Select * from product where name=?0")
	List<Product> findByProductName(String name);
	
}


