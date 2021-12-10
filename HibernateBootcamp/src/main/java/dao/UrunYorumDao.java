package dao;

import dto.UrunYorumDto;
import dto.UrunYorumSayısıDto;
import entity.Kategori;
import hibernate.HibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


import java.util.List;

public class UrunYorumDao {

    private SessionFactory sessionFactory ;

    public UrunYorumDao() {
        sessionFactory= HibernateUtil.getSessionFactory();
    }

    public List<UrunYorumDto> urunYorumListById(Long urunId){

        Session session=sessionFactory.openSession();

       //Query query= session.createQuery("select * from URUN_YORUMLARI uy where uy.id = :givenId");
    /*  Query query= session.createSQLQuery("select UY.* from urun_yorumlari UY \n" +
                " inner join  kullanici KU on (KU.id=UY.kullanici_id) \n" +
                " inner join  urun UR on (UY.urun_id=UR.id) \n" +
                " inner join kategori KA on (KA.id=UR.id_kategori) \n" +
                " where UY.urun_id = 3");*/

        String sql=
                "select new dto.UrunYorumDto(  ur.adi, " +
                        "ka.adi," +
                        "ur.fiyat, " +
                        "ku.adi," +
                        "ku.soyadi ," +
                        "ku.email," +
                        "ku.telefon," +
                        "uy.yorum," +
                        "uy.yorumTarihi) " +
                " from UrunYorum uy " +
                " inner join uy.kullanici ku " +
                " inner join uy.urun ur " +
                " inner join ur.kategori ka " +
                " where uy.urun.id = :givenId ";
        Query query= session.createQuery(sql);
        query.setParameter("givenId", urunId);

        return query.list();
    }

    public List<UrunYorumSayısıDto> urunYorumListWithYorumSayisi(){

        Session session=sessionFactory.openSession();

        String SQL=
                "select new dto.UrunYorumSayısıDto(  " +
                        "ur.id, " +
                        "ur.adi," +
                        "ur.fiyat," +
                        "Count(uy.urun.id) )" +
                        " from UrunYorum uy " +
                        " right join uy.urun ur " +
                        " GROUP BY ur.id,ur.adi,ur.fiyat " +
                        " order by ur.id";

        Query query= session.createQuery(SQL);
      //  query.setParameter("givenId", id);

        return query.list();
    }







}
