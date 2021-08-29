package mail.model.repository;

import mail.model.bean.Mail;

import java.util.List;

public interface IMailRepository {
    List<Mail>listAll();
    void add(Mail mail);
}
