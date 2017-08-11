package ua.andriosta.projects.ostastore.dao.interfaces;

/**
 * Created by Admin on 04.07.2015.
 */
public interface ReservDAO {

    boolean  addInfo(String firstName,String lastName,String middleName,String newPost,long goods_id);
}
