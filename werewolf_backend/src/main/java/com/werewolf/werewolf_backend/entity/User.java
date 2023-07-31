package com.werewolf.werewolf_backend.entity;
import javax.persistence.*;
import java.sql.Blob;

@Table(name = "user" )
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long uid;

    private String uname;

    private String password;

    private String mail_addr;

    private long victory_num;

    private long failure_num;

    private long draw_num;

    private String description;

    private String avatar;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail_addr() {
        return mail_addr;
    }

    public void setMail_addr(String mail_addr) {
        this.mail_addr = mail_addr;
    }

    public long getVictory_num() {
        return victory_num;
    }

    public void setVictory_num(long victory_num) {
        this.victory_num = victory_num;
    }

    public long getFailure_num() {
        return failure_num;
    }

    public void setFailure_num(long failure_num) {
        this.failure_num = failure_num;
    }

    public long getDraw_num() {
        return draw_num;
    }

    public void setDraw_num(long draw_num) {
        this.draw_num = draw_num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
