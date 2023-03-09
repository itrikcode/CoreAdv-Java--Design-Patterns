import com.itsp.MultithreadSingletonProblem;

public class TestMultiThreadSingletonProblem {
    public static void main(String[] args) {
        // object

        /*
         * 
         * we have 3 solution to solve the multithread problem to create as a singleton
         * class.
         * 1. we can create object at the of class loding (eager instantation)
         * 2. we can use static factory method as snycronized method(but good solution)
         * 3. we can take snycronized bloks inside static factory method
         */
        MultithreadSingletonProblem problem = new MultithreadSingletonProblem();
        Thread t1 = new Thread(problem);
        Thread t2 = new Thread(problem);
        Thread t3 = new Thread(problem);
        Thread t4 = new Thread(problem);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}