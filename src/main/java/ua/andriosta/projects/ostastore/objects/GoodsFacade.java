package ua.andriosta.projects.ostastore.objects;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ua.andriosta.projects.ostastore.dao.interfaces.GoodsDAO;
import ua.andriosta.projects.ostastore.dao.interfaces.ReservDAO;
import ua.andriosta.projects.ostastore.entites.Goods;

import java.util.List;

@Component("goodsFacade")
@Scope("singleton")
public class GoodsFacade {

    @Autowired
    private GoodsDAO goodsDAO;

    @Autowired
    private ReservDAO reservDAO;

    @Autowired
    private SearchCriteria searchCriteria;

    @Autowired
    private InsertCriteria insertCriteria;

    @Autowired
    private UpdateCriteria updateCriteria;

    private List<Goods> goods;

    @Autowired
    public void setGoodsDAO(GoodsDAO goodsDAO){
        this.goodsDAO=goodsDAO;

        goods=goodsDAO.getGoods();
    }

    @Autowired
    public void setReservDAO(ReservDAO reservDAO) {

        this.reservDAO = reservDAO;
    }

    public void searchGoodsByKind(){

        goods=goodsDAO.getGoods(searchCriteria.getKind());
    }


    public void searchGoodsByText(){

        goods=goodsDAO.getGoods(searchCriteria.getText());
    }


    public void deleteGoodsById(){

        boolean result=goodsDAO.deleteGoods(insertCriteria.getGoods_id());
    }


    public void updateGoods(){

        int result=goodsDAO.updateGoods(updateCriteria.getName(),updateCriteria.getPrice(),updateCriteria.getYear()
                ,updateCriteria.getId());
    }

    public void insertInfo(){

        boolean result=reservDAO.addInfo(insertCriteria.getFirstName(),insertCriteria.getLastName(),
                insertCriteria.getMidlleName(),insertCriteria.getNewPost(),insertCriteria.getGoods_id());
    }

    public List<Goods> getGoods() {

        return goods;
    }

  }

