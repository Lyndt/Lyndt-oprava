import BlockPost.BlogPost;
import PostIt.PostIt;
import Sharpie.Sharpie;

public class Main {
    public static void main(String[] args) {
        PostIt orangeText = new PostIt("orange", "Idea 1", "blue");
        PostIt pinkText = new PostIt("pink", "Awesome", "black");
        PostIt yellow = new PostIt("yellow", "Superb!", "green");

        System.out.println(orangeText);
        System.out.println(pinkText);
        System.out.println(yellow);
        System.out.println();

        BlogPost johnDoe = new BlogPost("Lorem ipsum dolor sit amet.", "Lorem ipsum", "2000.05.04", "John Doe");
        System.out.println(johnDoe);
        BlogPost timUrban = new BlogPost("A popular long-form, stick-figure-illustrated blog about almost everything.", "Wait but why", "2010.10.10", "Tim Urban");
        System.out.println(timUrban);
        BlogPost williamTurton = new BlogPost("Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention.\t \n When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t really into the whole organizer profile thing.", "One Engineer Is Trying to Get IBM to Reckon With Trump", "2017.03.28", "William Turton");
        System.out.println(williamTurton);

        Animal animal = new Animal(50,50);
        animal.play();
        animal.eat();
        animal.drink();
        System.out.println(animal.hunger);
        System.out.println(animal.thirst);

        Sharpie sharpie1 = new Sharpie("red", 80);
        sharpie1.use();
        System.out.println(sharpie1.getInkAmount());
        sharpie1.use();
        System.out.println(sharpie1.getInkAmount());





    }
}
