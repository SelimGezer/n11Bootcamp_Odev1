import dao.KategoriDao;
import dao.KullaniciYorumDao;
import dao.UrunYorumDao;
import dto.KullaniciYorumlariDto;
import dto.UrunYorumDto;
import dto.UrunYorumSayısıDto;
import entity.Kategori;
import entity.Urun;
import entity.UrunYorum;
import entityservice.KategoriEntityService;

import java.util.List;

public class Application {


    public static void main(String[] args) {

        KategoriEntityService kategoriDaoService = new KategoriEntityService();
        kategoriDaoService.findAll();
    }
}