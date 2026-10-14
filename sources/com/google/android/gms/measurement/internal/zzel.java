package com.google.android.gms.measurement.internal;

import android.util.Log;
import androidx.activity.k;

/* JADX INFO: loaded from: classes2.dex */
final class zzel implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ Object zzc;
    public final /* synthetic */ Object zzd;
    public final /* synthetic */ Object zze;
    public final /* synthetic */ zzeo zzf;

    public zzel(zzeo zzeoVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.zzf = zzeoVar;
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzeo zzeoVar;
        char c10;
        zzfd zzfdVarZzm = this.zzf.zzs.zzm();
        if (!zzfdVarZzm.zzx()) {
            Log.println(6, this.zzf.zzq(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        zzeo zzeoVar2 = this.zzf;
        if (zzeoVar2.zza == 0) {
            if (zzeoVar2.zzs.zzf().zzy()) {
                zzeoVar = this.zzf;
                zzeoVar.zzs.zzaw();
                c10 = 'C';
            } else {
                zzeoVar = this.zzf;
                zzeoVar.zzs.zzaw();
                c10 = 'c';
            }
            zzeoVar.zza = c10;
        }
        zzeo zzeoVar3 = this.zzf;
        if (zzeoVar3.zzb < 0) {
            zzeoVar3.zzs.zzf().zzh();
            zzeoVar3.zzb = 73000L;
        }
        char cCharAt = "01VDIWEA?".charAt(this.zza);
        zzeo zzeoVar4 = this.zzf;
        char c11 = zzeoVar4.zza;
        long j10 = zzeoVar4.zzb;
        String strZzo = zzeo.zzo(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(c11);
        sb2.append(j10);
        String strA = k.a(sb2, ":", strZzo);
        if (strA.length() > 1024) {
            strA = this.zzb.substring(0, 1024);
        }
        zzfb zzfbVar = zzfdVarZzm.zzb;
        if (zzfbVar != null) {
            zzfbVar.zzb(strA, 1L);
        }
    }
}
