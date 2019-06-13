package com.project7.bibliomanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.project7.bibliomanagement.dao.MemberRepository;
import com.project7.bibliomanagement.entities.Member;

@Component
public class AuthenticationService {

	@Autowired
	MemberRepository memberRepository;
	
	public Member authenticate(String email, String password) {
		return memberRepository.findOneByEmailAndPasswd(email, password);
	}
	
	public Member signUp(Member member) {
		return memberRepository.save(member);
	}
	
}
