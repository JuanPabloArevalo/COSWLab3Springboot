package com.eci.cosw.springbootsecureapi.model;

/**
 * @author Santiago Carrillo
 * 8/21/17.
 */
public class User
{

    private long id;

    private String email;

    private String password;

    private String name;

    private String lastname;

    private String username;

    private String image;

    public User()
    {
    }

    public User( String email, String password, String firstname, String lastname, String image, String username )
    {
        this.email = email;
        this.password = password;
        this.name = firstname;
        this.lastname = lastname;
        this.image = image;
        this.username = username;
    }


    public long getId()
    {
        return id;
    }

    public void setId( long id )
    {
        this.id = id;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail( String email )
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getLastname()
    {
        return lastname;
    }

    public void setLastname( String lastname )
    {
        this.lastname = lastname;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }
    
    

    @Override
    public String toString()
    {
        return "User{" + "id=" + id + ", email='" + email + '\'' + ", password='" + password + '\'' + ", firstname='"
            + name + '\'' + '}';
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
}
