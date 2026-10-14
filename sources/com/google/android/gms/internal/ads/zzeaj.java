package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeaj implements zzfem {
    private final zzdzx zza;
    private final zzeab zzb;

    public zzeaj(zzdzx zzdzxVar, zzeab zzeabVar) {
        this.zza = zzdzxVar;
        this.zzb = zzeabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzbB(zzfef zzfefVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzbC(zzfef zzfefVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfW)).booleanValue() && zzfef.RENDERER == zzfefVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzc(zzfef zzfefVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfW)).booleanValue()) {
            if (zzfef.RENDERER == zzfefVar) {
                this.zza.zzg(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                return;
            }
            if (zzfef.PRELOADED_LOADER == zzfefVar || zzfef.SERVER_TRANSACTION == zzfefVar) {
                this.zza.zzh(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime());
                final zzeab zzeabVar = this.zzb;
                final long jZzd = this.zza.zzd();
                zzeabVar.zza.zza(new zzfdo() { // from class: com.google.android.gms.internal.ads.zzeaa
                    @Override // com.google.android.gms.internal.ads.zzfdo
                    public final Object zza(Object obj) {
                        zzeab zzeabVar2 = zzeabVar;
                        long j10 = jZzd;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzeabVar2.zzf()) {
                            return null;
                        }
                        zzazh zzazhVarZzg = zzazi.zzg();
                        zzazhVarZzg.zzh(j10);
                        byte[] bArrZzax = ((zzazi) zzazhVarZzg.zzal()).zzax();
                        zzeai.zzg(sQLiteDatabase, false, false);
                        zzeai.zzd(sQLiteDatabase, j10, bArrZzax);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfem
    public final void zzd(zzfef zzfefVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzfW)).booleanValue() && zzfef.RENDERER == zzfefVar && this.zza.zzc() != 0) {
            this.zza.zzf(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }
}
