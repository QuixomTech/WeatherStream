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
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Wind_Table extends ModelAdapter<WeatherData.Wind> {
  /**
   * Primary Key AutoIncrement */
  public static final Property<Integer> id = new Property<Integer>(WeatherData.Wind.class, "id");

  public static final Property<String> speed = new Property<String>(WeatherData.Wind.class, "speed");

  public static final Property<String> deg = new Property<String>(WeatherData.Wind.class, "deg");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,speed,deg};

  public Wind_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherData.Wind> getModelClass() {
    return WeatherData.Wind.class;
  }

  @Override
  public final String getTableName() {
    return "`WindWeather`";
  }

  @Override
  public final WeatherData.Wind newInstance() {
    return new WeatherData.Wind();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`speed`":  {
        return speed;
      }
      case "`deg`":  {
        return deg;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(WeatherData.Wind model, Number id) {
    model.setId(id.intValue());
  }

  @Override
  public final Number getAutoIncrementingId(WeatherData.Wind model) {
    return model.getId();
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final ModelSaver<WeatherData.Wind> createSingleModelSaver() {
    return new AutoIncrementModelSaver<>();
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, WeatherData.Wind model) {
    values.put("`speed`", model.getSpeed());
    values.put("`deg`", model.getDeg());
  }

  @Override
  public final void bindToContentValues(ContentValues values, WeatherData.Wind model) {
    values.put("`id`", model.getId());
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, WeatherData.Wind model,
      int start) {
    statement.bindStringOrNull(1 + start, model.getSpeed());
    statement.bindStringOrNull(2 + start, model.getDeg());
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, WeatherData.Wind model) {
    int start = 0;
    statement.bindNumberOrNull(1 + start, model.getId());
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, WeatherData.Wind model) {
    statement.bindNumberOrNull(1, model.getId());
    statement.bindStringOrNull(2, model.getSpeed());
    statement.bindStringOrNull(3, model.getDeg());
    statement.bindNumberOrNull(4, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, WeatherData.Wind model) {
    statement.bindNumberOrNull(1, model.getId());
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `WindWeather`(`speed`,`deg`) VALUES (?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `WindWeather`(`id`,`speed`,`deg`) VALUES (?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `WindWeather` SET `id`=?,`speed`=?,`deg`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `WindWeather` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `WindWeather`(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `speed` TEXT, `deg` TEXT)";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherData.Wind model) {
    model.setId(cursor.getIntOrDefault("id", null));
    model.setSpeed(cursor.getStringOrDefault("speed"));
    model.setDeg(cursor.getStringOrDefault("deg"));
  }

  @Override
  public final boolean exists(WeatherData.Wind model, DatabaseWrapper wrapper) {
    return (model.getId() != null && model.getId() > 0 || model.getId() == null)
    && SQLite.selectCountOf()
    .from(WeatherData.Wind.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherData.Wind model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
