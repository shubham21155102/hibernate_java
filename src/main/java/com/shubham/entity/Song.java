package com.shubham.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="song")
public class Song {
    @Id
    @Column(name = "songId")
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
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
    @Override
    public String toString() {
        return "Song [id=" + songId + ", songName=" + songName + ", singerName=" + singerName + "]";
    }

}