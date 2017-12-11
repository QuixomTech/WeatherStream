package com.github.matteobattilana.weather;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u0018J\u0006\u0010\u001e\u001a\u00020\u0018J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0002J\u0006\u0010#\u001a\u00020\u0018J\u0006\u0010$\u001a\u00020\u0018J\b\u0010%\u001a\u00020\u0018H\u0002R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000f@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006&"}, d2 = {"Lcom/github/matteobattilana/weather/WeatherViewSensorEventListener;", "Landroid/hardware/SensorEventListener;", "context", "Landroid/content/Context;", "weatherView", "Lcom/quixom/apps/weatherstream/weatherview/WeatherView;", "(Landroid/content/Context;Lcom/quixom/apps/weatherstream/weatherview/WeatherView;)V", "accelerometerValues", "", "getContext", "()Landroid/content/Context;", "magneticValues", "sensorManager", "Landroid/hardware/SensorManager;", "<set-?>", "", "started", "getStarted", "()Z", "setStarted", "(Z)V", "getWeatherView", "()Lcom/quixom/apps/weatherstream/weatherview/WeatherView;", "onAccuracyChanged", "", "sensor", "Landroid/hardware/Sensor;", "accuracy", "", "onPause", "onResume", "onSensorChanged", "event", "Landroid/hardware/SensorEvent;", "registerListener", "start", "stop", "unregisterListener", "app_debug"})
public final class WeatherViewSensorEventListener implements android.hardware.SensorEventListener {
    private final android.hardware.SensorManager sensorManager = null;
    private float[] magneticValues;
    private float[] accelerometerValues;
    private boolean started;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.quixom.apps.weatherstream.weatherview.WeatherView weatherView = null;
    
    public final boolean getStarted() {
        return false;
    }
    
    private final void setStarted(boolean p0) {
    }
    
    @java.lang.Override()
    public void onAccuracyChanged(@org.jetbrains.annotations.NotNull()
    android.hardware.Sensor sensor, int accuracy) {
    }
    
    @java.lang.Override()
    public void onSensorChanged(@org.jetbrains.annotations.NotNull()
    android.hardware.SensorEvent event) {
    }
    
    private final void registerListener() {
    }
    
    private final void unregisterListener() {
    }
    
    public final void start() {
    }
    
    public final void stop() {
    }
    
    public final void onResume() {
    }
    
    public final void onPause() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.weatherview.WeatherView getWeatherView() {
        return null;
    }
    
    public WeatherViewSensorEventListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.weatherview.WeatherView weatherView) {
        super();
    }
}