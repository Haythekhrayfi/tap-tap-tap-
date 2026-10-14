package ch.qos.logback.classic.db.names;

/* JADX INFO: loaded from: classes.dex */
public interface DBNameResolver {
    <N extends Enum<?>> String getColumnName(N n10);

    <N extends Enum<?>> String getTableName(N n10);
}
