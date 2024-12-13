class LibraryMember extends Person {
    private String memberId;
    private String membershipType;

    public LibraryMember(String name, int age, String memberId, String membershipType) {
        super(name, age);
        this.memberId = memberId;
        this.membershipType = membershipType;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    @Override
    public void displayDetails() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Membership Type: " + membershipType);
    }
}
