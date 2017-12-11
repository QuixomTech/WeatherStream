package com.raizlabs.android.dbflow.config;

import com.raizlabs.android.dbflow.converter.BigDecimalConverter;
import com.raizlabs.android.dbflow.converter.BigIntegerConverter;
import com.raizlabs.android.dbflow.converter.BooleanConverter;
import com.raizlabs.android.dbflow.converter.CalendarConverter;
import com.raizlabs.android.dbflow.converter.CharConverter;
import com.raizlabs.android.dbflow.converter.DateConverter;
import com.raizlabs.android.dbflow.converter.SqlDateConverter;
import com.raizlabs.android.dbflow.converter.UUIDConverter;
import java.lang.Boolean;
import java.lang.Character;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.UUID;

public final class GeneratedDatabaseHolder extends DatabaseHolder {
  public GeneratedDatabaseHolder() {
    typeConverters.put(Boolean.class, new BooleanConverter());
    typeConverters.put(Character.class, new CharConverter());
    typeConverters.put(BigDecimal.class, new BigDecimalConverter());
    typeConverters.put(BigInteger.class, new BigIntegerConverter());
    typeConverters.put(Date.class, new SqlDateConverter());
    typeConverters.put(Time.class, new SqlDateConverter());
    typeConverters.put(Timestamp.class, new SqlDateConverter());
    typeConverters.put(Calendar.class, new CalendarConverter());
    typeConverters.put(GregorianCalendar.class, new CalendarConverter());
    typeConverters.put(java.util.Date.class, new DateConverter());
    typeConverters.put(UUID.class, new UUIDConverter());
    new WeatherStreamDBWeatherStreamDB_Database(this);
  }
}
