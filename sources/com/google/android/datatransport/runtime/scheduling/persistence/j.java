package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements SQLiteEventStore.Producer, SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11702a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11703b;

    public /* synthetic */ j(SQLiteDatabase sQLiteDatabase) {
        this.f11703b = sQLiteDatabase;
    }

    public /* synthetic */ j(SchemaManager schemaManager) {
        this.f11703b = schemaManager;
    }

    public /* synthetic */ j(Map map) {
        this.f11703b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public Object apply(Object obj) {
        return SQLiteEventStore.lambda$loadMetadata$16((Map) this.f11703b, (Cursor) obj);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public Object produce() {
        switch (this.f11702a) {
            case 0:
                return ((SchemaManager) this.f11703b).getWritableDatabase();
            default:
                return SQLiteEventStore.lambda$ensureBeginTransaction$24((SQLiteDatabase) this.f11703b);
        }
    }
}
