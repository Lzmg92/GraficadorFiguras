package com.example.lezs.graficadorfiguras;

/**
 * Created by lezs on 29/07/15.
 */
public class NodoValores {
    float valx, valy, val1, val2, val3;
    char tipo, color;

    public NodoValores(char tipo, float valx, float valy, float val1, float val2, float val3, char color){

        tipo = this.tipo;
        valx = this.valx;
        valy = this.valy;
        val1 = this.val1;
        val2 = this.val2;
        val3 = this.val3;
        color = this.color;

    }

    public float getValx() {
        return valx;
    }

    public void setValx(float valx) {
        this.valx = valx;
    }

    public float getValy() {
        return valy;
    }

    public void setValy(float valy) {
        this.valy = valy;
    }

    public float getVal1() {
        return val1;
    }

    public void setVal1(float val1) {
        this.val1 = val1;
    }

    public float getVal2() {
        return val2;
    }

    public void setVal2(float val2) {
        this.val2 = val2;
    }

    public float getVal3() {
        return val3;
    }

    public void setVal3(float val3) {
        this.val3 = val3;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }
}
