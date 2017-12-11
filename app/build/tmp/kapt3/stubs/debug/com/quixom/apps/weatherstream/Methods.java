package com.quixom.apps.weatherstream;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/quixom/apps/weatherstream/Methods;", "", "mActivity", "Lcom/quixom/apps/weatherstream/MainActivity;", "(Lcom/quixom/apps/weatherstream/MainActivity;)V", "getMActivity", "()Lcom/quixom/apps/weatherstream/MainActivity;", "Companion", "app_debug"})
public final class Methods {
    @org.jetbrains.annotations.NotNull()
    private final com.quixom.apps.weatherstream.MainActivity mActivity = null;
    @org.jetbrains.annotations.Nullable()
    private static com.quixom.apps.weatherstream.utilities.WSProgressDialog wsProgressDialog;
    public static final com.quixom.apps.weatherstream.Methods.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.MainActivity getMActivity() {
        return null;
    }
    
    public Methods(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.MainActivity mActivity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u000eJ\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020\u001aJ\u0018\u0010#\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001cH\u0002J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u001cJ\u000e\u0010(\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0015J\u000e\u0010*\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0015J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0015J\u001e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u001c2\u0006\u00101\u001a\u00020\u001cJ\u000e\u00102\u001a\u00020\u00102\u0006\u0010)\u001a\u00020\u0015J\u000e\u00103\u001a\u00020\n2\u0006\u00104\u001a\u000205J\u0010\u00106\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u001fH\u0007J\u0006\u00108\u001a\u00020\nJ\u000e\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020/J\u000e\u0010;\u001a\u00020\n2\u0006\u00104\u001a\u000205J\u0016\u0010<\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010=\u001a\u00020\u000eJ\u0016\u0010>\u001a\u00020\n2\u0006\u00104\u001a\u0002052\u0006\u0010?\u001a\u00020\u001cJ\u000e\u0010@\u001a\u00020\n2\u0006\u00104\u001a\u000205J&\u0010A\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006C"}, d2 = {"Lcom/quixom/apps/weatherstream/Methods$Companion;", "", "()V", "wsProgressDialog", "Lcom/quixom/apps/weatherstream/utilities/WSProgressDialog;", "getWsProgressDialog", "()Lcom/quixom/apps/weatherstream/utilities/WSProgressDialog;", "setWsProgressDialog", "(Lcom/quixom/apps/weatherstream/utilities/WSProgressDialog;)V", "avoidDoubleClicks", "", "view", "Landroid/view/View;", "calculatePercentage", "", "value", "", "total", "checkHistory", "", "convertCelsiusToFahrenheit", "", "celsius", "convertFahrenheitToCelsius", "fahrenheit", "convertTimeToMillisecond", "", "givenDateString", "", "dpToPxConvertor", "mainActivity", "Lcom/quixom/apps/weatherstream/MainActivity;", "dp", "getDate", "timeStamp", "getDateFormate", "dateTime", "newFormat", "getDateFormateGMTToLocal", "mDate", "getInHG", "i", "getMeters", "getMiles", "getSpannableString", "Landroid/text/SpannableStringBuilder;", "context", "Landroid/content/Context;", "first", "second", "gethPa", "hideKeyboard", "activity", "Landroid/app/Activity;", "isNetworkConnected", "mActivity", "isProgressHide", "isProgressShowMessage", "mContext", "promptSpeechInput", "pxToDpConvertor", "px", "shareIntent", "message", "showKeyboard", "showSnackBar", "color", "app_debug"})
    public static final class Companion {
        
        public final void showKeyboard(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        public final void hideKeyboard(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        public final void avoidDoubleClicks(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        public final int dpToPxConvertor(@org.jetbrains.annotations.NotNull()
        com.quixom.apps.weatherstream.MainActivity mainActivity, int dp) {
            return 0;
        }
        
        public final int pxToDpConvertor(@org.jetbrains.annotations.NotNull()
        com.quixom.apps.weatherstream.MainActivity mainActivity, int px) {
            return 0;
        }
        
        public final void shareIntent(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
        }
        
        public final long convertTimeToMillisecond(@org.jetbrains.annotations.NotNull()
        java.lang.String givenDateString) {
            return 0L;
        }
        
        private final java.lang.String getDateFormate(java.lang.String dateTime, java.lang.String newFormat) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDateFormateGMTToLocal(@org.jetbrains.annotations.NotNull()
        java.lang.String mDate) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDate(long timeStamp) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.text.SpannableStringBuilder getSpannableString(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String first, @org.jetbrains.annotations.NotNull()
        java.lang.String second) {
            return null;
        }
        
        @android.annotation.SuppressLint(value = {"MissingPermission"})
        public final boolean isNetworkConnected(@org.jetbrains.annotations.NotNull()
        com.quixom.apps.weatherstream.MainActivity mActivity) {
            return false;
        }
        
        public final int calculatePercentage(double value, double total) {
            return 0;
        }
        
        public final void promptSpeechInput(@org.jetbrains.annotations.NotNull()
        android.app.Activity activity) {
        }
        
        public final void showSnackBar(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        java.lang.String message, int color, @org.jetbrains.annotations.NotNull()
        com.quixom.apps.weatherstream.MainActivity mActivity) {
        }
        
        public final boolean checkHistory() {
            return false;
        }
        
        public final float convertFahrenheitToCelsius(float fahrenheit) {
            return 0.0F;
        }
        
        public final float convertCelsiusToFahrenheit(float celsius) {
            return 0.0F;
        }
        
        public final double getMiles(float i) {
            return 0.0;
        }
        
        public final double getMeters(float i) {
            return 0.0;
        }
        
        public final double getInHG(float i) {
            return 0.0;
        }
        
        public final double gethPa(float i) {
            return 0.0;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.quixom.apps.weatherstream.utilities.WSProgressDialog getWsProgressDialog() {
            return null;
        }
        
        public final void setWsProgressDialog(@org.jetbrains.annotations.Nullable()
        com.quixom.apps.weatherstream.utilities.WSProgressDialog p0) {
        }
        
        public final void isProgressShowMessage(@org.jetbrains.annotations.NotNull()
        android.content.Context mContext) {
        }
        
        public final void isProgressHide() {
        }
        
        private Companion() {
            super();
        }
    }
}