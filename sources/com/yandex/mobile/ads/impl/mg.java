package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class mg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f23069c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rm f23070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f23071b;

    public mg(ms msVar) {
        this.f23070a = msVar;
    }

    public final HashMap a() throws qm {
        try {
            Objects.requireNonNull(this.f23071b);
            Cursor cursorQuery = this.f23070a.getReadableDatabase().query(this.f23071b, f23069c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    Objects.requireNonNull(string);
                    map.put(string, new lg(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            throw new qm(th3);
        }
    }

    public final void a(long j10) throws qm {
        try {
            String hexString = Long.toHexString(j10);
            this.f23071b = "ExoPlayerCacheFileMetadata" + hexString;
            if (xb1.a(this.f23070a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f23070a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    xb1.a(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f23071b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f23071b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (Throwable th) {
            throw new qm(th);
        }
    }

    public final void a(String str) throws qm {
        Objects.requireNonNull(this.f23071b);
        try {
            this.f23070a.getWritableDatabase().delete(this.f23071b, "name = ?", new String[]{str});
        } catch (Throwable th) {
            throw new qm(th);
        }
    }

    public final void a(String str, long j10, long j11) throws qm {
        Objects.requireNonNull(this.f23071b);
        try {
            SQLiteDatabase writableDatabase = this.f23070a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j10));
            contentValues.put("last_touch_timestamp", Long.valueOf(j11));
            writableDatabase.replaceOrThrow(this.f23071b, null, contentValues);
        } catch (Throwable th) {
            throw new qm(th);
        }
    }

    public final void a(Set<String> set) throws qm {
        Objects.requireNonNull(this.f23071b);
        try {
            SQLiteDatabase writableDatabase = this.f23070a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f23071b, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (Throwable th) {
            throw new qm(th);
        }
    }
}
