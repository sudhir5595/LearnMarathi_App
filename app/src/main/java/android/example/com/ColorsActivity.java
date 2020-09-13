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
        words.add(new Word("red","लाल", R.drawable.color_red));
        words.add(new Word("green","हिरवा", R.drawable.color_green));
        words.add(new Word("brown","तपकिरी", R.drawable.color_brown));
        words.add(new Word("gray","राखाडी", R.drawable.color_gray));
        words.add(new Word("black","काळा", R.drawable.color_black));
        words.add(new Word("white","पांढरा", R.drawable.color_white));
        words.add(new Word("dusty yellow","धुळीचा पिवळा", R.drawable.color_dusty_yellow));
        words.add(new Word("mustard yellow","मोहरीचा पिवळा", R.drawable.color_mustard_yellow));

        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}