package com.quixom.apps.weatherstream.utilities;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0002J0\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\fH\u0007J \u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/quixom/apps/weatherstream/utilities/LocalNotification;", "", "mainActivity", "Lcom/quixom/apps/weatherstream/MainActivity;", "(Lcom/quixom/apps/weatherstream/MainActivity;)V", "getMainActivity", "()Lcom/quixom/apps/weatherstream/MainActivity;", "createRemoteViews", "Landroid/widget/RemoteViews;", "context", "Landroid/content/Context;", "layout", "", "title", "", "message", "time", "weatherTypeImage", "showCustomLayoutHeadsUpNotification", "", "showNotification", "notification", "Landroid/app/Notification;", "id", "app_debug"})
public final class LocalNotification {
    @org.jetbrains.annotations.NotNull()
    private final com.quixom.apps.weatherstream.MainActivity mainActivity = null;
    
    @android.support.annotation.RequiresApi(value = 24)
    public final void showCustomLayoutHeadsUpNotification(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String time, int weatherTypeImage) {
    }
    
    private final android.widget.RemoteViews createRemoteViews(android.content.Context context, int layout, java.lang.String title, java.lang.String message, java.lang.String time, int weatherTypeImage) {
        return null;
    }
    
    private final void showNotification(android.content.Context context, android.app.Notification notification, int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.MainActivity getMainActivity() {
        return null;
    }
    
    public LocalNotification(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.MainActivity mainActivity) {
        super();
    }
}