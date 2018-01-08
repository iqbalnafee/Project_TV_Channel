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
public class News_reader {
    String Program_id,reader_id;

    public News_reader(String Program_id, String reader_id) {
        this.Program_id = Program_id;
        this.reader_id = reader_id;
    }

    public String getProgram_id() {
        return Program_id;
    }

    public String getReader_id() {
        return reader_id;
    }

    public void setProgram_id(String Program_id) {
        this.Program_id = Program_id;
    }

    public void setReader_id(String reader_id) {
        this.reader_id = reader_id;
    }

    @Override
    public String toString() {
        return "News_reader{" + "Program_id=" + Program_id + ", reader_id=" + reader_id + '}';
    }
    
    
}
