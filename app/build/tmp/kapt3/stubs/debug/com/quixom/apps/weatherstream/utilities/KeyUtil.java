package com.quixom.apps.weatherstream.utilities;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\nR\u0014\u0010\'\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\n\u00a8\u0006+"}, d2 = {"Lcom/quixom/apps/weatherstream/utilities/KeyUtil;", "", "()V", "KEY_CALL_PERMISSION", "", "getKEY_CALL_PERMISSION", "()I", "KEY_LOCATION", "", "getKEY_LOCATION", "()Ljava/lang/String;", "setKEY_LOCATION", "(Ljava/lang/String;)V", "KEY_MODE", "getKEY_MODE", "LATITUDE_VALUE", "getLATITUDE_VALUE", "LONGITUDE_VALUE", "getLONGITUDE_VALUE", "PLACE_AUTOCOMPLETE_REQUEST_CODE", "getPLACE_AUTOCOMPLETE_REQUEST_CODE", "RC_ENABLE_LOCATION", "getRC_ENABLE_LOCATION", "RC_LOCATION_PERMISSION", "getRC_LOCATION_PERMISSION", "REQ_CODE_SPEECH_INPUT", "getREQ_CODE_SPEECH_INPUT", "THEME_DEFAULT", "getTHEME_DEFAULT", "THEME_NIGHT", "getTHEME_NIGHT", "TYPES_ACCURATE", "getTYPES_ACCURATE", "TYPES_LIKE", "getTYPES_LIKE", "UNITS_IMPERIAL", "getUNITS_IMPERIAL", "UNITS_METRIC", "getUNITS_METRIC", "UNITS_STANDARD", "getUNITS_STANDARD", "datePattern", "getDatePattern", "app_debug"})
public final class KeyUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String datePattern = "dd MMM yyyy HH:mm:ss z";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_MODE = "key_mode";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String KEY_LOCATION;
    private static final int REQ_CODE_SPEECH_INPUT = 101;
    private static final int PLACE_AUTOCOMPLETE_REQUEST_CODE = 102;
    private static final int RC_ENABLE_LOCATION = 103;
    private static final int RC_LOCATION_PERMISSION = 104;
    private static final int KEY_CALL_PERMISSION = 105;
    private static final int THEME_DEFAULT = 0;
    private static final int THEME_NIGHT = 1;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String UNITS_STANDARD = "Standard";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String UNITS_METRIC = "metric";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String UNITS_IMPERIAL = "imperial";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TYPES_ACCURATE = "accurate";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String TYPES_LIKE = "like";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LATITUDE_VALUE = "LATITUDE";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String LONGITUDE_VALUE = "LONGITUDE";
    public static final com.quixom.apps.weatherstream.utilities.KeyUtil INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDatePattern() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKEY_MODE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getKEY_LOCATION() {
        return null;
    }
    
    public final void setKEY_LOCATION(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getREQ_CODE_SPEECH_INPUT() {
        return 0;
    }
    
    public final int getPLACE_AUTOCOMPLETE_REQUEST_CODE() {
        return 0;
    }
    
    public final int getRC_ENABLE_LOCATION() {
        return 0;
    }
    
    public final int getRC_LOCATION_PERMISSION() {
        return 0;
    }
    
    public final int getKEY_CALL_PERMISSION() {
        return 0;
    }
    
    public final int getTHEME_DEFAULT() {
        return 0;
    }
    
    public final int getTHEME_NIGHT() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUNITS_STANDARD() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUNITS_METRIC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUNITS_IMPERIAL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTYPES_ACCURATE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTYPES_LIKE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLATITUDE_VALUE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLONGITUDE_VALUE() {
        return null;
    }
    
    private KeyUtil() {
        super();
    }
}