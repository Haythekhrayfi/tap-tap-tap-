package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h f11690b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ h f11691c = new h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h f11692d = new h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ h f11693e = new h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h f11694f = new h(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11695a;

    public /* synthetic */ h(int i10) {
        this.f11695a = i10;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f11695a) {
            case 0:
                return SQLiteEventStore.lambda$readPayload$15((Cursor) obj);
            case 1:
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            case 2:
                return SQLiteEventStore.lambda$loadActiveContexts$10((SQLiteDatabase) obj);
            case 3:
                return SQLiteEventStore.lambda$getNextCallTime$5((Cursor) obj);
            default:
                return SQLiteEventStore.lambda$ensureBeginTransaction$25((Throwable) obj);
        }
    }
}
