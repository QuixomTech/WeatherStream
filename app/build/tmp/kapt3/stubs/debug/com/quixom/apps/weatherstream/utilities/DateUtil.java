package com.quixom.apps.weatherstream.utilities;

@kotlin.Metadata(mv = {1, 1, 8}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\tJ\u0010\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\tH\u0007J\u0016\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000206J\u0016\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\t2\u0006\u0010;\u001a\u00020\tJ \u0010<\u001a\u0004\u0018\u00010\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tJ \u0010@\u001a\u0004\u0018\u00010\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tJ \u0010A\u001a\u0004\u0018\u00010\t2\u0006\u0010=\u001a\u00020\t2\u0006\u0010>\u001a\u00020\t2\u0006\u0010?\u001a\u00020\tJ\u0010\u0010B\u001a\u0002092\u0006\u00103\u001a\u00020\tH\u0007J\'\u0010C\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u0001062\u0006\u0010E\u001a\u00020\t2\u0006\u0010F\u001a\u000209H\u0007\u00a2\u0006\u0002\u0010GJ\u001d\u0010H\u001a\u00020\t2\b\u0010D\u001a\u0004\u0018\u0001062\u0006\u0010E\u001a\u00020\t\u00a2\u0006\u0002\u0010IJ\u0016\u0010J\u001a\u0002062\u0006\u0010K\u001a\u00020\t2\u0006\u0010L\u001a\u00020\tJ\u000e\u0010M\u001a\u00020\t2\u0006\u00103\u001a\u000206J\u000e\u0010N\u001a\u00020\t2\u0006\u0010D\u001a\u000206J\u0016\u0010O\u001a\u0002092\u0006\u0010=\u001a\u00020\t2\u0006\u00101\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000b\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u000b\"\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000bR\u0014\u0010\u001b\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000bR\u0014\u0010\u001d\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000bR\u0014\u0010\u001f\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u000bR\u0014\u0010!\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u000bR\u0014\u0010#\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u000bR\u0014\u0010%\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u000bR\u0014\u0010\'\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u000bR\u0014\u0010)\u001a\u00020\tX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u000b\u00a8\u0006P"}, d2 = {"Lcom/quixom/apps/weatherstream/utilities/DateUtil;", "", "()V", "DAY_MILLIS", "", "HOUR_MILLIS", "MINUTE_MILLIS", "SECOND_MILLIS", "currentDate", "", "getCurrentDate", "()Ljava/lang/String;", "dateDisplayFormat", "getDateDisplayFormat", "dateDisplayFormat1", "getDateDisplayFormat1", "dateDisplayFormat2", "getDateDisplayFormat2", "dateDisplayFormat3", "getDateDisplayFormat3", "setDateDisplayFormat3", "(Ljava/lang/String;)V", "dateDisplayFormat4", "getDateDisplayFormat4", "setDateDisplayFormat4", "dateDisplayFormatWithTime", "getDateDisplayFormatWithTime", "dateDisplayFormatWithTime2", "getDateDisplayFormatWithTime2", "dateDisplayFormatWithTime3", "getDateDisplayFormatWithTime3", "dateFormatFacebook", "getDateFormatFacebook", "dateServerFormat", "getDateServerFormat", "dateServerFormatWithTime", "getDateServerFormatWithTime", "timeFormat", "getTimeFormat", "timeFormat24Hour", "getTimeFormat24Hour", "timeHourFormat", "getTimeHourFormat", "chooseDate", "", "mContext", "Landroid/content/Context;", "tvDate", "Landroid/widget/TextView;", "dateFormat", "convertTime", "time", "dateDifferentInDays", "startDate1", "", "endDate1", "dateLessthenCurrentDate", "", "strDateToCompare", "format", "getChangedDateFormate", "mDate", "mOldDateFormat", "newDateFormate", "getChangedDateFormateGMTToLocal", "getChangedDateFormateLocalToGMT", "getCurrentDateTime", "getDateFromMillis", "mDateInMillis", "mDateFormat", "timeConversion", "(Ljava/lang/Long;Ljava/lang/String;Z)Ljava/lang/String;", "getDateFromMillisGMT", "(Ljava/lang/Long;Ljava/lang/String;)Ljava/lang/String;", "getMillFromDate", "str_date", "dateFormate", "getTimeAgo", "getWeeksFromMillis", "isAgeGreaterThanEqualTo18ForDateFormat", "app_debug"})
public final class DateUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String timeFormat = "hh:mm aa";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String timeFormat24Hour = "kk:mm";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String timeHourFormat = "hh aa";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String dateDisplayFormat = "dd MMM, yyyy";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String dateDisplayFormat1 = "EEEE MMMM dd, yyyy";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String dateDisplayFormat2 = "MMM dd, yyyy";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String dateDisplayFormat3;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String dateDisplayFormat4;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String dateDisplayFormatWithTime = "dd MMM, yyyy hh:mm aa";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String dateDisplayFormatWithTime2 = "MMM dd, yyyy hh:mm aa";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String dateDisplayFormatWithTime3 = "EEEE, dd MMM hh:mm aa";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String dateServerFormat = "yyyy-MM-dd";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String dateServerFormatWithTime = "yyyy-MM-dd hh:mm aa";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String dateFormatFacebook = "MM/dd/yyyy";
    private static final int SECOND_MILLIS = 1000;
    private static final int MINUTE_MILLIS = 60000;
    private static final int HOUR_MILLIS = 3600000;
    private static final int DAY_MILLIS = 86400000;
    public static final com.quixom.apps.weatherstream.utilities.DateUtil INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeFormat24Hour() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeHourFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateDisplayFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateDisplayFormat1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateDisplayFormat2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateDisplayFormat3() {
        return null;
    }
    
    public final void setDateDisplayFormat3(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateDisplayFormat4() {
        return null;
    }
    
    public final void setDateDisplayFormat4(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateDisplayFormatWithTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateDisplayFormatWithTime2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateDisplayFormatWithTime3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateServerFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateServerFormatWithTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateFormatFacebook() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String getDateFromMillis(@org.jetbrains.annotations.Nullable()
    java.lang.Long mDateInMillis, @org.jetbrains.annotations.NotNull()
    java.lang.String mDateFormat, boolean timeConversion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getWeeksFromMillis(long mDateInMillis) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDateFromMillisGMT(@org.jetbrains.annotations.Nullable()
    java.lang.Long mDateInMillis, @org.jetbrains.annotations.NotNull()
    java.lang.String mDateFormat) {
        return null;
    }
    
    public final long getMillFromDate(@org.jetbrains.annotations.NotNull()
    java.lang.String str_date, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormate) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChangedDateFormate(@org.jetbrains.annotations.NotNull()
    java.lang.String mDate, @org.jetbrains.annotations.NotNull()
    java.lang.String mOldDateFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String newDateFormate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChangedDateFormateLocalToGMT(@org.jetbrains.annotations.NotNull()
    java.lang.String mDate, @org.jetbrains.annotations.NotNull()
    java.lang.String mOldDateFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String newDateFormate) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getChangedDateFormateGMTToLocal(@org.jetbrains.annotations.NotNull()
    java.lang.String mDate, @org.jetbrains.annotations.NotNull()
    java.lang.String mOldDateFormat, @org.jetbrains.annotations.NotNull()
    java.lang.String newDateFormate) {
        return null;
    }
    
    public final boolean dateLessthenCurrentDate(@org.jetbrains.annotations.NotNull()
    java.lang.String strDateToCompare, @org.jetbrains.annotations.NotNull()
    java.lang.String format) {
        return false;
    }
    
    public final boolean isAgeGreaterThanEqualTo18ForDateFormat(@org.jetbrains.annotations.NotNull()
    java.lang.String mDate, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormat) {
        return false;
    }
    
    public final void chooseDate(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    android.widget.TextView tvDate, @org.jetbrains.annotations.NotNull()
    java.lang.String dateFormat) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTimeAgo(long time) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final java.lang.String convertTime(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SimpleDateFormat"})
    public final boolean getCurrentDateTime(@org.jetbrains.annotations.NotNull()
    java.lang.String time) {
        return false;
    }
    
    public final int dateDifferentInDays(long startDate1, long endDate1) {
        return 0;
    }
    
    private DateUtil() {
        super();
    }
}