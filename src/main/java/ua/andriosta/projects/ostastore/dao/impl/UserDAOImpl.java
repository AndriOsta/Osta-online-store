package ua.andriosta.projects.ostastore.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.andriosta.projects.ostastore.dao.interfaces.UserDAO;
import ua.andriosta.projects.ostastore.entites.GroupMembers;
import ua.andriosta.projects.ostastore.entites.Users;

@Component
public class UserDAOImpl implements UserDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public boolean addNewUser(String username, String password) {

        Users user=new Users();
        user.setUsername(username);
        user.setPassword(password);
        user.setEnabled((byte) 1);

        GroupMembers groupMember=new GroupMembers();

        groupMember.setUsername(username);
        groupMember.setGroupsByGroupId(1l);

        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.save(groupMember);
        session.getTransaction().commit();


        return true;
    }
}
