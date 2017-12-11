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
public final class Clouds_Table extends ModelAdapter<WeatherData.Clouds> {
  /**
   * Primary Key AutoIncrement */
  public static final Property<Integer> id = new Property<Integer>(WeatherData.Clouds.class, "id");

  public static final Property<Integer> all = new Property<Integer>(WeatherData.Clouds.class, "all");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,all};

  public Clouds_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherData.Clouds> getModelClass() {
    return WeatherData.Clouds.class;
  }

  @Override
  public final String getTableName() {
    return "`CloudsWeather`";
  }

  @Override
  public final WeatherData.Clouds newInstance() {
    return new WeatherData.Clouds();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`all`":  {
        return all;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(WeatherData.Clouds model, Number id) {
    model.setId(id.intValue());
  }

  @Override
  public final Number getAutoIncrementingId(WeatherData.Clouds model) {
    return model.getId();
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final ModelSaver<WeatherData.Clouds> createSingleModelSaver() {
    return new AutoIncrementModelSaver<>();
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, WeatherData.Clouds model) {
    values.put("`all`", model.getAll());
  }

  @Override
  public final void bindToContentValues(ContentValues values, WeatherData.Clouds model) {
    values.put("`id`", model.getId());
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, WeatherData.Clouds model,
      int start) {
    statement.bindNumberOrNull(1 + start, model.getAll());
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, WeatherData.Clouds model) {
    int start = 0;
    statement.bindNumberOrNull(1 + start, model.getId());
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, WeatherData.Clouds model) {
    statement.bindNumberOrNull(1, model.getId());
    statement.bindNumberOrNull(2, model.getAll());
    statement.bindNumberOrNull(3, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, WeatherData.Clouds model) {
    statement.bindNumberOrNull(1, model.getId());
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `CloudsWeather`(`all`) VALUES (?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `CloudsWeather`(`id`,`all`) VALUES (?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `CloudsWeather` SET `id`=?,`all`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `CloudsWeather` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `CloudsWeather`(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `all` INTEGER)";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherData.Clouds model) {
    model.setId(cursor.getIntOrDefault("id", null));
    model.setAll(cursor.getIntOrDefault("all", null));
  }

  @Override
  public final boolean exists(WeatherData.Clouds model, DatabaseWrapper wrapper) {
    return (model.getId() != null && model.getId() > 0 || model.getId() == null)
    && SQLite.selectCountOf()
    .from(WeatherData.Clouds.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherData.Clouds model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
