package com.quixom.apps.weatherstream.fragments;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020(2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0012\u0010.\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u00a8\u0006/"}, d2 = {"Lcom/quixom/apps/weatherstream/fragments/BaseFragment;", "Landroid/support/v4/app/Fragment;", "()V", "connectionChecker", "Lcom/quixom/apps/weatherstream/utilities/ConnectionChecker;", "getConnectionChecker", "()Lcom/quixom/apps/weatherstream/utilities/ConnectionChecker;", "setConnectionChecker", "(Lcom/quixom/apps/weatherstream/utilities/ConnectionChecker;)V", "errorHandler", "Lcom/quixom/apps/weatherstream/webservice/ErrorHandler;", "getErrorHandler", "()Lcom/quixom/apps/weatherstream/webservice/ErrorHandler;", "setErrorHandler", "(Lcom/quixom/apps/weatherstream/webservice/ErrorHandler;)V", "fragmentUtil", "Lcom/quixom/apps/weatherstream/utilities/FragmentUtil;", "getFragmentUtil", "()Lcom/quixom/apps/weatherstream/utilities/FragmentUtil;", "setFragmentUtil", "(Lcom/quixom/apps/weatherstream/utilities/FragmentUtil;)V", "mActivity", "Lcom/quixom/apps/weatherstream/MainActivity;", "getMActivity", "()Lcom/quixom/apps/weatherstream/MainActivity;", "setMActivity", "(Lcom/quixom/apps/weatherstream/MainActivity;)V", "mResources", "Landroid/content/res/Resources;", "getMResources", "()Landroid/content/res/Resources;", "setMResources", "(Landroid/content/res/Resources;)V", "preferenceUtil", "Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;", "getPreferenceUtil", "()Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;", "setPreferenceUtil", "(Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;)V", "onActivityCreated", "", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "context", "Landroid/content/Context;", "onCreate", "app_debug"})
public class BaseFragment extends android.support.v4.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public com.quixom.apps.weatherstream.MainActivity mActivity;
    @org.jetbrains.annotations.NotNull()
    public com.quixom.apps.weatherstream.utilities.FragmentUtil fragmentUtil;
    @org.jetbrains.annotations.NotNull()
    public android.content.res.Resources mResources;
    @org.jetbrains.annotations.NotNull()
    public com.quixom.apps.weatherstream.utilities.ConnectionChecker connectionChecker;
    @org.jetbrains.annotations.NotNull()
    public com.quixom.apps.weatherstream.utilities.PreferenceUtil preferenceUtil;
    @org.jetbrains.annotations.NotNull()
    public com.quixom.apps.weatherstream.webservice.ErrorHandler errorHandler;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.MainActivity getMActivity() {
        return null;
    }
    
    public final void setMActivity(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.MainActivity p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.utilities.FragmentUtil getFragmentUtil() {
        return null;
    }
    
    public final void setFragmentUtil(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.utilities.FragmentUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.res.Resources getMResources() {
        return null;
    }
    
    public final void setMResources(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.utilities.ConnectionChecker getConnectionChecker() {
        return null;
    }
    
    public final void setConnectionChecker(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.utilities.ConnectionChecker p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.utilities.PreferenceUtil getPreferenceUtil() {
        return null;
    }
    
    public final void setPreferenceUtil(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.utilities.PreferenceUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.webservice.ErrorHandler getErrorHandler() {
        return null;
    }
    
    public final void setErrorHandler(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.webservice.ErrorHandler p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public BaseFragment() {
        super();
    }
}