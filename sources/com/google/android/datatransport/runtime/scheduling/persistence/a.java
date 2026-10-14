package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11671b;

    public /* synthetic */ a(long j10, int i10) {
        this.f11670a = i10;
        this.f11671b = j10;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f11670a) {
            case 0:
                return SQLiteEventStore.lambda$getTimeWindow$21(this.f11671b, (Cursor) obj);
            default:
                return SQLiteEventStore.lambda$getTimeWindow$22(this.f11671b, (SQLiteDatabase) obj);
        }
    }
}
