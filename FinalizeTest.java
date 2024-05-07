public class FinalizeTest {
    // This method is called just before an object is garbage collected
    protected void finalize() throws Throwable {
        try {
            System.out.println("finalize method called");
        } finally {
            super.finalize();
        }
    }

    public static void main(String[] args) {
        FinalizeTest test = new FinalizeTest();
        test = null; // Making the Test object eligible for garbage collection
        System.gc(); // Requesting JVM for running Garbage Collector
    }
}
