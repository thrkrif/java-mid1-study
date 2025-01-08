package lang.immutable.address;

public class MemberV1 {
    // name은 바뀌지 않도록 setName() 메서드를 만들지 않았다.
    private String name;
    private Address address;
    public MemberV1(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
