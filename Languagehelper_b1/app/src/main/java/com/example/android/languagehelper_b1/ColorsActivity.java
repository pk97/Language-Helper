package com.example.android.languagehelper_b1;


import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red", "लाल",R.drawable.color_red, MediaPlayer.create(getApplicationContext(),R.raw.color_black)));
        words.add(new Word("mustard yellow", "पीला",R.drawable.color_mustard_yellow,MediaPlayer.create(getApplicationContext(),R.raw.color_black)));
      //  words.add(new Word("dusty yellow", " हरा",R.drawable.color_dusty_yellow,));
        words.add(new Word("green", " हरा",R.drawable.color_green,MediaPlayer.create(getApplicationContext(),R.raw.color_black)));
        words.add(new Word("brown", " भूरा",R.drawable.color_brown,MediaPlayer.create(getApplicationContext(),R.raw.color_black)));
        words.add(new Word("gray", "स्लेटी",R.drawable.color_gray,MediaPlayer.create(getApplicationContext(),R.raw.color_black)));
        words.add(new Word("black", " काला",R.drawable.color_black,MediaPlayer.create(getApplicationContext(),R.raw.color_black)));
        words.add(new Word("white", "सफ़ेद",R.drawable.color_white,MediaPlayer.create(getApplicationContext(),R.raw.color_black)));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}