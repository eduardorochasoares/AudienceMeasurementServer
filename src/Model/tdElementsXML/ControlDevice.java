/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.tdElementsXML;

/**
 *
 * @author Principal
 */
public enum ControlDevice {

    STBControl(0), STB(1), STBKeyboard(2), PC(10), TABLET(20), MOBILEFONE(30), OTHER(40);
    private int valorCodigo;

    ControlDevice(int valor) {
        valorCodigo = valor;
    }

    /**
     * @return the valorCodigo
     */
    public int getValorCodigo() {
        return valorCodigo;
    }

    /**
     * @param valorCodigo the valorCodigo to set
     */
    public void setValorCodigo(int valorCodigo) {
        this.valorCodigo = valorCodigo;
    }
}
