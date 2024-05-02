package com.example.databasesqllite.repository;

import android.content.Context;

import androidx.room.Room;

import com.example.databasesqllite.AppDatabase;
import com.example.databasesqllite.dao.BookDAO;
import com.example.databasesqllite.dao.NoteDAO;
import com.example.databasesqllite.model.Book;
import com.example.databasesqllite.model.BookNote;
import com.example.databasesqllite.model.Note;
import com.example.databasesqllite.model.NoteBook;

import java.util.List;

public class NoteRepository {

    private NoteDAO noteDAO;

    private BookDAO bookDAO;

    public NoteRepository(Context context) {
      AppDatabase appDatabase =  Room.databaseBuilder(context, AppDatabase.class,"MYDB2")
              .build();
        noteDAO = appDatabase.noteDAO();
        bookDAO = appDatabase.bookDAO();
    }

    public List<Note> getNotes(){
        return noteDAO.getNotes();
    }

    public Note findById(int id){
        return noteDAO.findById(id);
    }
    public void insertNote(Note note){
        noteDAO.insertNote(note);
    }

    public void deleteNote(int id){
        noteDAO.deleteById(id);
    }


    public List<NoteBook> getNoteBook(){
        return bookDAO.getNoteBook();
    }

    public void insertBook(Book book){
        bookDAO.insertBook(book);
    }

    public List<BookNote> getBookNote(){
        return bookDAO.getBookNote();
    }




}
