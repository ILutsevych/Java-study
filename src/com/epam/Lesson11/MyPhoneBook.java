package com.epam.Lesson11;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    private Contact[] contacts = new Contact[10];
    private int count = 0;

    private class Contact {
        private String name;
        private String numberPhone;

        public Contact(String name, String numberPhone) {
            this.name = name;
            this.numberPhone = numberPhone;
        }

        public String getName( ) {
            return name;
        }

        public String getNumberPhone( ) {
            return numberPhone;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setNumberPhone(String numberPhone) {
            this.numberPhone = numberPhone;
        }

        @Override
        public String toString( ) {
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", numberPhone='" + numberPhone + '\'' +
                    '}';
        }
    }
    public void addPhoneNumber(String name, String number){
        if(count >= contacts.length) {
            return;
        }
        contacts[count] = new Contact(name, number);
        count++;
    }

    @Override
    public String toString( ) {
        if(count ==0){
            return "Contacts is empty!";
        }
        return viewContacts(contacts,count);
    }

    private String viewContacts(Contact[] array, int size){

        StringBuilder result = new StringBuilder();

        for (int i = 0; i <size; i++) {
            result.append(array[i] + "\n");
        }
        return result.toString();
    }

    public String sortByName(){
     Contact [] newContact = Arrays.copyOf(contacts,count);
        Arrays.sort(newContact, new Comparator<Contact>() {
            @Override
            public int compare(Contact o1, Contact o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
      return viewContacts(newContact, newContact.length);
    }
}

