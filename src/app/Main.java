package app;

public class Main {

    public static void main(String[] args) {

        Direction dir = Direction. GREEN;

        switch (dir){
            case GREEN:
                System.out.println("Traffic allowed");
                break;
            case YELLOW:
                System.out.println("Get ready for movement");
                break;
            case RED:
                System.out.println("No traffic allowed");
                break;
        }
    }
}
