package com.example.android.languagehelper_b1;

import android.media.MediaPlayer;
import android.provider.MediaStore;

public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    private static final MediaPlayer NO_AUDIO_PROVIDED = null;
    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;
    /** image of the word */
    private int imageID=NO_IMAGE_PROVIDED;
    /** media for audio */
    private MediaPlayer ring=NO_AUDIO_PROVIDED;


    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation,int imageID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.imageID = imageID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageID, MediaPlayer ring) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.imageID = imageID;
        this.ring=ring;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageID() {
        return  imageID;
    }

    public boolean hasImage(){
        return imageID != NO_IMAGE_PROVIDED;
    }

    public MediaPlayer getRing() { return ring;}
    public boolean hasRing() {return ring !=NO_AUDIO_PROVIDED;}

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", imageID=" + imageID +
                ", ring=" + ring +
                '}';
    }
}