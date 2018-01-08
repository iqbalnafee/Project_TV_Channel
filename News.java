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
public class News {
    String Program_id,NEWS_NAME,NEWS_TYPE,NEWS_HOUR,CAMERAMAN_ID,DIRECTOR_ID,PRODUCER_ID,TITLE_SPONSOR;

    public News(String Program_id, String NEWS_NAME, String NEWS_TYPE, String NEWS_HOUR, String CAMERAMAN_ID, String DIRECTOR_ID, String PRODUCER_ID, String TITLE_SPONSOR) {
        this.Program_id = Program_id;
        this.NEWS_NAME = NEWS_NAME;
        this.NEWS_TYPE = NEWS_TYPE;
        this.NEWS_HOUR = NEWS_HOUR;
        this.CAMERAMAN_ID = CAMERAMAN_ID;
        this.DIRECTOR_ID = DIRECTOR_ID;
        this.PRODUCER_ID = PRODUCER_ID;
        this.TITLE_SPONSOR = TITLE_SPONSOR;
    }

    public String getProgram_id() {
        return Program_id;
    }

    public String getNEWS_NAME() {
        return NEWS_NAME;
    }

    public String getNEWS_TYPE() {
        return NEWS_TYPE;
    }

    public String getNEWS_HOUR() {
        return NEWS_HOUR;
    }

    public String getCAMERAMAN_ID() {
        return CAMERAMAN_ID;
    }

    public String getDIRECTOR_ID() {
        return DIRECTOR_ID;
    }

    public String getPRODUCER_ID() {
        return PRODUCER_ID;
    }

    public String getTITLE_SPONSOR() {
        return TITLE_SPONSOR;
    }

    public void setProgram_id(String Program_id) {
        this.Program_id = Program_id;
    }

    public void setNEWS_NAME(String NEWS_NAME) {
        this.NEWS_NAME = NEWS_NAME;
    }

    public void setNEWS_TYPE(String NEWS_TYPE) {
        this.NEWS_TYPE = NEWS_TYPE;
    }

    public void setNEWS_HOUR(String NEWS_HOUR) {
        this.NEWS_HOUR = NEWS_HOUR;
    }

    public void setCAMERAMAN_ID(String CAMERAMAN_ID) {
        this.CAMERAMAN_ID = CAMERAMAN_ID;
    }

    public void setDIRECTOR_ID(String DIRECTOR_ID) {
        this.DIRECTOR_ID = DIRECTOR_ID;
    }

    public void setPRODUCER_ID(String PRODUCER_ID) {
        this.PRODUCER_ID = PRODUCER_ID;
    }

    public void setTITLE_SPONSOR(String TITLE_SPONSOR) {
        this.TITLE_SPONSOR = TITLE_SPONSOR;
    }

    @Override
    public String toString() {
        return "News{" + "Program_id=" + Program_id + ", NEWS_NAME=" + NEWS_NAME + ", NEWS_TYPE=" + NEWS_TYPE + ", NEWS_HOUR=" + NEWS_HOUR + ", CAMERAMAN_ID=" + CAMERAMAN_ID + ", DIRECTOR_ID=" + DIRECTOR_ID + ", PRODUCER_ID=" + PRODUCER_ID + ", TITLE_SPONSOR=" + TITLE_SPONSOR + '}';
    }
    
    
}
