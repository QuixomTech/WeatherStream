package com.quixom.apps.weatherstream.utilities

import android.app.DatePickerDialog
import android.content.Context
import android.net.ParseException
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by akif on 14/101/15.
 */
object DateUtil {

    val timeFormat = "hh:mm aa"
    val timeFormat24Hour = "kk:mm"
    val timeHourFormat = "hh aa"
    val dateDisplayFormat = "dd MMM, yyyy"
    val dateDisplayFormat1 = "EEEE MMMM dd, yyyy"
    val dateDisplayFormat2 = "MMM dd, yyyy"
    val dateDisplayFormatWithTime = dateDisplayFormat + " " + timeFormat
    val dateDisplayFormatWithTime2 = dateDisplayFormat2 + " " + timeFormat
    val dateDisplayFormatWithTime3 = "EEEE, dd MMM " + timeFormat
    val dateServerFormat = "yyyy-MM-dd"
    val dateServerFormatWithTime = dateServerFormat + " " + timeFormat
    val dateFormatFacebook = "MM/dd/yyyy"//12\/14\/1990


    private val SECOND_MILLIS = 1000
    private val MINUTE_MILLIS = 60 * SECOND_MILLIS
    private val HOUR_MILLIS = 60 * MINUTE_MILLIS
    private val DAY_MILLIS = 24 * HOUR_MILLIS

    val currentDate: String
        get() = Calendar.getInstance().time.toString()

    /*
    public static int getCurrentDay()
    {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        return day;

    }

    public static int timeIn24Hour(final String time, final String timeFormat)
    {
        if (Validation.isRequiredField(time))
        {
            String t = getChangedDateFormate(time, timeFormat, "kk");

            if (Validation.getIntFromString(t)!=0)
            {
                return Integer.parseInt(t);
            }
        }

        return 0;
    }
*/
    fun getDateFromMillis(mDateInMillis: Long?, mDateFormat: String): String {
        var miliis: Long = 0

        if (mDateInMillis != null) {
            try {
                miliis = mDateInMillis  * 1000L
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
        // Create a DateFormatter object for displaying date in specified format.
        val formatter = SimpleDateFormat(mDateFormat)

        // Create a calendar object that will convert the date and time value in milliseconds to date.
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = miliis
        return formatter.format(calendar.time)
    }

    fun getWeeksFromMillis(mDateInMillis: Long): String {
        var mDateInMillis = mDateInMillis
        if (mDateInMillis < 1000000000000L) {
            // if timestamp given in seconds, convert to millis
            mDateInMillis *= 1000
        }

        val calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"))
        val calendarCurrent = Calendar.getInstance(TimeZone.getTimeZone("GMT"))
        calendarCurrent.timeInMillis = System.currentTimeMillis()
        calendar.timeInMillis = mDateInMillis

        //      int weeks    = calendarCurrent.get(Calendar.WEEK_OF_YEAR) - calendar.get(Calendar.WEEK_OF_YEAR);
        val days = calendarCurrent.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH)
        val hours = calendarCurrent.get(Calendar.HOUR) - calendar.get(Calendar.HOUR)
        val minutes = calendarCurrent.get(Calendar.MINUTE) - calendar.get(Calendar.MINUTE)
        val seconds = calendarCurrent.get(Calendar.SECOND) - calendar.get(Calendar.SECOND)

        var duration = ""

        if (days == 7) {
            duration = "1" + " WEEK AGO"
        } else if (days > 7) {
            duration = Math.ceil((days.toFloat() / 7).toDouble()).toInt().toString() + " WEEKS AGO"
        } else if (days == 1) {
            duration = days.toString() + " DAY AGO"//[NSString stringWithFormat:@"%ld d",(long)days];
        } else if (days > 1) {
            duration = days.toString() + " DAYS AGO"//[NSString stringWithFormat:@"%ld d",(long)days];
        } else if (hours == 1) {
            duration = hours.toString() + " HOUR AGO"//[NSString stringWithFormat:@"%ld h",(long)hours];
        } else if (hours > 1) {
            duration = hours.toString() + " HOURS AGO"//[NSString stringWithFormat:@"%ld h",(long)hours];
        } else if (minutes == 0) {
            duration = minutes.toString() + " MINUTE AGO"//[NSString stringWithFormat:@"%ld m",(long)minutes];
        } else if (minutes > 1) {
            duration = minutes.toString() + " MINUTES AGO"//[NSString stringWithFormat:@"%ld m",(long)minutes];
        } else {
            if (seconds <= 1) {
                duration = "NOW"//[NSString stringWithFormat:@"Now"];
            } else {
                duration = seconds.toString() + " SEC. AGO"//[NSString stringWithFormat:@"%ld s",(long)seconds];
            }
        }
        return duration
    }

    fun getDateFromMillisGMT(mDateInMillis: Long?, mDateFormat: String): String {
        var miliis: Long = 0

        if (mDateInMillis != null) {
            try {
                miliis = mDateInMillis
            } catch (e: Exception) {
                e.printStackTrace()
            }

        }
        // Create a calendar object that will convert the date and time value in milliseconds to date.
        val calendar = Calendar.getInstance()
        calendar.timeInMillis = miliis

        // Create a DateFormatter object for displaying date in specified format.
        val formatter = SimpleDateFormat(mDateFormat)
        formatter.timeZone = TimeZone.getTimeZone("GMT")


        return formatter.format(calendar.time)
    }

    fun getMillFromDate(str_date: String, dateFormate: String): Long {
        try {
            val formatter = SimpleDateFormat(dateFormate)
            val date = formatter.parse(str_date)

            return date.time
        } catch (e: Exception) {
            e.printStackTrace()
            return 0
        }

    }

    fun getChangedDateFormate(mDate: String, mOldDateFormat: String, newDateFormate: String): String? {
        val inputFormat = SimpleDateFormat(mOldDateFormat)
        val outputFormat = SimpleDateFormat(newDateFormate)

        var date: Date? = null
        var str: String? = null

        try {
            date = inputFormat.parse(mDate)
            str = outputFormat.format(date)

            return str

        } catch (e: ParseException) {
            e.printStackTrace()
        } catch (e: java.text.ParseException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ""
    }

    fun getChangedDateFormateLocalToGMT(mDate: String, mOldDateFormat: String, newDateFormate: String): String? {
        val inputFormat = SimpleDateFormat(mOldDateFormat)
        val outputFormat = SimpleDateFormat(newDateFormate)

        var date: Date? = null
        var str: String? = null

        try {
            date = inputFormat.parse(mDate)
            outputFormat.timeZone = TimeZone.getTimeZone("GMT")
            str = outputFormat.format(date)

            return str

        } catch (e: ParseException) {
            e.printStackTrace()
        } catch (e: java.text.ParseException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ""
    }

    fun getChangedDateFormateGMTToLocal(mDate: String, mOldDateFormat: String, newDateFormate: String): String? {
        val inputFormat = SimpleDateFormat(mOldDateFormat)
        val outputFormat = SimpleDateFormat(newDateFormate)

        var date: Date? = null
        var str: String? = null

        try {
            inputFormat.timeZone = TimeZone.getTimeZone("GMT")
            date = inputFormat.parse(mDate)
            outputFormat.timeZone = TimeZone.getDefault()
            str = outputFormat.format(date)

            return str

        } catch (e: ParseException) {
            e.printStackTrace()
        } catch (e: java.text.ParseException) {
            e.printStackTrace()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return ""
    }
    /*public static String getChangedDateFormateGMTToLocal(final String mDate, final String mOldDateFormat, final String newDateFormate)
    {
        SimpleDateFormat inputFormat = new SimpleDateFormat(mOldDateFormat);
        SimpleDateFormat outputFormat = new SimpleDateFormat(newDateFormate);

        Date date = null;
        String str = null;

        try {
            inputFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            date = inputFormat.parse(mDate);
            outputFormat.setTimeZone(TimeZone.getDefault());
            str = outputFormat.format(date);

            return str;

        } catch (ParseException e) {
            e.printStackTrace();
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return "";
    }*/

    fun dateLessthenCurrentDate(strDateToCompare: String, format: String): Boolean {
        val c = Calendar.getInstance()

        // set the calendar to start of today
        c.set(Calendar.HOUR_OF_DAY, 0)
        c.set(Calendar.MINUTE, 0)
        c.set(Calendar.SECOND, 0)
        c.set(Calendar.MILLISECOND, 0)

        // and get that as a Date
        val today = c.time

        val sdf = SimpleDateFormat(format)
        var strDate: Date? = null
        try {
            strDate = sdf.parse(strDateToCompare)



            if (strDate!!.before(today)) {
                return true
            }

        } catch (e: java.text.ParseException) {
            e.printStackTrace()
        }

        return false

    }

    fun isAgeGreaterThanEqualTo18ForDateFormat(mDate: String, dateFormat: String): Boolean {

        val calendarCurrent = Calendar.getInstance()
        val calendarSelected = Calendar.getInstance()
        calendarSelected.timeInMillis = getMillFromDate(mDate, dateFormat)

        val yearCurrent = calendarCurrent.get(Calendar.YEAR)
        val yearSelected = calendarSelected.get(Calendar.YEAR)

        val monthCurrent = calendarCurrent.get(Calendar.MONTH)
        val monthSelected = calendarSelected.get(Calendar.MONTH)

        val dayCurrent = calendarCurrent.get(Calendar.DAY_OF_MONTH)
        val daySelected = calendarSelected.get(Calendar.DAY_OF_MONTH)

        return if (yearCurrent - yearSelected >= 18) {
            if (yearCurrent - yearSelected == 18 && monthSelected <= monthCurrent) {
                if (monthSelected == monthCurrent && daySelected <= dayCurrent) {
                    true
                } else false

            } else true

        } else false


        /*  Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(getMillFromDate(mDate, dateFormat));
        Calendar b = Calendar.getInstance();
        Calendar a = calendar;
        int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
        if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) ||
                (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
            diff--;
        }

        if (diff>18)
        {
            return true;
        }

        return false;*/
    }

    fun chooseDate(mContext: Context, tvDate: TextView, dateFormat: String) {
        val c = Calendar.getInstance()
        c.timeInMillis = System.currentTimeMillis()


            val l = getMillFromDate(tvDate.text.toString(), dateFormat)

            if (l != 0L) {
                c.timeInMillis = l
            }

        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)


        val datePickerDialog = DatePickerDialog(mContext, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
            c.set(year, monthOfYear, dayOfMonth)

            val mDate = getDateFromMillis(c.timeInMillis, dateFormat)

            tvDate.text = mDate
        }, year, month, day)


        datePickerDialog.show()
    }


    //    public static void showDateTimePickerDialog(Context context,final TextView tvDateTime,final String mDateTimeFormatmDateTimeFormat)
    //    {
    //        final AlertDialog alertDialog = new AlertDialog.Builder(context).create();
    //        View view = LayoutInflater.from(context).inflate(R.layout.dialog_date_time, null);
    //        alertDialog.setView(view);
    //
    //        final TabLayout tabLayout = (TabLayout) view.findViewById(R.id.tabLayout);
    //        final DatePicker datePicker = (DatePicker) view.findViewById(R.id.datePicker);
    //        final TimePicker timePicker = (TimePicker) view.findViewById(R.id.timePicker);
    //        final Button btn_ok = (Button) view.findViewById(R.id.btn_ok);
    //        final Button btn_cancel = (Button) view.findViewById(R.id.btn_cancel);
    //
    //        tabLayout.addTab(tabLayout.newTab().setText("Date"));
    //        tabLayout.addTab(tabLayout.newTab().setText("Time"));
    //
    //        tabLayout.getTabAt(0).select();
    //        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
    //            @Override
    //            public void onTabSelected(TabLayout.Tab tab) {
    //                if (tab.getPosition()==0)
    //                {
    //                    datePicker.setVisibility(View.VISIBLE);
    //                    timePicker.setVisibility(View.INVISIBLE);
    //                }
    //                else {
    //                    datePicker.setVisibility(View.INVISIBLE);
    //                    timePicker.setVisibility(View.VISIBLE);
    //                }
    //            }
    //
    //            @Override
    //            public void onTabUnselected(TabLayout.Tab tab) {
    //
    //            }
    //
    //            @Override
    //            public void onTabReselected(TabLayout.Tab tab) {
    //
    //            }
    //        });
    //
    //        final Calendar calendar = Calendar.getInstance();
    //        if (ValidationUtil.isRequiredField(tvDateTime.getText().toString()))
    //        {
    //            long l = DateUtil.getMillFromDate(tvDateTime.getText().toString(), mDateTimeFormatmDateTimeFormat);
    //
    //            if (l != 0)
    //            {
    //                calendar.setTimeInMillis(l);
    //            }
    //
    //        }
    //
    //        datePicker.updateDate(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH));
    //        timePicker.setIs24HourView(false);
    //        timePicker.setCurrentHour(calendar.get(Calendar.HOUR_OF_DAY));
    //        timePicker.setCurrentMinute(calendar.get(Calendar.MINUTE));
    //
    //        btn_cancel.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //                alertDialog.dismiss();
    //            }
    //        });
    //
    //        btn_ok.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //
    //                if (tabLayout.getSelectedTabPosition()==0)
    //                {
    //                    tabLayout.getTabAt(1).select();
    //                }
    //                else {
    //
    //                    calendar.set(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), timePicker.getCurrentHour(), timePicker.getCurrentMinute());
    //
    //                    tvDateTime.setText(DateUtil.getDateFromMillis("" + calendar.getTime().getTime(), mDateTimeFormatmDateTimeFormat));
    //                    Methods.syso("" + calendar.getTime().toString());
    //
    //                    alertDialog.dismiss();
    //                }
    //
    //            }
    //        });
    //
    // /*
    //        builder.setPositiveButton(context.getResources().getString(android.R.string.ok), new DialogInterface.OnClickListener() {
    //            @Override
    //            public void onClick(DialogInterface dialog, int which) {
    //
    //
    //                calendar.set(datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth(), timePicker.getCurrentHour(), timePicker.getCurrentMinute());
    //
    //                tvDateTime.setText(DateUtil.getDateFromMillis("" + calendar.getTime().getTime(), mDateTimeFormatmDateTimeFormat));
    //                Methods.syso("" + calendar.getTime().toString());
    //
    //            }
    //        });*/
    //
    //
    //
    //        alertDialog.show();
    //    }


    fun getTimeAgo(time: Long): String {
        var time = time
        if (time < 1000000000000L) {
            // if timestamp given in seconds, convert to millis
            time *= 1000
        }

        val calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"))

        val calendarCurrent = Calendar.getInstance(TimeZone.getTimeZone("GMT"))
        calendarCurrent.timeInMillis = System.currentTimeMillis()
        calendar.timeInMillis = time

        val years = calendarCurrent.get(Calendar.YEAR) - calendar.get(Calendar.YEAR)
        val months = calendarCurrent.get(Calendar.MONTH) - calendar.get(Calendar.MONTH)
        //        int weeks    = calendarCurrent.get(Calendar.WEEK_OF_YEAR) - calendar.get(Calendar.WEEK_OF_YEAR);
        val days = calendarCurrent.get(Calendar.DAY_OF_MONTH) - calendar.get(Calendar.DAY_OF_MONTH)
        val hours = calendarCurrent.get(Calendar.HOUR) - calendar.get(Calendar.HOUR)
        val minutes = calendarCurrent.get(Calendar.MINUTE) - calendar.get(Calendar.MINUTE)
        val seconds = calendarCurrent.get(Calendar.SECOND) - calendar.get(Calendar.SECOND)

        /*   int days     = calendar.get(Calendar.DAY_OF_MONTH);
        int months   = calendar.get(Calendar.MONTH);
        int years    = calendar.get(Calendar.YEAR);
        int hours    = calendar.get(Calendar.HOUR);
        int minutes  = calendar.get(Calendar.MINUTE);
        int seconds  = calendar.get(Calendar.SECOND);*/

        var duration = ""

        if (years == 1) {
            duration = years.toString() + " YEAR AGO"//[NSString stringWithFormat:@"%ld y",(long)years];
        } else if (years > 1) {
            duration = years.toString() + " YEARS AGO"//[NSString stringWithFormat:@"%ld y",(long)years];
        } else if (months == 1) {
            duration = months.toString() + " MONTH AGO"//[NSString stringWithFormat:@"%ld m",(long)months];
        } else if (months > 1) {
            duration = months.toString() + " MONTHS AGO"//[NSString stringWithFormat:@"%ld m",(long)months];
        } else if (days == 7) {
            duration = "1" + " WEEK AGO"
        } else if (days > 7) {
            duration = Math.ceil((days.toFloat() / 7).toDouble()).toInt().toString() + " WEEKS AGO"
        } else if (days == 1) {
            duration = days.toString() + " DAY AGO"//[NSString stringWithFormat:@"%ld d",(long)days];
        } else if (days > 1) {
            duration = days.toString() + " DAYS AGO"//[NSString stringWithFormat:@"%ld d",(long)days];
        } else if (hours == 1) {
            duration = hours.toString() + " HOUR AGO"//[NSString stringWithFormat:@"%ld h",(long)hours];
        } else if (hours > 1) {
            duration = hours.toString() + " HOURS AGO"//[NSString stringWithFormat:@"%ld h",(long)hours];
        } else if (minutes == 1) {
            duration = minutes.toString() + " MINUTE AGO"//[NSString stringWithFormat:@"%ld m",(long)minutes];
        } else if (minutes > 1) {
            duration = minutes.toString() + " MINUTES AGO"//[NSString stringWithFormat:@"%ld m",(long)minutes];
        } else {
            if (seconds <= 1) {
                duration = "NOW"//[NSString stringWithFormat:@"Now"];
            } else {
                duration = seconds.toString() + " SEC. AGO"//[NSString stringWithFormat:@"%ld s",(long)seconds];
            }
        }
        return duration

    }

    //1 minute = 60 seconds
    //1 hour = 60 x 60 = 3600
    //1 day = 3600 x 24 = 86400
    //    public int  dateDifferentInDays(Date startDate, Date endDate){
    fun dateDifferentInDays(startDate1: Long, endDate1: Long): Int {

        val calendar1 = Calendar.getInstance()
        calendar1.timeInMillis = startDate1
        val calendar2 = Calendar.getInstance()
        calendar2.timeInMillis = endDate1

        val startDate = calendar1.time
        val endDate = calendar2.time

        //milliseconds
        val different = endDate.time - startDate.time

        val secondsInMilli: Long = 1000
        val minutesInMilli = secondsInMilli * 60
        val hoursInMilli = minutesInMilli * 60
        val daysInMilli = hoursInMilli * 24

        val elapsedDays = different / daysInMilli
        //        different = different % daysInMilli;

        /* long elapsedHours = different / hoursInMilli;
        different = different % hoursInMilli;

        long elapsedMinutes = different / minutesInMilli;
        different = different % minutesInMilli;

        long elapsedSeconds = different / secondsInMilli;*/
        return elapsedDays.toInt()
    }
}