package com.quixom.apps.weatherstream.adapters;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001!B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001e\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0018\u00010\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001e\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u0004X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\""}, d2 = {"Lcom/quixom/apps/weatherstream/adapters/LocationHistoryAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/quixom/apps/weatherstream/adapters/LocationHistoryAdapter$LocationVH;", "preferenceUtil", "Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;", "appslist", "Ljava/util/ArrayList;", "Lcom/quixom/apps/weatherstream/model/LocationSearchHistory;", "sActivity", "Lcom/quixom/apps/weatherstream/MainActivity;", "(Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;Ljava/util/ArrayList;Lcom/quixom/apps/weatherstream/MainActivity;)V", "getAppslist$app_debug", "()Ljava/util/ArrayList;", "setAppslist$app_debug", "(Ljava/util/ArrayList;)V", "getPreferenceUtil$app_debug", "()Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;", "setPreferenceUtil$app_debug", "(Lcom/quixom/apps/weatherstream/utilities/PreferenceUtil;)V", "getSActivity$app_debug", "()Lcom/quixom/apps/weatherstream/MainActivity;", "setSActivity$app_debug", "(Lcom/quixom/apps/weatherstream/MainActivity;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "LocationVH", "app_debug"})
public final class LocationHistoryAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.quixom.apps.weatherstream.adapters.LocationHistoryAdapter.LocationVH> {
    @org.jetbrains.annotations.NotNull()
    private com.quixom.apps.weatherstream.utilities.PreferenceUtil preferenceUtil;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.quixom.apps.weatherstream.model.LocationSearchHistory> appslist;
    @org.jetbrains.annotations.NotNull()
    private com.quixom.apps.weatherstream.MainActivity sActivity;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.quixom.apps.weatherstream.adapters.LocationHistoryAdapter.LocationVH onCreateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.Nullable()
    com.quixom.apps.weatherstream.adapters.LocationHistoryAdapter.LocationVH holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.utilities.PreferenceUtil getPreferenceUtil$app_debug() {
        return null;
    }
    
    public final void setPreferenceUtil$app_debug(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.utilities.PreferenceUtil p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.quixom.apps.weatherstream.model.LocationSearchHistory> getAppslist$app_debug() {
        return null;
    }
    
    public final void setAppslist$app_debug(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.quixom.apps.weatherstream.model.LocationSearchHistory> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.quixom.apps.weatherstream.MainActivity getSActivity$app_debug() {
        return null;
    }
    
    public final void setSActivity$app_debug(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.MainActivity p0) {
    }
    
    public LocationHistoryAdapter(@org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.utilities.PreferenceUtil preferenceUtil, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.quixom.apps.weatherstream.model.LocationSearchHistory> appslist, @org.jetbrains.annotations.NotNull()
    com.quixom.apps.weatherstream.MainActivity sActivity) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007\u00a8\u0006\t"}, d2 = {"Lcom/quixom/apps/weatherstream/adapters/LocationHistoryAdapter$LocationVH;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/quixom/apps/weatherstream/adapters/LocationHistoryAdapter;Landroid/view/View;)V", "bindData", "", "locationSearchData", "Lcom/quixom/apps/weatherstream/model/LocationSearchHistory;", "app_debug"})
    public final class LocationVH extends android.support.v7.widget.RecyclerView.ViewHolder {
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bindData(@org.jetbrains.annotations.NotNull()
        com.quixom.apps.weatherstream.model.LocationSearchHistory locationSearchData) {
        }
        
        public LocationVH(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}