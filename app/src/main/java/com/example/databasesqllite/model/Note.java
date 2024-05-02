package com.example.databasesqllite.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Note_Table")
public class Note {
    @PrimaryKey()
    public int id;

    @ColumnInfo(name = "Note_name")
    public String name;

    @ColumnInfo(name = "Book_id")
    public int bookId;

    public Note(int id, String name,int bookId) {
        this.id = id;
        this.name = name;
        this.bookId = bookId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}
