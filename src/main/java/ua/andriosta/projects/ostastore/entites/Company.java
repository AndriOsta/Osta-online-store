package ua.andriosta.projects.ostastore.entites;

import java.util.Collection;

/**
 * Created by Admin on 02.07.2015.
 */
public class Company {
    private int id;
    private String name;
    private Collection<Goods> goodsesById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (id != company.id) return false;
        if (name != null ? !name.equals(company.name) : company.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Collection<Goods> getGoodsesById() {
        return goodsesById;
    }

    public void setGoodsesById(Collection<Goods> goodsesById) {
        this.goodsesById = goodsesById;
    }
}
