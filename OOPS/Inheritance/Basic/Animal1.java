package OOPS.Inheritance.Basic;

public class Animal1 {
    void speak() {
        System.out.println("Animal speaks");
    }
}

// default class Dog extends Animal1 {
// void fetch() {
// System.out.println("Dog fetches");
// }
// }

// 👇 no modifier = default access

class Dog extends Animal1 {
    void fetch() {
        System.out.println("Dog fetches");
    }
}

class Client {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.speak();
        d.fetch();
    }
}

// in single file only one public is allowed
// write other classes as default--->> default maat likh dena java me koi
// keyword nhi hai default
// Class या member सिर्फ उसी package में accessible रहेगा।
