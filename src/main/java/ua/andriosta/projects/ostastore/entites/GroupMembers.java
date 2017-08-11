package ua.andriosta.projects.ostastore.entites;

/**
 * Created by Admin on 06.08.2015.
 */
public class GroupMembers {
    private Long id;
    private String username;
    private Long groupsByGroupId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupMembers that = (GroupMembers) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    public Long getGroupsByGroupId() {
        return groupsByGroupId;
    }

    public void setGroupsByGroupId(Long groupsByGroupId) {
        this.groupsByGroupId = groupsByGroupId;
    }
}
