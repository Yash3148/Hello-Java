package bank;

class Account {
    public String name;
    protected String email;
    private String password;

    // getters and setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Yoshita";
        account1.email = "Yoshita@example.com";
        account1.setPassword("YS07");
        System.out.println(account1.getPassword());
    }
}
------------------------------------------------------------------------------------------------------
