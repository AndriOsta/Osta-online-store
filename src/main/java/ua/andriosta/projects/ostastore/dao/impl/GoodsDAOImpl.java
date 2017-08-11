package ua.andriosta.projects.ostastore.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.andriosta.projects.ostastore.dao.interfaces.GoodsDAO;

import ua.andriosta.projects.ostastore.entites.Company;
import ua.andriosta.projects.ostastore.entites.Goods;
import ua.andriosta.projects.ostastore.entites.Kind;

import java.util.List;

@Component
public class GoodsDAOImpl implements GoodsDAO{

    @Autowired
    private SessionFactory sessionFactory;

    private ProjectionList goodsProjection;


    public GoodsDAOImpl(){

        goodsProjection = Projections.projectionList();
        goodsProjection.add(Projections.property("id"), "id");
        goodsProjection.add(Projections.property("kind"), "kind");
        goodsProjection.add(Projections.property("image"), "image");
        goodsProjection.add(Projections.property("price"), "price");
        goodsProjection.add(Projections.property("company"), "company");
        goodsProjection.add(Projections.property("year"), "year");
        goodsProjection.add(Projections.property("descr"), "descr");
        goodsProjection.add(Projections.property("name"), "name");



    }


    @Transactional
    public List<Goods> getGoods() {

        List<Goods> goodsList=createGoodsList(createGoodsCriteria());
        return goodsList;
    }

    @Transactional
    public List<Goods> getGoods(Kind kind) {

        List<Goods> goodsList=createGoodsList(createGoodsCriteria().add((Restrictions.ilike("kind.name", kind.getName(), MatchMode.ANYWHERE))));

        return goodsList;

    }

    @Transactional
    public List<Goods> getGoods(String text) {
        List<Goods> goodsList=createGoodsList(createGoodsCriteria().add((Restrictions.ilike("g.name", text, MatchMode.ANYWHERE))));

        return goodsList;
    }



    @Transactional
    public boolean deleteGoods(long id) {

        String hql="delete from Goods where id=:id";
        sessionFactory.getCurrentSession().createQuery(hql).setLong("id",id).executeUpdate();
        return true;

    }

    @Transactional
    public int updateGoods(String name, String price, int year, long id) {

       Query query=sessionFactory.getCurrentSession().createQuery("update Goods set name=:name , price=:price , year=:year where id=:id");
       query.setParameter("name",name);
       query.setParameter("price",price);
       query.setParameter("year",year);
       query.setParameter("id",id);

       int result=query.executeUpdate();


        return result;
    }

    public int addGoods(String name, String price, int year, long id, byte[] image, Company company, Kind kind) {
        return 0;
    }

    private DetachedCriteria createGoodsCriteria() {
        DetachedCriteria goodsListCriteria = DetachedCriteria.forClass(Goods.class, "g");
        createAliases(goodsListCriteria);
        return goodsListCriteria;
    }


    private void createAliases(DetachedCriteria criteria) {

        criteria.createAlias("g.kind", "kind");
        criteria.createAlias("g.company", "company");

    }


    private List<Goods> createGoodsList(DetachedCriteria goodsListCriteria) {

        Criteria criteria = goodsListCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
        criteria.addOrder(Order.asc("g.price")).setProjection(goodsProjection).setResultTransformer(Transformers.aliasToBean(Goods.class));
        return criteria.list();
    }

}
