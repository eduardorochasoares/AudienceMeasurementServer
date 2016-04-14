/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.MeasurementRequest;

/**
 *
 * @author Principal
 */
public enum DayOfTheWeek {

    Everyday(0), Monday(1), Tuesday(2), Wednesday(3),
    Thursday(4), Friday(5), Saturday(6), Sunday(7), WeekDay(8), Weekend(9);
    private final int code;

    DayOfTheWeek(int code) {
        this.code = code;
    }

    /**
     * @return the code
     */
    public int getCode() {
        return code;
    }

}
