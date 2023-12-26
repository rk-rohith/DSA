package main;

public class BigO {
    /*
        O(1) => constant
        0(log n) => Divide & conquer
        O(n) => proportional
        O(n^2) => Loop with in a loop
     */
    public static void main(String[] args) {
        printItems(10);
        dropConstants(10);
        loopinLoop(10); //O(n^2)
        dropNonDominants(10);
    }

    private static void printItems(int n) {
        /* It will print 10 times i.e, 0-9, it only depends on the value of n and executes n times hence the TM is O(n) */
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

    private static void dropConstants(int n) {
        /* Sum of the both the loops is O(n)+O(n) => 0(2n) -> in this case we will drop the constants hence the TM is O(n) */
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }

    }

    private static void loopinLoop(int n) {
        for (int i = 0; i < n; i++) {   /* TM for this loop is O(n) */
            for (int j = 0; j < n; j++) {    /* TM for this loop is O(n) */
                /* Finally the below statement executes O(n)*O(n) => 0(n^2) */
                System.out.println(i + " " + j);
            }
        }
    }

    private static void dropNonDominants(int n) {
        for (int i = 0; i < n; i++) {   /* TM for this loop is O(n) */
            for (int j = 0; j < n; j++) {    /* TM for this loop is O(n) */
                /* Finally the below statement executes O(n)*O(n) => 0(n^2) */
                System.out.println(i + " " + j);
            }
        }
        /* It will print 10 times i.e, 0-9, it only depends on the value of n and executes n times hence the TM is O(n) */
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
        /* the sum of both loops is O(n^2) + O(n) => O(n^2+n) => O(n^2) -> in this case we will drop the nonDominant n hence the TM is O(n^2)  */

    }

}
