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
public final class Coord_Table extends ModelAdapter<WeatherData.Coord> {
  /**
   * Primary Key AutoIncrement */
  public static final Property<Integer> id = new Property<Integer>(WeatherData.Coord.class, "id");

  public static final Property<Double> lon = new Property<Double>(WeatherData.Coord.class, "lon");

  public static final Property<Double> lat = new Property<Double>(WeatherData.Coord.class, "lat");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,lon,lat};

  public Coord_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherData.Coord> getModelClass() {
    return WeatherData.Coord.class;
  }

  @Override
  public final String getTableName() {
    return "`CoordWeather`";
  }

  @Override
  public final WeatherData.Coord newInstance() {
    return new WeatherData.Coord();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`lon`":  {
        return lon;
      }
      case "`lat`":  {
        return lat;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(WeatherData.Coord model, Number id) {
    model.setId(id.intValue());
  }

  @Override
  public final Number getAutoIncrementingId(WeatherData.Coord model) {
    return model.getId();
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final ModelSaver<WeatherData.Coord> createSingleModelSaver() {
    return new AutoIncrementModelSaver<>();
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, WeatherData.Coord model) {
    values.put("`lon`", model.getLon());
    values.put("`lat`", model.getLat());
  }

  @Override
  public final void bindToContentValues(ContentValues values, WeatherData.Coord model) {
    values.put("`id`", model.getId());
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, WeatherData.Coord model,
      int start) {
    statement.bindDoubleOrNull(1 + start, model.getLon());
    statement.bindDoubleOrNull(2 + start, model.getLat());
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, WeatherData.Coord model) {
    int start = 0;
    statement.bindNumberOrNull(1 + start, model.getId());
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, WeatherData.Coord model) {
    statement.bindNumberOrNull(1, model.getId());
    statement.bindDoubleOrNull(2, model.getLon());
    statement.bindDoubleOrNull(3, model.getLat());
    statement.bindNumberOrNull(4, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, WeatherData.Coord model) {
    statement.bindNumberOrNull(1, model.getId());
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `CoordWeather`(`lon`,`lat`) VALUES (?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `CoordWeather`(`id`,`lon`,`lat`) VALUES (?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `CoordWeather` SET `id`=?,`lon`=?,`lat`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `CoordWeather` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `CoordWeather`(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `lon` REAL, `lat` REAL)";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherData.Coord model) {
    model.setId(cursor.getIntOrDefault("id", null));
    model.setLon(cursor.getDoubleOrDefault("lon", null));
    model.setLat(cursor.getDoubleOrDefault("lat", null));
  }

  @Override
  public final boolean exists(WeatherData.Coord model, DatabaseWrapper wrapper) {
    return (model.getId() != null && model.getId() > 0 || model.getId() == null)
    && SQLite.selectCountOf()
    .from(WeatherData.Coord.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherData.Coord model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
