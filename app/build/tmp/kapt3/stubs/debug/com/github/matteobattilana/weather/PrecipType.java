package com.github.matteobattilana.weather;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00008\u0016X\u0097\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\f"}, d2 = {"Lcom/github/matteobattilana/weather/PrecipType;", "", "Lcom/github/matteobattilana/weather/WeatherDataAnim;", "(Ljava/lang/String;I)V", "precipType", "precipType$annotations", "()V", "getPrecipType", "()Lcom/github/matteobattilana/weather/PrecipType;", "CLEAR", "SNOW", "RAIN", "app_debug"})
public enum PrecipType implements com.github.matteobattilana.weather.WeatherDataAnim {
    /*public static final*/ CLEAR /* = new @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/github/matteobattilana/weather/PrecipType$CLEAR;", "Lcom/github/matteobattilana/weather/PrecipType;", "(Ljava/lang/String;I)V", "emissionRate", "", "getEmissionRate", "()F", "speed", "", "getSpeed", "()I", "app_debug"}) CLEAR(){
        private final float emissionRate = 0.0F;
        private final int speed = 0;
        
        @java.lang.Override()
        public float getEmissionRate() {
            return 0.0F;
        }
        
        @java.lang.Override()
        public int getSpeed() {
            return 0;
        }
        
        CLEAR() {
            super();
        }
    } */,
    /*public static final*/ SNOW /* = new @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/github/matteobattilana/weather/PrecipType$SNOW;", "Lcom/github/matteobattilana/weather/PrecipType;", "(Ljava/lang/String;I)V", "emissionRate", "", "getEmissionRate", "()F", "speed", "", "getSpeed", "()I", "app_debug"}) SNOW(){
        private final float emissionRate = 10.0F;
        private final int speed = 250;
        
        @java.lang.Override()
        public float getEmissionRate() {
            return 0.0F;
        }
        
        @java.lang.Override()
        public int getSpeed() {
            return 0;
        }
        
        SNOW() {
            super();
        }
    } */,
    /*public static final*/ RAIN /* = new @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0001\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/github/matteobattilana/weather/PrecipType$RAIN;", "Lcom/github/matteobattilana/weather/PrecipType;", "(Ljava/lang/String;I)V", "emissionRate", "", "getEmissionRate", "()F", "speed", "", "getSpeed", "()I", "app_debug"}) RAIN(){
        private final float emissionRate = 100.0F;
        private final int speed = 0;
        
        @java.lang.Override()
        public float getEmissionRate() {
            return 0.0F;
        }
        
        @java.lang.Override()
        public int getSpeed() {
            return 0;
        }
        
        RAIN() {
            super();
        }
    } */;
    @org.jetbrains.annotations.NotNull()
    private final com.github.matteobattilana.weather.PrecipType precipType = null;
    
    @kotlin.Suppress(names = {"LeakingThis"})
    @java.lang.Override()
    public static void precipType$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.github.matteobattilana.weather.PrecipType getPrecipType() {
        return null;
    }
    
    PrecipType() {
    }
}