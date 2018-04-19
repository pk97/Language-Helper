package com.example.android.languagehelper_b1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of words
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you ?", " कहाँ हो तुम?"));
        words.add(new Word("What is your name?", "तुम्हारा नाम क्या हे?"));
        words.add(new Word("My name is...", "मेरा नाम ...है ."));
        words.add(new Word("How are you feeling?", "आप कैसा महसूस कर रहे हैं?"));
        words.add(new Word("I’m feeling good.", "मैं अच्छा महसूस कर रहा हूँt"));
        words.add(new Word("Are you coming?", "क्या तुम आ रहे हो?"));
        words.add(new Word("Yes, I’m coming.", "हाँ, मैं आ रहा हूँ"));
       // words.add(new Word("I’m coming.", "әәnәm"));
        words.add(new Word("Let’s go.", "चलिए चलते हैं"));
      //  words.add(new Word("Come here.", ""));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
    }
}