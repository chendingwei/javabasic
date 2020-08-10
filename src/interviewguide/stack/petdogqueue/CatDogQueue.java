package interviewguide.stack.petdogqueue;

import java.util.LinkedList;
import java.util.Queue;

public class CatDogQueue {
    private Queue<PetEnterQueue> catQ;
    private Queue<PetEnterQueue> dogQ;
    private long count;

    public CatDogQueue() {
        this.catQ = new LinkedList<PetEnterQueue>();
        this.dogQ = new LinkedList<PetEnterQueue>();
        this.count = 0;
    }

    public void add(Pet pet) {
        if (pet.getType().equals("dog")) {
            dogQ.add(new PetEnterQueue(pet, count++));
        } else {
            catQ.add(new PetEnterQueue(pet, count++));
        }
    }

    public Dog pollDog(){
        Dog pet =(Dog) dogQ.poll().getPet();
        return pet;
    }

    public Cat pollCat(){
        Cat pet = (Cat) catQ.poll().getPet();
        return pet;
    }

    public Pet pollAll() {
        if (!dogQ.isEmpty() && !catQ.isEmpty()) {
            if (catQ.peek().getCount() > dogQ.peek().getCount()) {
                Pet pet = catQ.poll().getPet();
                return pet;
            } else {
                Pet pet = dogQ.poll().getPet();
                return pet;

            }
        }else if(dogQ.isEmpty()){
            return catQ.poll().getPet();
        }else {
            return dogQ.poll().getPet();
        }
    }
}
