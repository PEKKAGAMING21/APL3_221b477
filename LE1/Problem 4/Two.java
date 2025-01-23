class Two extends One {
    Two(int x) {
        super(x); // Call the constructor of One
        System.out.println("Constructor of Two with value: " + x);
    }
}
