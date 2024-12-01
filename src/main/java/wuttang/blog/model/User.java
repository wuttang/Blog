package wuttang.blog.model;

public class User {
    private int id;
    private String fullName;
    private Role role;
    private boolean active;
    private String email;

    public int getId(){
        return id;
    }

    public String getFullName(){
        return fullName;
    }

    public Role getRole(){
        return role;
    }

    public boolean isActive(){
        return active;
    }

    public String getEmail(){
        return email;
    }

    public void setId(int id){}

    public void setFullName(String fullName){}

    public void setRole(Role role){}

    public void setActive(boolean active){}

    public void setEmail(String email){}
}
