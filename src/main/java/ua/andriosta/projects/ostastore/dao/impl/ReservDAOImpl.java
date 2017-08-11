package ua.andriosta.projects.ostastore.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.andriosta.projects.ostastore.dao.interfaces.ReservDAO;
import ua.andriosta.projects.ostastore.entites.Reservation;

@Component
public class ReservDAOImpl implements ReservDAO {

    @Autowired
    private SessionFactory sessionFactory;


    @Transactional
    public boolean addInfo(String firstName, String lastName, String middleName, String newPost ,long goods_id) {


      ///  sessionFactory.getCurrentSession().createCriteria(Reservation.class).add(Restrictions.sqlRestriction("insert into reservation values"));
        Reservation reservation=new Reservation();
        reservation.setName(firstName);
        reservation.setLastname(lastName);
        reservation.setMidllename(middleName);
        reservation.setNewpost(newPost);
        reservation.setGoods(goods_id);

        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(reservation);
        session.getTransaction().commit();

        System.out.println("inserAlready");

        return true;
    }
}
