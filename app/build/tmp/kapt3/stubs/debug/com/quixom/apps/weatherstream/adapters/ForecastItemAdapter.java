package com.quixom.apps.weatherstream.adapters;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0011H\u0017J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/quixom/apps/weatherstream/adapters/ForecastItemAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/quixom/apps/weatherstream/adapters/ForecastItemAdapter$ViewHolder;", "preferenceUtil", "Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;", "cityname", "", "daysForecastList", "", "Lcom/quixom/apps/weatherstream/model/WeatherForecastData$ForecastList;", "mainActivity", "Lcom/quixom/apps/weatherstream/MainActivity;", "(Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;Ljava/lang/String;Ljava/util/List;Lcom/quixom/apps/weatherstream/MainActivity;)V", "context", "Landroid/content/Context;", "mActivity", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class ForecastItemAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.quixom.apps.weatherstream.adapters.ForecastItemAdapter.ViewHolder> {
    private android.content.Context context;
    private com.quixom.apps.weatherstream.MainActivity mActivity;
    private com.quixom.apps.weatherstream.utilities.PreferenceUtil preferenceUtil;
    private java.lang.String cityname;
    private java.util.List<com.quixom.apps.weatherstream.model.WeatherForecastData.ForecastList> daysForecastList;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.quixom.apps.weatherstream.adapters.ForecastItemAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"InflateParams"})
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.adapters.ForecastItemAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public ForecastItemAdapter(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.utilities.PreferenceUtil preferenceUtil, @org.jetbrains.annotations.NotNull()
    java.lang.String cityname, @org.jetbrains.annotations.NotNull()
    java.util.List<com.quixom.apps.weatherstream.model.WeatherForecastData.ForecastList> daysForecastList, @org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.MainActivity mainActivity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006\u0013"}, d2 = {"Lcom/quixom/apps/weatherstream/adapters/ForecastItemAdapter$ViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "mActivity", "Lcom/quixom/apps/weatherstream/MainActivity;", "(Landroid/view/View;Lcom/quixom/apps/weatherstream/MainActivity;)V", "ivWeatherTypeForecast", "Landroid/widget/ImageView;", "getIvWeatherTypeForecast", "()Landroid/widget/ImageView;", "tvAvgTemperature", "Landroid/widget/TextView;", "getTvAvgTemperature", "()Landroid/widget/TextView;", "tvDayTime", "getTvDayTime", "tvMinMaxTempExpand", "getTvMinMaxTempExpand", "app_debug"})
    public static final class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvDayTime = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvMinMaxTempExpand = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView tvAvgTemperature = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView ivWeatherTypeForecast = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDayTime() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvMinMaxTempExpand() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvAvgTemperature() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getIvWeatherTypeForecast() {
            return null;
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        com.quixom.apps.weatherstream.MainActivity mActivity) {
            super(null);
        }
    }
}