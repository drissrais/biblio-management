package com.project7.bibliomanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project7.bibliomanagement.entities.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, Long> {

	Member findOneByEmailAndPasswd(String email, String passwd);

}
