package bytebank.conta;

public class Client {
    private String name;
    private String socialSecurity;
    private String address;

    public Client(String name, String socialSecurity, String address) {
        this.name = name;
        this.socialSecurity = socialSecurity;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSocialSecurity() {
        return socialSecurity;
    }

    public void setSocialSecurity(String socialSecurity) {
        this.socialSecurity = socialSecurity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
