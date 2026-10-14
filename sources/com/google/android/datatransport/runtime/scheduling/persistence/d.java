package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SQLiteEventStore f11678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransportContext f11679c;

    public /* synthetic */ d(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, int i10) {
        this.f11677a = i10;
        this.f11678b = sQLiteEventStore;
        this.f11679c = transportContext;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f11677a) {
            case 0:
                return this.f11678b.lambda$hasPendingEventsFor$6(this.f11679c, (SQLiteDatabase) obj);
            default:
                return this.f11678b.lambda$loadBatch$8(this.f11679c, (SQLiteDatabase) obj);
        }
    }
}
