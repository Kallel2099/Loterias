package com.knowledge.loterias;

public class Lotofacil implements Comparable<Lotofacil> {
    
    private int cel1;
    private int cel2;
    private int cel3;
    private int cel4;
    private int cel5;
    private int cel6;
    private int cel7;
    private int cel8;
    private int cel9;
    private int cel10;
    private int cel11;
    private int cel12;
    private int cel13;
    private int cel14;
    private int cel15;
    private Integer qtd;
    private Integer gan;

    public Lotofacil() {
    }

    public Lotofacil(int cel1, int cel2, int cel3, int cel4, int cel5,
            int cel6, int cel7, int cel8, int cel9, int cel10, int cel11,
            int cel12, int cel13, int cel14, int cel15, int gan) {
        this.cel1 = cel1;
        this.cel2 = cel2;
        this.cel3 = cel3;
        this.cel4 = cel4;
        this.cel5 = cel5;
        this.cel6 = cel6;
        this.cel7 = cel7;
        this.cel8 = cel8;
        this.cel9 = cel9;
        this.cel10 = cel10;
        this.cel11 = cel11;
        this.cel12 = cel12;
        this.cel13 = cel13;
        this.cel14 = cel14;
        this.cel15 = cel15;
        this.gan = gan;
    }

    public int getCel1() {
        return cel1;
    }

    public void setCel1(int cel1) {
        this.cel1 = cel1;
    }

    public int getCel2() {
        return cel2;
    }

    public void setCel2(int cel2) {
        this.cel2 = cel2;
    }

    public int getCel3() {
        return cel3;
    }

    public void setCel3(int cel3) {
        this.cel3 = cel3;
    }

    public int getCel4() {
        return cel4;
    }

    public void setCel4(int cel4) {
        this.cel4 = cel4;
    }

    public int getCel5() {
        return cel5;
    }

    public void setCel5(int cel5) {
        this.cel5 = cel5;
    }

    public int getCel6() {
        return cel6;
    }

    public void setCel6(int cel6) {
        this.cel6 = cel6;
    }

    public int getCel7() {
        return cel7;
    }

    public void setCel7(int cel7) {
        this.cel7 = cel7;
    }

    public int getCel8() {
        return cel8;
    }

    public void setCel8(int cel8) {
        this.cel8 = cel8;
    }

    public int getCel9() {
        return cel9;
    }

    public void setCel9(int cel9) {
        this.cel9 = cel9;
    }

    public int getCel10() {
        return cel10;
    }

    public void setCel10(int cel10) {
        this.cel10 = cel10;
    }

    public int getCel11() {
        return cel11;
    }

    public void setCel11(int cel11) {
        this.cel11 = cel11;
    }

    public int getCel12() {
        return cel12;
    }

    public void setCel12(int cel12) {
        this.cel12 = cel12;
    }

    public int getCel13() {
        return cel13;
    }

    public void setCel13(int cel13) {
        this.cel13 = cel13;
    }

    public int getCel14() {
        return cel14;
    }

    public void setCel14(int cel14) {
        this.cel14 = cel14;
    }

    public int getCel15() {
        return cel15;
    }

    public void setCel15(int cel15) {
        this.cel15 = cel15;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getGan() {
        return gan;
    }

    public void setGan(int gan) {
        this.gan = gan;
    }

    @Override
    public String toString() {
        return "Lotofacil{" + "cel1=" + cel1 + ", cel2=" + cel2 + ","
                + " cel3=" + cel3 + ", cel4=" + cel4 + ", cel5=" + cel5 + ","
                + " cel6=" + cel6 + ", cel7=" + cel7 + ", cel8=" + cel8 + ","
                + " cel9=" + cel9 + ", cel10=" + cel10 + ", cel11=" + cel11 + ","
                + " cel12=" + cel12 + ", cel13=" + cel13 + ", cel14=" + cel14 + ","
                + " cel15=" + cel15 + ", qtd=" + qtd + ", gan=" + gan + '}'+"\n";
    }

    @Override
    public int compareTo(Lotofacil o) {
        return qtd.compareTo(o.getQtd());
    }
}
