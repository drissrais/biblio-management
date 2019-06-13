package com.project7.bibliomanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project7.bibliomanagement.entities.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
