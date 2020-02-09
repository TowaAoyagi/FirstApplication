package com.kamiture.kamui.haikupost;

/**
 * Created by kamui_000 on 2016/12/28.
 */

public class Post {
    String kamiku;
    String nakaku;
    String simoku;

    public Post(){
        // firebase使うのに必要
    }
    public Post(String kamiku,String nakaku, String simoku){
        this.kamiku = kamiku;
        this.nakaku = nakaku;
        this.simoku = simoku;
    }

    public String getKamiku(){return kamiku;}

    public void setKamiku (String kamiku){this.kamiku = kamiku;}


    public String getNakaku(){return nakaku;}

    public void  setNakaku (String nakaku){this.nakaku = nakaku;}


    public String getSimoku(){return simoku;}


    public void setSimoku (String simoku ) {this.simoku = simoku;}



}
