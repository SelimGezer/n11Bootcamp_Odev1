package app;

import dao.UrunYorumDao;
import dto.UrunYorumSayısıDto;
import entityservice.UrunYorumEntityService;

import java.util.List;

public class UrunlerVeYorumSayilari {

    public static void main(String[] args) {

        UrunYorumEntityService urunYorumEntityService=new UrunYorumEntityService();

        //Ürünler ve ürünlere yapılan yapılan yorumSayilari
        List<UrunYorumSayısıDto> sonuc=urunYorumEntityService.urunYorumListWithYorumSayisi();
        System.out.println("\n---------Sonuçlar------------");
        for (UrunYorumSayısıDto urunYorumSayısıDto :sonuc) {
            System.out.println(urunYorumSayısıDto);
        }

    }
}
