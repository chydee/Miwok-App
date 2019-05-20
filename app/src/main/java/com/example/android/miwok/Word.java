package com.example.android.miwok;


public class Word {

    private static final int NO_IMAGE_PROVIDED = -1;
    // String value
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResouceId;


    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public Word(String miwokTranslation, String defaultTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        this.mAudioResouceId = audioResourceId;

    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int audioResourceId) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResouceId = audioResourceId;
    }

    /**
     * Get the miwok translation of the word.
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the default translation of the word.
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioResouceId() {
        return mAudioResouceId;
    }

    /**
     * Determines whether this word has image or not
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
