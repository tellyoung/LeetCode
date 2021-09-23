package optimal.chapter_1_zstackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class Problem_04_DogCatQueue {
    public static class Pet{
        private String type;

        public Pet(String type) {
            this.type = type;
        }

        public String getPetType(){
            return this.type;
        }
    }

    public static class Dog extends Pet {
        public Dog() {
            super("dog");
        }
    }

    public static class Cat extends Pet {
        public Cat() {
            super("cat");
        }
    }

    public static class PetEnterQueue{
        private Pet pet;
        private int index;

        public PetEnterQueue(Pet pet, int index) {
            this.pet = pet;
            this.index = index;
        }

        public Pet getPet(){
            return this.pet;
        }

        public int getIndex(){
            return this.index;
        }

        public String getEnterPetType(){
            return this.pet.getPetType();
        }


    }

    public static class DogCatQueue{
        private Queue<PetEnterQueue> dogQ;
        private Queue<PetEnterQueue> catQ;
        private int index;

        public DogCatQueue() {
            this.dogQ = new LinkedList<>();
            this.catQ = new LinkedList<>();
            this.index = 0;
        }

        public void add(Pet pet){
            if (pet.getPetType().equals("dog")) {
                this.dogQ.add(new PetEnterQueue(pet, this.index++));
            } else if (pet.getPetType().equals("cat")) {
                this.catQ.add(new PetEnterQueue(pet, this.index++));
            } else {
                throw new RuntimeException("err, not dog or cat");
            }
        }

        public void pollAll(){
            while (!this.isEmpty()){
                if (!this.isDogQueueEmpty() && !this.isCatQueueEmpty()){
                    if (this.dogQ.peek().index < this.catQ.peek().index){
                        System.out.print(this.dogQ.poll().getEnterPetType());
                    } else {
                        System.out.print(this.catQ.poll().getEnterPetType());
                    }

                } else if (!this.isDogQueueEmpty()){
                    System.out.print(this.dogQ.poll().getEnterPetType());
                } else if (!this.isCatQueueEmpty()){
                    System.out.print(this.catQ.poll().getEnterPetType());
                } else {
                    throw new RuntimeException("err, queue is Empty !");
                }
            }
        }

        public void pollDog(){
            if (!this.isDogQueueEmpty()) {
                System.out.print(this.dogQ.poll().getEnterPetType());
            } else {
                throw new RuntimeException("Dog queue is empty!");
            }
        }

        public void pollCat(){
            if (!this.isCatQueueEmpty()) {
                System.out.print(this.catQ.poll().getEnterPetType());
            } else {
                throw new RuntimeException("cat queue is empty!");
            }
        }

        public boolean isEmpty(){
            return this.dogQ.isEmpty() && this.catQ.isEmpty();
        }

        public boolean isDogQueueEmpty() {
            return this.dogQ.isEmpty();
        }

        public boolean isCatQueueEmpty() {
            return this.catQ.isEmpty();
        }

    }

    public static void main(String[] args) {
        DogCatQueue test = new DogCatQueue();
        Pet dog1 = new Dog();
        Pet dog2 = new Dog();
        Pet cat1 = new Cat();
        Pet cat2 = new Cat();

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        test.pollAll();
        System.out.println("\n==========");

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        while (!test.isDogQueueEmpty()){
            test.pollDog();
        }
        System.out.println("\n============");

        test.add(dog1);
        test.add(cat1);
        test.add(dog2);
        test.add(cat2);
        while (!test.isCatQueueEmpty()){
            test.pollCat();
        }
    }

}
