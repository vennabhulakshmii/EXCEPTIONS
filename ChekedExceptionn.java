class Demo {
    void m1() throws InterruptedException {
        Thread.sleep(1000); // may throw InterruptedException
        System.out.println("Inside m1()");
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        try {
            d.m1(); // must handle the checked exception
        } 
        catch (InterruptedException e) {
            System.out.println("Handled: " + e);
        }
        System.out.println("Program ends.");
    }
}
