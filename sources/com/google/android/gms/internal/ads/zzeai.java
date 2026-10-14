package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeai {
    public static int zza(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11 = 0;
        if (i10 == 2) {
            return 0;
        }
        Cursor cursorZzh = zzh(sQLiteDatabase, i10);
        if (cursorZzh.getCount() > 0) {
            cursorZzh.moveToNext();
            i11 = cursorZzh.getInt(cursorZzh.getColumnIndexOrThrow("value"));
        }
        cursorZzh.close();
        return i11;
    }

    public static long zzb(SQLiteDatabase sQLiteDatabase, int i10) {
        long j10;
        Cursor cursorZzh = zzh(sQLiteDatabase, 2);
        if (cursorZzh.getCount() > 0) {
            cursorZzh.moveToNext();
            j10 = cursorZzh.getLong(cursorZzh.getColumnIndexOrThrow("value"));
        } else {
            j10 = 0;
        }
        cursorZzh.close();
        return j10;
    }

    public static ArrayList zzc(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(zzazi.zzi(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzgpy e10) {
                zzbzr.zzg("Unable to deserialize proto from offline signals database:");
                zzbzr.zzg(e10.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static void zzd(SQLiteDatabase sQLiteDatabase, long j10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j10));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j10)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void zze(SQLiteDatabase sQLiteDatabase) {
        zzi(sQLiteDatabase, "failed_requests", 0);
        zzi(sQLiteDatabase, "total_requests", 0);
        zzi(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void zzf(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        zzj(sQLiteDatabase, "failed_requests", 0);
        zzj(sQLiteDatabase, "total_requests", 0);
        zzj(sQLiteDatabase, "completed_requests", 0);
    }

    public static void zzg(SQLiteDatabase sQLiteDatabase, boolean z10, boolean z11) {
        String str;
        if (z11) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
            if (z10) {
                return;
            } else {
                str = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests");
            }
        } else {
            str = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests");
        }
        sQLiteDatabase.execSQL(str);
    }

    private static Cursor zzh(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 == 1) {
            strArr2[0] = "total_requests";
        } else if (i10 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void zzi(SQLiteDatabase sQLiteDatabase, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
