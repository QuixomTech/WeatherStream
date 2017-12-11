package com.quixom.apps.weatherstream;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/quixom/apps/weatherstream/WeatherStreamApp;", "Landroid/app/Application;", "()V", "activityLifecycleCallbacks", "Landroid/app/Application$ActivityLifecycleCallbacks;", "preferenceUtil", "Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;", "getPreferenceUtil", "()Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;", "setPreferenceUtil", "(Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;)V", "onCreate", "", "onTerminate", "app_debug"})
public final class WeatherStreamApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public com.quixom.apps.weatherstream.utilities.PreferenceUtil preferenceUtil;
    private android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.utilities.PreferenceUtil getPreferenceUtil() {
        return null;
    }
    
    public final void setPreferenceUtil(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.utilities.PreferenceUtil p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onTerminate() {
    }
    
    public WeatherStreamApp() {
        super();
    }
}