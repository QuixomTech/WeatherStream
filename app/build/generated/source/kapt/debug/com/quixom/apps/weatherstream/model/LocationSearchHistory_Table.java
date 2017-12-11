package com.quixom.apps.weatherstream.model;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.OperatorGroup;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.structure.database.FlowCursor;
import java.lang.Class;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class LocationSearchHistory_Table extends ModelAdapter<LocationSearchHistory> {
  /**
   * Primary Key */
  public static final Property<Long> id = new Property<Long>(LocationSearchHistory.class, "id");

  public static final Property<String> cityName = new Property<String>(LocationSearchHistory.class, "cityName");

  public static final Property<String> countyName = new Property<String>(LocationSearchHistory.class, "countyName");

  public static final Property<Integer> weatherType = new Property<Integer>(LocationSearchHistory.class, "weatherType");

  public static final Property<Double> temperature = new Property<Double>(LocationSearchHistory.class, "temperature");

  public static final Property<Double> lat = new Property<Double>(LocationSearchHistory.class, "lat");

  public static final Property<Double> lon = new Property<Double>(LocationSearchHistory.class, "lon");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,cityName,countyName,weatherType,temperature,lat,lon};

  public LocationSearchHistory_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<LocationSearchHistory> getModelClass() {
    return LocationSearchHistory.class;
  }

  @Override
  public final String getTableName() {
    return "`LocationSearchHistory`";
  }

  @Override
  public final LocationSearchHistory newInstance() {
    return new LocationSearchHistory();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`cityName`":  {
        return cityName;
      }
      case "`countyName`":  {
        return countyName;
      }
      case "`weatherType`":  {
        return weatherType;
      }
      case "`temperature`":  {
        return temperature;
      }
      case "`lat`":  {
        return lat;
      }
      case "`lon`":  {
        return lon;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, LocationSearchHistory model) {
    values.put("`id`", model.getId());
    values.put("`cityName`", model.getCityName());
    values.put("`countyName`", model.getCountyName());
    values.put("`weatherType`", model.getWeatherType());
    values.put("`temperature`", model.getTemperature());
    values.put("`lat`", model.getLat());
    values.put("`lon`", model.getLon());
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, LocationSearchHistory model,
      int start) {
    statement.bindNumberOrNull(1 + start, model.getId());
    statement.bindStringOrNull(2 + start, model.getCityName());
    statement.bindStringOrNull(3 + start, model.getCountyName());
    statement.bindNumberOrNull(4 + start, model.getWeatherType());
    statement.bindDoubleOrNull(5 + start, model.getTemperature());
    statement.bindDoubleOrNull(6 + start, model.getLat());
    statement.bindDoubleOrNull(7 + start, model.getLon());
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement,
      LocationSearchHistory model) {
    statement.bindNumberOrNull(1, model.getId());
    statement.bindStringOrNull(2, model.getCityName());
    statement.bindStringOrNull(3, model.getCountyName());
    statement.bindNumberOrNull(4, model.getWeatherType());
    statement.bindDoubleOrNull(5, model.getTemperature());
    statement.bindDoubleOrNull(6, model.getLat());
    statement.bindDoubleOrNull(7, model.getLon());
    statement.bindNumberOrNull(8, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement,
      LocationSearchHistory model) {
    statement.bindNumberOrNull(1, model.getId());
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `LocationSearchHistory`(`id`,`cityName`,`countyName`,`weatherType`,`temperature`,`lat`,`lon`) VALUES (?,?,?,?,?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `LocationSearchHistory` SET `id`=?,`cityName`=?,`countyName`=?,`weatherType`=?,`temperature`=?,`lat`=?,`lon`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `LocationSearchHistory` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `LocationSearchHistory`(`id` INTEGER, `cityName` TEXT, `countyName` TEXT, `weatherType` INTEGER, `temperature` REAL, `lat` REAL, `lon` REAL, PRIMARY KEY(`id`))";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, LocationSearchHistory model) {
    model.setId(cursor.getLongOrDefault("id", null));
    model.setCityName(cursor.getStringOrDefault("cityName"));
    model.setCountyName(cursor.getStringOrDefault("countyName"));
    model.setWeatherType(cursor.getIntOrDefault("weatherType", null));
    model.setTemperature(cursor.getDoubleOrDefault("temperature", null));
    model.setLat(cursor.getDoubleOrDefault("lat", null));
    model.setLon(cursor.getDoubleOrDefault("lon", null));
  }

  @Override
  public final boolean exists(LocationSearchHistory model, DatabaseWrapper wrapper) {
    return SQLite.selectCountOf()
    .from(LocationSearchHistory.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(LocationSearchHistory model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
