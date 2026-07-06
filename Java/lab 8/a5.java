class House {
    private String address;
    private int numberOfRooms;
    private double area;

    public void setAddress(String a) {
        address = a;
    }

    public void setNumberOfRooms(int n) {
        numberOfRooms = n;
    }

    public void setArea(double ar) {
        area = ar;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public double getArea() {
        return area;
    }

    double calculatePrice(double pricePerSqMeter) {
        return area * pricePerSqMeter;
    }
}
public class a5{
    public static void main(String[] args) {
        House h = new House();
        h.setAddress("Ahmedabad");
        h.setNumberOfRooms(3);
        h.setArea(120);

        System.out.println("Address: " + h.getAddress());
        System.out.println("Rooms: " + h.getNumberOfRooms());
        System.out.println("Area: " + h.getArea());
        System.out.println("Price: " + h.calculatePrice(1500));
    }
}