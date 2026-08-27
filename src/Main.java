void main() {
    Scanner input = new Scanner(System.in);
    while (true) {
        System.out.print("Input a string: ");
        String userString = input.nextLine().trim();
        if (userString.length() == 13) {
            throw new ThirteenException();
        } else {
            System.out.println("That string has a length of "+userString.length());
        }
    }

}