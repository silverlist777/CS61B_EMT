package randomizedtest;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by hug.
 */
public class TestBuggyAList {
    // YOUR TESTS HERE
    @Test
    public void testThreeAddThreeRemove() {
        BuggyAList BList = new BuggyAList<>();
        AListNoResizing AList = new AListNoResizing<>();
        BList.addLast(3);
        AList.addLast(3);
        BList.addLast(4);
        AList.addLast(4);
        BList.addLast(5);
        AList.addLast(5);
        assertEquals(AList.size(), BList.size());
        assertEquals(AList.removeLast(), BList.removeLast());
        assertEquals(AList.removeLast(), BList.removeLast());
        assertEquals(AList.removeLast(), BList.removeLast());
    }

    @Test
    public void newTest() {
        AListNoResizing<Integer> L = new AListNoResizing<>();
        BuggyAList<Integer> A =new BuggyAList<>();
        int N = 5000;
        for (int i = 0; i < N; i += 1) {
            int operationNumber = StdRandom.uniform(0, 4);
            if (operationNumber == 0) {
                // addLast
                int randVal = StdRandom.uniform(0, 100);
                L.addLast(randVal);
                A.addLast(randVal);
                System.out.println("addLast(" + randVal + ")");
            } else if (operationNumber == 1) {
                // size
                int size = L.size();
                int sizeA = A.size();
                System.out.println("sizeA: " + sizeA);
                System.out.println("size: " + size);
                assertEquals(size,sizeA);
            } else if (operationNumber == 2) {
                // getLast
                if (L.size() == 0) {
                    continue;
                } else {
                    A.getLast();
                    L.getLast();
                    assertEquals(A.getLast(),L.getLast());
                }
            } else if (operationNumber == 3) {
                // getLast
                if (L.size() == 0) {
                    continue;
                } else {
                   assertEquals(L.removeLast(),A.removeLast());
                }
            }
        }
    }
}

