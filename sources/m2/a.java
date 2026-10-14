package m2;

import ch.qos.logback.classic.db.names.ColumnName;
import ch.qos.logback.classic.db.names.DBNameResolver;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a {
    public static void a(DBNameResolver dBNameResolver, ColumnName columnName, StringBuilder sb2, String str) {
        sb2.append(dBNameResolver.getColumnName(columnName));
        sb2.append(str);
    }
}
