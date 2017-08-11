//package ua.andriosta.projects.ostastore.rest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import ua.andriosta.projects.ostastore.dao.interfaces.GoodsDAO;
//import ua.andriosta.projects.ostastore.entites.Goods;
//import ua.andriosta.projects.ostastore.entites.Kind;
//
//
//import java.util.List;
//
//@RestController
//public class GoodsREST {
//
//    @Autowired
//    private GoodsDAO goodsDAO;
//
//    @RequestMapping(value = "/goods/all", method = RequestMethod.GET, headers="Accept=application/json")
//    public List<Goods> getAll(){
//        return goodsDAO.getGoods();
//    }
//
//    @RequestMapping(value = "/goods/name/{name}", method = RequestMethod.GET, headers="Accept=application/json")
//    public List<Goods> getGoodsByName(@PathVariable("name") String name){
//        return goodsDAO.getGoods(name);
//    }
//
//    @RequestMapping(value = "/goods/kind/{name}", method = RequestMethod.GET, headers="Accept=application/json")
//    public List<Goods> getGoodsBykind(@PathVariable("name") String name){
//        return goodsDAO.getGoods(new Kind(name));
//    }
//}
