package entityservice;

import dao.KullaniciYorumDao;
import dto.KullaniciYorumlariDto;

import java.util.List;

public class KullanıcıEntityService {
    private KullaniciYorumDao kullaniciYorumDao;

    public KullanıcıEntityService() {
         kullaniciYorumDao=new KullaniciYorumDao();
    }


    public List<KullaniciYorumlariDto> kullaniciYorumListById(Long kullaniciId){
        return kullaniciYorumDao.kullaniciYorumListById(kullaniciId);
    }

}
