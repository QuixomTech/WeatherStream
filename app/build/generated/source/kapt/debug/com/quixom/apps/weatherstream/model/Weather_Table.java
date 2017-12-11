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
public final class Weather_Table extends ModelAdapter<WeatherData.Weather> {
  /**
   * Primary Key AutoIncrement */
  public static final Property<Integer> wId = new Property<Integer>(WeatherData.Weather.class, "wId");

  public static final Property<Integer> id = new Property<Integer>(WeatherData.Weather.class, "id");

  public static final Property<String> icon = new Property<String>(WeatherData.Weather.class, "icon");

  public static final Property<String> description = new Property<String>(WeatherData.Weather.class, "description");

  public static final Property<String> main = new Property<String>(WeatherData.Weather.class, "main");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{wId,id,icon,description,main};

  public Weather_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherData.Weather> getModelClass() {
    return WeatherData.Weather.class;
  }

  @Override
  public final String getTableName() {
    return "`WeatherDescription`";
  }

  @Override
  public final WeatherData.Weather newInstance() {
    return new WeatherData.Weather();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`wId`":  {
        return wId;
      }
      case "`id`":  {
        return id;
      }
      case "`icon`":  {
        return icon;
      }
      case "`description`":  {
        return description;
      }
      case "`main`":  {
        return main;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(WeatherData.Weather model, Number id) {
    model.setWId(id.intValue());
  }

  @Override
  public final Number getAutoIncrementingId(WeatherData.Weather model) {
    return model.getWId();
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "wId";
  }

  @Override
  public final ModelSaver<WeatherData.Weather> createSingleModelSaver() {
    return new AutoIncrementModelSaver<>();
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, WeatherData.Weather model) {
    values.put("`id`", model.getId());
    values.put("`icon`", model.getIcon());
    values.put("`description`", model.getDescription());
    values.put("`main`", model.getMain());
  }

  @Override
  public final void bindToContentValues(ContentValues values, WeatherData.Weather model) {
    values.put("`wId`", model.getWId());
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, WeatherData.Weather model,
      int start) {
    statement.bindNumberOrNull(1 + start, model.getId());
    statement.bindStringOrNull(2 + start, model.getIcon());
    statement.bindStringOrNull(3 + start, model.getDescription());
    statement.bindStringOrNull(4 + start, model.getMain());
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, WeatherData.Weather model) {
    int start = 0;
    statement.bindNumberOrNull(1 + start, model.getWId());
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, WeatherData.Weather model) {
    statement.bindNumberOrNull(1, model.getWId());
    statement.bindNumberOrNull(2, model.getId());
    statement.bindStringOrNull(3, model.getIcon());
    statement.bindStringOrNull(4, model.getDescription());
    statement.bindStringOrNull(5, model.getMain());
    statement.bindNumberOrNull(6, model.getWId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, WeatherData.Weather model) {
    statement.bindNumberOrNull(1, model.getWId());
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `WeatherDescription`(`id`,`icon`,`description`,`main`) VALUES (?,?,?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `WeatherDescription`(`wId`,`id`,`icon`,`description`,`main`) VALUES (?,?,?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `WeatherDescription` SET `wId`=?,`id`=?,`icon`=?,`description`=?,`main`=? WHERE `wId`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `WeatherDescription` WHERE `wId`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `WeatherDescription`(`wId` INTEGER PRIMARY KEY AUTOINCREMENT, `id` INTEGER, `icon` TEXT, `description` TEXT, `main` TEXT)";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherData.Weather model) {
    model.setWId(cursor.getIntOrDefault("wId", null));
    model.setId(cursor.getIntOrDefault("id", null));
    model.setIcon(cursor.getStringOrDefault("icon"));
    model.setDescription(cursor.getStringOrDefault("description"));
    model.setMain(cursor.getStringOrDefault("main"));
  }

  @Override
  public final boolean exists(WeatherData.Weather model, DatabaseWrapper wrapper) {
    return (model.getWId() != null && model.getWId() > 0 || model.getWId() == null)
    && SQLite.selectCountOf()
    .from(WeatherData.Weather.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherData.Weather model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(wId.eq(model.getWId()));
    return clause;
  }
}
