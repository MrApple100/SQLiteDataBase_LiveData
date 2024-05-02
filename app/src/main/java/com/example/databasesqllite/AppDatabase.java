package com.example.databasesqllite;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.databasesqllite.dao.BookDAO;
import com.example.databasesqllite.dao.NoteDAO;
import com.example.databasesqllite.model.Book;
import com.example.databasesqllite.model.Note;

@Database(entities =  {Note.class, Book.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract NoteDAO noteDAO();

    public abstract BookDAO bookDAO();
}
