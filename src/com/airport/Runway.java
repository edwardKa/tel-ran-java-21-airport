package com.airport;

/**
 * @author Edward Kats
 */
public class Runway {
    public static boolean IS_LANE_ACCESSIBLE = true;


    public void takeOff(Plane plane) {
        synchronized (this) {
            IS_LANE_ACCESSIBLE = false;
            System.out.println("Самолет " + plane.getName() + " взлетает");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            IS_LANE_ACCESSIBLE = true;

            System.out.println("Самолет " + plane.getName() + " взлетел");
        }
    }
}
