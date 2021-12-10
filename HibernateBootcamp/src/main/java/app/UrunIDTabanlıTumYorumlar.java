package app;

import dao.UrunYorumDao;
import dto.UrunYorumDto;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class UrunIDTabanlıTumYorumlar {

    public static void main(String[] args) {

        UrunYorumEntityService urunYorumEntityService=new UrunYorumEntityService();

        //İlgili urune yapılmış tum yorumlar
        Long urunId=3L;
        List<UrunYorumDto> sonuc= urunYorumEntityService.urunYorumListById(urunId);

        System.out.println("\n---------Sonuçlar------------");
        for (UrunYorumDto urunYorumDto:sonuc) {
            System.out.println(urunYorumDto);
        }
    }
}
