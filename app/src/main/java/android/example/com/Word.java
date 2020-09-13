package android.example.com;

public class Word {
    private String mDefaultTranslation;
    private String mMarathiTranslation;

    public Word(String defaultTranslation, String marathiTranslation){
        mDefaultTranslation = defaultTranslation;
        mMarathiTranslation = marathiTranslation;
    }
    public String getMarathiTranslation(){
        return mMarathiTranslation;
    }
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }
}
