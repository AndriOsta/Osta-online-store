package ua.andriosta.projects.ostastore.dao.interfaces;

import ua.andriosta.projects.ostastore.entites.Company;
import ua.andriosta.projects.ostastore.entites.Goods;
import ua.andriosta.projects.ostastore.entites.Kind;

import java.util.List;

/**
 * Created by Admin on 01.07.2015.
 */
public interface GoodsDAO {

    List<Goods> getGoods();
    List<Goods>  getGoods(Kind kind);
    List<Goods> getGoods(String text);
    boolean deleteGoods(long id);
    int updateGoods(String name,String price,int year,long id);
    int addGoods(String name,String price,int year,long id,byte []image,Company company,Kind kind);

}
