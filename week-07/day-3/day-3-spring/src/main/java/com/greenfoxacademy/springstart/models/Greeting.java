package com.greenfoxacademy.springstart.models;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private AtomicLong id;
    private String content;

    public String[] getHellos() {
        return hellos;
    }

    public void setHellos(String[] hellos) {
        this.hellos = hellos;
    }

    public Greeting(String[] hellos) {
        this.hellos = hellos;
    }

    private String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};


    public AtomicLong getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Greeting(AtomicLong id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting() {

    }

    public String fizzBuzz(AtomicLong counter) {
        if (counter.intValue() % 5 == 0 && counter.intValue() % 7 == 0 && counter.intValue() % 3 == 0) {
            return "FizzBuzzWoof";
        } else if (counter.intValue() % 5 == 0 && counter.intValue() % 7 == 0) {
            return "BuzzFizz";
        } else if (counter.intValue() % 3 == 0 && counter.intValue() % 7 == 0) {
            return "FizzWoof";
        } else if (counter.intValue() % 3 == 0 && counter.intValue() % 5 == 0) {
            return "FizzBuzz";
        } else if (counter.intValue() % 3 == 0) {
            return "Fizz";
        } else if (counter.intValue() % 5 == 0) {
            return "Buzz";
        } else if (counter.intValue() % 7 == 0) {
            return "Woof";
        }


        return counter.toString();
    }
}
