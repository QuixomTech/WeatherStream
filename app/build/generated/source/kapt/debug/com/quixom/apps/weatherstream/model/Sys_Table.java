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
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Sys_Table extends ModelAdapter<WeatherData.Sys> {
  /**
   * Primary Key AutoIncrement */
  public static final Property<Integer> sysId = new Property<Integer>(WeatherData.Sys.class, "sysId");

  public static final Property<String> message = new Property<String>(WeatherData.Sys.class, "message");

  public static final Property<Integer> id = new Property<Integer>(WeatherData.Sys.class, "id");

  public static final Property<Long> sunset = new Property<Long>(WeatherData.Sys.class, "sunset");

  public static final Property<Long> sunrise = new Property<Long>(WeatherData.Sys.class, "sunrise");

  public static final Property<Integer> type = new Property<Integer>(WeatherData.Sys.class, "type");

  public static final Property<String> country = new Property<String>(WeatherData.Sys.class, "country");

  public static final Property<String> pod = new Property<String>(WeatherData.Sys.class, "pod");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{sysId,message,id,sunset,sunrise,type,country,pod};

  public Sys_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherData.Sys> getModelClass() {
    return WeatherData.Sys.class;
  }

  @Override
  public final String getTableName() {
    return "`SysWeather`";
  }

  @Override
  public final WeatherData.Sys newInstance() {
    return new WeatherData.Sys();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`sysId`":  {
        return sysId;
      }
      case "`message`":  {
        return message;
      }
      case "`id`":  {
        return id;
      }
      case "`sunset`":  {
        return sunset;
      }
      case "`sunrise`":  {
        return sunrise;
      }
      case "`type`":  {
        return type;
      }
      case "`country`":  {
        return country;
      }
      case "`pod`":  {
        return pod;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(WeatherData.Sys model, Number id) {
    model.setSysId(id.intValue());
  }

  @Override
  public final Number getAutoIncrementingId(WeatherData.Sys model) {
    return model.getSysId();
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "sysId";
  }

  @Override
  public final ModelSaver<WeatherData.Sys> createSingleModelSaver() {
    return new AutoIncrementModelSaver<>();
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, WeatherData.Sys model) {
    values.put("`message`", model.getMessage());
    values.put("`id`", model.getId());
    values.put("`sunset`", model.getSunset());
    values.put("`sunrise`", model.getSunrise());
    values.put("`type`", model.getType());
    values.put("`country`", model.getCountry());
    values.put("`pod`", model.getPod());
  }

  @Override
  public final void bindToContentValues(ContentValues values, WeatherData.Sys model) {
    values.put("`sysId`", model.getSysId());
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, WeatherData.Sys model,
      int start) {
    statement.bindStringOrNull(1 + start, model.getMessage());
    statement.bindNumberOrNull(2 + start, model.getId());
    statement.bindNumberOrNull(3 + start, model.getSunset());
    statement.bindNumberOrNull(4 + start, model.getSunrise());
    statement.bindNumberOrNull(5 + start, model.getType());
    statement.bindStringOrNull(6 + start, model.getCountry());
    statement.bindStringOrNull(7 + start, model.getPod());
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, WeatherData.Sys model) {
    int start = 0;
    statement.bindNumberOrNull(1 + start, model.getSysId());
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, WeatherData.Sys model) {
    statement.bindNumberOrNull(1, model.getSysId());
    statement.bindStringOrNull(2, model.getMessage());
    statement.bindNumberOrNull(3, model.getId());
    statement.bindNumberOrNull(4, model.getSunset());
    statement.bindNumberOrNull(5, model.getSunrise());
    statement.bindNumberOrNull(6, model.getType());
    statement.bindStringOrNull(7, model.getCountry());
    statement.bindStringOrNull(8, model.getPod());
    statement.bindNumberOrNull(9, model.getSysId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, WeatherData.Sys model) {
    statement.bindNumberOrNull(1, model.getSysId());
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `SysWeather`(`message`,`id`,`sunset`,`sunrise`,`type`,`country`,`pod`) VALUES (?,?,?,?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `SysWeather`(`sysId`,`message`,`id`,`sunset`,`sunrise`,`type`,`country`,`pod`) VALUES (?,?,?,?,?,?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `SysWeather` SET `sysId`=?,`message`=?,`id`=?,`sunset`=?,`sunrise`=?,`type`=?,`country`=?,`pod`=? WHERE `sysId`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `SysWeather` WHERE `sysId`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `SysWeather`(`sysId` INTEGER PRIMARY KEY AUTOINCREMENT, `message` TEXT, `id` INTEGER, `sunset` INTEGER, `sunrise` INTEGER, `type` INTEGER, `country` TEXT, `pod` TEXT)";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherData.Sys model) {
    model.setSysId(cursor.getIntOrDefault("sysId", null));
    model.setMessage(cursor.getStringOrDefault("message"));
    model.setId(cursor.getIntOrDefault("id", null));
    model.setSunset(cursor.getLongOrDefault("sunset", null));
    model.setSunrise(cursor.getLongOrDefault("sunrise", null));
    model.setType(cursor.getIntOrDefault("type", null));
    model.setCountry(cursor.getStringOrDefault("country"));
    model.setPod(cursor.getStringOrDefault("pod"));
  }

  @Override
  public final boolean exists(WeatherData.Sys model, DatabaseWrapper wrapper) {
    return (model.getSysId() != null && model.getSysId() > 0 || model.getSysId() == null)
    && SQLite.selectCountOf()
    .from(WeatherData.Sys.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherData.Sys model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(sysId.eq(model.getSysId()));
    return clause;
  }
}
