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
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class WeatherForecastData_Table extends ModelAdapter<WeatherForecastData> {
  /**
   * Primary Key */
  public static final Property<Long> id = new Property<Long>(WeatherForecastData.class, "id");

  public static final Property<String> message = new Property<String>(WeatherForecastData.class, "message");

  public static final Property<Long> cnt = new Property<Long>(WeatherForecastData.class, "cnt");

  public static final Property<String> cod = new Property<String>(WeatherForecastData.class, "cod");

  public static final Property<Long> dt = new Property<Long>(WeatherForecastData.class, "dt");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,message,cnt,cod,dt};

  public WeatherForecastData_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherForecastData> getModelClass() {
    return WeatherForecastData.class;
  }

  @Override
  public final String getTableName() {
    return "`WeatherForecast`";
  }

  @Override
  public final WeatherForecastData newInstance() {
    return new WeatherForecastData();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`message`":  {
        return message;
      }
      case "`cnt`":  {
        return cnt;
      }
      case "`cod`":  {
        return cod;
      }
      case "`dt`":  {
        return dt;
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
  public final void bindToInsertValues(ContentValues values, WeatherForecastData model) {
    values.put("`id`", model.getId());
    values.put("`message`", model.getMessage());
    values.put("`cnt`", model.getCnt());
    values.put("`cod`", model.getCod());
    values.put("`dt`", model.getDt());
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, WeatherForecastData model,
      int start) {
    statement.bindNumberOrNull(1 + start, model.getId());
    statement.bindStringOrNull(2 + start, model.getMessage());
    statement.bindNumberOrNull(3 + start, model.getCnt());
    statement.bindStringOrNull(4 + start, model.getCod());
    statement.bindNumberOrNull(5 + start, model.getDt());
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, WeatherForecastData model) {
    statement.bindNumberOrNull(1, model.getId());
    statement.bindStringOrNull(2, model.getMessage());
    statement.bindNumberOrNull(3, model.getCnt());
    statement.bindStringOrNull(4, model.getCod());
    statement.bindNumberOrNull(5, model.getDt());
    statement.bindNumberOrNull(6, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, WeatherForecastData model) {
    statement.bindNumberOrNull(1, model.getId());
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `WeatherForecast`(`id`,`message`,`cnt`,`cod`,`dt`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `WeatherForecast` SET `id`=?,`message`=?,`cnt`=?,`cod`=?,`dt`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `WeatherForecast` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `WeatherForecast`(`id` INTEGER, `message` TEXT, `cnt` INTEGER, `cod` TEXT, `dt` INTEGER, PRIMARY KEY(`id`))";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherForecastData model) {
    model.setId(cursor.getLongOrDefault("id", null));
    model.setMessage(cursor.getStringOrDefault("message"));
    model.setCnt(cursor.getLongOrDefault("cnt", null));
    model.setCod(cursor.getStringOrDefault("cod"));
    model.setDt(cursor.getLongOrDefault("dt", null));
  }

  @Override
  public final boolean exists(WeatherForecastData model, DatabaseWrapper wrapper) {
    return SQLite.selectCountOf()
    .from(WeatherForecastData.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherForecastData model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
