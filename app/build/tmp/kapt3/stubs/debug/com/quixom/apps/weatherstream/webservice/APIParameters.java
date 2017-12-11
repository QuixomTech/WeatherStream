package com.quixom.apps.weatherstream.webservice;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a8\u0006\b"}, d2 = {"Lcom/quixom/apps/weatherstream/webservice/APIParameters;", "", "()V", "getParam", "Ljava/util/HashMap;", "", "ForecastingWeather", "LocationSearch", "app_debug"})
public final class APIParameters {
    public static final com.quixom.apps.weatherstream.webservice.APIParameters INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.lang.String> getParam() {
        return null;
    }
    
    private APIParameters() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/quixom/apps/weatherstream/webservice/APIParameters$LocationSearch;", "", "()V", "Companion", "app_debug"})
    public static final class LocationSearch {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String apiKey = "apikey";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String lat = "lat";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String lon = "lon";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String type = "type";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String units = "units";
        public static final com.quixom.apps.weatherstream.webservice.APIParameters.LocationSearch.Companion Companion = null;
        
        public LocationSearch() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/quixom/apps/weatherstream/webservice/APIParameters$LocationSearch$Companion;", "", "()V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "lat", "getLat", "lon", "getLon", "type", "getType", "units", "getUnits", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getApiKey() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLat() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLon() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getType() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUnits() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/quixom/apps/weatherstream/webservice/APIParameters$ForecastingWeather;", "", "()V", "Companion", "app_debug"})
    public static final class ForecastingWeather {
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String apiKey = "apikey";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String lat = "lat";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String lon = "lon";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String units = "units";
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String type = "type";
        public static final com.quixom.apps.weatherstream.webservice.APIParameters.ForecastingWeather.Companion Companion = null;
        
        public ForecastingWeather() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/quixom/apps/weatherstream/webservice/APIParameters$ForecastingWeather$Companion;", "", "()V", "apiKey", "", "getApiKey", "()Ljava/lang/String;", "lat", "getLat", "lon", "getLon", "type", "getType", "units", "getUnits", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getApiKey() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLat() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getLon() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getUnits() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getType() {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}