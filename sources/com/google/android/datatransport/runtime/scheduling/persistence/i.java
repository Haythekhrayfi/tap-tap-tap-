package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i f11696b = new i(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i f11697c = new i(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ i f11698d = new i(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i f11699e = new i(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ i f11700f = new i(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11701a;

    public /* synthetic */ i(int i10) {
        this.f11701a = i10;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        switch (this.f11701a) {
            case 0:
                return SQLiteEventStore.lambda$recordLogEventDropped$17((Cursor) obj);
            case 1:
                return SQLiteEventStore.lambda$loadActiveContexts$9((Cursor) obj);
            case 2:
                return SQLiteEventStore.lambda$getDb$0((Throwable) obj);
            case 3:
                return SQLiteEventStore.lambda$getTransportContextId$2((Cursor) obj);
            default:
                return SQLiteEventStore.lambda$clearDb$13((SQLiteDatabase) obj);
        }
    }
}
