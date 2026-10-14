package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements SchemaManager.Migration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ l f11708b = new l(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ l f11709c = new l(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11710a;

    public /* synthetic */ l(int i10) {
        this.f11710a = i10;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
    public final void upgrade(SQLiteDatabase sQLiteDatabase) {
        switch (this.f11710a) {
            case 0:
                SchemaManager.lambda$static$1(sQLiteDatabase);
                break;
            default:
                SchemaManager.lambda$static$3(sQLiteDatabase);
                break;
        }
    }
}
