package com.quixom.apps.weatherstream.fragments;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0003J\u0012\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J(\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u000eH\u0016J\b\u0010!\u001a\u00020\u000eH\u0016J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0010H\u0016J\u001c\u0010&\u001a\u00020\u000e2\b\u0010\'\u001a\u0004\u0018\u00010\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u000e\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020\u000eJ\b\u0010,\u001a\u00020\u000eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006-"}, d2 = {"Lcom/quixom/apps/weatherstream/fragments/MainFragment;", "Lcom/quixom/apps/weatherstream/fragments/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/quixom/apps/weatherstream/widgets/StickySwitch$OnSelectedChangeListener;", "()V", "addWeatherStreamCallBack", "Lcom/quixom/apps/weatherstream/utilities/WeatherStreamCallback;", "weatherSensor", "Lcom/github/matteobattilana/weather/WeatherViewSensorEventListener;", "getWeatherSensor", "()Lcom/github/matteobattilana/weather/WeatherViewSensorEventListener;", "setWeatherSensor", "(Lcom/github/matteobattilana/weather/WeatherViewSensorEventListener;)V", "initToolbar", "", "header", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onClick", "v", "Landroid/view/View;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onHiddenChanged", "hidden", "", "onPause", "onResume", "onSelectedChange", "direction", "Lcom/quixom/apps/weatherstream/widgets/StickySwitch$Direction;", "text", "onViewCreated", "view", "setWeatherData", "weatherDataAnim", "Lcom/github/matteobattilana/weather/WeatherDataAnim;", "setWeatherDetails", "showInfoDialog", "app_debug"})
public final class MainFragment extends com.quixom.apps.weatherstream.fragments.BaseFragment implements android.view.View.OnClickListener, com.quixom.apps.weatherstream.widgets.StickySwitch.OnSelectedChangeListener {
    @org.jetbrains.annotations.NotNull()
    public com.github.matteobattilana.weather.WeatherViewSensorEventListener weatherSensor;
    private com.quixom.apps.weatherstream.utilities.WeatherStreamCallback addWeatherStreamCallBack;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.github.matteobattilana.weather.WeatherViewSensorEventListener getWeatherSensor() {
        return null;
    }
    
    public final void setWeatherSensor(@org.jetbrains.annotations.NotNull()
    com.github.matteobattilana.weather.WeatherViewSensorEventListener p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.Nullable()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.Nullable()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onSelectedChange(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.widgets.StickySwitch.Direction direction, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void setWeatherData(@org.jetbrains.annotations.NotNull()
    com.github.matteobattilana.weather.WeatherDataAnim weatherDataAnim) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onHiddenChanged(boolean hidden) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initToolbar(java.lang.String header) {
    }
    
    public final void setWeatherDetails() {
    }
    
    private final void showInfoDialog() {
    }
    
    public MainFragment() {
        super();
    }
}