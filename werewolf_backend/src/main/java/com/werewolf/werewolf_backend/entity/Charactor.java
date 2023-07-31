package com.werewolf.werewolf_backend.entity;
import javax.persistence.*;

@Table(name = "charactor")
@Entity
public class Charactor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long uid;

    String name;

    String description;

    String camp;

    String avator;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCamp() {
        return camp;
    }

    public void setCamp(String camp) {
        this.camp = camp;
    }

    public String getAvator() {
        return avator;
    }

    public void setAvator(String avator) {
        this.avator = avator;
    }
}
