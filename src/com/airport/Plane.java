package com.airport;

/**
 * @author Edward Kats
 */
public class Plane extends Thread {

    static volatile Runway runway = new Runway();

    public Plane(String name) {
        super(name);
    }

    @Override
    public void run() {
        PlaneState planeState = PlaneState.ON_THE_GROUND;

        while (planeState == PlaneState.ON_THE_GROUND) {

            if (Runway.IS_LANE_ACCESSIBLE) {
                System.out.println("Полоса свободна. Самолет " + super.getName() + " выезжает на взлетную полосу");
                runway.takeOff(this);
                planeState = PlaneState.IN_AIR;
                System.out.println("Самолет " + super.getName() + " взлетел. PlaneState: " + planeState.getDescription());
            } else {
                System.out.println("Полоса занята. Самолет " + super.getName() + " ожидает");
                System.out.println("PlaneState: " + planeState.getDescription());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
