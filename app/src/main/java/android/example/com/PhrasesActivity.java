package android.example.com;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
//        Create an array of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?","आपण कोठे जात आहात?", R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?","तुझं नाव काय आहे?", R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...","माझं नावं आहे...", R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?", "तुला कसे वाटत आहे?", R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.","मला बरं वाटतेय.", R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?","तू येत आहेस का?", R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.","होय, मी येत आहे.", R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.","मी येतोय.", R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.","चल जाऊया.", R.raw.phrase_lets_go));
        words.add(new Word("Come here.","इकडे ये.", R.raw.phrase_come_here));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this, words.get(position).getAudioResourceId());
                mediaPlayer.start();
            }
        });
    }
}