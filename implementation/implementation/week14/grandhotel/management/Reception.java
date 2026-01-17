package implementation.week14.grandhotel.management;

import implementation.week14.grandhotel.room.Room;
import implementation.week14.grandhotel.room.RoomDirtyException;

import java.util.ArrayList;
import java.util.List;

public class Reception
{
    private List<Room> rooms;

    public Reception()
    {
        this.rooms = new ArrayList<>();
    }

    public List<Room> getAvailableRoom() throws RoomDirtyException
    {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : rooms)
        {
            if (room.isBooked() && room.getCleanlinessScore() < 50)
            {
                throw new RoomDirtyException("Room is not available!");
            }
            else
            {
                availableRooms.add(room);
            }
        }

        return availableRooms;
    }

    public double generateRevenueReport()
    {
        double total = 0.0;

        for (Room room : rooms)
        {
            total += room.calculateBill(1);
        }

        return total;
    }
}