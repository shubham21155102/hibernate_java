package com.shubham.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Song {
    @Id
    @Column(name = "songId")
    private int songId;
    @Column(name = "songName")
    private String songName;
    @Column(name = "singerName")
    private String singerName;
    public int getId(){
        return songId;
    }
    public void setId(int songId){
        this.songId = songId;
    }
    public String getSongName(){
        return songName;
    }
    public void setSongName(String songName){
        this.songName = songName;
    }
    public String getSingerName(){
        return singerName;
    }
    public void setSingerName(String singerName){
        this.singerName = singerName;
    }

}