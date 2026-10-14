package com.yandex.metrica.impl.ob;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1694i {
    public static int a(long j10) {
        return ((GregorianCalendar) GregorianCalendar.getInstance()).getTimeZone().getOffset(j10 * 1000) / 1000;
    }

    public static long a() {
        return Lm.c().a();
    }

    public static long a(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = sQLiteDatabase.rawQuery("SELECT count() FROM " + str, null);
            return cursorRawQuery.moveToFirst() ? cursorRawQuery.getLong(0) : 0L;
        } finally {
            U2.a(cursorRawQuery);
        }
    }

    public static SharedPreferences a(Context context, String str) {
        return context.getSharedPreferences(context.getPackageName() + str, 0);
    }

    public static com.yandex.metrica.i a(String str) {
        com.yandex.metrica.i iVar = new com.yandex.metrica.i();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                iVar.f13583a = jSONObject.optString("UserInfo.UserId", null);
                iVar.f13584b = jSONObject.optString("UserInfo.Type", null);
                iVar.f13585c = C2120ym.b(jSONObject.optJSONObject("UserInfo.Options"));
            } catch (Throwable unused) {
            }
        }
        return iVar;
    }

    public static String a(Context context) {
        return context.getPackageName() + "-crashpad_new_crash_socket";
    }

    public static List<Integer> a(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }

    public static void a(SharedPreferences sharedPreferences, String str, int i10) {
        if (sharedPreferences == null || !sharedPreferences.contains(str)) {
            return;
        }
        try {
            sharedPreferences.edit().remove(str).putLong(str, sharedPreferences.getInt(str, i10)).apply();
        } catch (ClassCastException unused) {
        }
    }

    public static void a(Cursor cursor, ContentValues contentValues) {
        String str;
        String[] columnNames = cursor.getColumnNames();
        int length = columnNames.length;
        int i10 = 0;
        while (i10 < length) {
            int type = cursor.getType(i10);
            if (type != 0) {
                if (type == 1) {
                    contentValues.put(columnNames[i10], Long.valueOf(cursor.getLong(i10)));
                } else if (type == 2) {
                    contentValues.put(columnNames[i10], Double.valueOf(cursor.getDouble(i10)));
                } else if (type == 3 || type != 4) {
                    str = columnNames[i10];
                } else {
                    contentValues.put(columnNames[i10], cursor.getBlob(i10));
                }
                i10++;
            } else {
                str = columnNames[i10];
            }
            contentValues.put(str, cursor.getString(i10));
            i10++;
        }
    }

    public static boolean a(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static boolean a(String str, String str2) {
        boolean zEquals;
        int i10 = O2.f14603a;
        if (str == null && str2 == null) {
            zEquals = true;
        } else {
            zEquals = (str == null || str2 == null) ? false : str.equals(str2);
        }
        return !zEquals;
    }

    public static boolean a(Collection<?> collection, Collection<?> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static int[] a(List<Integer> list) {
        int[] iArr = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static Integer b(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static com.yandex.metrica.billing_interface.c c(String str) {
        if ("inapp".equals(str)) {
            return com.yandex.metrica.billing_interface.c.INAPP;
        }
        return "subs".equals(str) ? com.yandex.metrica.billing_interface.c.SUBS : com.yandex.metrica.billing_interface.c.UNKNOWN;
    }
}
