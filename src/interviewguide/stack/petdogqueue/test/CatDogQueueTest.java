package interviewguide.stack.petdogqueue.test;

import interviewguide.stack.petdogqueue.*;

public class CatDogQueueTest {
    public static void main(String[] args) {
        CatDogQueue queue = new CatDogQueue();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        queue.add(dog1);
        queue.add(dog2);
        queue.add(cat1);
        queue.add(cat2);

        System.out.println(queue.pollAll().getType());
        System.out.println(queue.pollCat().getType());
        System.out.println(queue.pollDog().getType());
    }
}
