public class Person {
    protected String name;
    protected String phone_number;
    protected String email_address;

    public Person(String name, String phone_number, String email_address) {
        this.name = name;
        this.phone_number = phone_number;
        this.email_address = email_address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", phone_number=" + phone_number + ", email_address=" + email_address + "]";
    }

}
