package com.quixom.apps.weatherstream.model;

@com.raizlabs.android.dbflow.annotation.Table(name = "LocationSearchHistory", database = com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB.class)
@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001e\b\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b \u0010\u001a\"\u0004\b!\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006("}, d2 = {"Lcom/quixom/apps/weatherstream/model/LocationSearchHistory;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "id", "", "cityName", "", "countyName", "weatherType", "", "temperature", "", "lat", "lon", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getCityName", "()Ljava/lang/String;", "setCityName", "(Ljava/lang/String;)V", "getCountyName", "setCountyName", "getId", "()Ljava/lang/Long;", "setId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getLat", "()Ljava/lang/Double;", "setLat", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLon", "setLon", "getTemperature", "setTemperature", "getWeatherType", "()Ljava/lang/Integer;", "setWeatherType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "Companion", "app_debug"})
public final class LocationSearchHistory extends com.raizlabs.android.dbflow.structure.BaseModel {
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.PrimaryKey()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.String cityName;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.String countyName;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Integer weatherType;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Double temperature;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Double lat;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Double lon;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_NAME = "LocationSearchHistory";
    public static final com.quixom.apps.weatherstream.model.LocationSearchHistory.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCityName() {
        return null;
    }
    
    public final void setCityName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountyName() {
        return null;
    }
    
    public final void setCountyName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getWeatherType() {
        return null;
    }
    
    public final void setWeatherType(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getTemperature() {
        return null;
    }
    
    public final void setTemperature(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLat() {
        return null;
    }
    
    public final void setLat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLon() {
        return null;
    }
    
    public final void setLon(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    public LocationSearchHistory(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.String cityName, @org.jetbrains.annotations.Nullable()
    java.lang.String countyName, @org.jetbrains.annotations.Nullable()
    java.lang.Integer weatherType, @org.jetbrains.annotations.Nullable()
    java.lang.Double temperature, @org.jetbrains.annotations.Nullable()
    java.lang.Double lat, @org.jetbrains.annotations.Nullable()
    java.lang.Double lon) {
        super();
    }
    
    public LocationSearchHistory() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/quixom/apps/weatherstream/model/LocationSearchHistory$Companion;", "", "()V", "TABLE_NAME", "", "getLocationInfo", "Lcom/quixom/apps/weatherstream/model/LocationSearchHistory;", "cityName", "countryName", "getSearchedLocationList", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.quixom.apps.weatherstream.model.LocationSearchHistory> getSearchedLocationList() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.quixom.apps.weatherstream.model.LocationSearchHistory getLocationInfo(@org.jetbrains.annotations.NotNull()
        java.lang.String cityName, @org.jetbrains.annotations.NotNull()
        java.lang.String countryName) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}