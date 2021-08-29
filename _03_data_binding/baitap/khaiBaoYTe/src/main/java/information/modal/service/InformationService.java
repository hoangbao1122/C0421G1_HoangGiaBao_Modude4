package information.modal.service;

import information.modal.bean.Information;
import information.modal.repository.IInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InformationService implements IInformationService {
    @Autowired
    private IInformationRepository iInformationRepository;

    @Override
    public List<Information> listAll() {
        return this.iInformationRepository.listAll();
    }

}
