package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdwq {
    private final zzfwn zza;
    private final zzfwn zzb;
    private final zzdxl zzc;
    private final zzgvy zzd;

    public zzdwq(zzfwn zzfwnVar, zzfwn zzfwnVar2, zzdxl zzdxlVar, zzgvy zzgvyVar) {
        this.zza = zzfwnVar;
        this.zzb = zzfwnVar2;
        this.zzc = zzdxlVar;
        this.zzd = zzgvyVar;
    }

    public final /* synthetic */ zzfwm zza(zzbtm zzbtmVar) throws Exception {
        return this.zzc.zza(zzbtmVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjV)).longValue());
    }

    public final /* synthetic */ zzfwm zzb(zzbtm zzbtmVar, int i10, zzdwa zzdwaVar) throws Exception {
        return ((zzdyr) this.zzd.zzb()).zzb(zzbtmVar, i10);
    }

    public final zzfwm zzc(final zzbtm zzbtmVar) {
        String str = zzbtmVar.zzf;
        com.google.android.gms.ads.internal.zzt.zzp();
        zzfwm zzfwmVarZzg = com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfwc.zzg(new zzdwa(1, "Ads service proxy force local")) : zzfwc.zzf(zzfwc.zzk(new zzfvi() { // from class: com.google.android.gms.internal.ads.zzdwn
            @Override // com.google.android.gms.internal.ads.zzfvi
            public final zzfwm zza() {
                return this.zza.zza(zzbtmVar);
            }
        }, this.zza), ExecutionException.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdwo
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                ExecutionException executionException = (ExecutionException) obj;
                Throwable cause = executionException.getCause();
                ExecutionException cause2 = executionException;
                if (cause != null) {
                    cause2 = executionException.getCause();
                }
                return zzfwc.zzg(cause2);
            }
        }, this.zzb);
        final int callingUid = Binder.getCallingUid();
        return zzfwc.zzf(zzfwmVarZzg, zzdwa.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzdwp
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzb(zzbtmVar, callingUid, (zzdwa) obj);
            }
        }, this.zzb);
    }
}
