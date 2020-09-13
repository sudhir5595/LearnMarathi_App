package android.example.com;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words){
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView marathiTextView = (TextView) listItemView.findViewById(R.id.number_text_view_marathi);
        marathiTextView.setText(currentWord.getMarathiTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.number_text_view_english);
        defaultTextView.setText(currentWord.getDefaultTranslation());
        return listItemView;
    }
}
