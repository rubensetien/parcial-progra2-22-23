package main.ex1;

public class Client {

    private String name;
    private   String surname;
    private String address;
    private String descrition;

    public Client(String name, String surname, String address, String descrition) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.descrition = descrition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
