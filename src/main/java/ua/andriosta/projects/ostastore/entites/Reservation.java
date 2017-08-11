package ua.andriosta.projects.ostastore.entites;

/**
 * Created by Admin on 02.07.2015.
 */
public class Reservation {
    private long id;
    private String name;
    private String lastname;
    private String midllename;
    private String newpost;
    private long goods;


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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMidllename() {
        return midllename;
    }

    public void setMidllename(String midllename) {
        this.midllename = midllename;
    }

    public String getNewpost() {
        return newpost;
    }

    public void setNewpost(String newpost) {
        this.newpost = newpost;
    }

    public long getGoods() {
        return goods;
    }

    public void setGoods(long goods) {
        this.goods = goods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reservation that = (Reservation) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (lastname != null ? !lastname.equals(that.lastname) : that.lastname != null) return false;
        if (midllename != null ? !midllename.equals(that.midllename) : that.midllename != null) return false;
        if (newpost != null ? !newpost.equals(that.newpost) : that.newpost != null) return false;


        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (midllename != null ? midllename.hashCode() : 0);
        result = 31 * result + (newpost != null ? newpost.hashCode() : 0);

        return result;
    }
}
