package agh.cs.lab2;

public enum MapDirection {
    NORTH,
    SOUTH,
    EAST,
    WEST;

    public MapDirection Next(){
        switch(this) {
            case NORTH: return EAST;
            case SOUTH: return WEST;
            case EAST: return SOUTH;
            default: return NORTH;
        }
    }

    public MapDirection Previous(){
        switch(this) {
            case NORTH: return WEST;
            case SOUTH: return EAST;
            case EAST: return NORTH;
            default: return SOUTH;
        }
    }

    public Vector2d ToUnitVector(){
        switch(this) {
            case NORTH: return new Vector2d(0,1);
            case SOUTH: return new Vector2d(0,-1);
            case EAST: return new Vector2d(1,0);
            default: return new Vector2d(-1,0);
        }
    }

    @Override
    public String toString() {
        switch(this) {
            case NORTH: return "North";
            case SOUTH: return "South";
            case EAST: return "East";
            default: return "West";
        }
    }
}
