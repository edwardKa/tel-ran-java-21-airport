package com.airport;

/**
 * @author Edward Kats
 */
public enum PlaneState {
    IN_AIR(1, "In air"),
    ON_THE_GROUND(2, "On the ground")
    ;

    private Integer id;
    private String description;

    PlaneState(Integer id, String description) { this.id = id;
    this.description = description; }

    public Integer getId() {return id;}

    public String getDescription() {return description;}

    public static PlaneState getById(Integer id) {
        for (PlaneState planeState : PlaneState.values()) {
            if (planeState.getId().equals(id)) { return planeState; }
        }
        throw new RuntimeException("No such ID");
    }
}
