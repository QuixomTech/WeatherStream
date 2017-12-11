package com.quixom.apps.weatherstream.utilities;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\b"}, d2 = {"Lcom/quixom/apps/weatherstream/utilities/WeatherStreamCallbackManager;", "Lcom/quixom/apps/weatherstream/utilities/WeatherStreamCallback;", "()V", "onSearchLocationAction", "", "type", "", "Companion", "app_debug"})
public final class WeatherStreamCallbackManager implements com.quixom.apps.weatherstream.utilities.WeatherStreamCallback {
    @org.jetbrains.annotations.Nullable()
    private static java.util.List<com.quixom.apps.weatherstream.utilities.WeatherStreamCallback> weatherStreamCallbacks;
    public static final com.quixom.apps.weatherstream.utilities.WeatherStreamCallbackManager.Companion Companion = null;
    
    @java.lang.Override()
    public void onSearchLocationAction(int type) {
    }
    
    public WeatherStreamCallbackManager() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u00020\u000bH\u0002J\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0011R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/quixom/apps/weatherstream/utilities/WeatherStreamCallbackManager$Companion;", "", "()V", "weatherStreamCallbacks", "", "Lcom/quixom/apps/weatherstream/utilities/WeatherStreamCallback;", "getWeatherStreamCallbacks", "()Ljava/util/List;", "setWeatherStreamCallbacks", "(Ljava/util/List;)V", "addWishCallBack", "", "weatherStreamCallback", "initList", "removeWishCallBack", "updateHomeScreenData", "type", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.quixom.apps.weatherstream.utilities.WeatherStreamCallback> getWeatherStreamCallbacks() {
            return null;
        }
        
        public final void setWeatherStreamCallbacks(@org.jetbrains.annotations.Nullable()
        java.util.List<com.quixom.apps.weatherstream.utilities.WeatherStreamCallback> p0) {
        }
        
        public final void addWishCallBack(@org.jetbrains.annotations.NotNull()
        com.quixom.apps.weatherstream.utilities.WeatherStreamCallback weatherStreamCallback) {
        }
        
        public final void removeWishCallBack(@org.jetbrains.annotations.NotNull()
        com.quixom.apps.weatherstream.utilities.WeatherStreamCallback weatherStreamCallback) {
        }
        
        public final void updateHomeScreenData(int type) {
        }
        
        private final void initList() {
        }
        
        private Companion() {
            super();
        }
    }
}