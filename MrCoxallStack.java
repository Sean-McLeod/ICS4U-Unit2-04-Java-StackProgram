/*
* This is a class that pushes
* and prints out elements.
*
* @author  Sean McLeod
* @version 1.0
* @since   2021-05-20
*/

import java.util.ArrayList;

public final class MrCoxallStack {
    /** This is an ArrayList for stacking data. */
    private ArrayList<Integer> stackList = new ArrayList<Integer>();

    /**
    * This method returns the top
    * element but doesn't remove it.
    * @return topElement
    */
    public int peekElement() {
        int size = this.stackList.size();
        if (size <= 0) {
            return -1;
        } else {
            int topElement = this.stackList.get(size - 1);
            return (topElement);
        }
    }

    /**
    * This method removes the
    * last element and returns it.
    * @return lastElement
    */
    public int popElement() {
        int size = this.stackList.size();
        if (size <= 0) {
            return -1;
        } else {
            int lastElement = this.stackList.remove(size - 1);
            return (lastElement);
        }
    }

    /** This method removes every elements in the stack. */
    public void clearElement() {
        this.stackList.clear();
    }

    /**
    * This method pushes
    * elements into the ArrayList.
    * @param anElement
    */
    public void pushNumber(final int anElement) {
        this.stackList.add(anElement);
    }

    /** This method prints out the elements in the ArrayList. */
    public void printStack() {
        int size = this.stackList.size();
        if (size <= 0) {
            System.out.println("****no item****");
        } else {
            for (int counter = 0; counter < size; counter++) {
                System.out.println(this.stackList.get(counter));
            }
        }
    }
}
