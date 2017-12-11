package com.quixom.apps.weatherstream.weatherview.confetti;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J*\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/quixom/apps/weatherstream/weatherview/confetti/MutableRectSource;", "Lcom/quixom/apps/weatherstream/weatherview/confetti/ConfettiSource;", "x", "", "y", "otherX", "otherY", "(IIII)V", "getOtherX", "()I", "setOtherX", "(I)V", "getOtherY", "setOtherY", "getX", "setX", "getY", "setY", "getInitialX", "", "random", "getInitialY", "getXRange", "getYRange", "setBounds", "", "x0", "y0", "x1", "y1", "app_debug"})
public final class MutableRectSource extends com.quixom.apps.weatherstream.weatherview.confetti.ConfettiSource {
    private volatile int x;
    private volatile int y;
    private volatile int otherX;
    private volatile int otherY;
    
    public final int getXRange() {
        return 0;
    }
    
    public final int getYRange() {
        return 0;
    }
    
    @java.lang.Override()
    protected float getInitialX(float random) {
        return 0.0F;
    }
    
    @java.lang.Override()
    protected float getInitialY(float random) {
        return 0.0F;
    }
    
    public final void setBounds(int x0, int y0, int x1, int y1) {
    }
    
    public final int getX() {
        return 0;
    }
    
    public final void setX(int p0) {
    }
    
    public final int getY() {
        return 0;
    }
    
    public final void setY(int p0) {
    }
    
    public final int getOtherX() {
        return 0;
    }
    
    public final void setOtherX(int p0) {
    }
    
    public final int getOtherY() {
        return 0;
    }
    
    public final void setOtherY(int p0) {
    }
    
    public MutableRectSource(int x, int y, int otherX, int otherY) {
        super(0, 0);
    }
    
    public MutableRectSource(int x, int y, int otherX) {
        super(0, 0);
    }
    
    public MutableRectSource(int x, int y) {
        super(0, 0);
    }
}