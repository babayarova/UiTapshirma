import animal.Animal;
import animal.Eagle;
import animal.Shark;
import animal.Turtle;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Shark(), new Turtle(), new Eagle()};
        for (Animal an : animals) {
            if (an instanceof Shark){
                ((Shark) an).attack();
            } else if (an instanceof Turtle) {
                ((Turtle) an).swim();
            }

            if (an instanceof Eagle) {
                ((Eagle) an).fly();
            } else {

                Shark[] sharks = new Shark[0];
                for (Shark shark : sharks) {
                    shark.attack();
                }
                Turtle[] turtles = new Turtle[0];
                for (Turtle turtle : turtles) {
                    turtle.swim();
                }
                Eagle[] eagles = new Eagle[0];
                for (Eagle egy : eagles) {
                    egy.fly();}
                }

            }
        }
    }