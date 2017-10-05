package com.mate.spring.util;

import java.io.IOException;

/**
 * Created by akhambir on 30.09.17.
 */
public class Test {


    interface A {
        void doSometh();
    }

    abstract class B<T> {}

    class C extends B<A> {

    }

}
