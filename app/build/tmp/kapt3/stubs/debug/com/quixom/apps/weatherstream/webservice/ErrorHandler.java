package com.quixom.apps.weatherstream.webservice;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u000bJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0010"}, d2 = {"Lcom/quixom/apps/weatherstream/webservice/ErrorHandler;", "", "mActivity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "getMActivity", "()Landroid/app/Activity;", "setMActivity", "parseError", "Lcom/quixom/apps/weatherstream/webservice/APIError;", "response", "Lretrofit2/Response;", "setExceptionMessage", "", "t", "", "app_debug"})
public final class ErrorHandler {
    @org.jetbrains.annotations.NotNull()
    private android.app.Activity mActivity;
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.webservice.APIError parseError(@org.jetbrains.annotations.NotNull()
    retrofit2.Response<?> response) {
        return null;
    }
    
    public final void setExceptionMessage(@org.jetbrains.annotations.Nullable()
    java.lang.Throwable t) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Activity getMActivity() {
        return null;
    }
    
    public final void setMActivity(@org.jetbrains.annotations.NotNull()
    android.app.Activity p0) {
    }
    
    public ErrorHandler(@org.jetbrains.annotations.NotNull()
    android.app.Activity mActivity) {
        super();
    }
}