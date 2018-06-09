package com.thinkindatastructure.exercise.individualExercise.exercise3;

import com.thinkindatastructure.exercise.individualExercise.exercise2.MyArrayListTest;
import org.junit.Before;

import java.util.ArrayList;


/**
 * @author downey
 *
 */
public class MyLinkedListTest extends MyArrayListTest {

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception {
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<Integer>();
        mylist.addAll(list);
    }
}
