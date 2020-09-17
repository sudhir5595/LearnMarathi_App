package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
//        Create an array of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","वडील", R.drawable.family_father, R.raw.family_father));
        words.add(new Word("mother","आई", R.drawable.family_mother, R.raw.family_mother));
        words.add(new Word("son","मुलगा", R.drawable.family_son, R.raw.family_son));
        words.add(new Word("daughter","मुलगी", R.drawable.family_daughter, R.raw.family_daughter));
        words.add(new Word("older brother","मोठा भाऊ", R.drawable.family_older_brother, R.raw.family_older_brother));
        words.add(new Word("younger brother","धाकटा भाऊ", R.drawable.family_younger_brother, R.raw.family_younger_brother));
        words.add(new Word("older sister","मोठी बहीण", R.drawable.family_older_sister, R.raw.family_older_sister));
        words.add(new Word("younger sister","लहान बहीण", R.drawable.family_younger_sister, R.raw.family_younger_sister));
        words.add(new Word("grandmother","आजी", R.drawable.family_grandmother, R.raw.family_grandmother));
        words.add(new Word("grandfather","आजोबा", R.drawable.family_grandfather, R.raw.family_grandfather));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(FamilyActivity.this, words.get(position).getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}