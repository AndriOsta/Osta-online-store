package ua.andriosta.projects.ostastore.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;
import ua.andriosta.projects.ostastore.dao.interfaces.UserDAO;

@Component("userFacade")
@Scope("singleton")
public class UserFacade {

    @Autowired
    private InsertCriteria insertCriteria;
    @Autowired
    private UserDAO userDao;

    @Autowired
    public void setUserDao(UserDAO userDao) {
        this.userDao = userDao;
    }


    public void addUser(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        String newpassword=encoder.encode(insertCriteria.getPassword());
        insertCriteria.setPassword(newpassword);

        boolean result= userDao.addNewUser(insertCriteria.getUsername(),newpassword);
    }
}
