package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");
        MemberV1 memberA = new MemberV1("회원A", address);
        MemberV1 memberB = new MemberV1("회원B", address);

        //회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        // 회원B의 주소만 부산으로 바꿔보겠음. -> 불가능함.
        // memberB.setAddress("부산"); 을 하면 Address 객체의 값이 서울 -> 부산으로 바뀌어버림.
//        memberB.setAddress(address.setValue("부산"));
        memberB.getAddress().setValue("부산");
        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

    }
}
