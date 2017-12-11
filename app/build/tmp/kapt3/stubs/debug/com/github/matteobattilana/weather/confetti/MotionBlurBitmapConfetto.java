package com.github.matteobattilana.weather.confetti;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J@\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\bH\u0014J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\u001d"}, d2 = {"Lcom/github/matteobattilana/weather/confetti/MotionBlurBitmapConfetto;", "Lcom/quixom/apps/weatherstream/weatherview/confetto/Confetto;", "confettoInfo", "Lcom/quixom/apps/weatherstream/weatherview/confetti/ConfettoInfo;", "(Lcom/quixom/apps/weatherstream/weatherview/confetti/ConfettoInfo;)V", "getConfettoInfo", "()Lcom/quixom/apps/weatherstream/weatherview/confetti/ConfettoInfo;", "prevX", "", "Ljava/lang/Float;", "prevY", "configurePaint", "", "paint", "Landroid/graphics/Paint;", "drawInternal", "canvas", "Landroid/graphics/Canvas;", "matrix", "Landroid/graphics/Matrix;", "x", "y", "rotation", "percentageAnimated", "getHeight", "", "getWidth", "reset", "Companion", "app_debug"})
public final class MotionBlurBitmapConfetto extends com.quixom.apps.weatherstream.weatherview.confetto.Confetto {
    private java.lang.Float prevX;
    private java.lang.Float prevY;
    @org.jetbrains.annotations.NotNull()
    private final com.quixom.apps.weatherstream.weatherview.confetti.ConfettoInfo confettoInfo = null;
    public static final float SNOW_RADIUS = 7.5F;
    public static final float RAIN_STRETCH = 1.5F;
    public static final com.github.matteobattilana.weather.confetti.MotionBlurBitmapConfetto.Companion Companion = null;
    
    @java.lang.Override()
    public int getHeight() {
        return 0;
    }
    
    @java.lang.Override()
    public int getWidth() {
        return 0;
    }
    
    @java.lang.Override()
    public void reset() {
    }
    
    @java.lang.Override()
    protected void configurePaint(@org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint) {
    }
    
    @java.lang.Override()
    protected void drawInternal(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas, @org.jetbrains.annotations.NotNull()
    android.graphics.Matrix matrix, @org.jetbrains.annotations.NotNull()
    android.graphics.Paint paint, float x, float y, float rotation, float percentageAnimated) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.weatherview.confetti.ConfettoInfo getConfettoInfo() {
        return null;
    }
    
    public MotionBlurBitmapConfetto(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.weatherview.confetti.ConfettoInfo confettoInfo) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/github/matteobattilana/weather/confetti/MotionBlurBitmapConfetto$Companion;", "", "()V", "RAIN_STRETCH", "", "SNOW_RADIUS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}