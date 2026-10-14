package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11672a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11674c;

    public /* synthetic */ b(long j10, TransportContext transportContext) {
        this.f11673b = j10;
        this.f11674c = transportContext;
    }

    public /* synthetic */ b(SQLiteEventStore sQLiteEventStore, long j10) {
        this.f11674c = sQLiteEventStore;
        this.f11673b = j10;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f11672a) {
            case 0:
                return SQLiteEventStore.lambda$recordNextCallTime$7(this.f11673b, (TransportContext) this.f11674c, (SQLiteDatabase) obj);
            default:
                return ((SQLiteEventStore) this.f11674c).lambda$cleanUp$12(this.f11673b, (SQLiteDatabase) obj);
        }
    }
}
