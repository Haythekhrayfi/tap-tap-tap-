package ch.qos.logback.classic.db;

import android.support.v4.media.session.e;
import androidx.activity.k;
import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.TableName;
import m2.a;

/* JADX INFO: loaded from: classes.dex */
public class SQLBuilder {
    public static String buildCreateExceptionTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION));
        sb2.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        a.a(dBNameResolver, columnName, sb2, " BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.I;
        a.a(dBNameResolver, columnName2, sb2, " SMALLINT NOT NULL, ");
        sb2.append(dBNameResolver.getColumnName(ColumnName.TRACE_LINE));
        sb2.append(" VARCHAR(254) NOT NULL, ");
        sb2.append("PRIMARY KEY (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(", ");
        sb2.append(dBNameResolver.getColumnName(columnName2));
        sb2.append("), ");
        sb2.append("FOREIGN KEY (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(") ");
        sb2.append("REFERENCES ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb2.append(" (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        return k.a(sb2, ") ", ")");
    }

    public static String buildCreateLoggingEventTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb2.append(" (");
        a.a(dBNameResolver, ColumnName.TIMESTMP, sb2, " BIGINT NOT NULL, ");
        a.a(dBNameResolver, ColumnName.FORMATTED_MESSAGE, sb2, " TEXT NOT NULL, ");
        a.a(dBNameResolver, ColumnName.LOGGER_NAME, sb2, " VARCHAR(254) NOT NULL, ");
        a.a(dBNameResolver, ColumnName.LEVEL_STRING, sb2, " VARCHAR(254) NOT NULL, ");
        a.a(dBNameResolver, ColumnName.THREAD_NAME, sb2, " VARCHAR(254), ");
        a.a(dBNameResolver, ColumnName.REFERENCE_FLAG, sb2, " SMALLINT, ");
        a.a(dBNameResolver, ColumnName.ARG0, sb2, " VARCHAR(254), ");
        a.a(dBNameResolver, ColumnName.ARG1, sb2, " VARCHAR(254), ");
        a.a(dBNameResolver, ColumnName.ARG2, sb2, " VARCHAR(254), ");
        a.a(dBNameResolver, ColumnName.ARG3, sb2, " VARCHAR(254), ");
        a.a(dBNameResolver, ColumnName.CALLER_FILENAME, sb2, " VARCHAR(254), ");
        a.a(dBNameResolver, ColumnName.CALLER_CLASS, sb2, " VARCHAR(254), ");
        a.a(dBNameResolver, ColumnName.CALLER_METHOD, sb2, " VARCHAR(254), ");
        a.a(dBNameResolver, ColumnName.CALLER_LINE, sb2, " CHAR(4), ");
        sb2.append(dBNameResolver.getColumnName(ColumnName.EVENT_ID));
        sb2.append(" INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT");
        sb2.append(")");
        return sb2.toString();
    }

    public static String buildCreatePropertyTableSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb2 = new StringBuilder("CREATE TABLE IF NOT EXISTS ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY));
        sb2.append(" (");
        ColumnName columnName = ColumnName.EVENT_ID;
        a.a(dBNameResolver, columnName, sb2, " BIGINT NOT NULL, ");
        ColumnName columnName2 = ColumnName.MAPPED_KEY;
        a.a(dBNameResolver, columnName2, sb2, " VARCHAR(254) NOT NULL, ");
        sb2.append(dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE));
        sb2.append(" VARCHAR(254) NOT NULL, ");
        sb2.append("PRIMARY KEY (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(", ");
        sb2.append(dBNameResolver.getColumnName(columnName2));
        sb2.append("), ");
        sb2.append("FOREIGN KEY (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(") ");
        sb2.append("REFERENCES ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb2.append(" (");
        sb2.append(dBNameResolver.getColumnName(columnName));
        return k.a(sb2, ") ", ")");
    }

    public static String buildDeleteExpiredLogsSQL(DBNameResolver dBNameResolver, long j10) {
        StringBuilder sb2 = new StringBuilder("DELETE FROM ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb2.append(" WHERE ");
        a.a(dBNameResolver, ColumnName.TIMESTMP, sb2, " <= ");
        return e.a(sb2, j10, ";");
    }

    public static String buildInsertExceptionSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb2 = new StringBuilder("INSERT INTO ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION));
        sb2.append(" (");
        a.a(dBNameResolver, ColumnName.EVENT_ID, sb2, ", ");
        a.a(dBNameResolver, ColumnName.I, sb2, ", ");
        sb2.append(dBNameResolver.getColumnName(ColumnName.TRACE_LINE));
        sb2.append(") ");
        sb2.append("VALUES (?, ?, ?)");
        return sb2.toString();
    }

    public static String buildInsertPropertiesSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb2 = new StringBuilder("INSERT INTO ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY));
        sb2.append(" (");
        a.a(dBNameResolver, ColumnName.EVENT_ID, sb2, ", ");
        a.a(dBNameResolver, ColumnName.MAPPED_KEY, sb2, ", ");
        sb2.append(dBNameResolver.getColumnName(ColumnName.MAPPED_VALUE));
        sb2.append(") ");
        sb2.append("VALUES (?, ?, ?)");
        return sb2.toString();
    }

    public static String buildInsertSQL(DBNameResolver dBNameResolver) {
        StringBuilder sb2 = new StringBuilder("INSERT INTO ");
        sb2.append(dBNameResolver.getTableName(TableName.LOGGING_EVENT));
        sb2.append(" (");
        a.a(dBNameResolver, ColumnName.TIMESTMP, sb2, ", ");
        a.a(dBNameResolver, ColumnName.FORMATTED_MESSAGE, sb2, ", ");
        a.a(dBNameResolver, ColumnName.LOGGER_NAME, sb2, ", ");
        a.a(dBNameResolver, ColumnName.LEVEL_STRING, sb2, ", ");
        a.a(dBNameResolver, ColumnName.THREAD_NAME, sb2, ", ");
        a.a(dBNameResolver, ColumnName.REFERENCE_FLAG, sb2, ", ");
        a.a(dBNameResolver, ColumnName.ARG0, sb2, ", ");
        a.a(dBNameResolver, ColumnName.ARG1, sb2, ", ");
        a.a(dBNameResolver, ColumnName.ARG2, sb2, ", ");
        a.a(dBNameResolver, ColumnName.ARG3, sb2, ", ");
        a.a(dBNameResolver, ColumnName.CALLER_FILENAME, sb2, ", ");
        a.a(dBNameResolver, ColumnName.CALLER_CLASS, sb2, ", ");
        a.a(dBNameResolver, ColumnName.CALLER_METHOD, sb2, ", ");
        sb2.append(dBNameResolver.getColumnName(ColumnName.CALLER_LINE));
        sb2.append(") ");
        sb2.append("VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        return sb2.toString();
    }
}
