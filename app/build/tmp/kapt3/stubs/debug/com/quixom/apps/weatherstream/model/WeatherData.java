package com.quixom.apps.weatherstream.model;

@com.raizlabs.android.dbflow.annotation.Table(name = "WeatherDetail", database = com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB.class)
@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\b\u0007\u0018\u0000 G2\u00020\u0001:\u0007FGHIJKLB\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0018R \u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010.\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001a\"\u0004\b6\u0010\u001cR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001a\"\u0004\b<\u0010\u001cR(\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010A\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E\u00a8\u0006M"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "id", "", "dt", "clouds", "Lcom/quixom/apps/weatherstream/model/WeatherData$Clouds;", "coord", "Lcom/quixom/apps/weatherstream/model/WeatherData$Coord;", "wind", "Lcom/quixom/apps/weatherstream/model/WeatherData$Wind;", "cod", "", "visibility", "", "sys", "Lcom/quixom/apps/weatherstream/model/WeatherData$Sys;", "name", "base", "weather", "", "Lcom/quixom/apps/weatherstream/model/WeatherData$Weather;", "main", "Lcom/quixom/apps/weatherstream/model/WeatherData$Main;", "(Ljava/lang/Long;Ljava/lang/Long;Lcom/quixom/apps/weatherstream/model/WeatherData$Clouds;Lcom/quixom/apps/weatherstream/model/WeatherData$Coord;Lcom/quixom/apps/weatherstream/model/WeatherData$Wind;Ljava/lang/Integer;Ljava/lang/String;Lcom/quixom/apps/weatherstream/model/WeatherData$Sys;Ljava/lang/String;Ljava/lang/String;[Lcom/quixom/apps/weatherstream/model/WeatherData$Weather;Lcom/quixom/apps/weatherstream/model/WeatherData$Main;)V", "getBase", "()Ljava/lang/String;", "setBase", "(Ljava/lang/String;)V", "getClouds", "()Lcom/quixom/apps/weatherstream/model/WeatherData$Clouds;", "setClouds", "(Lcom/quixom/apps/weatherstream/model/WeatherData$Clouds;)V", "getCod", "()Ljava/lang/Integer;", "setCod", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCoord", "()Lcom/quixom/apps/weatherstream/model/WeatherData$Coord;", "setCoord", "(Lcom/quixom/apps/weatherstream/model/WeatherData$Coord;)V", "getDt", "()Ljava/lang/Long;", "setDt", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getId", "setId", "getMain", "()Lcom/quixom/apps/weatherstream/model/WeatherData$Main;", "setMain", "(Lcom/quixom/apps/weatherstream/model/WeatherData$Main;)V", "getName", "setName", "getSys", "()Lcom/quixom/apps/weatherstream/model/WeatherData$Sys;", "setSys", "(Lcom/quixom/apps/weatherstream/model/WeatherData$Sys;)V", "getVisibility", "setVisibility", "getWeather", "()[Lcom/quixom/apps/weatherstream/model/WeatherData$Weather;", "setWeather", "([Lcom/quixom/apps/weatherstream/model/WeatherData$Weather;)V", "[Lcom/quixom/apps/weatherstream/model/WeatherData$Weather;", "getWind", "()Lcom/quixom/apps/weatherstream/model/WeatherData$Wind;", "setWind", "(Lcom/quixom/apps/weatherstream/model/WeatherData$Wind;)V", "Clouds", "Companion", "Coord", "Main", "Sys", "Weather", "Wind", "app_debug"})
public final class WeatherData extends com.raizlabs.android.dbflow.structure.BaseModel {
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.PrimaryKey()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Long id;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Long dt;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private com.quixom.apps.weatherstream.model.WeatherData.Clouds clouds;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private com.quixom.apps.weatherstream.model.WeatherData.Coord coord;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private com.quixom.apps.weatherstream.model.WeatherData.Wind wind;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.Integer cod;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.String visibility;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private com.quixom.apps.weatherstream.model.WeatherData.Sys sys;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @com.raizlabs.android.dbflow.annotation.Column()
    @com.google.gson.annotations.Expose()
    private java.lang.String base;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private com.quixom.apps.weatherstream.model.WeatherData.Weather[] weather;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private com.quixom.apps.weatherstream.model.WeatherData.Main main;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TABLE_NAME = "WeatherDetail";
    public static final com.quixom.apps.weatherstream.model.WeatherData.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getDt() {
        return null;
    }
    
    public final void setDt(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quixom.apps.weatherstream.model.WeatherData.Clouds getClouds() {
        return null;
    }
    
    public final void setClouds(@org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Clouds p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quixom.apps.weatherstream.model.WeatherData.Coord getCoord() {
        return null;
    }
    
    public final void setCoord(@org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Coord p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quixom.apps.weatherstream.model.WeatherData.Wind getWind() {
        return null;
    }
    
    public final void setWind(@org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Wind p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCod() {
        return null;
    }
    
    public final void setCod(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getVisibility() {
        return null;
    }
    
    public final void setVisibility(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quixom.apps.weatherstream.model.WeatherData.Sys getSys() {
        return null;
    }
    
    public final void setSys(@org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Sys p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBase() {
        return null;
    }
    
    public final void setBase(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quixom.apps.weatherstream.model.WeatherData.Weather[] getWeather() {
        return null;
    }
    
    public final void setWeather(@org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Weather[] p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.quixom.apps.weatherstream.model.WeatherData.Main getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Main p0) {
    }
    
    public WeatherData(@org.jetbrains.annotations.Nullable()
    java.lang.Long id, @org.jetbrains.annotations.Nullable()
    java.lang.Long dt, @org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Clouds clouds, @org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Coord coord, @org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Wind wind, @org.jetbrains.annotations.Nullable()
    java.lang.Integer cod, @org.jetbrains.annotations.Nullable()
    java.lang.String visibility, @org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Sys sys, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String base, @org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Weather[] weather, @org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.model.WeatherData.Main main) {
        super();
    }
    
    public WeatherData() {
        super();
    }
    
    @com.raizlabs.android.dbflow.annotation.Table(name = "CloudsWeather", database = com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB.class)
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t\u00a8\u0006\u000e"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Clouds;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "id", "", "all", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getAll", "()Ljava/lang/Integer;", "setAll", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "setId", "Companion", "app_debug"})
    public static final class Clouds extends com.raizlabs.android.dbflow.structure.BaseModel {
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.PrimaryKey(autoincrement = true)
        @com.raizlabs.android.dbflow.annotation.Column()
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Integer all;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "CloudsWeather";
        public static final com.quixom.apps.weatherstream.model.WeatherData.Clouds.Companion Companion = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getAll() {
            return null;
        }
        
        public final void setAll(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        public Clouds(@org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        java.lang.Integer all) {
            super();
        }
        
        public Clouds() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Clouds$Companion;", "", "()V", "TABLE_NAME", "", "getCloudWeatherDetails", "Lcom/quixom/apps/weatherstream/model/WeatherData$Clouds;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final com.quixom.apps.weatherstream.model.WeatherData.Clouds getCloudWeatherDetails() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @com.raizlabs.android.dbflow.annotation.Table(name = "CoordWeather", database = com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB.class)
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u0015"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Coord;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "id", "", "lon", "", "lat", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLat", "()Ljava/lang/Double;", "setLat", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getLon", "setLon", "Companion", "app_debug"})
    public static final class Coord extends com.raizlabs.android.dbflow.structure.BaseModel {
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.PrimaryKey(autoincrement = true)
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Double lon;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Double lat;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "CoordWeather";
        public static final com.quixom.apps.weatherstream.model.WeatherData.Coord.Companion Companion = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getLon() {
            return null;
        }
        
        public final void setLon(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getLat() {
            return null;
        }
        
        public final void setLat(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        public Coord(@org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        java.lang.Double lon, @org.jetbrains.annotations.Nullable()
        java.lang.Double lat) {
            super();
        }
        
        public Coord() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Coord$Companion;", "", "()V", "TABLE_NAME", "", "getCoordinateDetails", "Lcom/quixom/apps/weatherstream/model/WeatherData$Coord;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final com.quixom.apps.weatherstream.model.WeatherData.Coord getCoordinateDetails() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @com.raizlabs.android.dbflow.annotation.Table(name = "WindWeather", database = com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB.class)
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Wind;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "id", "", "speed", "", "deg", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getDeg", "()Ljava/lang/String;", "setDeg", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getSpeed", "setSpeed", "Companion", "app_debug"})
    public static final class Wind extends com.raizlabs.android.dbflow.structure.BaseModel {
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.PrimaryKey(autoincrement = true)
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String speed;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String deg;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "WindWeather";
        public static final com.quixom.apps.weatherstream.model.WeatherData.Wind.Companion Companion = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getSpeed() {
            return null;
        }
        
        public final void setSpeed(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeg() {
            return null;
        }
        
        public final void setDeg(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Wind(@org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        java.lang.String speed, @org.jetbrains.annotations.Nullable()
        java.lang.String deg) {
            super();
        }
        
        public Wind() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Wind$Companion;", "", "()V", "TABLE_NAME", "", "getWindWeatherDetails", "Lcom/quixom/apps/weatherstream/model/WeatherData$Wind;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final com.quixom.apps.weatherstream.model.WeatherData.Wind getWindWeatherDetails() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @com.raizlabs.android.dbflow.annotation.Table(name = "SysWeather", database = com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB.class)
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\rR \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000f\"\u0004\b\u0018\u0010\u0011R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015\u00a8\u0006\'"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Sys;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "sysId", "", "message", "", "id", "sunset", "", "sunrise", "type", "country", "pod", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMessage", "setMessage", "getPod", "setPod", "getSunrise", "()Ljava/lang/Long;", "setSunrise", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getSunset", "setSunset", "getSysId", "setSysId", "getType", "setType", "Companion", "app_debug"})
    public static final class Sys extends com.raizlabs.android.dbflow.structure.BaseModel {
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.PrimaryKey(autoincrement = true)
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Integer sysId;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String message;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Long sunset;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Long sunrise;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Integer type;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String country;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String pod;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "SysWeather";
        public static final com.quixom.apps.weatherstream.model.WeatherData.Sys.Companion Companion = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getSysId() {
            return null;
        }
        
        public final void setSysId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMessage() {
            return null;
        }
        
        public final void setMessage(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getSunset() {
            return null;
        }
        
        public final void setSunset(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Long getSunrise() {
            return null;
        }
        
        public final void setSunrise(@org.jetbrains.annotations.Nullable()
        java.lang.Long p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getType() {
            return null;
        }
        
        public final void setType(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getCountry() {
            return null;
        }
        
        public final void setCountry(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPod() {
            return null;
        }
        
        public final void setPod(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Sys(@org.jetbrains.annotations.Nullable()
        java.lang.Integer sysId, @org.jetbrains.annotations.Nullable()
        java.lang.String message, @org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        java.lang.Long sunset, @org.jetbrains.annotations.Nullable()
        java.lang.Long sunrise, @org.jetbrains.annotations.Nullable()
        java.lang.Integer type, @org.jetbrains.annotations.Nullable()
        java.lang.String country, @org.jetbrains.annotations.Nullable()
        java.lang.String pod) {
            super();
        }
        
        public Sys() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\b\u0010\b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Sys$Companion;", "", "()V", "TABLE_NAME", "", "getSysListDetails", "", "Lcom/quixom/apps/weatherstream/model/WeatherData$Sys;", "getSysWeatherDetails", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final com.quixom.apps.weatherstream.model.WeatherData.Sys getSysWeatherDetails() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.quixom.apps.weatherstream.model.WeatherData.Sys> getSysListDetails() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @com.raizlabs.android.dbflow.annotation.Table(name = "WeatherDescription", database = com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB.class)
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tR \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0011\"\u0004\b\u0018\u0010\u0013\u00a8\u0006\u001a"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Weather;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "wId", "", "id", "icon", "", "description", "main", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getIcon", "setIcon", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getMain", "setMain", "getWId", "setWId", "Companion", "app_debug"})
    public static final class Weather extends com.raizlabs.android.dbflow.structure.BaseModel {
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.PrimaryKey(autoincrement = true)
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Integer wId;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String icon;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String description;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String main;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "WeatherDescription";
        public static final com.quixom.apps.weatherstream.model.WeatherData.Weather.Companion Companion = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getWId() {
            return null;
        }
        
        public final void setWId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getIcon() {
            return null;
        }
        
        public final void setIcon(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDescription() {
            return null;
        }
        
        public final void setDescription(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getMain() {
            return null;
        }
        
        public final void setMain(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        public Weather(@org.jetbrains.annotations.Nullable()
        java.lang.Integer wId, @org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        java.lang.String icon, @org.jetbrains.annotations.Nullable()
        java.lang.String description, @org.jetbrains.annotations.Nullable()
        java.lang.String main) {
            super();
        }
        
        public Weather() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Weather$Companion;", "", "()V", "TABLE_NAME", "", "getInnerWeatherDetails", "Lcom/quixom/apps/weatherstream/model/WeatherData$Weather;", "getInnerWeatherList", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final com.quixom.apps.weatherstream.model.WeatherData.Weather getInnerWeatherDetails() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.quixom.apps.weatherstream.model.WeatherData.Weather> getInnerWeatherList() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @com.raizlabs.android.dbflow.annotation.Table(name = "MainWeather", database = com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB.class)
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u001f\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u000eR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u001f\u0010\u0010\"\u0004\b \u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0015\"\u0004\b(\u0010\u0017\u00a8\u0006*"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Main;", "Lcom/raizlabs/android/dbflow/structure/BaseModel;", "id", "", "humidity", "", "pressure", "temp_max", "temp_min", "temp", "sea_level", "", "grnd_level", "temp_kf", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getGrnd_level", "()Ljava/lang/Double;", "setGrnd_level", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getHumidity", "()Ljava/lang/String;", "setHumidity", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPressure", "setPressure", "getSea_level", "setSea_level", "getTemp", "setTemp", "getTemp_kf", "setTemp_kf", "getTemp_max", "setTemp_max", "getTemp_min", "setTemp_min", "Companion", "app_debug"})
    public static final class Main extends com.raizlabs.android.dbflow.structure.BaseModel {
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.PrimaryKey(autoincrement = true)
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Integer id;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String humidity;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String pressure;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String temp_max;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String temp_min;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.String temp;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Double sea_level;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Double grnd_level;
        @org.jetbrains.annotations.Nullable()
        @com.raizlabs.android.dbflow.annotation.Column()
        @com.google.gson.annotations.Expose()
        private java.lang.Double temp_kf;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String TABLE_NAME = "MainWeather";
        public static final com.quixom.apps.weatherstream.model.WeatherData.Main.Companion Companion = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getId() {
            return null;
        }
        
        public final void setId(@org.jetbrains.annotations.Nullable()
        java.lang.Integer p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getHumidity() {
            return null;
        }
        
        public final void setHumidity(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getPressure() {
            return null;
        }
        
        public final void setPressure(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTemp_max() {
            return null;
        }
        
        public final void setTemp_max(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTemp_min() {
            return null;
        }
        
        public final void setTemp_min(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getTemp() {
            return null;
        }
        
        public final void setTemp(@org.jetbrains.annotations.Nullable()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getSea_level() {
            return null;
        }
        
        public final void setSea_level(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getGrnd_level() {
            return null;
        }
        
        public final void setGrnd_level(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Double getTemp_kf() {
            return null;
        }
        
        public final void setTemp_kf(@org.jetbrains.annotations.Nullable()
        java.lang.Double p0) {
        }
        
        public Main(@org.jetbrains.annotations.Nullable()
        java.lang.Integer id, @org.jetbrains.annotations.Nullable()
        java.lang.String humidity, @org.jetbrains.annotations.Nullable()
        java.lang.String pressure, @org.jetbrains.annotations.Nullable()
        java.lang.String temp_max, @org.jetbrains.annotations.Nullable()
        java.lang.String temp_min, @org.jetbrains.annotations.Nullable()
        java.lang.String temp, @org.jetbrains.annotations.Nullable()
        java.lang.Double sea_level, @org.jetbrains.annotations.Nullable()
        java.lang.Double grnd_level, @org.jetbrains.annotations.Nullable()
        java.lang.Double temp_kf) {
            super();
        }
        
        public Main() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Main$Companion;", "", "()V", "TABLE_NAME", "", "getMainWeatherDetails", "Lcom/quixom/apps/weatherstream/model/WeatherData$Main;", "getMainWeatherList", "", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.Nullable()
            public final com.quixom.apps.weatherstream.model.WeatherData.Main getMainWeatherDetails() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable()
            public final java.util.List<com.quixom.apps.weatherstream.model.WeatherData.Main> getMainWeatherList() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/quixom/apps/weatherstream/model/WeatherData$Companion;", "", "()V", "TABLE_NAME", "", "getLocationBasedWeatherDetails", "Lcom/quixom/apps/weatherstream/model/WeatherData;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final com.quixom.apps.weatherstream.model.WeatherData getLocationBasedWeatherDetails() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}