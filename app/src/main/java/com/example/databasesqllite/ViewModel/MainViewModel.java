package com.example.databasesqllite.ViewModel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.databasesqllite.model.BookNote;
import com.example.databasesqllite.model.Note;
import com.example.databasesqllite.model.NoteBook;

public class MainViewModel extends ViewModel {

    private MutableLiveData<Note> noteLD = new MutableLiveData<>();

    private MutableLiveData<NoteBook> notebookLD = new MutableLiveData<>();

    private MutableLiveData<BookNote> bookNoteLD = new MutableLiveData<>();



    public MutableLiveData<Note> getNoteLD() {
        return noteLD;
    }

    public void setNoteLD(Note note) {
        this.noteLD.postValue(note);
    }

    public MutableLiveData<NoteBook> getNotebookLD() {
        return notebookLD;
    }

    public void setNotebookLD(NoteBook notebook) {
        this.notebookLD.postValue(notebook);
    }


    public MutableLiveData<BookNote> getBookNoteLD() {
        return bookNoteLD;
    }

    public void setBookNoteLD(BookNote bookNoteLD) {
        this.bookNoteLD.postValue(bookNoteLD);
    }
}
