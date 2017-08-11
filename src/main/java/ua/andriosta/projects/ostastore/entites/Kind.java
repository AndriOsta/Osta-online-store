package ua.andriosta.projects.ostastore.entites;

import java.util.Collection;

/**
 * Created by Admin on 02.07.2015.
 */
public class Kind {
    private long id;
    private String name;
    private Collection<Goods> goodsesById;

    public Kind(String name) {
        this.name=name;
    }

    public Kind() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

        Kind kinds = (Kind) o;

        if (id != kinds.id) return false;
        if (name != null ? !name.equals(kinds.name) : kinds.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
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
