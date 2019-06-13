package com.project7.bibliomanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project7.bibliomanagement.entities.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long> {

}
