package agh.cs.lab2;
import org.junit.Assert;
import org.junit.Test;

public class Vector2dTest {
    @Test
    public void Vector2dEquals(){
        Vector2d v1 = new Vector2d(1,2);
        Vector2d v2 = new Vector2d(1,2);
        Vector2d v3 = new Vector2d(-2,0);
        Assert.assertTrue(v1.equals(v2));
        Assert.assertFalse(v1.equals(v3));
        Assert.assertFalse(v2.equals(v3));
    }

    @Test
    public void Vector2dToString(){
        Vector2d v1 = new Vector2d(1,2);
        Vector2d v2 = new Vector2d(-2,0);
        Assert.assertEquals(v1.toString(), "(1,2)");
        Assert.assertEquals(v2.toString(), "(-2,0)");
    }

    @Test
    public void Vector2dPrecedes(){
        Vector2d v1 = new Vector2d(1,2);
        Vector2d v2 = new Vector2d(-2,0);
        Assert.assertTrue(v2.Precedes(v1));
        Assert.assertFalse(v1.Precedes(v2));
    }

    @Test
    public void Vector2dFollows(){
        Vector2d v1 = new Vector2d(1,2);
        Vector2d v2 = new Vector2d(-2,0);
        Assert.assertTrue(v1.Follows(v2));
        Assert.assertFalse(v2.Follows(v1));
    }

    @Test
    public void Vector2dUpperRight(){
        Vector2d v1 = new Vector2d(3,-2);
        Vector2d v2 = new Vector2d(1,2);
        Assert.assertEquals(v1.UpperRight(v2), new Vector2d(3, 2));
    }

    @Test
    public void Vector2dLowerLeft(){
        Vector2d v1 = new Vector2d(3,-2);
        Vector2d v2 = new Vector2d(1,2);
        Assert.assertEquals(v1.LowerLeft(v2), new Vector2d(1, -2));
    }

    @Test
    public void Vector2dAdd(){
        Vector2d v1 = new Vector2d(3,-2);
        Vector2d v2 = new Vector2d(1,2);
        Assert.assertEquals(v1.Add(v2), new Vector2d(4, 0));
    }

    @Test
    public void Vector2dSubtract(){
        Vector2d v1 = new Vector2d(3,-2);
        Vector2d v2 = new Vector2d(1,2);
        Assert.assertEquals(v1.Subtract(v2), new Vector2d(2, -4));
        Assert.assertEquals(v2.Subtract(v1), new Vector2d(-2, 4));
    }

    @Test
    public void Vector2dOpposite(){
        Vector2d v1 = new Vector2d(3,-2);
        Assert.assertEquals(v1.Opposite(), new Vector2d(-3, 2));
    }
}