package com.example.databasesqllite.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.databasesqllite.model.Note;

import java.util.List;

@Dao
public interface NoteDAO {

    @Query("SELECT * FROM Note_Table")
    public List<Note> getNotes();

    @Insert
    public void insertNote(Note note);

    @Query("SELECT * FROM Note_Table WHERE id=:id")
    public Note findById(int id);

    @Query("DELETE FROM Note_Table WHERE id=:id ")
    public void deleteById(int id);
}
