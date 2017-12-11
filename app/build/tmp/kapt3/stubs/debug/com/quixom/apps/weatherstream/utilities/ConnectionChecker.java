package com.quixom.apps.weatherstream.utilities;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lcom/quixom/apps/weatherstream/utilities/ConnectionChecker;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getMContext", "()Landroid/content/Context;", "isConnectionAvailable", "", "app_debug"})
public final class ConnectionChecker {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final boolean isConnectionAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public ConnectionChecker(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
}