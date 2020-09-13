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
        words.add(new Word("father","वडील", R.drawable.family_father));
        words.add(new Word("mother","आई", R.drawable.family_mother));
        words.add(new Word("son","मुलगा", R.drawable.family_son));
        words.add(new Word("daughter","मुलगी", R.drawable.family_daughter));
        words.add(new Word("older brother","मोठा भाऊ", R.drawable.family_older_brother));
        words.add(new Word("younger brother","धाकटा भाऊ", R.drawable.family_younger_brother));
        words.add(new Word("older sister","मोठी बहीण", R.drawable.family_older_sister));
        words.add(new Word("younger sister","लहान बहीण", R.drawable.family_younger_sister));
        words.add(new Word("grandmother","आजी", R.drawable.family_grandmother));
        words.add(new Word("grandfather","आजोबा", R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}