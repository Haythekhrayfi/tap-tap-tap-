package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.CounterConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1951s8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CounterConfiguration.b f17283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final D2 f17284b;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s8$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ContentValues> f17285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f17286b;

        public a(List<ContentValues> list, int i10) {
            this.f17285a = list;
            this.f17286b = i10;
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.s8$b */
    public enum b {
        BAD_REQUEST("bad_request"),
        DB_OVERFLOW("db_overflow");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17290a;

        b(String str) {
            this.f17290a = str;
        }
    }

    public C1951s8(CounterConfiguration.b bVar) {
        this(bVar, P0.i().r());
    }

    public C1951s8(CounterConfiguration.b bVar, D2 d10) {
        this.f17283a = bVar;
        this.f17284b = d10;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0054  */
    public a a(SQLiteDatabase sQLiteDatabase, String str, String str2, b bVar, String str3, boolean z10) {
        Cursor cursorRawQuery;
        ArrayList<ContentValues> arrayList;
        D2 d10;
        int iDelete = 0;
        S s10 = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery(String.format("SELECT %s, %s, %s FROM %s WHERE %s", "global_number", "type", "number_of_type", "reports", str2), null);
            if (cursorRawQuery != null) {
                try {
                    if (cursorRawQuery.getCount() > 0) {
                        arrayList = new ArrayList(cursorRawQuery.getCount());
                        while (cursorRawQuery.moveToNext()) {
                            ContentValues contentValues = new ContentValues();
                            DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                            arrayList.add(contentValues);
                        }
                    } else {
                        arrayList = null;
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        ((Nh) Oh.a()).reportError("select_rows_to_delete_exception", th);
                        U2.a(cursorRawQuery);
                        arrayList = null;
                    } catch (Throwable th2) {
                        U2.a(cursorRawQuery);
                        throw th2;
                    }
                }
            } else {
                arrayList = null;
            }
            U2.a(cursorRawQuery);
        } catch (Throwable th3) {
            th = th3;
            cursorRawQuery = null;
        }
        if (U2.b(arrayList)) {
            HashMap mapA = com.applovin.impl.mediation.b.a.c.a("table_name", str);
            mapA.put("api_key", String.valueOf(str3));
            ((Nh) Oh.a()).reportEvent("select_rows_to_delete_failed", mapA);
        } else {
            try {
                iDelete = sQLiteDatabase.delete(str, str2, null);
            } catch (Throwable unused) {
            }
            if (z10 && str3 != null && (d10 = this.f17284b) != null) {
                C2 c2A = d10.a(str3, this.f17283a);
                try {
                    JSONObject jSONObject = new JSONObject();
                    JSONArray jSONArray = new JSONArray();
                    JSONArray jSONArray2 = new JSONArray();
                    JSONArray jSONArray3 = new JSONArray();
                    for (ContentValues contentValues2 : arrayList) {
                        Integer asInteger = contentValues2.getAsInteger("global_number");
                        Integer asInteger2 = contentValues2.getAsInteger("type");
                        Integer asInteger3 = contentValues2.getAsInteger("number_of_type");
                        if (asInteger != null && asInteger2 != null && asInteger3 != null) {
                            jSONArray.put(asInteger);
                            jSONArray2.put(C1572d2.b(EnumC1745k1.a(asInteger2.intValue())));
                            jSONArray3.put(asInteger3);
                        }
                    }
                    jSONObject.put("global_number", jSONArray).put("event_type", jSONArray2).put("number_of_type", jSONArray3);
                    JSONObject jSONObjectPut = new JSONObject().put("details", new JSONObject().put("reason", bVar.f17290a).put("cleared", jSONObject).put("actual_deleted_number", iDelete));
                    Im imB = AbstractC2145zm.b(str3);
                    String string = jSONObjectPut.toString();
                    List<Integer> list = J0.f14266i;
                    s10 = new S(string, "", EnumC1745k1.EVENT_TYPE_CLEANUP.b(), 0, imB);
                } catch (Throwable unused2) {
                }
                if (s10 != null) {
                    c2A.a(s10);
                }
            }
            arrayList.size();
        }
        return new a(arrayList, iDelete);
    }
}
