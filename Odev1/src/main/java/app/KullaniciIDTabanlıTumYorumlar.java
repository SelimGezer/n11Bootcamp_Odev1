package app;

import dao.KullaniciYorumDao;
import dto.KullaniciYorumlariDto;
import entityservice.KullanıcıEntityService;

import java.util.List;

public class KullaniciIDTabanlıTumYorumlar {

    public static void main(String[] args) {

        KullanıcıEntityService kullanıcıEntityService=new KullanıcıEntityService();

        //İlgili kullanıcının yaptığı tüm yorumlar
        Long kullaniciId=1L;
        List<KullaniciYorumlariDto> sonuc=kullanıcıEntityService.kullaniciYorumListById(kullaniciId);

        System.out.println("\n---------Sonuçlar------------");
        for (KullaniciYorumlariDto kullaniciYorumlariDto:sonuc) {
            System.out.println(kullaniciYorumlariDto);
        }

    }
}
