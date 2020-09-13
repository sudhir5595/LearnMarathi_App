package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
//        Create an array of words
        ArrayList <Word> words = new ArrayList<Word>();
        words.add(new Word("one","एक"));
        words.add(new Word("two","दोन"));
        words.add(new Word("three","तीन"));
        words.add(new Word("four","चार"));
        words.add(new Word("five","पाच"));
        words.add(new Word("six","सहा"));
        words.add(new Word("seven","सात"));
        words.add(new Word("eight","आठ"));
        words.add(new Word("nine","नऊ"));
        words.add(new Word("ten","दहा"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}