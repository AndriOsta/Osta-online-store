package ua.andriosta.projects.ostastore.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.andriosta.projects.ostastore.dao.interfaces.KindDAO;
import ua.andriosta.projects.ostastore.entites.Kind;

import java.util.List;


@Component
public class KindDAOImpl implements KindDAO {


    @Autowired
   public SessionFactory sessionFactory;


    @Transactional
    public List<Kind> getKinds() {

        List<Kind> kindList=sessionFactory.getCurrentSession().createCriteria(Kind.class).list();

        return kindList;
    }
}
