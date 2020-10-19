package agh.cs.lab2;
import static java.lang.System.out;

public class World {
    public static void main(String[] args) {
        // sprawdzanie metod klasy Vector2d
        out.println("Checking methods for Vector2d class:");
        Vector2d position1 = new Vector2d(1,2);
        out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        out.println(position2);
        out.println(position1.Add(position2));
        // dodatkowe, "ręczne" sprawdzanie metod
        out.println(position1.Subtract(position2));
        out.println(position1.Opposite());
        out.println(position1.Precedes(position2));
        out.println(position2.Precedes(position1));
        out.println(position1.Follows(position2));
        out.println(position2.Follows(position1));
        Vector2d position3 = new Vector2d(0, 3);
        out.println(position1.UpperRight(position3));
        out.println(position1.LowerLeft(position3));
        Vector2d position4 = new Vector2d(1,2);
        out.println(position1.equals(position3));
        out.println(position1.equals(position4));
        // sprawdzanie metod typu wyliczeniowego MapDirection
        out.println("Checking methods for MapDirection enum:");
        MapDirection d1 = MapDirection.NORTH;
        out.println(d1);
        MapDirection d2 = MapDirection.WEST;
        out.println(d2);
        out.println(d1.Next());
        out.println(d2.Next());
        out.println(d1.Previous());
        out.println(d2.Previous());
        out.println(d1.ToUnitVector());
        out.println(d2.ToUnitVector());
    }
}
