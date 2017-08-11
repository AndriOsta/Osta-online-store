package ua.andriosta.projects.ostastore.objects;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Component
@Scope("singleton")
public class InsertCriteria {

    private String firstName;
    private String LastName;
    private String MidlleName;
    private String NewPost;
    private long goods_id;

    private String username;
    private String password;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getMidlleName() {
        return MidlleName;
    }

    public void setMidlleName(String midlleName) {
        MidlleName = midlleName;
    }

    public String getNewPost() {
        return NewPost;
    }

    public void setNewPost(String newPost) {
        NewPost = newPost;
    }

    public long getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(long goods_id) {
        this.goods_id = goods_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void save(){
        FacesContext.getCurrentInstance().addMessage(null,new FacesMessage("Welcome to ANDRIOSTA Online Strore"));
    }
}
