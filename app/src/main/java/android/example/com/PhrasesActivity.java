package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
//        Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?","आपण कोठे जात आहात?"));
        words.add(new Word("What is your name?","तुझं नाव काय आहे?"));
        words.add(new Word("My name is...","माझं नावं आहे..."));
        words.add(new Word("How are you feeling?", "तुला कसे वाटत आहे?"));
        words.add(new Word("I’m feeling good.","मला बरं वाटतेय."));
        words.add(new Word("Are you coming?","तू येत आहेस का?"));
        words.add(new Word("Yes, I’m coming.","होय, मी येत आहे."));
        words.add(new Word("I’m coming.","मी येतोय."));
        words.add(new Word("Let’s go.","चल जाऊया."));
        words.add(new Word("Come here.","इकडे ये."));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}