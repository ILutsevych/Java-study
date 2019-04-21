package com.epam.Lesson11;

public class Main {
    public static void main(String[] args) {
    MyPhoneBook phoneBook = new MyPhoneBook();
        phoneBook.addPhoneNumber("Ivan", "+38(098)5728883");
        phoneBook.addPhoneNumber("Vita", "+38(092)9928883");
        phoneBook.addPhoneNumber("Roman", "+38(097)7728883");
        phoneBook.addPhoneNumber("Olga", "+38(094)7852883");
        phoneBook.addPhoneNumber("Slava", "+38(091)5698883");
        phoneBook.addPhoneNumber("Zaja", "+38(090)5368883");
        System.out.println(phoneBook);
        System.out.println("------------------");
        System.out.println(phoneBook.sortByName());
    }
}
