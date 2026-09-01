class MembershipCard {

    String memberName;
    int memberId;
    int validityYears;

    // Default constructor
    MembershipCard() {
        memberName = "Guest";
        memberId = 0;
        validityYears = 1;
    }

    // Parameterized constructor
    MembershipCard(String memberName, int memberId, int validityYears) {
        this.memberName = memberName;
        this.memberId = memberId;
        this.validityYears = validityYears;
    }

    void display() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Member ID: " + memberId);
        System.out.println("Validity: " + validityYears + " years");
    }

    public static void main(String[] args) {

        MembershipCard card1 = new MembershipCard();

        MembershipCard card2 =
                new MembershipCard("Pooja", 101, 3);

        System.out.println("Default Card:");
        card1.display();

        System.out.println();

        System.out.println("Parameterized Card:");
        card2.display();
    }
}