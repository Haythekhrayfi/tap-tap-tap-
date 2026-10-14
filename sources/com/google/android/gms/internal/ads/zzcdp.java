package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcdp extends zzcdl {
    public zzcdp(zzcca zzccaVar) {
        super(zzccaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzcdl
    public final boolean zzt(String str) {
        String strZze = zzbzk.zze(str);
        zzcca zzccaVar = (zzcca) this.zzc.get();
        if (zzccaVar != null && strZze != null) {
            zzccaVar.zzt(strZze, this);
        }
        zzbzr.zzj("VideoStreamNoopCache is doing nothing.");
        zzg(str, strZze, "noop", "Noop cache is a noop.");
        return false;
    }
}
