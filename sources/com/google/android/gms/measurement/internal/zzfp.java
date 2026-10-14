package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import q.f;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfp extends zzkn implements zzaf {

    @VisibleForTesting
    public final Map zza;

    @VisibleForTesting
    public final Map zzb;

    @VisibleForTesting
    public final Map zzc;

    @VisibleForTesting
    public final f zzd;
    public final com.google.android.gms.internal.measurement.zzr zze;
    private final Map zzg;
    private final Map zzh;
    private final Map zzi;
    private final Map zzj;
    private final Map zzk;
    private final Map zzl;

    public zzfp(zzkz zzkzVar) {
        super(zzkzVar);
        this.zzg = new q.a();
        this.zza = new q.a();
        this.zzb = new q.a();
        this.zzc = new q.a();
        this.zzh = new q.a();
        this.zzj = new q.a();
        this.zzk = new q.a();
        this.zzl = new q.a();
        this.zzi = new q.a();
        this.zzd = new zzfm(this, 20);
        this.zze = new zzfn(this);
    }

    private final com.google.android.gms.internal.measurement.zzfe zzA(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzfe.zzg();
        }
        try {
            com.google.android.gms.internal.measurement.zzfe zzfeVar = (com.google.android.gms.internal.measurement.zzfe) ((com.google.android.gms.internal.measurement.zzfd) zzlb.zzl(com.google.android.gms.internal.measurement.zzfe.zze(), bArr)).zzaE();
            this.zzs.zzay().zzj().zzc("Parsed config. version, gmp_app_id", zzfeVar.zzs() ? Long.valueOf(zzfeVar.zzc()) : null, zzfeVar.zzr() ? zzfeVar.zzh() : null);
            return zzfeVar;
        } catch (com.google.android.gms.internal.measurement.zzko | RuntimeException e10) {
            this.zzs.zzay().zzk().zzc("Unable to merge remote config. appId", zzeo.zzn(str), e10);
            return com.google.android.gms.internal.measurement.zzfe.zzg();
        }
    }

    private final void zzB(String str, com.google.android.gms.internal.measurement.zzfd zzfdVar) {
        HashSet hashSet = new HashSet();
        q.a aVar = new q.a();
        q.a aVar2 = new q.a();
        q.a aVar3 = new q.a();
        if (zzfdVar != null) {
            zzow.zzc();
            if (this.zzs.zzf().zzs(null, zzeb.zzal)) {
                Iterator it = zzfdVar.zzg().iterator();
                while (it.hasNext()) {
                    hashSet.add(((com.google.android.gms.internal.measurement.zzfa) it.next()).zzb());
                }
            }
            for (int i10 = 0; i10 < zzfdVar.zza(); i10++) {
                com.google.android.gms.internal.measurement.zzfb zzfbVar = (com.google.android.gms.internal.measurement.zzfb) zzfdVar.zzb(i10).zzby();
                if (zzfbVar.zzc().isEmpty()) {
                    this.zzs.zzay().zzk().zza("EventConfig contained null event name");
                } else {
                    String strZzc = zzfbVar.zzc();
                    String strZzb = zzgv.zzb(zzfbVar.zzc());
                    if (!TextUtils.isEmpty(strZzb)) {
                        zzfbVar.zzb(strZzb);
                        zzfdVar.zzd(i10, zzfbVar);
                    }
                    if (zzfbVar.zzf() && zzfbVar.zzd()) {
                        aVar.put(strZzc, Boolean.TRUE);
                    }
                    if (zzfbVar.zzg() && zzfbVar.zze()) {
                        aVar2.put(zzfbVar.zzc(), Boolean.TRUE);
                    }
                    if (zzfbVar.zzh()) {
                        if (zzfbVar.zza() < 2 || zzfbVar.zza() > 65535) {
                            this.zzs.zzay().zzk().zzc("Invalid sampling rate. Event name, sample rate", zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        } else {
                            aVar3.put(zzfbVar.zzc(), Integer.valueOf(zzfbVar.zza()));
                        }
                    }
                }
            }
        }
        this.zza.put(str, hashSet);
        this.zzb.put(str, aVar);
        this.zzc.put(str, aVar2);
        this.zzi.put(str, aVar3);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00da  */
    /* JADX WARN: Code duplicated, block: B:38:0x0125  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0122: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:36:0x0122 */
    private final void zzC(String str) throws Throwable {
        SQLiteException e10;
        Cursor cursorQuery;
        Cursor cursor;
        zzaj zzajVar;
        Map map;
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzam zzamVarZzi = this.zzf.zzi();
            Preconditions.checkNotEmpty(str);
            zzamVarZzi.zzg();
            zzamVarZzi.zzW();
            Cursor cursor2 = null;
            String str2 = null;
            try {
                try {
                    cursorQuery = zzamVarZzi.zzh().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = zzamVarZzi.zzs.zzf().zzs(null, zzeb.zzaw) ? cursorQuery.getString(2) : null;
                            if (cursorQuery.moveToNext()) {
                                zzamVarZzi.zzs.zzay().zzd().zzb("Got multiple records for app config, expected one. appId", zzeo.zzn(str));
                            }
                            if (blob != null) {
                                zzajVar = new zzaj(blob, string, string2);
                                cursorQuery.close();
                            }
                            if (zzajVar == null) {
                                this.zzg.put(str, null);
                                this.zzb.put(str, null);
                                this.zza.put(str, null);
                                this.zzc.put(str, null);
                                this.zzh.put(str, null);
                                this.zzj.put(str, null);
                                this.zzk.put(str, null);
                                this.zzl.put(str, null);
                                map = this.zzi;
                            } else {
                                com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) zzA(str, zzajVar.zza).zzby();
                                zzB(str, zzfdVar);
                                this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE()));
                                this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
                                zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
                                this.zzj.put(str, zzfdVar.zze());
                                this.zzk.put(str, zzajVar.zzb);
                                map = this.zzl;
                                str2 = zzajVar.zzc;
                            }
                            map.put(str, str2);
                        }
                    } catch (SQLiteException e11) {
                        e10 = e11;
                        zzamVarZzi.zzs.zzay().zzd().zzc("Error querying remote config. appId", zzeo.zzn(str), e10);
                        if (cursorQuery != null) {
                        }
                        zzajVar = null;
                        if (zzajVar == null) {
                            this.zzg.put(str, null);
                            this.zzb.put(str, null);
                            this.zza.put(str, null);
                            this.zzc.put(str, null);
                            this.zzh.put(str, null);
                            this.zzj.put(str, null);
                            this.zzk.put(str, null);
                            this.zzl.put(str, null);
                            map = this.zzi;
                        } else {
                            com.google.android.gms.internal.measurement.zzfd zzfdVar2 = (com.google.android.gms.internal.measurement.zzfd) zzA(str, zzajVar.zza).zzby();
                            zzB(str, zzfdVar2);
                            this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzfe) zzfdVar2.zzaE()));
                            this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar2.zzaE());
                            zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar2.zzaE());
                            this.zzj.put(str, zzfdVar2.zze());
                            this.zzk.put(str, zzajVar.zzb);
                            map = this.zzl;
                            str2 = zzajVar.zzc;
                        }
                        map.put(str, str2);
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
                e10 = e12;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            cursorQuery.close();
            zzajVar = null;
            if (zzajVar == null) {
                this.zzg.put(str, null);
                this.zzb.put(str, null);
                this.zza.put(str, null);
                this.zzc.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                map = this.zzi;
            } else {
                com.google.android.gms.internal.measurement.zzfd zzfdVar3 = (com.google.android.gms.internal.measurement.zzfd) zzA(str, zzajVar.zza).zzby();
                zzB(str, zzfdVar3);
                this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzfe) zzfdVar3.zzaE()));
                this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar3.zzaE());
                zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar3.zzaE());
                this.zzj.put(str, zzfdVar3.zze());
                this.zzk.put(str, zzajVar.zzb);
                map = this.zzl;
                str2 = zzajVar.zzc;
            }
            map.put(str, str2);
        }
    }

    private final void zzD(final String str, com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        if (zzfeVar.zza() == 0) {
            this.zzd.remove(str);
            return;
        }
        this.zzs.zzay().zzj().zzb("EES programs found", Integer.valueOf(zzfeVar.zza()));
        com.google.android.gms.internal.measurement.zzgs zzgsVar = (com.google.android.gms.internal.measurement.zzgs) zzfeVar.zzm().get(0);
        try {
            com.google.android.gms.internal.measurement.zzc zzcVar = new com.google.android.gms.internal.measurement.zzc();
            zzcVar.zzd("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzn("internal.remoteConfig", new zzfo(this.zza, str));
                }
            });
            zzcVar.zzd("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzfp zzfpVar = this.zza;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzu("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzfp zzfpVar2 = zzfpVar;
                            String str3 = str2;
                            zzh zzhVarZzj = zzfpVar2.zzf.zzi().zzj(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            zzfpVar2.zzs.zzf().zzh();
                            map.put("gmp_version", 73000L);
                            if (zzhVarZzj != null) {
                                String strZzw = zzhVarZzj.zzw();
                                if (strZzw != null) {
                                    map.put("app_version", strZzw);
                                }
                                map.put("app_version_int", Long.valueOf(zzhVarZzj.zzb()));
                                map.put("dynamite_version", Long.valueOf(zzhVarZzj.zzk()));
                            }
                            return map;
                        }
                    });
                }
            });
            zzcVar.zzd("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzfl
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzt(this.zza.zze);
                }
            });
            zzcVar.zzc(zzgsVar);
            this.zzd.put(str, zzcVar);
            this.zzs.zzay().zzj().zzc("EES program loaded for appId, activities", str, Integer.valueOf(zzgsVar.zza().zza()));
            Iterator it = zzgsVar.zza().zzd().iterator();
            while (it.hasNext()) {
                this.zzs.zzay().zzj().zzb("EES program activity", ((com.google.android.gms.internal.measurement.zzgq) it.next()).zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzd unused) {
            this.zzs.zzay().zzd().zzb("Failed to load EES program. appId", str);
        }
    }

    private static final Map zzE(com.google.android.gms.internal.measurement.zzfe zzfeVar) {
        q.a aVar = new q.a();
        if (zzfeVar != null) {
            for (com.google.android.gms.internal.measurement.zzfi zzfiVar : zzfeVar.zzn()) {
                aVar.put(zzfiVar.zzb(), zzfiVar.zzc());
            }
        }
        return aVar;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.internal.measurement.zzc zzd(zzfp zzfpVar, String str) throws Throwable {
        zzfpVar.zzW();
        Preconditions.checkNotEmpty(str);
        if (!zzfpVar.zzo(str)) {
            return null;
        }
        if (!zzfpVar.zzh.containsKey(str) || zzfpVar.zzh.get(str) == null) {
            zzfpVar.zzC(str);
        } else {
            zzfpVar.zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzfpVar.zzh.get(str));
        }
        return (com.google.android.gms.internal.measurement.zzc) zzfpVar.zzd.snapshot().get(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzaf
    public final String zza(String str, String str2) throws Throwable {
        zzg();
        zzC(str);
        Map map = (Map) this.zzg.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final boolean zzb() {
        return false;
    }

    public final int zzc(String str, String str2) throws Throwable {
        Integer num;
        zzg();
        zzC(str);
        Map map = (Map) this.zzi.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.zzfe zze(String str) {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        zzC(str);
        return (com.google.android.gms.internal.measurement.zzfe) this.zzh.get(str);
    }

    public final String zzf(String str) {
        zzg();
        return (String) this.zzl.get(str);
    }

    public final String zzh(String str) {
        zzg();
        return (String) this.zzk.get(str);
    }

    public final String zzi(String str) throws Throwable {
        zzg();
        zzC(str);
        return (String) this.zzj.get(str);
    }

    public final Set zzk(String str) {
        zzg();
        zzC(str);
        return (Set) this.zza.get(str);
    }

    public final void zzl(String str) {
        zzg();
        this.zzk.put(str, null);
    }

    public final void zzm(String str) {
        zzg();
        this.zzh.remove(str);
    }

    public final boolean zzn(String str) {
        zzg();
        com.google.android.gms.internal.measurement.zzfe zzfeVarZze = zze(str);
        if (zzfeVarZze == null) {
            return false;
        }
        return zzfeVarZze.zzq();
    }

    public final boolean zzo(String str) {
        com.google.android.gms.internal.measurement.zzfe zzfeVar;
        return (TextUtils.isEmpty(str) || (zzfeVar = (com.google.android.gms.internal.measurement.zzfe) this.zzh.get(str)) == null || zzfeVar.zza() == 0) ? false : true;
    }

    public final boolean zzp(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzq(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzC(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.zzc.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzr(String str, String str2) throws Throwable {
        Boolean bool;
        zzg();
        zzC(str);
        if (zzp(str) && zzlh.zzah(str2)) {
            return true;
        }
        if (zzs(str) && zzlh.zzai(str2)) {
            return true;
        }
        Map map = (Map) this.zzb.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean zzs(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzt(String str, byte[] bArr, String str2, String str3) throws Throwable {
        zzW();
        zzg();
        Preconditions.checkNotEmpty(str);
        com.google.android.gms.internal.measurement.zzfd zzfdVar = (com.google.android.gms.internal.measurement.zzfd) zzA(str, bArr).zzby();
        if (zzfdVar == null) {
            return false;
        }
        zzB(str, zzfdVar);
        zzD(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
        this.zzj.put(str, zzfdVar.zze());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzg.put(str, zzE((com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE()));
        this.zzf.zzi().zzB(str, new ArrayList(zzfdVar.zzf()));
        try {
            zzfdVar.zzc();
            bArr = ((com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE()).zzbv();
        } catch (RuntimeException e10) {
            this.zzs.zzay().zzk().zzc("Unable to serialize reduced-size config. Storing full config instead. appId", zzeo.zzn(str), e10);
        }
        zzam zzamVarZzi = this.zzf.zzi();
        Preconditions.checkNotEmpty(str);
        zzamVarZzi.zzg();
        zzamVarZzi.zzW();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        if (zzamVarZzi.zzs.zzf().zzs(null, zzeb.zzaw)) {
            contentValues.put("e_tag", str3);
        }
        try {
            if (zzamVarZzi.zzh().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzamVarZzi.zzs.zzay().zzd().zzb("Failed to update remote config (got 0). appId", zzeo.zzn(str));
            }
        } catch (SQLiteException e11) {
            zzamVarZzi.zzs.zzay().zzd().zzc("Error storing remote config. appId", zzeo.zzn(str), e11);
        }
        this.zzh.put(str, (com.google.android.gms.internal.measurement.zzfe) zzfdVar.zzaE());
        return true;
    }

    public final boolean zzu(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("app_instance_id");
    }

    public final boolean zzv(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && (((Set) this.zza.get(str)).contains("device_model") || ((Set) this.zza.get(str)).contains("device_info"));
    }

    public final boolean zzw(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("enhanced_user_id");
    }

    public final boolean zzx(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("google_signals");
    }

    public final boolean zzy(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && (((Set) this.zza.get(str)).contains("os_version") || ((Set) this.zza.get(str)).contains("device_info"));
    }

    public final boolean zzz(String str) throws Throwable {
        zzg();
        zzC(str);
        return this.zza.get(str) != null && ((Set) this.zza.get(str)).contains("user_id");
    }
}
