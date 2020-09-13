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
        words.add(new Word("one","एक", R.drawable.number_one));
        words.add(new Word("two","दोन", R.drawable.number_two));
        words.add(new Word("three","तीन", R.drawable.number_three));
        words.add(new Word("four","चार", R.drawable.number_four));
        words.add(new Word("five","पाच", R.drawable.number_five));
        words.add(new Word("six","सहा", R.drawable.number_six));
        words.add(new Word("seven","सात", R.drawable.number_seven));
        words.add(new Word("eight","आठ", R.drawable.number_eight));
        words.add(new Word("nine","नऊ", R.drawable.number_nine));
        words.add(new Word("ten","दहा", R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}