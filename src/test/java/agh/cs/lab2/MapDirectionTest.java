package agh.cs.lab2;
import org.junit.Assert;
import org.junit.Test;

public class MapDirectionTest {
    @Test
    public void MapDirectionNext(){
        MapDirection mp1 = MapDirection.NORTH;
        MapDirection mp2 = MapDirection.SOUTH;
        MapDirection mp3 = MapDirection.EAST;
        MapDirection mp4 = MapDirection.WEST;
        Assert.assertEquals(mp1.Next(), mp3);
        Assert.assertEquals(mp2.Next(), mp4);
        Assert.assertEquals(mp3.Next(), mp2);
        Assert.assertEquals(mp4.Next(), mp1);
    }

    @Test
    public void MapDirectionPrevious(){
        MapDirection mp1 = MapDirection.NORTH;
        MapDirection mp2 = MapDirection.SOUTH;
        MapDirection mp3 = MapDirection.EAST;
        MapDirection mp4 = MapDirection.WEST;
        Assert.assertEquals(mp1.Previous(), mp4);
        Assert.assertEquals(mp2.Previous(), mp3);
        Assert.assertEquals(mp3.Previous(), mp1);
        Assert.assertEquals(mp4.Previous(), mp2);
    }
}