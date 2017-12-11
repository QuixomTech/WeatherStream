package com.raizlabs.android.dbflow.config;

import com.quixom.apps.weatherstream.dbconfig.WeatherStreamDB;
import com.quixom.apps.weatherstream.model.Clouds_Table;
import com.quixom.apps.weatherstream.model.Coord_Table;
import com.quixom.apps.weatherstream.model.ForecastList_Table;
import com.quixom.apps.weatherstream.model.LocationSearchHistory_Table;
import com.quixom.apps.weatherstream.model.Main_Table;
import com.quixom.apps.weatherstream.model.Rain_Table;
import com.quixom.apps.weatherstream.model.Sys_Table;
import com.quixom.apps.weatherstream.model.WeatherData_Table;
import com.quixom.apps.weatherstream.model.WeatherForecastData_Table;
import com.quixom.apps.weatherstream.model.Weather_Table;
import com.quixom.apps.weatherstream.model.Wind_Table;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class WeatherStreamDBWeatherStreamDB_Database extends DatabaseDefinition {
  public WeatherStreamDBWeatherStreamDB_Database(DatabaseHolder holder) {
    addModelAdapter(new Clouds_Table(this), holder);
    addModelAdapter(new Coord_Table(this), holder);
    addModelAdapter(new ForecastList_Table(this), holder);
    addModelAdapter(new LocationSearchHistory_Table(this), holder);
    addModelAdapter(new Main_Table(this), holder);
    addModelAdapter(new Rain_Table(this), holder);
    addModelAdapter(new Sys_Table(this), holder);
    addModelAdapter(new WeatherData_Table(this), holder);
    addModelAdapter(new WeatherForecastData_Table(this), holder);
    addModelAdapter(new Weather_Table(this), holder);
    addModelAdapter(new Wind_Table(this), holder);
  }

  @Override
  public final Class<?> getAssociatedDatabaseClassFile() {
    return WeatherStreamDB.class;
  }

  @Override
  public final boolean isForeignKeysSupported() {
    return false;
  }

  @Override
  public final boolean backupEnabled() {
    return false;
  }

  @Override
  public final boolean areConsistencyChecksEnabled() {
    return false;
  }

  @Override
  public final int getDatabaseVersion() {
    return 1;
  }

  @Override
  public final String getDatabaseName() {
    return "WeatherStream";
  }
}
