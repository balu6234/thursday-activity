package com.librarymgmysystem.daoImpl;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.librarymgmysystem.dao.Librarydao;
import com.librarymgmysystem.entity.Library;

public class LibrarydaoImpl implements Librarydao {
    HibernateTemplate ht1;
	@Override
	@Transactional
	public int insertLibrary(Library lib) {
		ht1.save(lib);
		return 1;
	}
	public HibernateTemplate getHt1() {
		return ht1;
	}
	public void setHt1(HibernateTemplate ht1) {
		this.ht1 = ht1;
	}

}
