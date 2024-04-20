package Case;

public class Room {
    private int roomID;
    private int giaphong;
    private int tang;
    private String tinhtrangSD;

    public Room(int roomID, int giaphong, int tang, String tinhtrangSD) {
        this.roomID = roomID;
        this.giaphong = giaphong;
        this.tang = tang;
        this.tinhtrangSD = tinhtrangSD;
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getGiaphong() {
        return giaphong;
    }

    public void setGiaphong(int giaphong) {
        this.giaphong = giaphong;
    }

    public int getTang() {
        return tang;
    }

    public void setTang(int tang) {
        this.tang = tang;
    }

    public String getTinhtrangSD() {
        return tinhtrangSD;
    }

    public void setTinhtrangSD(String tinhtrangSD) {
        this.tinhtrangSD = tinhtrangSD;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomID=" + roomID +
                ", giaphong=" + giaphong +
                ", tang=" + tang +
                ", tinhtrangSD='" + tinhtrangSD + '\'' +
                '}';
    }
}
