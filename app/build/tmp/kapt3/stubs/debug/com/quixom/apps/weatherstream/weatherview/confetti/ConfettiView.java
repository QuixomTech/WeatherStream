package com.quixom.apps.weatherstream.weatherview.confetti;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0014\u0010\u000f\u001a\u00020\u00102\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\b\u0010\u0011\u001a\u00020\u0010H\u0014J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0014JP\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0016J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\"H\u0016J\u0006\u0010#\u001a\u00020\u0010J\u000e\u0010$\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010%\u001a\u00020\u0010R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/quixom/apps/weatherstream/weatherview/confetti/ConfettiView;", "Landroid/view/View;", "Landroid/view/View$OnLayoutChangeListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "confetti", "", "Lcom/quixom/apps/weatherstream/weatherview/confetto/Confetto;", "draggedConfetto", "terminated", "", "touchEnabled", "bind", "", "onAttachedToWindow", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onLayoutChange", "view", "i", "", "i1", "i2", "i3", "i4", "i5", "i6", "i7", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "reset", "setTouchEnabled", "terminate", "Companion", "app_debug"})
public final class ConfettiView extends android.view.View implements android.view.View.OnLayoutChangeListener {
    private java.util.List<? extends com.quixom.apps.weatherstream.weatherview.confetto.Confetto> confetti;
    private boolean terminated;
    private boolean touchEnabled;
    private com.quixom.apps.weatherstream.weatherview.confetto.Confetto draggedConfetto;
    public static final com.quixom.apps.weatherstream.weatherview.confetti.ConfettiView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void bind(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.quixom.apps.weatherstream.weatherview.confetto.Confetto> confetti) {
    }
    
    public final void setTouchEnabled(boolean touchEnabled) {
    }
    
    public final void terminate() {
    }
    
    public final void reset() {
    }
    
    @java.lang.Override()
    protected void onAttachedToWindow() {
    }
    
    @java.lang.Override()
    public void onLayoutChange(@org.jetbrains.annotations.NotNull()
    android.view.View view, int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public ConfettiView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/quixom/apps/weatherstream/weatherview/confetti/ConfettiView$Companion;", "", "()V", "newInstance", "Lcom/quixom/apps/weatherstream/weatherview/confetti/ConfettiView;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.quixom.apps.weatherstream.weatherview.confetti.ConfettiView newInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}