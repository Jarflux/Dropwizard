package be.skdebrug.website.core;

/**
 * Developer: Ben Oeyen
 * Date: 23/07/2015
 */
public class Player {

    private int id;
    private String firsName;
    private String lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
