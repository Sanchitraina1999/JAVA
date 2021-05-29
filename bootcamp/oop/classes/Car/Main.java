public class Main {
    public static void main(String[] args) {
        car hyundai = new car();
        hyundai.setModel("NIOS");
        hyundai.setWheels(4);
        hyundai.setDoors(4);
        System.out.println("hyundai model: " + hyundai.getModel());
        System.out.println("hyundai wheels: " + hyundai.getWheels());
        System.out.println("hyundai doors: " + hyundai.getDoors());
    }
}
