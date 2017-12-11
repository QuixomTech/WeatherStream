package com.github.matteobattilana.weather;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/github/matteobattilana/weather/WeatherDataAnim;", "", "emissionRate", "", "getEmissionRate", "()F", "precipType", "Lcom/github/matteobattilana/weather/PrecipType;", "getPrecipType", "()Lcom/github/matteobattilana/weather/PrecipType;", "speed", "", "getSpeed", "()I", "app_debug"})
public abstract interface WeatherDataAnim {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.github.matteobattilana.weather.PrecipType getPrecipType();
    
    public abstract float getEmissionRate();
    
    public abstract int getSpeed();
}