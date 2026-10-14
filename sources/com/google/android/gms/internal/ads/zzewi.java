package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzewi implements zzfco {
    private final zzexe zza;

    public zzewi(zzexe zzexeVar) {
        this.zza = zzexeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfco
    public final zzfwm zza(zzfcp zzfcpVar) {
        zzewj zzewjVar = (zzewj) zzfcpVar;
        return ((zzewf) this.zza).zzb(zzewjVar.zzb, zzewjVar.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfco
    public final void zzb(zzfcd zzfcdVar) {
        zzfcdVar.zza = ((zzewf) this.zza).zza();
    }
}
