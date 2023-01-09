package com.librarymgmysystem.daoImpl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.librarymgmysystem.dao.Bookdao;
import com.librarymgmysystem.entity.Book;

public class BookdaoImpl implements Bookdao {
  private HibernateTemplate ht;
  
	@Override
	@Transactional
	public int insertBook(Book b) {
		ht.save(b);
		return 1;
	}

	@Override
	@Transactional
	public int updateBook(Book b) {
		ht.save(b);
		return 1;
	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}
