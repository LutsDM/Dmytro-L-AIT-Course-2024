package homeWork_18.animals;

import homeWork_18.animals.model.Cat;
import homeWork_18.animals.model.Dog;
import homeWork_18.animals.model.Pet;

public class HauseAppl {
    public static void main(String[] args) {

        Dog dog1 = new Dog(1, "dog",2,"Tyzik", "Pug", 30,7);
        Dog dog2 = new Dog(2, "dog",4,"Bobik", "NoName", 40,12);
        Cat cat1 = new Cat(3, "cat",2,"Myrzik", "MaineCoon", 25,9);
        Cat cat2 = new Cat(4, "cat",6,"Kuzya", "NoName", 20,4);
        Cat cat3 = new Cat(5, "cat",2,"Persik", "Munchkin", 15,7);

        dog1.voice();
        cat3.voice();
        cat1.voice();
        dog2.voice();
        cat2.voice();

    }

}
