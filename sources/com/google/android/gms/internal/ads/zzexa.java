package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzexa {
    private final zzfbu zza;
    private final zzcun zzb;
    private final Executor zzc;
    private zzewz zzd;

    public zzexa(zzfbu zzfbuVar, zzcun zzcunVar, Executor executor) {
        this.zza = zzfbuVar;
        this.zzb = zzcunVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfce zze() {
        zzfai zzfaiVarZzg = this.zzb.zzg();
        return this.zza.zzc(zzfaiVarZzg.zzd, zzfaiVarZzg.zzf, zzfaiVarZzg.zzj);
    }

    public final zzfwm zzc() {
        zzfwm zzfwmVarZze;
        zzewz zzewzVar = this.zzd;
        if (zzewzVar != null) {
            return zzfwc.zzh(zzewzVar);
        }
        if (((Boolean) zzbdl.zza.zze()).booleanValue()) {
            zzfwmVarZze = zzfwc.zze(zzfwc.zzl(zzfvt.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzewx(this), this.zzc), zzdwa.class, new zzeww(this), this.zzc);
        } else {
            zzewz zzewzVar2 = new zzewz(null, zze(), null);
            this.zzd = zzewzVar2;
            zzfwmVarZze = zzfwc.zzh(zzewzVar2);
        }
        return zzfwc.zzl(zzfwmVarZze, new zzfov() { // from class: com.google.android.gms.internal.ads.zzewv
            @Override // com.google.android.gms.internal.ads.zzfov
            public final Object apply(Object obj) {
                return (zzewz) obj;
            }
        }, this.zzc);
    }
}
