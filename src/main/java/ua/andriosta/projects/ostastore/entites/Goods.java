package ua.andriosta.projects.ostastore.entites;

import java.util.Arrays;

/**
 * Created by Admin on 02.07.2015.
 */
public class Goods {
    private long id;
    private int year;
    private String price;
    private String descr;
    private String name;
    private byte[] image;
    private Company company;
    private Kind kind;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (id != goods.id) return false;
        if (year != goods.year) return false;
        if (price != null ? !price.equals(goods.price) : goods.price != null) return false;
        if (descr != null ? !descr.equals(goods.descr) : goods.descr != null) return false;
        if (name != null ? !name.equals(goods.name) : goods.name != null) return false;
        if (!Arrays.equals(image, goods.image)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + year;
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (descr != null ? descr.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (image != null ? Arrays.hashCode(image) : 0);
        return result;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Kind getKind() {
        return kind;
    }

    public void setKind(Kind kindsByKindId) {
        this.kind = kind;
    }
}
