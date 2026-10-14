package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
final class zzefq implements zzfvy {
    public final /* synthetic */ long zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzezn zzc;
    public final /* synthetic */ zzezq zzd;
    public final /* synthetic */ zzfgn zze;
    public final /* synthetic */ zzezz zzf;
    public final /* synthetic */ zzefr zzg;

    public zzefq(zzefr zzefrVar, long j10, String str, zzezn zzeznVar, zzezq zzezqVar, zzfgn zzfgnVar, zzezz zzezzVar) {
        this.zzg = zzefrVar;
        this.zza = j10;
        this.zzb = str;
        this.zzc = zzeznVar;
        this.zzd = zzezqVar;
        this.zze = zzfgnVar;
        this.zzf = zzezzVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:32:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0083  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ba  */
    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.client.zze zzeVarZzb;
        Integer numValueOf;
        int i10;
        zzefr zzefrVar;
        com.google.android.gms.ads.internal.client.zze zzeVarZza;
        int i11;
        com.google.android.gms.ads.internal.client.zze zzeVar;
        zzecg zzecgVar;
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        int i12 = 6;
        if (!(th instanceof TimeoutException)) {
            if (th instanceof zzefe) {
                i12 = 3;
            } else {
                if (!(th instanceof CancellationException)) {
                    if (th instanceof zzfan) {
                        i10 = 5;
                    } else if (th instanceof zzdtx) {
                        i12 = zzfbi.zza(th).zza == 3 ? 1 : 6;
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzby)).booleanValue() && (th instanceof zzecg) && (zzeVarZzb = ((zzecg) th).zzb()) != null) {
                            numValueOf = Integer.valueOf(zzeVarZzb.zza);
                        }
                    }
                    zzefr.zzg(this.zzg, this.zzb, i12, jElapsedRealtime, this.zzc.zzag, numValueOf);
                    zzefrVar = this.zzg;
                    if (zzefrVar.zze) {
                        zzefs zzefsVar = zzefrVar.zzb;
                        zzezq zzezqVar = this.zzd;
                        zzezn zzeznVar = this.zzc;
                        if (th instanceof zzecg) {
                            zzecgVar = (zzecg) th;
                        } else {
                            zzecgVar = null;
                        }
                        zzefsVar.zza(zzezqVar, zzeznVar, i12, zzecgVar, jElapsedRealtime);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhT)).booleanValue()) {
                        zzfgr zzfgrVar = this.zzg.zzc;
                        zzfgn zzfgnVar = this.zze;
                        zzezz zzezzVar = this.zzf;
                        zzezn zzeznVar2 = this.zzc;
                        zzfgrVar.zzd(zzfgnVar.zzc(zzezzVar, zzeznVar2, zzeznVar2.zzo));
                    }
                    zzeVarZza = zzfbi.zza(th);
                    i11 = zzeVarZza.zza;
                    if ((i11 != 3 || i11 == 0) && (zzeVar = zzeVarZza.zzd) != null && !zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                    }
                    this.zzg.zzf.zze(this.zzc, jElapsedRealtime, zzeVarZza);
                }
                i10 = 4;
            }
            numValueOf = null;
            zzefr.zzg(this.zzg, this.zzb, i12, jElapsedRealtime, this.zzc.zzag, numValueOf);
            zzefrVar = this.zzg;
            if (zzefrVar.zze) {
                zzefs zzefsVar2 = zzefrVar.zzb;
                zzezq zzezqVar2 = this.zzd;
                zzezn zzeznVar3 = this.zzc;
                if (th instanceof zzecg) {
                    zzecgVar = (zzecg) th;
                } else {
                    zzecgVar = null;
                }
                zzefsVar2.zza(zzezqVar2, zzeznVar3, i12, zzecgVar, jElapsedRealtime);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhT)).booleanValue()) {
                zzfgr zzfgrVar2 = this.zzg.zzc;
                zzfgn zzfgnVar2 = this.zze;
                zzezz zzezzVar2 = this.zzf;
                zzezn zzeznVar4 = this.zzc;
                zzfgrVar2.zzd(zzfgnVar2.zzc(zzezzVar2, zzeznVar4, zzeznVar4.zzo));
            }
            zzeVarZza = zzfbi.zza(th);
            i11 = zzeVarZza.zza;
            zzeVarZza = i11 != 3 ? zzfbi.zza(new zzecg(13, zzeVarZza.zzd)) : zzfbi.zza(new zzecg(13, zzeVarZza.zzd));
            this.zzg.zzf.zze(this.zzc, jElapsedRealtime, zzeVarZza);
        }
        i10 = 2;
        i12 = i10;
        numValueOf = null;
        zzefr.zzg(this.zzg, this.zzb, i12, jElapsedRealtime, this.zzc.zzag, numValueOf);
        zzefrVar = this.zzg;
        if (zzefrVar.zze) {
            zzefs zzefsVar3 = zzefrVar.zzb;
            zzezq zzezqVar3 = this.zzd;
            zzezn zzeznVar5 = this.zzc;
            if (th instanceof zzecg) {
                zzecgVar = (zzecg) th;
            } else {
                zzecgVar = null;
            }
            zzefsVar3.zza(zzezqVar3, zzeznVar5, i12, zzecgVar, jElapsedRealtime);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzhT)).booleanValue()) {
            zzfgr zzfgrVar3 = this.zzg.zzc;
            zzfgn zzfgnVar3 = this.zze;
            zzezz zzezzVar3 = this.zzf;
            zzezn zzeznVar6 = this.zzc;
            zzfgrVar3.zzd(zzfgnVar3.zzc(zzezzVar3, zzeznVar6, zzeznVar6.zzo));
        }
        zzeVarZza = zzfbi.zza(th);
        i11 = zzeVarZza.zza;
        if (i11 != 3) {
        }
        this.zzg.zzf.zze(this.zzc, jElapsedRealtime, zzeVarZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfvy
    public final void zzb(Object obj) {
        long jElapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        zzefr.zzg(this.zzg, this.zzb, 0, jElapsedRealtime, this.zzc.zzag, null);
        zzefr zzefrVar = this.zzg;
        if (zzefrVar.zze) {
            zzefrVar.zzb.zza(this.zzd, this.zzc, 0, null, jElapsedRealtime);
        }
        this.zzg.zzf.zzf(this.zzc, jElapsedRealtime, null);
    }
}
