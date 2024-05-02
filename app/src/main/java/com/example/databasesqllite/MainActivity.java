package com.example.databasesqllite;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.databasesqllite.ViewModel.MainViewModel;
import com.example.databasesqllite.model.Book;
import com.example.databasesqllite.model.BookNote;
import com.example.databasesqllite.model.Note;
import com.example.databasesqllite.model.NoteBook;
import com.example.databasesqllite.repository.NoteRepository;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    private final ExecutorService executorService = Executors.newFixedThreadPool(2);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NoteRepository noteRep = new NoteRepository(getApplicationContext());

        MainViewModel mainViewModel = new ViewModelProvider(this).get(MainViewModel.class);

        Button button = findViewById(R.id.toCLick);
        TextView textView = findViewById(R.id.TV);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                executorService.execute(() -> {
                   // noteRep.insertBook(new Book("LOL"));
                   // noteRep.insertNote(new Note(12, "POP",1));
                   // mainViewModel.setNotebookLD(noteRep.getNoteBook().get(0));
                    mainViewModel.setBookNoteLD(noteRep.getBookNote().get(0));
                });
            }
        });

        mainViewModel.getNoteLD().observe(this, new Observer<Note>() {
            @Override
            public void onChanged(Note note) {
                textView.setText(note.name);

            }
        });

        mainViewModel.getNotebookLD().observe(this, new Observer<NoteBook>() {
            @Override
            public void onChanged(NoteBook noteBook) {
                textView.setText(noteBook.toString());
            }
        });

        mainViewModel.getBookNoteLD().observe(this, new Observer<BookNote>() {
            @Override
            public void onChanged(BookNote bookNote) {
                textView.setText(bookNote.toString());
            }
        });

    }
}