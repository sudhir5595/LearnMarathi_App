package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
//        Create an array of words
        ArrayList <Word> words = new ArrayList<Word>();
        words.add(new Word("red","लाल"));
        words.add(new Word("green","हिरवा"));
        words.add(new Word("brown","तपकिरी"));
        words.add(new Word("gray","राखाडी"));
        words.add(new Word("black","काळा"));
        words.add(new Word("white","पांढरा"));
        words.add(new Word("dusty yellow","धुळीचा पिवळा"));
        words.add(new Word("mustard yellow","मोहरीचा पिवळा"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}