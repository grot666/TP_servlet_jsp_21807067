package tdgr1.meng3.webService;

//i am thinking about stock info by using a class,well i don t know
public class user {
    String userName;
    String firstName;
    String lastName;
    String passWord;

    //i know they should be private here ,but i just dont
    user(String username, String firstname, String lastname, String password) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.userName = username;
        this.passWord = password;
    }

    //test of my conception . it may work
    public String getAll() {

        return "un :" + userName + " fn :" + firstName + " ln :" + lastName + " ps :" + passWord;
    }

    @Override
    public String toString() {
        return "userinfo{" +
                "userName='" + userName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passWord='" + "that is a secret" + '\'' +
                '}';
    }
}
