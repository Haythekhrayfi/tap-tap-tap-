package com.yandex.mobile.ads.exo.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import ch.qos.logback.core.CoreConstants;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.yandex.mobile.ads.impl.bk1;
import com.yandex.mobile.ads.impl.da1;
import com.yandex.mobile.ads.impl.fn1;
import com.yandex.mobile.ads.impl.h41;
import com.yandex.mobile.ads.impl.pa;
import com.yandex.mobile.ads.impl.qm;
import com.yandex.mobile.ads.impl.rm;
import com.yandex.mobile.ads.impl.sq;
import com.yandex.mobile.ads.impl.tq;
import com.yandex.mobile.ads.impl.xb1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a implements bk1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f18668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f18669f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f18670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final rm f18671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f18672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f18673d;

    /* JADX INFO: renamed from: com.yandex.mobile.ads.exo.offline.a$a, reason: collision with other inner class name */
    public static final class C0195a implements sq {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Cursor f18674a;

        private C0195a(Cursor cursor) {
            this.f18674a = cursor;
        }

        public /* synthetic */ C0195a(Cursor cursor, int i10) {
            this(cursor);
        }

        public final b a() {
            return a.b(this.f18674a);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f18674a.close();
        }

        public final int getPosition() {
            return this.f18674a.getPosition();
        }

        public final boolean moveToPosition(int i10) {
            return this.f18674a.moveToPosition(i10);
        }
    }

    static {
        int[] iArr = {3, 4};
        StringBuilder sbA = android.support.v4.media.c.a("state", " IN (");
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 > 0) {
                sbA.append(CoreConstants.COMMA_CHAR);
            }
            sbA.append(iArr[i10]);
        }
        sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        f18668e = sbA.toString();
        f18669f = new String[]{FacebookMediationAdapter.KEY_ID, "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};
    }

    public a(h41 h41Var) {
        this(h41Var, 0);
    }

    public a(h41 h41Var, int i10) {
        this.f18671b = h41Var;
        this.f18670a = fn1.a("ExoPlayerDownloads", "");
        this.f18672c = new Object();
    }

    private ArrayList a(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!da1.a(sQLiteDatabase, this.f18670a)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f18670a, new String[]{FacebookMediationAdapter.KEY_ID, "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(c(cursorQuery));
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    private static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        int i10 = da1.f19803a;
        for (String str2 : str.split(",", -1)) {
            String[] strArrSplit = str2.split("\\.", -1);
            pa.b(strArrSplit.length == 3);
            arrayList.add(new StreamKey(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
        }
        return arrayList;
    }

    private void a() throws qm {
        synchronized (this.f18672c) {
            if (this.f18673d) {
                return;
            }
            try {
                int iA = xb1.a(this.f18671b.getReadableDatabase(), 0, "");
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.f18671b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        xb1.a(writableDatabase, 0, "", 3);
                        ArrayList arrayListA = iA == 2 ? a(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f18670a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f18670a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayListA.iterator();
                        while (it.hasNext()) {
                            a((b) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f18673d = true;
            } catch (Throwable th2) {
                throw new qm(th2);
            }
        }
    }

    private void a(b bVar, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = bVar.f18675a.f18655e;
        if (bArr == null) {
            bArr = da1.f19808f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(FacebookMediationAdapter.KEY_ID, bVar.f18675a.f18651a);
        contentValues.put("mime_type", bVar.f18675a.f18653c);
        contentValues.put("uri", bVar.f18675a.f18652b.toString());
        List<StreamKey> list = bVar.f18675a.f18654d;
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            StreamKey streamKey = list.get(i10);
            sb2.append(streamKey.f18665a);
            sb2.append(CoreConstants.DOT);
            sb2.append(streamKey.f18666b);
            sb2.append(CoreConstants.DOT);
            sb2.append(streamKey.f18667c);
            sb2.append(CoreConstants.COMMA_CHAR);
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        contentValues.put("stream_keys", sb2.toString());
        contentValues.put("custom_cache_key", bVar.f18675a.f18656f);
        contentValues.put("data", bVar.f18675a.f18657g);
        contentValues.put("state", Integer.valueOf(bVar.f18676b));
        contentValues.put("start_time_ms", Long.valueOf(bVar.f18677c));
        contentValues.put("update_time_ms", Long.valueOf(bVar.f18678d));
        contentValues.put("content_length", Long.valueOf(bVar.f18679e));
        contentValues.put("stop_reason", Integer.valueOf(bVar.f18680f));
        contentValues.put("failure_reason", Integer.valueOf(bVar.f18681g));
        contentValues.put("percent_downloaded", Float.valueOf(bVar.f18682h.f25438b));
        contentValues.put("bytes_downloaded", Long.valueOf(bVar.f18682h.f25437a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f18670a, null, contentValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b b(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        Objects.requireNonNull(string);
        String string2 = cursor.getString(2);
        Objects.requireNonNull(string2);
        DownloadRequest.b bVarA = new DownloadRequest.b(Uri.parse(string2), string).b(cursor.getString(1)).a(a(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        DownloadRequest downloadRequestA = bVarA.b(blob).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        tq tqVar = new tq();
        tqVar.f25437a = cursor.getLong(13);
        tqVar.f25438b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new b(downloadRequestA, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, tqVar);
    }

    private static b c(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        Objects.requireNonNull(string);
        String string2 = cursor.getString(2);
        Objects.requireNonNull(string2);
        DownloadRequest.b bVar = new DownloadRequest.b(Uri.parse(string2), string);
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = "ss".equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        DownloadRequest downloadRequestA = bVar.b(str).a(a(cursor.getString(3))).a(cursor.getString(4)).a(cursor.getBlob(5)).a();
        tq tqVar = new tq();
        tqVar.f25437a = cursor.getLong(13);
        tqVar.f25438b = cursor.getFloat(12);
        int i10 = cursor.getInt(6);
        return new b(downloadRequestA, i10, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i10 == 4 ? cursor.getInt(11) : 0, tqVar);
    }

    public final sq a(int... iArr) throws qm {
        String string;
        a();
        int i10 = 0;
        if (iArr.length == 0) {
            string = "1";
        } else {
            StringBuilder sbA = android.support.v4.media.c.a("state", " IN (");
            for (int i11 = 0; i11 < iArr.length; i11++) {
                if (i11 > 0) {
                    sbA.append(CoreConstants.COMMA_CHAR);
                }
                sbA.append(iArr[i11]);
            }
            sbA.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            string = sbA.toString();
        }
        try {
            return new C0195a(this.f18671b.getReadableDatabase().query(this.f18670a, f18669f, string, null, null, null, "start_time_ms ASC"), i10);
        } catch (Throwable th) {
            throw new qm(th);
        }
    }

    public final void a(int i10) throws qm {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f18671b.getWritableDatabase().update(this.f18670a, contentValues, f18668e, null);
        } catch (Throwable th) {
            throw new qm(th);
        }
    }

    public final void a(int i10, String str) throws qm {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i10));
            this.f18671b.getWritableDatabase().update(this.f18670a, contentValues, f18668e + " AND id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new qm(th);
        }
    }

    public final void a(b bVar) throws qm {
        a();
        try {
            a(bVar, this.f18671b.getWritableDatabase());
        } catch (Throwable th) {
            throw new qm(th);
        }
    }

    public final b b(String str) throws qm {
        a();
        try {
            try {
                Cursor cursorQuery = this.f18671b.getReadableDatabase().query(this.f18670a, f18669f, "id = ?", new String[]{str}, null, null, "start_time_ms ASC");
                try {
                    if (cursorQuery.getCount() == 0) {
                        cursorQuery.close();
                        return null;
                    }
                    cursorQuery.moveToNext();
                    b bVarB = b(cursorQuery);
                    cursorQuery.close();
                    return bVarB;
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
        } catch (SQLiteException e10) {
            throw new qm(e10);
        }
        throw new qm(e10);
    }

    public final void b() throws qm {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f18671b.getWritableDatabase().update(this.f18670a, contentValues, "state = 2", null);
        } catch (Throwable th) {
            throw new qm(th);
        }
    }

    public final void c() throws qm {
        a();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f18671b.getWritableDatabase().update(this.f18670a, contentValues, null, null);
        } catch (Throwable th) {
            throw new qm(th);
        }
    }

    public final void c(String str) throws qm {
        a();
        try {
            this.f18671b.getWritableDatabase().delete(this.f18670a, "id = ?", new String[]{str});
        } catch (Throwable th) {
            throw new qm(th);
        }
    }
}
