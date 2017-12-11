package com.quixom.apps.weatherstream.activity;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\"\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0012\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J-\u0010%\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00042\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020(0\'2\u0006\u0010)\u001a\u00020*H\u0016\u00a2\u0006\u0002\u0010+J\b\u0010,\u001a\u00020\u001cH\u0003R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006-"}, d2 = {"Lcom/quixom/apps/weatherstream/activity/SplashActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "SPLASH_TIME_OUT", "", "getSPLASH_TIME_OUT", "()I", "mLocation", "Landroid/location/Location;", "getMLocation", "()Landroid/location/Location;", "setMLocation", "(Landroid/location/Location;)V", "mLocationListener", "Landroid/location/LocationListener;", "getMLocationListener", "()Landroid/location/LocationListener;", "setMLocationListener", "(Landroid/location/LocationListener;)V", "mLocationManager", "Landroid/location/LocationManager;", "getMLocationManager", "()Landroid/location/LocationManager;", "setMLocationManager", "(Landroid/location/LocationManager;)V", "checkAndAskForLocationPermissions", "", "checkGpsEnabledAndPrompt", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "requestLocationUpdates", "app_debug"})
public final class SplashActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.Nullable()
    private android.location.LocationManager mLocationManager;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location mLocation;
    private final int SPLASH_TIME_OUT = 1000;
    @org.jetbrains.annotations.NotNull()
    private android.location.LocationListener mLocationListener;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.LocationManager getMLocationManager() {
        return null;
    }
    
    public final void setMLocationManager(@org.jetbrains.annotations.Nullable()
    android.location.LocationManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getMLocation() {
        return null;
    }
    
    public final void setMLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    public final int getSPLASH_TIME_OUT() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.LocationListener getMLocationListener() {
        return null;
    }
    
    public final void setMLocationListener(@org.jetbrains.annotations.NotNull()
    android.location.LocationListener p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void checkGpsEnabledAndPrompt() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    private final void requestLocationUpdates() {
    }
    
    private final boolean checkAndAskForLocationPermissions() {
        return false;
    }
    
    public SplashActivity() {
        super();
    }
}