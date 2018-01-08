/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author user2
 */
public class Show {
    String Show_id,Show_name,Show_episode,Show_topic,Show_type,Director_id,Producer_id,Duration;

    public Show(String Show_id, String Show_name, String Show_episode, String Show_topic, String Show_type, String Director_id, String Producer_id, String Duration) {
        this.Show_id = Show_id;
        this.Show_name = Show_name;
        this.Show_episode = Show_episode;
        this.Show_topic = Show_topic;
        this.Show_type = Show_type;
        this.Director_id = Director_id;
        this.Producer_id = Producer_id;
        this.Duration = Duration;
    }

    public String getShow_id() {
        return Show_id;
    }

    public String getShow_name() {
        return Show_name;
    }

    public String getShow_episode() {
        return Show_episode;
    }

    public String getShow_topic() {
        return Show_topic;
    }

    public String getShow_type() {
        return Show_type;
    }

    public String getDirector_id() {
        return Director_id;
    }

    public String getProducer_id() {
        return Producer_id;
    }

    public String getDuration() {
        return Duration;
    }

    public void setShow_id(String Show_id) {
        this.Show_id = Show_id;
    }

    public void setShow_name(String Show_name) {
        this.Show_name = Show_name;
    }

    public void setShow_episode(String Show_episode) {
        this.Show_episode = Show_episode;
    }

    public void setShow_topic(String Show_topic) {
        this.Show_topic = Show_topic;
    }

    public void setShow_type(String Show_type) {
        this.Show_type = Show_type;
    }

    public void setDirector_id(String Director_id) {
        this.Director_id = Director_id;
    }

    public void setProducer_id(String Producer_id) {
        this.Producer_id = Producer_id;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    @Override
    public String toString() {
        return "Show{" + "Show_id=" + Show_id + ", Show_name=" + Show_name + ", Show_episode=" + Show_episode + ", Show_topic=" + Show_topic + ", Show_type=" + Show_type + ", Director_id=" + Director_id + ", Producer_id=" + Producer_id + ", Duration=" + Duration + '}';
    }
    
    
}
