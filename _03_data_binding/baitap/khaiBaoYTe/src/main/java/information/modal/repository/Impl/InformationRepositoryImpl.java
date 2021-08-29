package information.modal.repository.Impl;

import information.modal.bean.Information;
import information.modal.repository.IInformationRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InformationRepositoryImpl implements IInformationRepository {
    private static List<Information> list = null;
    static {
        list = new ArrayList<>();
        list.add(new Information("bao",2000,"Nam","Viet Nam","201878946123","May bay", "VN123",1,"2021/10/12","2021/10/1","khong","Da Nang","Lien Chieu","Hoa Khanh Bac","294 nguyen luong bang","0123456789","hoangbaoasd@gmail.com","khong co","khong"));
    }
    @Override
    public List<Information> listAll() {
        return list;
    }

}
