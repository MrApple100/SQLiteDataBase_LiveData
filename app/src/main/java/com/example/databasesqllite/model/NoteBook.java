package com.example.databasesqllite.model;

import androidx.room.ColumnInfo;

public class NoteBook {
    @ColumnInfo(name="Note_name")
    private String name;
    @ColumnInfo(name = "Book_name")
    private String bookName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "name='" + name + '\'' +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
