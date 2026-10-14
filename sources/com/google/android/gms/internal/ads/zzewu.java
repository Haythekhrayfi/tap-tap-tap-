package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzewu implements zzexe {
    private final zzexe zza;
    private zzcun zzb;

    public zzewu(zzexe zzexeVar) {
        this.zza = zzexeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcun zzd() {
        return this.zzb;
    }

    public final synchronized zzfwm zzb(zzexf zzexfVar, zzexd zzexdVar, zzcun zzcunVar) {
        this.zzb = zzcunVar;
        if (zzexfVar.zza == null) {
            return ((zzewt) this.zza).zzb(zzexfVar, zzexdVar, zzcunVar);
        }
        zzcsk zzcskVarZzb = zzcunVar.zzb();
        return zzcskVarZzb.zzi(zzcskVarZzb.zzk(zzfwc.zzh(zzexfVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzexe
    public final /* bridge */ /* synthetic */ zzfwm zzc(zzexf zzexfVar, zzexd zzexdVar, Object obj) {
        return zzb(zzexfVar, zzexdVar, null);
    }
}
