package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
//        Create an array of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","वडील"));
        words.add(new Word("mother","आई"));
        words.add(new Word("son","मुलगा"));
        words.add(new Word("daughter","मुलगी"));
        words.add(new Word("older brother","मोठा भाऊ"));
        words.add(new Word("younger brother","धाकटा भाऊ"));
        words.add(new Word("older sister","मोठी बहीण"));
        words.add(new Word("younger sister","लहान बहीण"));
        words.add(new Word("grandmother","आजी"));
        words.add(new Word("grandfather","आजोबा"));

        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}