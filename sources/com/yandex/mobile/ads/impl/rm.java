package com.yandex.mobile.ads.impl;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public interface rm {
    SQLiteDatabase getReadableDatabase() throws Throwable;

    SQLiteDatabase getWritableDatabase() throws Throwable;
}
