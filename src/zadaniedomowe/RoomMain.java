package zadaniedomowe;

public class RoomMain {
    public static void main(String[] args) {
       Room room1 = new Room(3.3,5.5,6.6);
       Room room2 = new Room(15, 5.5, 1.5);
        System.out.println(room1.getArea());
        System.out.println(room2.getArea());

        Room[] rooms = new Room[]{room1, room2};
        for(Room room:rooms){
            System.out.println("high, wide, length, area, volumen");
            System.out.println(room.getHigh()+ ", " + room.getWide() + ", " + room.getLength() + ", " + room.getArea() + ", "+ room.getVolume());
        }
        }
    }

