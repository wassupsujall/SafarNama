package com.example.safarnama;



public class Model2 {
    int image;
    String name, tag,tag1,tag2,tag3,tag4,tag5;

    public Model2(int image, String name, String tag,String tag1,String tag2,String tag3,String tag4,String tag5) {
        this.image = image;
        this.name = name;
        this.tag = tag;
        this.tag1=tag1;
        this.tag2=tag2;
        this.tag3=tag3;
        this.tag4=tag4;
        this.tag5=tag5;


    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {this.tag = tag;}
    public String getTag2() { return tag2; }
    public void setTag2(String tag2) {
        this.tag2= tag2;
    }
    public String getTag1() { return tag1; }
    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }
    public String getTag3() { return tag3; }
    public void setTag3(String tag3) { this.tag3 = tag3; }
    public String getTag4() { return tag4; }

    public void setTag4(String tag4) {
        this.tag4 = tag4;}

    public String getTag5(){ return tag5; }

    public void setTag5(String tag5) {
        this.tag5 = tag5;


    }
}
