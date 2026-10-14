package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.r8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1926r8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C2056w8 f17231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H8 f17232b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ContentValues f17236f = new ContentValues();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicLong f17233c = new AtomicLong(d());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicLong f17234d = new AtomicLong(a(RecyclerView.FOREVER_NS));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f17235e = new AtomicLong(a());

    public AbstractC1926r8(C2056w8 c2056w8, H8 h10) {
        this.f17231a = c2056w8;
        this.f17232b = h10;
    }

    private long d() {
        try {
            SQLiteDatabase readableDatabase = this.f17231a.getReadableDatabase();
            if (readableDatabase != null) {
                return C1694i.a(readableDatabase, e());
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public abstract long a();

    public long a(long j10) {
        String str = String.format(Locale.US, "Select min(%s) from %s", "timestamp", e());
        Cursor cursorRawQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f17231a.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(str, null);
                if (cursorRawQuery.moveToFirst()) {
                    long j11 = cursorRawQuery.getLong(0);
                    if (j11 != 0) {
                        j10 = j11;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        U2.a(cursorRawQuery);
        return j10;
    }

    public synchronized Map<Long, String> a(int i10) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase readableDatabase = this.f17231a.getReadableDatabase();
            if (readableDatabase != null) {
                cursorQuery = readableDatabase.query(e(), new String[]{"incremental_id", "data"}, null, null, null, null, "incremental_id ASC", String.valueOf(i10));
                while (cursorQuery.moveToNext()) {
                    this.f17236f.clear();
                    try {
                        C1694i.a(cursorQuery, this.f17236f);
                    } catch (Throwable unused) {
                    }
                    Long asLong = this.f17236f.getAsLong("incremental_id");
                    String asString = this.f17236f.getAsString("data");
                    if (asLong != null && asString != null) {
                        linkedHashMap.put(asLong, asString);
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        U2.a(cursorQuery);
        return linkedHashMap;
    }

    public synchronized void a(long j10, String str) {
        try {
            SQLiteDatabase writableDatabase = this.f17231a.getWritableDatabase();
            if (writableDatabase != null) {
                this.f17236f.clear();
                this.f17236f.put("incremental_id", Long.valueOf(this.f17235e.get() + 1));
                this.f17236f.put("timestamp", Long.valueOf(j10));
                this.f17236f.put("data", str);
                if (writableDatabase.insert(e(), null, this.f17236f) != -1) {
                    this.f17233c.incrementAndGet();
                    this.f17235e.incrementAndGet();
                    b(this.f17235e.get());
                    if (this.f17234d.get() > j10) {
                        this.f17234d.set(j10);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public synchronized int b(int i10) {
        int iDelete = 0;
        if (i10 < 1) {
            return 0;
        }
        String str = String.format(Locale.US, "%1$s <= (select max(%1$s) from (select %1$s from %2$s order by %1$s limit ?))", "incremental_id", e());
        try {
            SQLiteDatabase writableDatabase = this.f17231a.getWritableDatabase();
            if (writableDatabase != null && (iDelete = writableDatabase.delete(e(), str, new String[]{String.valueOf(i10)})) > 0) {
                this.f17233c.getAndAdd(-iDelete);
                this.f17234d.set(a(RecyclerView.FOREVER_NS));
            }
        } catch (Throwable unused) {
        }
        return iDelete;
    }

    public long b() {
        return this.f17234d.get();
    }

    public abstract void b(long j10);

    public synchronized int c(long j10) {
        int iDelete;
        iDelete = 0;
        String str = String.format(Locale.US, "%s <= ?", "incremental_id");
        try {
            SQLiteDatabase writableDatabase = this.f17231a.getWritableDatabase();
            if (writableDatabase != null && (iDelete = writableDatabase.delete(e(), str, new String[]{String.valueOf(j10)})) > 0) {
                this.f17233c.getAndAdd(-iDelete);
                this.f17234d.set(a(RecyclerView.FOREVER_NS));
            }
        } catch (Throwable unused) {
        }
        return iDelete;
    }

    public long c() {
        return this.f17233c.get();
    }

    public abstract String e();

    public H8 f() {
        return this.f17232b;
    }
}
