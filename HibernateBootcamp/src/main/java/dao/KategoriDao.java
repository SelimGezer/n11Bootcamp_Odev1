package dao;

import entity.Kategori;
import hibernate.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


import java.util.List;

public class KategoriDao {

    private SessionFactory sessionFactory ;

    public KategoriDao() {
        sessionFactory= HibernateUtil.getSessionFactory();
    }

    public List<Kategori> findAll(){

        Session session=sessionFactory.openSession();

        Query query= session.createQuery("select kategori from Kategori kategori");

        return query.list();
    }

}
