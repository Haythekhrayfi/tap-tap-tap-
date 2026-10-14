package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements SchemaManager.Migration {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ k f11704b = new k(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ k f11705c = new k(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ k f11706d = new k(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11707a;

    public /* synthetic */ k(int i10) {
        this.f11707a = i10;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
    public final void upgrade(SQLiteDatabase sQLiteDatabase) {
        switch (this.f11707a) {
            case 0:
                SchemaManager.lambda$static$0(sQLiteDatabase);
                break;
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                break;
            default:
                SchemaManager.lambda$static$4(sQLiteDatabase);
                break;
        }
    }
}
