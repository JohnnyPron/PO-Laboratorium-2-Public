package agh.cs.lab2;
import java.util.Objects;

public class Vector2d {
    final int x;
    final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Vector2d(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean Precedes(Vector2d other){
        return this.getX() <= other.getX() & this.getY() <= other.getY();
    }

    public boolean Follows(Vector2d other){
        return this.getX() >= other.getX() & this.getY() >= other.getY();
    }

    public Vector2d UpperRight(Vector2d other){
        int new_x = Math.max(this.getX(), other.getX());
        int new_y = Math.max(this.getY(), other.getY());
        return new Vector2d(new_x, new_y);
    }

    public Vector2d LowerLeft(Vector2d other){
        int new_x = Math.min(this.getX(), other.getX());
        int new_y = Math.min(this.getY(), other.getY());
        return new Vector2d(new_x, new_y);
    }

    public Vector2d Add(Vector2d other){
        int new_x = this.getX() + other.getX();
        int new_y = this.getY() + other.getY();
        return new Vector2d(new_x, new_y);
    }

    public Vector2d Subtract(Vector2d other){
        int new_x = this.getX() - other.getX();
        int new_y = this.getY() - other.getY();
        return new Vector2d(new_x, new_y);
    }

    public Vector2d Opposite(){
        return new Vector2d(this.getX() * -1, this.getY() * -1);
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector2d vector2d = (Vector2d) o;
        return x == vector2d.x &&
                y == vector2d.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
