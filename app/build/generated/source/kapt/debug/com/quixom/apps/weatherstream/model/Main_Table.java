package com.quixom.apps.weatherstream.model;

import android.content.ContentValues;
import com.raizlabs.android.dbflow.config.DatabaseDefinition;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.OperatorGroup;
import com.raizlabs.android.dbflow.sql.language.SQLite;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import com.raizlabs.android.dbflow.sql.saveable.AutoIncrementModelSaver;
import com.raizlabs.android.dbflow.sql.saveable.ModelSaver;
import com.raizlabs.android.dbflow.structure.ModelAdapter;
import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.structure.database.FlowCursor;
import java.lang.Class;
import java.lang.Double;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Main_Table extends ModelAdapter<WeatherData.Main> {
  /**
   * Primary Key AutoIncrement */
  public static final Property<Integer> id = new Property<Integer>(WeatherData.Main.class, "id");

  public static final Property<String> humidity = new Property<String>(WeatherData.Main.class, "humidity");

  public static final Property<String> pressure = new Property<String>(WeatherData.Main.class, "pressure");

  public static final Property<String> temp_max = new Property<String>(WeatherData.Main.class, "temp_max");

  public static final Property<String> temp_min = new Property<String>(WeatherData.Main.class, "temp_min");

  public static final Property<String> temp = new Property<String>(WeatherData.Main.class, "temp");

  public static final Property<Double> sea_level = new Property<Double>(WeatherData.Main.class, "sea_level");

  public static final Property<Double> grnd_level = new Property<Double>(WeatherData.Main.class, "grnd_level");

  public static final Property<Double> temp_kf = new Property<Double>(WeatherData.Main.class, "temp_kf");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,humidity,pressure,temp_max,temp_min,temp,sea_level,grnd_level,temp_kf};

  public Main_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherData.Main> getModelClass() {
    return WeatherData.Main.class;
  }

  @Override
  public final String getTableName() {
    return "`MainWeather`";
  }

  @Override
  public final WeatherData.Main newInstance() {
    return new WeatherData.Main();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`humidity`":  {
        return humidity;
      }
      case "`pressure`":  {
        return pressure;
      }
      case "`temp_max`":  {
        return temp_max;
      }
      case "`temp_min`":  {
        return temp_min;
      }
      case "`temp`":  {
        return temp;
      }
      case "`sea_level`":  {
        return sea_level;
      }
      case "`grnd_level`":  {
        return grnd_level;
      }
      case "`temp_kf`":  {
        return temp_kf;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(WeatherData.Main model, Number id) {
    model.setId(id.intValue());
  }

  @Override
  public final Number getAutoIncrementingId(WeatherData.Main model) {
    return model.getId();
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final ModelSaver<WeatherData.Main> createSingleModelSaver() {
    return new AutoIncrementModelSaver<>();
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, WeatherData.Main model) {
    values.put("`humidity`", model.getHumidity());
    values.put("`pressure`", model.getPressure());
    values.put("`temp_max`", model.getTemp_max());
    values.put("`temp_min`", model.getTemp_min());
    values.put("`temp`", model.getTemp());
    values.put("`sea_level`", model.getSea_level());
    values.put("`grnd_level`", model.getGrnd_level());
    values.put("`temp_kf`", model.getTemp_kf());
  }

  @Override
  public final void bindToContentValues(ContentValues values, WeatherData.Main model) {
    values.put("`id`", model.getId());
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, WeatherData.Main model,
      int start) {
    statement.bindStringOrNull(1 + start, model.getHumidity());
    statement.bindStringOrNull(2 + start, model.getPressure());
    statement.bindStringOrNull(3 + start, model.getTemp_max());
    statement.bindStringOrNull(4 + start, model.getTemp_min());
    statement.bindStringOrNull(5 + start, model.getTemp());
    statement.bindDoubleOrNull(6 + start, model.getSea_level());
    statement.bindDoubleOrNull(7 + start, model.getGrnd_level());
    statement.bindDoubleOrNull(8 + start, model.getTemp_kf());
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, WeatherData.Main model) {
    int start = 0;
    statement.bindNumberOrNull(1 + start, model.getId());
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, WeatherData.Main model) {
    statement.bindNumberOrNull(1, model.getId());
    statement.bindStringOrNull(2, model.getHumidity());
    statement.bindStringOrNull(3, model.getPressure());
    statement.bindStringOrNull(4, model.getTemp_max());
    statement.bindStringOrNull(5, model.getTemp_min());
    statement.bindStringOrNull(6, model.getTemp());
    statement.bindDoubleOrNull(7, model.getSea_level());
    statement.bindDoubleOrNull(8, model.getGrnd_level());
    statement.bindDoubleOrNull(9, model.getTemp_kf());
    statement.bindNumberOrNull(10, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, WeatherData.Main model) {
    statement.bindNumberOrNull(1, model.getId());
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `MainWeather`(`humidity`,`pressure`,`temp_max`,`temp_min`,`temp`,`sea_level`,`grnd_level`,`temp_kf`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `MainWeather`(`id`,`humidity`,`pressure`,`temp_max`,`temp_min`,`temp`,`sea_level`,`grnd_level`,`temp_kf`) VALUES (?,?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `MainWeather` SET `id`=?,`humidity`=?,`pressure`=?,`temp_max`=?,`temp_min`=?,`temp`=?,`sea_level`=?,`grnd_level`=?,`temp_kf`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `MainWeather` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `MainWeather`(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `humidity` TEXT, `pressure` TEXT, `temp_max` TEXT, `temp_min` TEXT, `temp` TEXT, `sea_level` REAL, `grnd_level` REAL, `temp_kf` REAL)";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherData.Main model) {
    model.setId(cursor.getIntOrDefault("id", null));
    model.setHumidity(cursor.getStringOrDefault("humidity"));
    model.setPressure(cursor.getStringOrDefault("pressure"));
    model.setTemp_max(cursor.getStringOrDefault("temp_max"));
    model.setTemp_min(cursor.getStringOrDefault("temp_min"));
    model.setTemp(cursor.getStringOrDefault("temp"));
    model.setSea_level(cursor.getDoubleOrDefault("sea_level", null));
    model.setGrnd_level(cursor.getDoubleOrDefault("grnd_level", null));
    model.setTemp_kf(cursor.getDoubleOrDefault("temp_kf", null));
  }

  @Override
  public final boolean exists(WeatherData.Main model, DatabaseWrapper wrapper) {
    return (model.getId() != null && model.getId() > 0 || model.getId() == null)
    && SQLite.selectCountOf()
    .from(WeatherData.Main.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherData.Main model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
