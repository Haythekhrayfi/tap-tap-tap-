package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f11676b;

    public /* synthetic */ c(SQLiteEventStore sQLiteEventStore, int i10) {
        this.f11675a = i10;
        this.f11676b = sQLiteEventStore;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f11675a) {
            case 0:
                return this.f11676b.lambda$cleanUp$11((Cursor) obj);
            case 1:
                return this.f11676b.lambda$recordFailure$3((Cursor) obj);
            default:
                return this.f11676b.lambda$resetClientMetrics$23((SQLiteDatabase) obj);
        }
    }
}
