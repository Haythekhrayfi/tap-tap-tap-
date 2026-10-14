package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;

/* JADX INFO: loaded from: classes2.dex */
final class zzarr implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ zzart zzb;

    public zzarr(zzart zzartVar, int i10, boolean z10) {
        this.zzb = zzartVar;
        this.zza = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzaon zzaonVarZza;
        zzart zzartVar = this.zzb;
        int i10 = this.zza;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzartVar.zza.getPackageManager().getPackageInfo(zzartVar.zza.getPackageName(), 0);
            Context context = zzartVar.zza;
            zzaonVarZza = zzfjj.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzaonVarZza = null;
        }
        this.zzb.zzm = zzaonVarZza;
        if (this.zza < 4) {
            if (zzaonVarZza != null && zzaonVarZza.zzaj() && !zzaonVarZza.zzh().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzaonVarZza.zzak() && zzaonVarZza.zzf().zze() && zzaonVarZza.zzf().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
