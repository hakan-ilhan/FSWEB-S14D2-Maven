package org.example.model;

public class Bed {
    private String style;
    private int pillows, height, sheets;
    private  int  quilts;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilt;
    }
    public void make(){
        System.out.println("The bed is being made.");
    }
    public int getQuilts(){
        return quilts;
    }
    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }
    public String getStyle(){
        return style;
    }


}
