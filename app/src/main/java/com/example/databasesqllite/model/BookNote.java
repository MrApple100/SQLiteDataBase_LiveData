package com.example.databasesqllite.model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class BookNote {


    @Embedded
    private Book book;

    @Relation(parentColumn = "id", entityColumn = "Book_id")
    public List<Note> notes;


    @Override
    public String toString() {
        return "BookNote{" +
                "book=" + book +
                ", notes=" + notes +
                '}';
    }
}
