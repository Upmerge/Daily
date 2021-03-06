package com.leetcode.simple;

import java.util.concurrent.Semaphore;

/**
 * @author Upmerge
 * @package com.leetcode.simple
 * @date 2020/9/28 17:28
 */
public class S1114 {
    /*
        1114. 按序打印
        我们提供了一个类：

        public class Foo {
          public void first() { print("first"); }
          public void second() { print("second"); }
          public void third() { print("third"); }
        }
        三个不同的线程将会共用一个 Foo 实例。

        线程 A 将会调用 first() 方法
        线程 B 将会调用 second() 方法
        线程 C 将会调用 third() 方法
        请设计修改程序，以确保 second() 方法在 first() 方法之后被执行，third() 方法在 second() 方法之后被执行。

        示例 1:

        输入: [1,2,3]
        输出: "firstsecondthird"
        解释:
        有三个线程会被异步启动。
        输入 [1,2,3] 表示线程 A 将会调用 first() 方法，线程 B 将会调用 second() 方法，线程 C 将会调用 third() 方法。
        正确的输出是 "firstsecondthird"。
        示例 2:

        输入: [1,3,2]
        输出: "firstsecondthird"
        解释:
        输入 [1,3,2] 表示线程 A 将会调用 first() 方法，线程 B 将会调用 third() 方法，线程 C 将会调用 second() 方法。
        正确的输出是 "firstsecondthird"。
     */
}

class Foo {
    private Semaphore semaFirstToSecond = new Semaphore(0);
    private Semaphore semaSecondToThird = new Semaphore(0);

    public Foo() {
    }

    public void first(Runnable printFirst) throws InterruptedException {
        printFirst.run();
        semaFirstToSecond.release();
        // printFirst.run() outputs "first". Do not change or remove this line.
    }

    public void second(Runnable printSecond) throws InterruptedException {
        // printSecond.run() outputs "second". Do not change or remove this line.
        semaFirstToSecond.acquire();
        printSecond.run();
        semaSecondToThird.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        // printThird.run() outputs "third". Do not change or remove this line.
        semaSecondToThird.acquire();
        printThird.run();
    }
}