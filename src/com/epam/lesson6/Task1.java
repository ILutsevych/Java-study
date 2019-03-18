package com.epam.lesson6;

public class Task1 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.printAnimal();

        animal.setName("Cat");
        animal.printAnimal();

        Animal animal1 = new Animal("Dog",20,3);
        animal1.printAnimal();

        Animal[]animals = new Animal[3];
        animals[0] = new Animal("cat1",10,10);
        animals[1] = new Animal("cat2",10,10);
        animals[2] = new Animal("cat3",10,10);

        System.out.println("---------");

        for (Animal elem: animals) {
            if (elem.getAge()>5) {
                elem.printAnimal();

            }
        }



    }
}
