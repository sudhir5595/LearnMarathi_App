package android.example.com;

import android.widget.ImageView;

public class Word {
    private String mDefaultTranslation;
    private String mMarathiTranslation;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String marathiTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMarathiTranslation = marathiTranslation;
        mAudioResourceId = audioResourceId;
    }

    public Word(String defaultTranslation, String marathiTranslation, int ImageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMarathiTranslation = marathiTranslation;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getMarathiTranslation(){
        return mMarathiTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
