package com.sanroman.accesodatos.hibernatetutorial.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sanroman.accesodatos.hibernatetutorial.model.Usuario;

public class InsertarUsuarioTest {

	public static void main(String[] args) {
		Session session=null;
		Configuration cfg= new Configuration();
		SessionFactory factory=cfg.configure().buildSessionFactory();
		session=factory.openSession();
		Transaction tr=session.beginTransaction();
		Usuario user=new Usuario();
		user.setId(34);
		user.setDomicilio("Calle luna 22");
		user.setEmail("luis@gmai.com");
		user.setNombre("Luis");
		user.setTelefono("91234556");
		session.save(user);
		tr.commit();
		session.close();

	}

}
