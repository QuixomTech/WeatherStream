package com.quixom.apps.weatherstream.webservice;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\'J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0001\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\bH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/quixom/apps/weatherstream/webservice/WebApis;", "", "getWeatherDetail", "Lretrofit2/Call;", "Lcom/quixom/apps/weatherstream/model/WeatherData;", "key", "", "params", "Ljava/util/HashMap;", "getWeatherForecasting", "Lcom/quixom/apps/weatherstream/model/WeatherForecastData;", "app_debug"})
public abstract interface WebApis {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract retrofit2.Call<com.quixom.apps.weatherstream.model.WeatherData> getWeatherDetail(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-api-key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.HashMap<java.lang.String, java.lang.String> params);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "forecast")
    public abstract retrofit2.Call<com.quixom.apps.weatherstream.model.WeatherForecastData> getWeatherForecasting(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "x-api-key")
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.HashMap<java.lang.String, java.lang.String> params);
}