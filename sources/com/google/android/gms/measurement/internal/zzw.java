package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzw {
    public final /* synthetic */ zzaa zza;
    private com.google.android.gms.internal.measurement.zzfs zzb;
    private Long zzc;
    private long zzd;

    public /* synthetic */ zzw(zzaa zzaaVar, zzv zzvVar) {
        this.zza = zzaaVar;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x01df: MOVE (r5 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:66:0x01df */
    public final com.google.android.gms.internal.measurement.zzfs zza(String str, com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        Cursor cursor;
        Cursor cursorRawQuery;
        Cursor cursor2;
        Pair pairCreate;
        Object obj;
        String strZzh = zzfsVar.zzh();
        List listZzi = zzfsVar.zzi();
        this.zza.zzf.zzu();
        Long l10 = (Long) zzlb.zzC(zzfsVar, "_eid");
        if (l10 != null) {
            if (strZzh.equals("_ep")) {
                Preconditions.checkNotNull(l10);
                this.zza.zzf.zzu();
                String str2 = (String) zzlb.zzC(zzfsVar, "_en");
                if (TextUtils.isEmpty(str2)) {
                    this.zza.zzs.zzay().zzh().zzb("Extra parameter without an event name. eventId", l10);
                    return null;
                }
                if (this.zzb == null || this.zzc == null || l10.longValue() != this.zzc.longValue()) {
                    zzam zzamVarZzi = this.zza.zzf.zzi();
                    zzamVarZzi.zzg();
                    zzamVarZzi.zzW();
                    try {
                        try {
                            cursorRawQuery = zzamVarZzi.zzh().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l10.toString()});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pairCreate = Pair.create((com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzfr) zzlb.zzl(com.google.android.gms.internal.measurement.zzfs.zze(), cursorRawQuery.getBlob(0))).zzaE(), Long.valueOf(cursorRawQuery.getLong(1)));
                                        cursorRawQuery.close();
                                    } catch (IOException e10) {
                                        zzamVarZzi.zzs.zzay().zzd().zzd("Failed to merge main event. appId, eventId", zzeo.zzn(str), l10, e10);
                                        cursorRawQuery.close();
                                        pairCreate = null;
                                    }
                                } else {
                                    zzamVarZzi.zzs.zzay().zzj().zza("Main event not found");
                                    cursorRawQuery.close();
                                    pairCreate = null;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                zzamVarZzi.zzs.zzay().zzd().zzb("Error selecting main event", e);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                                pairCreate = null;
                                if (pairCreate != null) {
                                }
                                this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l10);
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursor2;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    if (pairCreate != null || (obj = pairCreate.first) == null) {
                        this.zza.zzs.zzay().zzh().zzc("Extra parameter without existing main event. eventName, eventId", str2, l10);
                        return null;
                    }
                    this.zzb = (com.google.android.gms.internal.measurement.zzfs) obj;
                    this.zzd = ((Long) pairCreate.second).longValue();
                    this.zza.zzf.zzu();
                    this.zzc = (Long) zzlb.zzC(this.zzb, "_eid");
                }
                long j10 = this.zzd - 1;
                this.zzd = j10;
                if (j10 <= 0) {
                    zzam zzamVarZzi2 = this.zza.zzf.zzi();
                    zzamVarZzi2.zzg();
                    zzamVarZzi2.zzs.zzay().zzj().zzb("Clearing complex main event info. appId", str);
                    try {
                        zzamVarZzi2.zzh().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e13) {
                        zzamVarZzi2.zzs.zzay().zzd().zzb("Error clearing complex main event", e13);
                    }
                } else {
                    this.zza.zzf.zzi().zzJ(str, l10, this.zzd, this.zzb);
                }
                ArrayList arrayList = new ArrayList();
                for (com.google.android.gms.internal.measurement.zzfw zzfwVar : this.zzb.zzi()) {
                    this.zza.zzf.zzu();
                    if (zzlb.zzB(zzfsVar, zzfwVar.zzg()) == null) {
                        arrayList.add(zzfwVar);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.zza.zzs.zzay().zzh().zzb("No unique parameters in main event. eventName", str2);
                } else {
                    arrayList.addAll(listZzi);
                    listZzi = arrayList;
                }
                strZzh = str2;
            } else {
                this.zzc = l10;
                this.zzb = zzfsVar;
                this.zza.zzf.zzu();
                Object objZzC = zzlb.zzC(zzfsVar, "_epc");
                long jLongValue = ((Long) (objZzC != null ? objZzC : 0L)).longValue();
                this.zzd = jLongValue;
                if (jLongValue <= 0) {
                    this.zza.zzs.zzay().zzh().zzb("Complex event with zero extra param count. eventName", strZzh);
                } else {
                    this.zza.zzf.zzi().zzJ(str, (Long) Preconditions.checkNotNull(l10), this.zzd, zzfsVar);
                }
            }
        }
        com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) zzfsVar.zzby();
        zzfrVar.zzi(strZzh);
        zzfrVar.zzg();
        zzfrVar.zzd(listZzi);
        return (com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE();
    }
}
