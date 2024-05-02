package com.example.databasesqllite.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;

import com.example.databasesqllite.model.Book;
import com.example.databasesqllite.model.BookNote;
import com.example.databasesqllite.model.NoteBook;

import java.util.List;

@Dao
public interface BookDAO {

    @Query("SELECT Note_Table.Note_name, Book_name" +
            " FROM Note_Table,Book_Table "+
                "WHERE Note_Table.Book_id=Book_id")
    public List<NoteBook> getNoteBook();

    @Insert
    public void insertBook(Book book);

    @Transaction
    @Query("SELECT id, Book_name from Book_Table")
    List<BookNote> getBookNote();


}
