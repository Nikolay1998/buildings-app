package buildings;

public interface BuildingFactory {
    public Space createSpace(double area);
    Space createSpace(int roomsCount, double area);
    Floor createFloor(int spacesCount);
    Floor createFloor(Space... spaces);
    Building createBuilding(int floorsCount, int[] spacesCounts);
    Building createBuilding(Floor... floors);
}
