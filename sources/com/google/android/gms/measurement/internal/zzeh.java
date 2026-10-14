package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeh extends zzf {
    private final zzeg zza;
    private boolean zzb;

    public zzeh(zzfy zzfyVar) {
        super(zzfyVar);
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzf();
        this.zza = new zzeg(this, contextZzau, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:81:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.database.Cursor] */
    private final boolean zzq(int i10, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzh;
        ?? r10;
        zzg();
        int i11 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i10));
        contentValues.put("entry", bArr);
        this.zzs.zzf();
        int i12 = 5;
        ?? r11 = 0;
        for (int i13 = 5; i11 < i13; i13 = 5) {
            ?? r12 = 0;
            r12 = 0;
             = 0;
            ?? r13 = 0;
            r12 = 0;
            ?? r14 = 0;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseZzh = zzh();
                try {
                    if (sQLiteDatabaseZzh == null) {
                        this.zzb = true;
                        return r11;
                    }
                    sQLiteDatabaseZzh.beginTransaction();
                    ?? RawQuery = sQLiteDatabaseZzh.rawQuery("select count(1) from messages", null);
                    long j10 = 0;
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j10 = RawQuery.getLong(r11);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r12 = RawQuery;
                            try {
                                SystemClock.sleep(i12);
                                i12 += 20;
                                if (r12 != 0) {
                                    r12.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                i11++;
                                r11 = 0;
                            } catch (Throwable th) {
                                th = th;
                                if (r12 != 0) {
                                    r12.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e10) {
                            e = e10;
                            r14 = RawQuery;
                            try {
                                this.zzs.zzay().zzd().zzb("Error writing entry; local database full", e);
                                this.zzb = true;
                                if (r14 != 0) {
                                    r14.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabase = sQLiteDatabaseZzh;
                                    sQLiteDatabase.close();
                                }
                                i11++;
                                r11 = 0;
                            } catch (Throwable th2) {
                                th = th2;
                                r10 = r14;
                                sQLiteDatabase = sQLiteDatabaseZzh;
                                sQLiteDatabaseZzh = sQLiteDatabase;
                                r12 = r10;
                                if (r12 != 0) {
                                    r12.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e11) {
                            e = e11;
                            r13 = RawQuery;
                            r10 = r13;
                            sQLiteDatabase = sQLiteDatabaseZzh;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    sQLiteDatabaseZzh = sQLiteDatabase;
                                    r12 = r10;
                                    if (r12 != 0) {
                                        r12.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzs.zzay().zzd().zzb("Error writing entry to local database", e);
                            this.zzb = true;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i11++;
                            r11 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            r12 = RawQuery;
                            if (r12 != 0) {
                                r12.close();
                            }
                            if (sQLiteDatabaseZzh != null) {
                                sQLiteDatabaseZzh.close();
                            }
                            throw th;
                        }
                    }
                    if (j10 >= 100000) {
                        this.zzs.zzay().zzd().zza("Data loss, local db full");
                        long j11 = (100000 - j10) + 1;
                        String[] strArr = new String[1];
                        strArr[r11] = Long.toString(j11);
                        long jDelete = sQLiteDatabaseZzh.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j11) {
                            this.zzs.zzay().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(jDelete), Long.valueOf(j11 - jDelete));
                        }
                    }
                    sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseZzh.setTransactionSuccessful();
                    sQLiteDatabaseZzh.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseZzh.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e12) {
                    e = e12;
                } catch (SQLiteException e13) {
                    e = e13;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseZzh = null;
            } catch (SQLiteFullException e14) {
                e = e14;
                sQLiteDatabaseZzh = null;
            } catch (SQLiteException e15) {
                e = e15;
                r10 = 0;
            } catch (Throwable th5) {
                th = th5;
                sQLiteDatabaseZzh = null;
            }
        }
        this.zzs.zzay().zzj().zza("Failed to write entry to local database");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x01f9 A[Catch: all -> 0x0243, TryCatch #21 {all -> 0x0243, blocks: (B:137:0x01f3, B:139:0x01f9, B:140:0x01fc, B:155:0x0226, B:147:0x0216), top: B:182:0x01f3 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x020d  */
    /* JADX WARN: Code duplicated, block: B:150:0x021d  */
    /* JADX WARN: Code duplicated, block: B:157:0x0237  */
    /* JADX WARN: Code duplicated, block: B:159:0x023c A[PHI: r9 r15
  0x023c: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:143:0x0210, B:158:0x023a, B:151:0x0220] A[DONT_GENERATE, DONT_INLINE]
  0x023c: PHI (r15v6 android.database.sqlite.SQLiteDatabase) = 
  (r15v4 android.database.sqlite.SQLiteDatabase)
  (r15v5 android.database.sqlite.SQLiteDatabase)
  (r15v7 android.database.sqlite.SQLiteDatabase)
 binds: [B:143:0x0210, B:158:0x023a, B:151:0x0220] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:165:0x0248  */
    /* JADX WARN: Code duplicated, block: B:167:0x024d  */
    /* JADX WARN: Code duplicated, block: B:182:0x01f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x01cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x023f A[SYNTHETIC] */
    public final List zzi(int i10) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabaseZzh;
        Cursor cursorQuery2;
        long j10;
        String str;
        String[] strArr;
        SafeParcelable safeParcelable;
        zzem zzemVarZzd;
        String str2;
        zzg();
        Cursor cursor = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzl()) {
            return arrayList;
        }
        int i11 = 5;
        for (int i12 = 0; i12 < 5; i12++) {
            try {
                sQLiteDatabaseZzh = zzh();
                if (sQLiteDatabaseZzh == null) {
                    this.zzb = true;
                    return null;
                }
                try {
                    sQLiteDatabaseZzh.beginTransaction();
                    try {
                        try {
                            cursorQuery2 = sQLiteDatabaseZzh.query("messages", new String[]{"rowid"}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                            try {
                                long j11 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j10 = cursorQuery2.getLong(0);
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        sQLiteDatabase = sQLiteDatabaseZzh;
                                        cursorQuery = null;
                                        sQLiteDatabaseZzh = sQLiteDatabase;
                                        SystemClock.sleep(i11);
                                        i11 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                    } catch (SQLiteFullException e10) {
                                        e = e10;
                                        sQLiteDatabase = sQLiteDatabaseZzh;
                                        cursorQuery = null;
                                        sQLiteDatabaseZzh = sQLiteDatabase;
                                        this.zzs.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        sQLiteDatabase = sQLiteDatabaseZzh;
                                        cursorQuery = null;
                                        sQLiteDatabaseZzh = sQLiteDatabase;
                                        if (sQLiteDatabaseZzh != null) {
                                            try {
                                                if (sQLiteDatabaseZzh.inTransaction()) {
                                                    sQLiteDatabaseZzh.endTransaction();
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                sQLiteDatabase = sQLiteDatabaseZzh;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        this.zzs.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase = sQLiteDatabaseZzh;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    cursorQuery2.close();
                                    j10 = -1;
                                }
                                if (j10 != -1) {
                                    str = "rowid<?";
                                    strArr = new String[]{String.valueOf(j10)};
                                } else {
                                    str = null;
                                    strArr = null;
                                }
                                cursorQuery = sQLiteDatabaseZzh.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j11 = cursorQuery.getLong(0);
                                        int i13 = cursorQuery.getInt(1);
                                        byte[] blob = cursorQuery.getBlob(2);
                                        if (i13 == 0) {
                                            Parcel parcelObtain = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                    parcelObtain.setDataPosition(0);
                                                    safeParcelable = (zzaw) zzaw.CREATOR.createFromParcel(parcelObtain);
                                                    parcelObtain.recycle();
                                                    if (safeParcelable != null) {
                                                        arrayList.add(safeParcelable);
                                                    }
                                                } catch (Throwable th3) {
                                                    parcelObtain.recycle();
                                                    throw th3;
                                                }
                                            } catch (SafeParcelReader.ParseException unused2) {
                                                this.zzs.zzay().zzd().zza("Failed to load event from local database");
                                                parcelObtain.recycle();
                                            }
                                        } else if (i13 == 1) {
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain2.unmarshall(blob, 0, blob.length);
                                                    parcelObtain2.setDataPosition(0);
                                                    safeParcelable = (zzlc) zzlc.CREATOR.createFromParcel(parcelObtain2);
                                                    parcelObtain2.recycle();
                                                } catch (Throwable th4) {
                                                    parcelObtain2.recycle();
                                                    throw th4;
                                                }
                                            } catch (SafeParcelReader.ParseException unused3) {
                                                this.zzs.zzay().zzd().zza("Failed to load user property from local database");
                                                parcelObtain2.recycle();
                                                safeParcelable = null;
                                            }
                                            if (safeParcelable != null) {
                                                arrayList.add(safeParcelable);
                                            }
                                        } else if (i13 == 2) {
                                            Parcel parcelObtain3 = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                    parcelObtain3.setDataPosition(0);
                                                    safeParcelable = (zzac) zzac.CREATOR.createFromParcel(parcelObtain3);
                                                    parcelObtain3.recycle();
                                                } catch (Throwable th5) {
                                                    parcelObtain3.recycle();
                                                    throw th5;
                                                }
                                            } catch (SafeParcelReader.ParseException unused4) {
                                                this.zzs.zzay().zzd().zza("Failed to load conditional user property from local database");
                                                parcelObtain3.recycle();
                                                safeParcelable = null;
                                            }
                                            if (safeParcelable != null) {
                                                arrayList.add(safeParcelable);
                                            }
                                        } else {
                                            if (i13 == 3) {
                                                zzemVarZzd = this.zzs.zzay().zzk();
                                                str2 = "Skipping app launch break";
                                            } else {
                                                zzemVarZzd = this.zzs.zzay().zzd();
                                                str2 = "Unknown record type in local database";
                                            }
                                            zzemVarZzd.zza(str2);
                                        }
                                    } catch (SQLiteDatabaseLockedException unused5) {
                                        sQLiteDatabase = sQLiteDatabaseZzh;
                                    } catch (SQLiteFullException e12) {
                                        e = e12;
                                        sQLiteDatabase = sQLiteDatabaseZzh;
                                    } catch (SQLiteException e13) {
                                        e = e13;
                                        sQLiteDatabase = sQLiteDatabaseZzh;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLiteDatabase = sQLiteDatabaseZzh;
                                    }
                                }
                                sQLiteDatabase = sQLiteDatabaseZzh;
                                try {
                                    if (sQLiteDatabase.delete("messages", "rowid <= ?", new String[]{Long.toString(j11)}) < arrayList.size()) {
                                        this.zzs.zzay().zzd().zza("Fewer entries removed from local database than expected");
                                    }
                                    sQLiteDatabase.setTransactionSuccessful();
                                    sQLiteDatabase.endTransaction();
                                    cursorQuery.close();
                                    sQLiteDatabase.close();
                                    return arrayList;
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    sQLiteDatabaseZzh = sQLiteDatabase;
                                    SystemClock.sleep(i11);
                                    i11 += 20;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                } catch (SQLiteFullException e14) {
                                    e = e14;
                                    sQLiteDatabaseZzh = sQLiteDatabase;
                                    this.zzs.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                } catch (SQLiteException e15) {
                                    e = e15;
                                    sQLiteDatabaseZzh = sQLiteDatabase;
                                    if (sQLiteDatabaseZzh != null) {
                                        if (sQLiteDatabaseZzh.inTransaction()) {
                                            sQLiteDatabaseZzh.endTransaction();
                                        }
                                    }
                                    this.zzs.zzay().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    cursor = cursorQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteDatabase = sQLiteDatabaseZzh;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused7) {
                                        cursorQuery = null;
                                        sQLiteDatabaseZzh = sQLiteDatabase;
                                        SystemClock.sleep(i11);
                                        i11 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                    } catch (SQLiteFullException e16) {
                                        e = e16;
                                        cursorQuery = null;
                                        sQLiteDatabaseZzh = sQLiteDatabase;
                                        this.zzs.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                    } catch (SQLiteException e17) {
                                        e = e17;
                                        cursorQuery = null;
                                        sQLiteDatabaseZzh = sQLiteDatabase;
                                        if (sQLiteDatabaseZzh != null) {
                                            if (sQLiteDatabaseZzh.inTransaction()) {
                                                sQLiteDatabaseZzh.endTransaction();
                                            }
                                        }
                                        this.zzs.zzay().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseZzh != null) {
                                            sQLiteDatabaseZzh.close();
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            sQLiteDatabase = sQLiteDatabaseZzh;
                            cursorQuery2 = null;
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        sQLiteDatabase = sQLiteDatabaseZzh;
                    }
                } catch (SQLiteDatabaseLockedException unused8) {
                    sQLiteDatabase = sQLiteDatabaseZzh;
                } catch (SQLiteFullException e18) {
                    e = e18;
                    sQLiteDatabase = sQLiteDatabaseZzh;
                } catch (SQLiteException e19) {
                    e = e19;
                    sQLiteDatabase = sQLiteDatabaseZzh;
                } catch (Throwable th12) {
                    th = th12;
                    sQLiteDatabase = sQLiteDatabaseZzh;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.close();
                    }
                    throw th;
                }
            } catch (SQLiteDatabaseLockedException unused9) {
                cursorQuery = null;
                sQLiteDatabaseZzh = null;
            } catch (SQLiteFullException e20) {
                e = e20;
                cursorQuery = null;
                sQLiteDatabaseZzh = null;
            } catch (SQLiteException e21) {
                e = e21;
                cursorQuery = null;
                sQLiteDatabaseZzh = null;
            } catch (Throwable th13) {
                th = th13;
                sQLiteDatabase = null;
            }
        }
        this.zzs.zzay().zzk().zza("Failed to read events from database in reasonable time");
        return null;
    }

    public final void zzj() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh == null || (iDelete = sQLiteDatabaseZzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzs.zzay().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzb("Error resetting local analytics data. error", e10);
        }
    }

    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzf();
        return contextZzau.getDatabasePath("google_app_measurement_local.db").exists();
    }

    public final boolean zzm() {
        zzg();
        if (!this.zzb && zzl()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseZzh = zzh();
                        if (sQLiteDatabaseZzh == null) {
                            this.zzb = true;
                            return false;
                        }
                        sQLiteDatabaseZzh.beginTransaction();
                        sQLiteDatabaseZzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseZzh.setTransactionSuccessful();
                        sQLiteDatabaseZzh.endTransaction();
                        sQLiteDatabaseZzh.close();
                        return true;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i10);
                        i10 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteFullException e10) {
                    this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e10);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.zzs.zzay().zzd().zzb("Error deleting app launch break from local database", e11);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.zzs.zzay().zzk().zza("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] bArrZzan = this.zzs.zzv().zzan(zzacVar);
        if (bArrZzan.length <= 131072) {
            return zzq(2, bArrZzan);
        }
        this.zzs.zzay().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzaw zzawVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzax.zza(zzawVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(0, bArrMarshall);
        }
        this.zzs.zzay().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlc zzlcVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzld.zza(zzlcVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(1, bArrMarshall);
        }
        this.zzs.zzay().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
