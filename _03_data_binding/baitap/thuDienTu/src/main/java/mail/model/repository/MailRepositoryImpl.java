package mail.model.repository;

import mail.model.bean.Mail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailRepositoryImpl implements IMailRepository {
    private static List<Mail> list = new ArrayList<>();

    @Override
    public List<Mail> listAll() {
        return list;
    }

    @Override
    public void add(Mail mail) {

    }
}
