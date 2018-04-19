package com.example.android.languagehelper_b1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
private static final String tag = "qwe";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "एक(ek)", R.drawable.number_one, MediaPlayer.create(getApplicationContext(),R.raw.number1)));
        words.add(new Word("two", "दो(do)",R.drawable.number_two,MediaPlayer.create(getApplicationContext(),R.raw.number2)));
        words.add(new Word("three", "तीन(teen",R.drawable.number_three,MediaPlayer.create(getApplicationContext(),R.raw.number3)));
        words.add(new Word("four", "चार(chaar)",R.drawable.number_four,MediaPlayer.create(getApplicationContext(),R.raw.number4)));
        words.add(new Word("five", "पांच(paanch)",R.drawable.number_five,MediaPlayer.create(getApplicationContext(),R.raw.number5)));
        words.add(new Word("six", "छह(chhah)",R.drawable.number_six,MediaPlayer.create(getApplicationContext(),R.raw.number6)));
        words.add(new Word("seven", "सात(saat)", R.drawable.number_seven,MediaPlayer.create(getApplicationContext(),R.raw.number7)));
        words.add(new Word("eight", "आठ(aaath",R.drawable.number_eight,MediaPlayer.create(getApplicationContext(),R.raw.number8)));
        words.add(new Word("nine", "नौ(nou)",R.drawable.number_nine,MediaPlayer.create(getApplicationContext(),R.raw.number_nine)));
        words.add(new Word("ten", "दस(das)",R.drawable.number_ten,MediaPlayer.create(getApplicationContext(),R.raw.number_10)));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

    }



}
