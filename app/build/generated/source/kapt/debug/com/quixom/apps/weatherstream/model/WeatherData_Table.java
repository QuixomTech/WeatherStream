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
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;

/**
 * This is generated code. Please do not modify */
public final class WeatherData_Table extends ModelAdapter<WeatherData> {
  /**
   * Primary Key */
  public static final Property<Long> id = new Property<Long>(WeatherData.class, "id");

  public static final Property<Long> dt = new Property<Long>(WeatherData.class, "dt");

  public static final Property<Integer> cod = new Property<Integer>(WeatherData.class, "cod");

  public static final Property<String> visibility = new Property<String>(WeatherData.class, "visibility");

  public static final Property<String> name = new Property<String>(WeatherData.class, "name");

  public static final Property<String> base = new Property<String>(WeatherData.class, "base");

  public static final IProperty[] ALL_COLUMN_PROPERTIES = new IProperty[]{id,dt,cod,visibility,name,base};

  public WeatherData_Table(DatabaseDefinition databaseDefinition) {
    super(databaseDefinition);
  }

  @Override
  public final Class<WeatherData> getModelClass() {
    return WeatherData.class;
  }

  @Override
  public final String getTableName() {
    return "`WeatherDetail`";
  }

  @Override
  public final WeatherData newInstance() {
    return new WeatherData();
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
      case "`cod`":  {
        return cod;
      }
      case "`visibility`":  {
        return visibility;
      }
      case "`name`":  {
        return name;
      }
      case "`base`":  {
        return base;
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
  public final void bindToInsertValues(ContentValues values, WeatherData model) {
    values.put("`id`", model.getId());
    values.put("`dt`", model.getDt());
    values.put("`cod`", model.getCod());
    values.put("`visibility`", model.getVisibility());
    values.put("`name`", model.getName());
    values.put("`base`", model.getBase());
  }

  @Override
  public final void bindToInsertStatement(DatabaseStatement statement, WeatherData model,
      int start) {
    statement.bindNumberOrNull(1 + start, model.getId());
    statement.bindNumberOrNull(2 + start, model.getDt());
    statement.bindNumberOrNull(3 + start, model.getCod());
    statement.bindStringOrNull(4 + start, model.getVisibility());
    statement.bindStringOrNull(5 + start, model.getName());
    statement.bindStringOrNull(6 + start, model.getBase());
  }

  @Override
  public final void bindToUpdateStatement(DatabaseStatement statement, WeatherData model) {
    statement.bindNumberOrNull(1, model.getId());
    statement.bindNumberOrNull(2, model.getDt());
    statement.bindNumberOrNull(3, model.getCod());
    statement.bindStringOrNull(4, model.getVisibility());
    statement.bindStringOrNull(5, model.getName());
    statement.bindStringOrNull(6, model.getBase());
    statement.bindNumberOrNull(7, model.getId());
  }

  @Override
  public final void bindToDeleteStatement(DatabaseStatement statement, WeatherData model) {
    statement.bindNumberOrNull(1, model.getId());
  }

  @Override
  public final String getCompiledStatementQuery() {
    return "INSERT INTO `WeatherDetail`(`id`,`dt`,`cod`,`visibility`,`name`,`base`) VALUES (?,?,?,?,?,?)";
  }

  @Override
  public final String getUpdateStatementQuery() {
    return "UPDATE `WeatherDetail` SET `id`=?,`dt`=?,`cod`=?,`visibility`=?,`name`=?,`base`=? WHERE `id`=?";
  }

  @Override
  public final String getDeleteStatementQuery() {
    return "DELETE FROM `WeatherDetail` WHERE `id`=?";
  }

  @Override
  public final String getCreationQuery() {
    return "CREATE TABLE IF NOT EXISTS `WeatherDetail`(`id` INTEGER, `dt` INTEGER, `cod` INTEGER, `visibility` TEXT, `name` TEXT, `base` TEXT, PRIMARY KEY(`id`))";
  }

  @Override
  public final void loadFromCursor(FlowCursor cursor, WeatherData model) {
    model.setId(cursor.getLongOrDefault("id", null));
    model.setDt(cursor.getLongOrDefault("dt", null));
    model.setCod(cursor.getIntOrDefault("cod", null));
    model.setVisibility(cursor.getStringOrDefault("visibility"));
    model.setName(cursor.getStringOrDefault("name"));
    model.setBase(cursor.getStringOrDefault("base"));
  }

  @Override
  public final boolean exists(WeatherData model, DatabaseWrapper wrapper) {
    return SQLite.selectCountOf()
    .from(WeatherData.class)
    .where(getPrimaryConditionClause(model))
    .hasData(wrapper);
  }

  @Override
  public final OperatorGroup getPrimaryConditionClause(WeatherData model) {
    OperatorGroup clause = OperatorGroup.clause();
    clause.and(id.eq(model.getId()));
    return clause;
  }
}
