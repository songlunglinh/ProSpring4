package com.pvthuan.spring4.ch6.dao;
import com.pvthuan.spring4.ch6.domain.Contact;
import java.util.List;
public interface ContactDao {
	List<Contact> findAll();

	List<Contact> findByFirstName(String firstName);

	String findLastNameById(Long id);

	String findFirstNameById(Long id);

	void insert(Contact contact);

	void update(Contact contact);

	void delete(Long contactId);
}
