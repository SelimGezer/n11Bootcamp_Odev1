package dao;

import dto.KullaniciYorumlariDto;
import dto.UrunYorumDto;
import hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class KullaniciYorumDao {

    private SessionFactory sessionFactory ;

    public KullaniciYorumDao() {
        sessionFactory= HibernateUtil.getSessionFactory();
    }

    public List<KullaniciYorumlariDto> kullaniciYorumListById(Long kullaniciId){

        Session session=sessionFactory.openSession();

        String sql=
                "select new dto.KullaniciYorumlariDto( " +
                        "ku.id," +
                        "ku.adi," +
                        "ur.adi, " +
                        "uy.yorum," +
                        "uy.yorumTarihi) " +
                        " from UrunYorum uy " +
                        " inner join uy.kullanici ku " +
                        " inner join uy.urun ur " +
                        " inner join ur.kategori ka " +
                        " where ku.id = :givenId ";

        Query query= session.createQuery(sql);
        query.setParameter("givenId", kullaniciId);

        return query.list();
    }

}
