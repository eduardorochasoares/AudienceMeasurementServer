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
public enum PriorityTimeTrigger {
    
    a(0), b(1), c(2), d(3), e(4), f(5), g(6), h(7), i(8), j(9), k(10);
    private final int priority;

     PriorityTimeTrigger(int num) {
        this.priority = num;
    }

    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }
}
