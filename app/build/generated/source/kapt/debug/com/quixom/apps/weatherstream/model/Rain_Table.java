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
import java.lang.Long;
import java.lang.Number;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class Rain_Table extends ModelAdapter<WeatherForecastData.Rain> {
  /**
   * Primary Key AutoIncrement */
  public static final Property<Long> id = new Property<Long>(WeatherForecastData.Rain.class, "id");

  public static final Property<Long> dt = new Property<Long>(WeatherForecastData.Rain.class, "dt");

  public static final Property<Double> rainCount = new Property<Double>(WeatherForecastData.Rain.class, "rainCount");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,dt,rainCount};

  public Rain_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherForecastData.Rain> getModelClass() {
    return WeatherForecastData.Rain.class;
  }

  @Override
  public final String getTableName() {
    return "`Rain`";
  }

  @Override
  public final WeatherForecastData.Rain newInstance() {
    return new WeatherForecastData.Rain();
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
      case "`rainCount`":  {
        return rainCount;
      }
      default: {
        throw new IllegalArgumentException("Invalid column name passed. Ensure you are calling the correct table's column");
      }
    }
  }

  @Override
  public final void updateAutoIncrement(WeatherForecastData.Rain model, Number id) {
    model.setId(id.longValue());
  }

  @Override
  public final Number getAutoIncrementingId(WeatherForecastData.Rain model) {
    return model.getId();
  }

  @Override
  public final String getAutoIncrementingColumnName() {
    return "id";
  }

  @Override
  public final ModelSaver<WeatherForecastData.Rain> createSingleModelSaver() {
    return new AutoIncrementModelSaver<>();
  }

  @Override
  public final IProperty[] getAllColumnProperties() {
    return ALL_COLUMN_PROPERTIES;
  }

  @Override
  public final void bindToInsertValues(ContentValues values, WeatherForecastData.Rain model) {
    values.put("`dt`", model.getDt());
    values.put("`rainCount`", model.getRainCount());
  }

  @Override
  public final void bindToContentValues(ContentValues values, WeatherForecastData.Rain model) {
    values.put("`id`", model.getId());
    bindToInsertValues(values, model);
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement,
      WeatherForecastData.Rain model, int start) {
    statement.bindNumberOrNull(1 + start, model.getDt());
    statement.bindDoubleOrNull(2 + start, model.getRainCount());
  }

  @Override
  public final void bindToStatement(DatabaseStatement statement, WeatherForecastData.Rain model) {
    int start = 0;
    statement.bindNumberOrNull(1 + start, model.getId());
    bindToInsertStatement(statement, model, 1);
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement,
      WeatherForecastData.Rain model) {
    statement.bindNumberOrNull(1, model.getId());
    statement.bindNumberOrNull(2, model.getDt());
    statement.bindDoubleOrNull(3, model.getRainCount());
    statement.bindNumberOrNull(4, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement,
      WeatherForecastData.Rain model) {
    statement.bindNumberOrNull(1, model.getId());
  }

  @Override
  public final String getInsertStatementQuery() {
    return "INSERT INTO `Rain`(`dt`,`rainCount`) VALUES (?,?)";
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `Rain`(`id`,`dt`,`rainCount`) VALUES (?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `Rain` SET `id`=?,`dt`=?,`rainCount`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `Rain` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `Rain`(`id` INTEGER PRIMARY KEY AUTOINCREMENT, `dt` INTEGER, `rainCount` REAL)";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherForecastData.Rain model) {
    model.setId(cursor.getLongOrDefault("id", null));
    model.setDt(cursor.getLongOrDefault("dt", null));
    model.setRainCount(cursor.getDoubleOrDefault("rainCount", null));
  }

  @Override
  public final boolean exists(WeatherForecastData.Rain model, DatabaseWrapper wrapper) {
    return (model.getId() != null && model.getId() > 0 || model.getId() == null)
    && SQLite.selectCountOf()
    .from(WeatherForecastData.Rain.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherForecastData.Rain model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
