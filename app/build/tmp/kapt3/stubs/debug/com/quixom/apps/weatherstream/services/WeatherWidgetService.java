package com.quixom.apps.weatherstream.services;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\"\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001dH\u0016R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t\u00a8\u0006!"}, d2 = {"Lcom/quixom/apps/weatherstream/services/WeatherWidgetService;", "Landroid/app/Service;", "()V", "locationSearchCall", "Lretrofit2/Call;", "Lcom/quixom/apps/weatherstream/model/WeatherData;", "getLocationSearchCall", "()Lretrofit2/Call;", "setLocationSearchCall", "(Lretrofit2/Call;)V", "weatherForecastingCall", "Lcom/quixom/apps/weatherstream/model/WeatherForecastData;", "getWeatherForecastingCall", "setWeatherForecastingCall", "callSearchLocationServiceApi", "", "lat", "", "lon", "allWidgetIds", "", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "callWeatherForecasting", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onStartCommand", "", "intent", "flags", "startId", "app_debug"})
public final class WeatherWidgetService extends android.app.Service {
    @org.jetbrains.annotations.Nullable()
    private retrofit2.Call<com.quixom.apps.weatherstream.model.WeatherData> locationSearchCall;
    @org.jetbrains.annotations.Nullable()
    private retrofit2.Call<com.quixom.apps.weatherstream.model.WeatherForecastData> weatherForecastingCall;
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.Nullable()
    android.content.Intent p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Call<com.quixom.apps.weatherstream.model.WeatherData> getLocationSearchCall() {
        return null;
    }
    
    public final void setLocationSearchCall(@org.jetbrains.annotations.Nullable()
    retrofit2.Call<com.quixom.apps.weatherstream.model.WeatherData> p0) {
    }
    
    public final void callSearchLocationServiceApi(double lat, double lon, @org.jetbrains.annotations.Nullable()
    int[] allWidgetIds, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final retrofit2.Call<com.quixom.apps.weatherstream.model.WeatherForecastData> getWeatherForecastingCall() {
        return null;
    }
    
    public final void setWeatherForecastingCall(@org.jetbrains.annotations.Nullable()
    retrofit2.Call<com.quixom.apps.weatherstream.model.WeatherForecastData> p0) {
    }
    
    public final void callWeatherForecasting(double lat, double lon) {
    }
    
    public WeatherWidgetService() {
        super();
    }
}