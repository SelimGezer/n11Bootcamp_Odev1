package entityservice;

import dao.UrunYorumDao;
import dto.UrunYorumDto;
import dto.UrunYorumSayısıDto;

import java.util.List;

public class UrunYorumEntityService {

    private UrunYorumDao urunYorumDao;

    public UrunYorumEntityService() {
        urunYorumDao = new UrunYorumDao();
    }

    public List<UrunYorumSayısıDto> urunYorumListWithYorumSayisi(){
        return urunYorumDao.urunYorumListWithYorumSayisi();
    }

    public List<UrunYorumDto> urunYorumListById(Long urunId){
        return urunYorumDao.urunYorumListById(urunId);
    }
}
