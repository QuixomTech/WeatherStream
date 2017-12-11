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
import java.lang.Long;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class ForecastList_Table extends ModelAdapter<WeatherForecastData.ForecastList> {
  /**
   * Primary Key AutoIncrement */
  public static final Property<Long> id = new Property<Long>(WeatherForecastData.ForecastList.class, "id");

  public static final Property<Long> dt = new Property<Long>(WeatherForecastData.ForecastList.class, "dt");

  public static final Property<String> dt_txt = new Property<String>(WeatherForecastData.ForecastList.class, "dt_txt");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,dt,dt_txt};

  public ForecastList_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherForecastData.ForecastList> getModelClass() {
    return WeatherForecastData.ForecastList.class;
  }

  @Override
  public final String getTableName() {
    return "`ForecastList`";
  }

  @Override
  public final WeatherForecastData.ForecastList newInstance() {
    return new WeatherForecastData.ForecastList();
  }

  @Override
  public final Property getProperty(String columnName) {
    columnName = QueryBuilder.quoteIfNeeded(columnName);
    switch ((columnName)) {
      case "`id`":  {
        return id;
      }
      case "`dt`":  {
        return dt;
      }
      case "`dt_txt`":  {
        return dt_txt;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(WeatherForecastData.ForecastList model, Number id) {
    model.setId(id.longValue());
  }

  @Override
  public final Number getAutoIncrementingId(WeatherForecastData.ForecastList model) {
    return model.getId();
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final ModelSaver<WeatherForecastData.ForecastList> createSingleModelSaver() {
    return new AutoIncrementModelSaver<>();
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values,
      WeatherForecastData.ForecastList model) {
    values.put("`dt`", model.getDt());
    values.put("`dt_txt`", model.getDt_txt());
  }

  @Override
  public final void bindToContentValues(ContentValues values,
      WeatherForecastData.ForecastList model) {
    values.put("`id`", model.getId());
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement,
      WeatherForecastData.ForecastList model, int start) {
    statement.bindNumberOrNull(1 + start, model.getDt());
    statement.bindStringOrNull(2 + start, model.getDt_txt());
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement,
      WeatherForecastData.ForecastList model) {
    int start = 0;
    statement.bindNumberOrNull(1 + start, model.getId());
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement,
      WeatherForecastData.ForecastList model) {
    statement.bindNumberOrNull(1, model.getId());
    statement.bindNumberOrNull(2, model.getDt());
    statement.bindStringOrNull(3, model.getDt_txt());
    statement.bindNumberOrNull(4, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement,
      WeatherForecastData.ForecastList model) {
    statement.bindNumberOrNull(1, model.getId());
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `ForecastList`(`dt`,`dt_txt`) VALUES (?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `ForecastList`(`id`,`dt`,`dt_txt`) VALUES (?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `ForecastList` SET `id`=?,`dt`=?,`dt_txt`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `ForecastList` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `ForecastList`(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `dt` INTEGER, `dt_txt` TEXT)";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherForecastData.ForecastList model) {
    model.setId(cursor.getLongOrDefault("id", null));
    model.setDt(cursor.getLongOrDefault("dt", null));
    model.setDt_txt(cursor.getStringOrDefault("dt_txt"));
  }

  @Override
  public final boolean exists(WeatherForecastData.ForecastList model, DatabaseWrapper wrapper) {
    return (model.getId() != null && model.getId() > 0 || model.getId() == null)
    && SQLite.selectCountOf()
    .from(WeatherForecastData.ForecastList.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherForecastData.ForecastList model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
