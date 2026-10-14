package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.j;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zzoz;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
final class zzam extends zzkn {
    private static final String[] zza = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    private static final String[] zzb = {AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    private static final String[] zzc = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};
    private static final String[] zzd = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    private static final String[] zze = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    private static final String[] zzg = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzh = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    private static final String[] zzi = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    private final zzal zzj;
    private final zzkj zzk;

    public zzam(zzkz zzkzVar) {
        super(zzkzVar);
        this.zzk = new zzkj(this.zzs.zzav());
        this.zzs.zzf();
        this.zzj = new zzal(this, this.zzs.zzau(), "google_app_measurement.db");
    }

    public static final void zzV(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty("value");
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long zzZ(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = zzh().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long zzaa(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = zzh().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j10;
                }
                long j11 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzc("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    public final void zzA(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            zzh().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzd("Error deleting user property. appId", zzeo.zzn(str), this.zzs.zzj().zzf(str2), e10);
        }
    }

    public final void zzB(String str, List list) throws Throwable {
        Iterator it;
        zzem zzemVarZzd;
        String str2;
        Object objZzn;
        zzem zzemVarZzk;
        String str3;
        Object objZzn2;
        Integer numValueOf;
        String str4;
        com.google.android.gms.internal.measurement.zzeg zzegVar;
        boolean z10;
        String str5 = "app_id=? and audience_id=?";
        Preconditions.checkNotNull(list);
        int i10 = 0;
        while (i10 < list.size()) {
            com.google.android.gms.internal.measurement.zzeg zzegVar2 = (com.google.android.gms.internal.measurement.zzeg) ((com.google.android.gms.internal.measurement.zzeh) list.get(i10)).zzby();
            if (zzegVar2.zza() != 0) {
                zzegVar = zzegVar2;
                int i11 = 0;
                while (i11 < zzegVar.zza()) {
                    com.google.android.gms.internal.measurement.zzei zzeiVar = (com.google.android.gms.internal.measurement.zzei) zzegVar.zze(i11).zzby();
                    com.google.android.gms.internal.measurement.zzei zzeiVar2 = (com.google.android.gms.internal.measurement.zzei) zzeiVar.clone();
                    String strZzb = zzgv.zzb(zzeiVar.zze());
                    if (strZzb != null) {
                        zzeiVar2.zzb(strZzb);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = 0;
                    while (i12 < zzeiVar.zza()) {
                        com.google.android.gms.internal.measurement.zzel zzelVarZzd = zzeiVar.zzd(i12);
                        com.google.android.gms.internal.measurement.zzei zzeiVar3 = zzeiVar;
                        String str6 = str5;
                        String strZzb2 = zzij.zzb(zzelVarZzd.zze(), zzgw.zza, zzgw.zzb);
                        if (strZzb2 != null) {
                            com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) zzelVarZzd.zzby();
                            zzekVar.zza(strZzb2);
                            zzeiVar2.zzc(i12, (com.google.android.gms.internal.measurement.zzel) zzekVar.zzaE());
                            z10 = true;
                        }
                        i12++;
                        zzeiVar = zzeiVar3;
                        str5 = str6;
                    }
                    String str7 = str5;
                    if (z10) {
                        zzegVar.zzc(i11, zzeiVar2);
                        list.set(i10, (com.google.android.gms.internal.measurement.zzeh) zzegVar2.zzaE());
                        zzegVar = zzegVar2;
                    }
                    i11++;
                    str5 = str7;
                }
                str4 = str5;
            } else {
                str4 = str5;
                zzegVar = zzegVar2;
            }
            if (zzegVar.zzb() != 0) {
                for (int i13 = 0; i13 < zzegVar.zzb(); i13++) {
                    com.google.android.gms.internal.measurement.zzes zzesVarZzf = zzegVar.zzf(i13);
                    String strZzb3 = zzij.zzb(zzesVarZzf.zze(), zzgx.zza, zzgx.zzb);
                    if (strZzb3 != null) {
                        com.google.android.gms.internal.measurement.zzer zzerVar = (com.google.android.gms.internal.measurement.zzer) zzesVarZzf.zzby();
                        zzerVar.zza(strZzb3);
                        zzegVar.zzd(i13, zzerVar);
                        list.set(i10, (com.google.android.gms.internal.measurement.zzeh) zzegVar2.zzaE());
                        zzegVar = zzegVar2;
                    }
                }
            }
            i10++;
            str5 = str4;
        }
        String str8 = str5;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        sQLiteDatabaseZzh.beginTransaction();
        try {
            zzW();
            zzg();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseZzh2 = zzh();
            sQLiteDatabaseZzh2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseZzh2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                com.google.android.gms.internal.measurement.zzeh zzehVar = (com.google.android.gms.internal.measurement.zzeh) it2.next();
                zzW();
                zzg();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(zzehVar);
                if (zzehVar.zzk()) {
                    int iZza = zzehVar.zza();
                    Iterator it3 = zzehVar.zzg().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            Iterator it4 = zzehVar.zzh().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = zzehVar.zzg().iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            Iterator it6 = zzehVar.zzh().iterator();
                                            while (true) {
                                                if (!it6.hasNext()) {
                                                    it2 = it;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzes zzesVar = (com.google.android.gms.internal.measurement.zzes) it6.next();
                                                zzW();
                                                zzg();
                                                Preconditions.checkNotEmpty(str);
                                                Preconditions.checkNotNull(zzesVar);
                                                if (zzesVar.zze().isEmpty()) {
                                                    this.zzs.zzay().zzk().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzeo.zzn(str), Integer.valueOf(iZza), String.valueOf(zzesVar.zzj() ? Integer.valueOf(zzesVar.zza()) : null));
                                                } else {
                                                    byte[] bArrZzbv = zzesVar.zzbv();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put("app_id", str);
                                                    contentValues.put("audience_id", Integer.valueOf(iZza));
                                                    contentValues.put("filter_id", zzesVar.zzj() ? Integer.valueOf(zzesVar.zza()) : null);
                                                    Iterator it7 = it6;
                                                    contentValues.put("property_name", zzesVar.zze());
                                                    contentValues.put("session_scoped", zzesVar.zzk() ? Boolean.valueOf(zzesVar.zzi()) : null);
                                                    contentValues.put("data", bArrZzbv);
                                                    try {
                                                        if (zzh().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            this.zzs.zzay().zzd().zzb("Failed to insert property filter (got -1). appId", zzeo.zzn(str));
                                                        } else {
                                                            it6 = it7;
                                                        }
                                                    } catch (SQLiteException e10) {
                                                        e = e10;
                                                        zzemVarZzd = this.zzs.zzay().zzd();
                                                        str2 = "Error storing property filter. appId";
                                                        objZzn = zzeo.zzn(str);
                                                        zzemVarZzd.zzc(str2, objZzn, e);
                                                    }
                                                }
                                                zzW();
                                                zzg();
                                                Preconditions.checkNotEmpty(str);
                                                SQLiteDatabase sQLiteDatabaseZzh3 = zzh();
                                                String str9 = str8;
                                                sQLiteDatabaseZzh3.delete("property_filters", str9, new String[]{str, String.valueOf(iZza)});
                                                sQLiteDatabaseZzh3.delete("event_filters", str9, new String[]{str, String.valueOf(iZza)});
                                                str8 = str9;
                                                it2 = it;
                                                break;
                                                break;
                                            }
                                        }
                                        com.google.android.gms.internal.measurement.zzej zzejVar = (com.google.android.gms.internal.measurement.zzej) it5.next();
                                        zzW();
                                        zzg();
                                        Preconditions.checkNotEmpty(str);
                                        Preconditions.checkNotNull(zzejVar);
                                        if (zzejVar.zzg().isEmpty()) {
                                            this.zzs.zzay().zzk().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzeo.zzn(str), Integer.valueOf(iZza), String.valueOf(zzejVar.zzp() ? Integer.valueOf(zzejVar.zzb()) : null));
                                            it = it2;
                                            zzW();
                                            zzg();
                                            Preconditions.checkNotEmpty(str);
                                            SQLiteDatabase sQLiteDatabaseZzh4 = zzh();
                                            String str10 = str8;
                                            sQLiteDatabaseZzh4.delete("property_filters", str10, new String[]{str, String.valueOf(iZza)});
                                            sQLiteDatabaseZzh4.delete("event_filters", str10, new String[]{str, String.valueOf(iZza)});
                                            str8 = str10;
                                            it2 = it;
                                            break;
                                        }
                                        byte[] bArrZzbv2 = zzejVar.zzbv();
                                        it = it2;
                                        ContentValues contentValues2 = new ContentValues();
                                        contentValues2.put("app_id", str);
                                        contentValues2.put("audience_id", Integer.valueOf(iZza));
                                        contentValues2.put("filter_id", zzejVar.zzp() ? Integer.valueOf(zzejVar.zzb()) : null);
                                        contentValues2.put("event_name", zzejVar.zzg());
                                        contentValues2.put("session_scoped", zzejVar.zzq() ? Boolean.valueOf(zzejVar.zzn()) : null);
                                        contentValues2.put("data", bArrZzbv2);
                                        try {
                                            if (zzh().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                this.zzs.zzay().zzd().zzb("Failed to insert event filter (got -1). appId", zzeo.zzn(str));
                                            }
                                            it2 = it;
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                            zzemVarZzd = this.zzs.zzay().zzd();
                                            str2 = "Error storing event filter. appId";
                                            objZzn = zzeo.zzn(str);
                                            zzemVarZzd.zzc(str2, objZzn, e);
                                            zzW();
                                            zzg();
                                            Preconditions.checkNotEmpty(str);
                                            SQLiteDatabase sQLiteDatabaseZzh5 = zzh();
                                            String str11 = str8;
                                            sQLiteDatabaseZzh5.delete("property_filters", str11, new String[]{str, String.valueOf(iZza)});
                                            sQLiteDatabaseZzh5.delete("event_filters", str11, new String[]{str, String.valueOf(iZza)});
                                            str8 = str11;
                                            it2 = it;
                                            break;
                                        }
                                    }
                                } else if (!((com.google.android.gms.internal.measurement.zzes) it4.next()).zzj()) {
                                    zzemVarZzk = this.zzs.zzay().zzk();
                                    str3 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                    objZzn2 = zzeo.zzn(str);
                                    numValueOf = Integer.valueOf(iZza);
                                }
                            }
                        } else if (!((com.google.android.gms.internal.measurement.zzej) it3.next()).zzp()) {
                            zzemVarZzk = this.zzs.zzay().zzk();
                            str3 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                            objZzn2 = zzeo.zzn(str);
                            numValueOf = Integer.valueOf(iZza);
                        }
                        zzemVarZzk.zzc(str3, objZzn2, numValueOf);
                        break;
                    }
                }
                try {
                    this.zzs.zzay().zzk().zzb("Audience with no ID. appId", zzeo.zzn(str));
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabaseZzh.endTransaction();
                    throw th;
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it8 = list.iterator();
            while (it8.hasNext()) {
                com.google.android.gms.internal.measurement.zzeh zzehVar2 = (com.google.android.gms.internal.measurement.zzeh) it8.next();
                arrayList.add(zzehVar2.zzk() ? Integer.valueOf(zzehVar2.zza()) : null);
            }
            Preconditions.checkNotEmpty(str);
            zzW();
            zzg();
            SQLiteDatabase sQLiteDatabaseZzh6 = zzh();
            try {
                long jZzZ = zzZ("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, this.zzs.zzf().zze(str, zzeb.zzE)));
                if (jZzZ > iMax) {
                    ArrayList arrayList2 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList.size()) {
                            String strJoin = TextUtils.join(",", arrayList2);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append("(" + strJoin + ")");
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseZzh6.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList.get(i14);
                        if (num == null) {
                            break;
                        }
                        arrayList2.add(Integer.toString(num.intValue()));
                        i14++;
                    }
                }
            } catch (SQLiteException e12) {
                this.zzs.zzay().zzd().zzc("Database error querying filters. appId", zzeo.zzn(str), e12);
            }
            sQLiteDatabaseZzh.setTransactionSuccessful();
            sQLiteDatabaseZzh.endTransaction();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void zzC() {
        zzW();
        zzh().setTransactionSuccessful();
    }

    public final void zzD(zzh zzhVar) {
        Preconditions.checkNotNull(zzhVar);
        zzg();
        zzW();
        String strZzt = zzhVar.zzt();
        Preconditions.checkNotNull(strZzt);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strZzt);
        contentValues.put("app_instance_id", zzhVar.zzu());
        contentValues.put("gmp_app_id", zzhVar.zzy());
        contentValues.put("resettable_device_id_hash", zzhVar.zzA());
        contentValues.put("last_bundle_index", Long.valueOf(zzhVar.zzo()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zzhVar.zzp()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zzhVar.zzn()));
        contentValues.put("app_version", zzhVar.zzw());
        contentValues.put("app_store", zzhVar.zzv());
        contentValues.put("gmp_version", Long.valueOf(zzhVar.zzm()));
        contentValues.put("dev_cert_hash", Long.valueOf(zzhVar.zzj()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zzhVar.zzai()));
        contentValues.put("day", Long.valueOf(zzhVar.zzi()));
        contentValues.put("daily_public_events_count", Long.valueOf(zzhVar.zzg()));
        contentValues.put("daily_events_count", Long.valueOf(zzhVar.zzf()));
        contentValues.put("daily_conversions_count", Long.valueOf(zzhVar.zzd()));
        contentValues.put("config_fetched_time", Long.valueOf(zzhVar.zzc()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zzhVar.zzl()));
        contentValues.put("app_version_int", Long.valueOf(zzhVar.zzb()));
        contentValues.put("firebase_instance_id", zzhVar.zzx());
        contentValues.put("daily_error_events_count", Long.valueOf(zzhVar.zze()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zzhVar.zzh()));
        contentValues.put("health_monitor_sample", zzhVar.zzz());
        zzhVar.zza();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zzhVar.zzah()));
        contentValues.put("admob_app_id", zzhVar.zzr());
        contentValues.put("dynamite_version", Long.valueOf(zzhVar.zzk()));
        contentValues.put("session_stitching_token", zzhVar.zzB());
        List listZzC = zzhVar.zzC();
        if (listZzC != null) {
            if (listZzC.isEmpty()) {
                this.zzs.zzay().zzk().zzb("Safelisted events should not be an empty list. appId", strZzt);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listZzC));
            }
        }
        zzns.zzc();
        if (this.zzs.zzf().zzs(null, zzeb.zzai) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh.update("apps", contentValues, "app_id = ?", new String[]{strZzt}) == 0 && sQLiteDatabaseZzh.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update app (got -1). appId", zzeo.zzn(strZzt));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzc("Error storing app. appId", zzeo.zzn(strZzt), e10);
        }
    }

    public final void zzE(zzas zzasVar) {
        Preconditions.checkNotNull(zzasVar);
        zzg();
        zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzasVar.zza);
        contentValues.put("name", zzasVar.zzb);
        contentValues.put("lifetime_count", Long.valueOf(zzasVar.zzc));
        contentValues.put("current_bundle_count", Long.valueOf(zzasVar.zzd));
        contentValues.put("last_fire_timestamp", Long.valueOf(zzasVar.zzf));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zzasVar.zzg));
        contentValues.put("last_bundled_day", zzasVar.zzh);
        contentValues.put("last_sampled_complex_event_id", zzasVar.zzi);
        contentValues.put("last_sampling_rate", zzasVar.zzj);
        contentValues.put("current_session_count", Long.valueOf(zzasVar.zze));
        Boolean bool = zzasVar.zzk;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (zzh().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update event aggregates (got -1). appId", zzeo.zzn(zzasVar.zza));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzc("Error storing event aggregates. appId", zzeo.zzn(zzasVar.zza), e10);
        }
    }

    public final boolean zzF() {
        return zzZ("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean zzG() {
        return zzZ("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean zzH() {
        return zzZ("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    public final boolean zzI() {
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzf();
        return contextZzau.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean zzJ(String str, Long l10, long j10, com.google.android.gms.internal.measurement.zzfs zzfsVar) {
        zzg();
        zzW();
        Preconditions.checkNotNull(zzfsVar);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l10);
        byte[] bArrZzbv = zzfsVar.zzbv();
        this.zzs.zzay().zzj().zzc("Saving complex main event, appId, data size", this.zzs.zzj().zzd(str), Integer.valueOf(bArrZzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrZzbv);
        try {
            if (zzh().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.zzs.zzay().zzd().zzb("Failed to insert complex main event (got -1). appId", zzeo.zzn(str));
            return false;
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzc("Error storing complex main event. appId", zzeo.zzn(str), e10);
            return false;
        }
    }

    public final boolean zzK(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zzW();
        String str = zzacVar.zza;
        Preconditions.checkNotNull(str);
        if (zzp(str, zzacVar.zzc.zzb) == null) {
            long jZzZ = zzZ("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.zzs.zzf();
            if (jZzZ >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzacVar.zzb);
        contentValues.put("name", zzacVar.zzc.zzb);
        zzV(contentValues, "value", Preconditions.checkNotNull(zzacVar.zzc.zza()));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.valueOf(zzacVar.zze));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, zzacVar.zzf);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.valueOf(zzacVar.zzh));
        contentValues.put("timed_out_event", this.zzs.zzv().zzan(zzacVar.zzg));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzacVar.zzd));
        contentValues.put("triggered_event", this.zzs.zzv().zzan(zzacVar.zzi));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.valueOf(zzacVar.zzc.zzc));
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.valueOf(zzacVar.zzj));
        contentValues.put("expired_event", this.zzs.zzv().zzan(zzacVar.zzk));
        try {
            if (zzh().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update conditional user property (got -1)", zzeo.zzn(str));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzc("Error storing conditional user property", zzeo.zzn(str), e10);
        }
        return true;
    }

    public final boolean zzL(zzle zzleVar) {
        Preconditions.checkNotNull(zzleVar);
        zzg();
        zzW();
        if (zzp(zzleVar.zza, zzleVar.zzc) == null) {
            if (zzlh.zzai(zzleVar.zzc)) {
                if (zzZ("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{zzleVar.zza}) >= this.zzs.zzf().zzf(zzleVar.zza, zzeb.zzF, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(zzleVar.zzc)) {
                long jZzZ = zzZ("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{zzleVar.zza, zzleVar.zzb});
                this.zzs.zzf();
                if (jZzZ >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzleVar.zza);
        contentValues.put(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, zzleVar.zzb);
        contentValues.put("name", zzleVar.zzc);
        contentValues.put("set_timestamp", Long.valueOf(zzleVar.zzd));
        zzV(contentValues, "value", zzleVar.zze);
        try {
            if (zzh().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.zzs.zzay().zzd().zzb("Failed to insert/update user property (got -1). appId", zzeo.zzn(zzleVar.zza));
            }
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzc("Error storing user property. appId", zzeo.zzn(zzleVar.zza), e10);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0227: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x0227 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void zzU(String str, long j10, long j11, zzkw zzkwVar) throws Throwable {
        ?? IsEmpty;
        Cursor cursor;
        Cursor cursorRawQuery;
        String string;
        int i10;
        String str2;
        String[] strArr;
        Preconditions.checkNotNull(zzkwVar);
        zzg();
        zzW();
        Cursor cursor2 = null;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                IsEmpty = TextUtils.isEmpty(null);
                try {
                    if (IsEmpty != 0) {
                        cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j11 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j11 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j11 != -1 ? new String[]{null, String.valueOf(j11)} : new String[]{null});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                        }
                    }
                    Cursor cursor3 = cursorRawQuery;
                    Cursor cursor4 = string;
                    try {
                        Cursor cursorQuery = sQLiteDatabaseZzh.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, cursor4}, null, null, "rowid", "2");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                this.zzs.zzay().zzd().zzb("Raw event metadata record is missing. appId", zzeo.zzn(string2));
                                cursorQuery.close();
                                return;
                            }
                            try {
                                try {
                                    com.google.android.gms.internal.measurement.zzgc zzgcVar = (com.google.android.gms.internal.measurement.zzgc) ((com.google.android.gms.internal.measurement.zzgb) zzlb.zzl(com.google.android.gms.internal.measurement.zzgc.zzt(), cursorQuery.getBlob(0))).zzaE();
                                    if (cursorQuery.moveToNext()) {
                                        this.zzs.zzay().zzk().zzb("Get multiple raw event metadata records, expected one. appId", zzeo.zzn(string2));
                                    }
                                    cursorQuery.close();
                                    Preconditions.checkNotNull(zzgcVar);
                                    zzkwVar.zza = zzgcVar;
                                    if (j11 != -1) {
                                        i10 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{string2, cursor4, String.valueOf(j11)};
                                    } else {
                                        i10 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{string2, cursor4};
                                    }
                                    Cursor cursorQuery2 = sQLiteDatabaseZzh.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                                    if (!cursorQuery2.moveToFirst()) {
                                        this.zzs.zzay().zzk().zzb("Raw event data disappeared while in transaction. appId", zzeo.zzn(string2));
                                        cursorQuery2.close();
                                        return;
                                    }
                                    do {
                                        long j12 = cursorQuery2.getLong(0);
                                        try {
                                            com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) zzlb.zzl(com.google.android.gms.internal.measurement.zzfs.zze(), cursorQuery2.getBlob(3));
                                            zzfrVar.zzi(cursorQuery2.getString(i10));
                                            zzfrVar.zzm(cursorQuery2.getLong(2));
                                            if (!zzkwVar.zza(j12, (com.google.android.gms.internal.measurement.zzfs) zzfrVar.zzaE())) {
                                                cursorQuery2.close();
                                                return;
                                            }
                                        } catch (IOException e10) {
                                            this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event. appId", zzeo.zzn(string2), e10);
                                        }
                                    } while (cursorQuery2.moveToNext());
                                    cursorQuery2.close();
                                } catch (IOException e11) {
                                    this.zzs.zzay().zzd().zzc("Data loss. Failed to merge raw event metadata. appId", zzeo.zzn(string2), e11);
                                    cursorQuery.close();
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                IsEmpty = cursor4;
                                this.zzs.zzay().zzd().zzc("Data loss. Error selecting raw event. appId", zzeo.zzn(string2), e);
                                if (IsEmpty != 0) {
                                    IsEmpty.close();
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor4;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            cursor4 = cursorQuery;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor4 = cursorQuery;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        IsEmpty = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e15) {
                    e = e15;
                }
            } catch (Throwable th4) {
                th = th4;
                cursor2 = cursor;
            }
        } catch (SQLiteException e16) {
            e = e16;
            IsEmpty = 0;
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final int zza(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        try {
            return zzh().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzd().zzd("Error deleting conditional property", zzeo.zzn(str), this.zzs.zzj().zzf(str2), e10);
            return 0;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final boolean zzb() {
        return false;
    }

    @VisibleForTesting
    public final long zzc(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty("first_open_count");
        zzg();
        zzW();
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        sQLiteDatabaseZzh.beginTransaction();
        long j10 = 0;
        try {
            try {
                long jZzaa = zzaa("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jZzaa == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseZzh.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        this.zzs.zzay().zzd().zzc("Failed to insert column (got -1). appId", zzeo.zzn(str), "first_open_count");
                        return -1L;
                    }
                    jZzaa = 0;
                    this.zzs.zzay().zzd().zzd("Error inserting column. appId", zzeo.zzn(str), "first_open_count", e);
                    return j10;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jZzaa));
                    if (sQLiteDatabaseZzh.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        this.zzs.zzay().zzd().zzc("Failed to update column (got 0). appId", zzeo.zzn(str), "first_open_count");
                        return -1L;
                    }
                    sQLiteDatabaseZzh.setTransactionSuccessful();
                    return jZzaa;
                } catch (SQLiteException e10) {
                    e = e10;
                    j10 = jZzaa;
                }
            } catch (SQLiteException e11) {
                e = e11;
            }
        } finally {
            sQLiteDatabaseZzh.endTransaction();
        }
    }

    public final long zzd() {
        return zzaa("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long zze() {
        return zzaa("select max(timestamp) from raw_events", null, 0L);
    }

    public final long zzf(String str) {
        Preconditions.checkNotEmpty(str);
        return zzaa("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    @VisibleForTesting
    public final SQLiteDatabase zzh() {
        zzg();
        try {
            return this.zzj.getWritableDatabase();
        } catch (SQLiteException e10) {
            this.zzs.zzay().zzk().zzb("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00d9  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    public final Bundle zzi(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = zzh().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        this.zzs.zzay().zzj().zza("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzfs zzfsVar = (com.google.android.gms.internal.measurement.zzfs) ((com.google.android.gms.internal.measurement.zzfr) zzlb.zzl(com.google.android.gms.internal.measurement.zzfs.zze(), cursorRawQuery.getBlob(0))).zzaE();
                        this.zzf.zzu();
                        List<com.google.android.gms.internal.measurement.zzfw> listZzi = zzfsVar.zzi();
                        Bundle bundle = new Bundle();
                        for (com.google.android.gms.internal.measurement.zzfw zzfwVar : listZzi) {
                            String strZzg = zzfwVar.zzg();
                            if (zzfwVar.zzu()) {
                                bundle.putDouble(strZzg, zzfwVar.zza());
                            } else if (zzfwVar.zzv()) {
                                bundle.putFloat(strZzg, zzfwVar.zzb());
                            } else if (zzfwVar.zzy()) {
                                bundle.putString(strZzg, zzfwVar.zzh());
                            } else if (zzfwVar.zzw()) {
                                bundle.putLong(strZzg, zzfwVar.zzd());
                            }
                        }
                        cursorRawQuery.close();
                        return bundle;
                    } catch (IOException e10) {
                        this.zzs.zzay().zzd().zzc("Failed to retrieve default event parameters. appId", zzeo.zzn(str), e10);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e11) {
                    e = e11;
                    this.zzs.zzay().zzd().zzb("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01ee  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01eb: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:51:0x01eb */
    public final zzh zzj(String str) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                boolean z10 = true;
                cursorQuery = zzh().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    zzh zzhVar = new zzh(this.zzf.zzq(), str);
                    zzhVar.zzH(cursorQuery.getString(0));
                    zzhVar.zzW(cursorQuery.getString(1));
                    zzhVar.zzae(cursorQuery.getString(2));
                    zzhVar.zzaa(cursorQuery.getLong(3));
                    zzhVar.zzab(cursorQuery.getLong(4));
                    zzhVar.zzZ(cursorQuery.getLong(5));
                    zzhVar.zzJ(cursorQuery.getString(6));
                    zzhVar.zzI(cursorQuery.getString(7));
                    zzhVar.zzX(cursorQuery.getLong(8));
                    zzhVar.zzS(cursorQuery.getLong(9));
                    zzhVar.zzac(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    zzhVar.zzR(cursorQuery.getLong(11));
                    zzhVar.zzP(cursorQuery.getLong(12));
                    zzhVar.zzO(cursorQuery.getLong(13));
                    zzhVar.zzM(cursorQuery.getLong(14));
                    zzhVar.zzL(cursorQuery.getLong(15));
                    zzhVar.zzU(cursorQuery.getLong(16));
                    zzhVar.zzK(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    zzhVar.zzV(cursorQuery.getString(18));
                    zzhVar.zzN(cursorQuery.getLong(19));
                    zzhVar.zzQ(cursorQuery.getLong(20));
                    zzhVar.zzY(cursorQuery.getString(21));
                    if (!cursorQuery.isNull(23) && cursorQuery.getInt(23) == 0) {
                        z10 = false;
                    }
                    zzhVar.zzG(z10);
                    zzhVar.zzF(cursorQuery.getString(24));
                    zzhVar.zzT(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        zzhVar.zzaf(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    zzoz.zzc();
                    if (this.zzs.zzf().zzs(null, zzeb.zzar)) {
                        zzhVar.zzag(cursorQuery.getString(28));
                    }
                    zzhVar.zzD();
                    if (cursorQuery.moveToNext()) {
                        this.zzs.zzay().zzd().zzb("Got multiple records for app, expected one. appId", zzeo.zzn(str));
                    }
                    cursorQuery.close();
                    return zzhVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    this.zzs.zzay().zzd().zzc("Error querying app. appId", zzeo.zzn(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0126  */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    public final zzac zzk(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzh().query("conditional_properties", new String[]{AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objZzq = zzq(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j10 = cursorQuery.getLong(4);
                    zzlb zzlbVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzac zzacVar = new zzac(str, str3, new zzlc(str2, cursorQuery.getLong(8), objZzq, str3), cursorQuery.getLong(6), z10, string2, (zzaw) zzlbVarZzu.zzh(blob, creator), j10, (zzaw) this.zzf.zzu().zzh(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzaw) this.zzf.zzu().zzh(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        this.zzs.zzay().zzd().zzc("Got multiple records for conditional property, expected one", zzeo.zzn(str), this.zzs.zzj().zzf(str2));
                    }
                    cursorQuery.close();
                    return zzacVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    this.zzs.zzay().zzd().zzd("Error querying conditional property", zzeo.zzn(str), this.zzs.zzj().zzf(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    public final zzak zzl(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return zzm(j10, str, 1L, false, false, z12, false, z14);
    }

    public final zzak zzm(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        String[] strArr = {str};
        zzak zzakVar = new zzak();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                Cursor cursorQuery = sQLiteDatabaseZzh.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    this.zzs.zzay().zzk().zzb("Not updating daily counts, app is not known. appId", zzeo.zzn(str));
                    cursorQuery.close();
                    return zzakVar;
                }
                if (cursorQuery.getLong(0) == j10) {
                    zzakVar.zzb = cursorQuery.getLong(1);
                    zzakVar.zza = cursorQuery.getLong(2);
                    zzakVar.zzc = cursorQuery.getLong(3);
                    zzakVar.zzd = cursorQuery.getLong(4);
                    zzakVar.zze = cursorQuery.getLong(5);
                }
                if (z10) {
                    zzakVar.zzb += j11;
                }
                if (z11) {
                    zzakVar.zza += j11;
                }
                if (z12) {
                    zzakVar.zzc += j11;
                }
                if (z13) {
                    zzakVar.zzd += j11;
                }
                if (z14) {
                    zzakVar.zze += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(zzakVar.zza));
                contentValues.put("daily_events_count", Long.valueOf(zzakVar.zzb));
                contentValues.put("daily_conversions_count", Long.valueOf(zzakVar.zzc));
                contentValues.put("daily_error_events_count", Long.valueOf(zzakVar.zzd));
                contentValues.put("daily_realtime_events_count", Long.valueOf(zzakVar.zze));
                sQLiteDatabaseZzh.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return zzakVar;
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzc("Error updating daily counts. appId", zzeo.zzn(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return zzakVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0150  */
    public final zzas zzn(String str, String str2) {
        Cursor cursor;
        Cursor cursor2;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor3 = null;
        try {
            Cursor cursorQuery = zzh().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                long j10 = cursorQuery.getLong(0);
                long j11 = cursorQuery.getLong(1);
                long j12 = cursorQuery.getLong(2);
                long j13 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                if (cursorQuery.isNull(7)) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                }
                cursor2 = cursorQuery;
                try {
                    zzas zzasVar = new zzas(str, str2, j10, j11, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j12, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursor2.moveToNext()) {
                        this.zzs.zzay().zzd().zzb("Got multiple records for event aggregates, expected one. appId", zzeo.zzn(str));
                    }
                    cursor2.close();
                    return zzasVar;
                } catch (SQLiteException e10) {
                    e = e10;
                } catch (Throwable th) {
                    th = th;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursor2 = cursorQuery;
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursorQuery;
            }
            cursor = cursor2;
        } catch (SQLiteException e12) {
            e = e12;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
        }
        try {
            this.zzs.zzay().zzd().zzd("Error querying events. appId", zzeo.zzn(str), this.zzs.zzj().zzd(str2), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            cursor3 = cursor;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a6  */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    public final zzle zzp(String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        zzg();
        zzW();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = zzh().query("user_attributes", new String[]{"set_timestamp", "value", AppMeasurementSdk.ConditionalUserProperty.ORIGIN}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j10 = cursorQuery.getLong(0);
                    Object objZzq = zzq(cursorQuery, 1);
                    if (objZzq == null) {
                        cursorQuery.close();
                        return null;
                    }
                    zzle zzleVar = new zzle(str, cursorQuery.getString(2), str2, j10, objZzq);
                    if (cursorQuery.moveToNext()) {
                        this.zzs.zzay().zzd().zzb("Got multiple records for user property, expected one. appId", zzeo.zzn(str));
                    }
                    cursorQuery.close();
                    return zzleVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    this.zzs.zzay().zzd().zzd("Error querying user property. appId", zzeo.zzn(str), this.zzs.zzj().zzf(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    @VisibleForTesting
    public final Object zzq(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            a.a(this.zzs, "Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.zzs.zzay().zzd().zzb("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        a.a(this.zzs, "Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0040  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public final String zzr() throws Throwable {
        SQLiteException e10;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseZzh = zzh();
        ?? r10 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseZzh.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e11) {
                    e10 = e11;
                    this.zzs.zzay().zzd().zzb("Database error getting next bundle app id", e10);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                r10 = sQLiteDatabaseZzh;
                th = th;
                if (r10 != 0) {
                    r10.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    public final List zzs(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat(Marker.ANY_MARKER));
            sb2.append(" and name glob ?");
        }
        return zzt(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public final List zzt(String str, String[] strArr) {
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                String[] strArr2 = {"app_id", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "name", "value", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, "timed_out_event", AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, "triggered_event", AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, "expired_event"};
                this.zzs.zzf();
                cursorQuery = sQLiteDatabaseZzh.query("conditional_properties", strArr2, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    int size = arrayList.size();
                    this.zzs.zzf();
                    if (size >= 1000) {
                        zzem zzemVarZzd = this.zzs.zzay().zzd();
                        this.zzs.zzf();
                        zzemVarZzd.zzb("Read more than the max allowed conditional properties, ignoring extra", 1000);
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objZzq = zzq(cursorQuery, 3);
                    boolean z10 = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j10 = cursorQuery.getLong(6);
                    zzlb zzlbVarZzu = this.zzf.zzu();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) zzlbVarZzu.zzh(blob, creator);
                    arrayList.add(new zzac(string, string2, new zzlc(string3, cursorQuery.getLong(10), objZzq, string2), cursorQuery.getLong(8), z10, string4, zzawVar, j10, (zzaw) this.zzf.zzu().zzh(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzaw) this.zzf.zzu().zzh(cursorQuery.getBlob(12), creator)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzb("Error querying conditional user property value", e10);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public final List zzu(String str) {
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.zzs.zzf();
                cursorQuery = zzh().query("user_attributes", new String[]{"name", AppMeasurementSdk.ConditionalUserProperty.ORIGIN, "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursorQuery.getLong(2);
                    Object objZzq = zzq(cursorQuery, 3);
                    if (objZzq == null) {
                        this.zzs.zzay().zzd().zzb("Read invalid user property value, ignoring it. appId", zzeo.zzn(str));
                    } else {
                        arrayList.add(new zzle(str, str2, string, j10, objZzq));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzc("Error querying user properties. appId", zzeo.zzn(str), e10);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0124  */
    public final List zzv(String str, String str2, String str3) {
        String string;
        Preconditions.checkNotEmpty(str);
        zzg();
        zzW();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                try {
                    arrayList2.add(str);
                    StringBuilder sb2 = new StringBuilder("app_id=?");
                    if (TextUtils.isEmpty(str2)) {
                        string = str2;
                    } else {
                        string = str2;
                        try {
                            arrayList2.add(string);
                            sb2.append(" and origin=?");
                        } catch (SQLiteException e10) {
                            e = e10;
                            this.zzs.zzay().zzd().zzd("(2)Error querying user properties", zzeo.zzn(str), string, e);
                            List listEmptyList = Collections.emptyList();
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            return listEmptyList;
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        arrayList2.add(str3 + Marker.ANY_MARKER);
                        sb2.append(" and name glob ?");
                    }
                    String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                    SQLiteDatabase sQLiteDatabaseZzh = zzh();
                    String[] strArr2 = {"name", "set_timestamp", "value", AppMeasurementSdk.ConditionalUserProperty.ORIGIN};
                    String string2 = sb2.toString();
                    this.zzs.zzf();
                    cursorQuery = sQLiteDatabaseZzh.query("user_attributes", strArr2, string2, strArr, null, null, "rowid", "1001");
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                    do {
                        int size = arrayList.size();
                        this.zzs.zzf();
                        if (size >= 1000) {
                            zzem zzemVarZzd = this.zzs.zzay().zzd();
                            this.zzs.zzf();
                            zzemVarZzd.zzb("Read more than the max allowed user properties, ignoring excess", 1000);
                            break;
                        }
                        String string3 = cursorQuery.getString(0);
                        long j10 = cursorQuery.getLong(1);
                        Object objZzq = zzq(cursorQuery, 2);
                        string = cursorQuery.getString(3);
                        if (objZzq == null) {
                            this.zzs.zzay().zzd().zzd("(2)Read invalid user property value, ignoring it", zzeo.zzn(str), string, str3);
                        } else {
                            arrayList.add(new zzle(str, string, string3, j10, objZzq));
                        }
                    } while (cursorQuery.moveToNext());
                    cursorQuery.close();
                    return arrayList;
                } catch (SQLiteException e11) {
                    e = e11;
                    string = str2;
                    this.zzs.zzay().zzd().zzd("(2)Error querying user properties", zzeo.zzn(str), string, e);
                    List listEmptyList2 = Collections.emptyList();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return listEmptyList2;
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e12) {
            e = e12;
        }
    }

    public final void zzw() {
        zzW();
        zzh().beginTransaction();
    }

    public final void zzx() {
        zzW();
        zzh().endTransaction();
    }

    @VisibleForTesting
    public final void zzy(List list) {
        zzg();
        zzW();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (zzI()) {
            String strA = j.a("(", TextUtils.join(",", list), ")");
            if (zzZ(j.a("SELECT COUNT(1) FROM queue WHERE rowid IN ", strA, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                this.zzs.zzay().zzk().zza("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                zzh().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strA + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                this.zzs.zzay().zzd().zzb("Error incrementing retry count. error", e10);
            }
        }
    }

    public final void zzz() {
        zzg();
        zzW();
        if (zzI()) {
            long jZza = this.zzf.zzs().zza.zza();
            long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jZza);
            this.zzs.zzf();
            if (jAbs > ((Long) zzeb.zzx.zza(null)).longValue()) {
                this.zzf.zzs().zza.zzb(jElapsedRealtime);
                zzg();
                zzW();
                if (zzI()) {
                    SQLiteDatabase sQLiteDatabaseZzh = zzh();
                    this.zzs.zzf();
                    int iDelete = sQLiteDatabaseZzh.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.zzs.zzav().currentTimeMillis()), String.valueOf(zzag.zzA())});
                    if (iDelete > 0) {
                        this.zzs.zzay().zzj().zzb("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }
}
