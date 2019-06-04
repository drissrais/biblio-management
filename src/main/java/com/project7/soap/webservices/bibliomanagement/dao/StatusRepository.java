package com.project7.soap.webservices.bibliomanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project7.soap.webservices.bibliomanagement.entities.Status;

@Repository
public interface StatusRepository extends CrudRepository<Status, Long> {

}
