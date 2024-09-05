class person {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(person.sq(4));
    }

    public static int sq(int x) {
        System.out.println("inside");
        return x*x;
    }
}
