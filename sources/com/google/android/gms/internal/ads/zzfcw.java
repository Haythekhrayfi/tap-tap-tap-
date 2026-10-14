package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcw {
    private final zzfcp zza;
    private final zzfwm zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfcw(final zzfbu zzfbuVar, final zzfco zzfcoVar, final zzfcp zzfcpVar) {
        this.zza = zzfcpVar;
        this.zzb = zzfwc.zzf(zzfwc.zzm(zzfcoVar.zza(zzfcpVar), new zzfvj() { // from class: com.google.android.gms.internal.ads.zzfcu
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzb(zzfcoVar, zzfbuVar, zzfcpVar, (zzfcd) obj);
            }
        }, zzfcpVar.zzb()), Exception.class, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzfcv
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return this.zza.zzc(zzfcoVar, (Exception) obj);
            }
        }, zzfcpVar.zzb());
    }

    public final synchronized zzfwm zza(zzfcp zzfcpVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zza() != null && zzfcpVar.zza() != null && this.zza.zza().equals(zzfcpVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ zzfwm zzb(zzfco zzfcoVar, zzfbu zzfbuVar, zzfcp zzfcpVar, zzfcd zzfcdVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfcoVar.zzb(zzfcdVar);
            if (this.zzc) {
                return zzfwc.zzh(new zzfcn(zzfcdVar, zzfcpVar));
            }
            zzfbuVar.zzd(zzfcpVar.zza(), zzfcdVar);
            return zzfwc.zzh(null);
        }
    }

    public final /* synthetic */ zzfwm zzc(zzfco zzfcoVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfvy zzfvyVar) {
        zzfwc.zzq(zzfwc.zzm(this.zzb, new zzfvj() { // from class: com.google.android.gms.internal.ads.zzfct
            @Override // com.google.android.gms.internal.ads.zzfvj
            public final zzfwm zza(Object obj) {
                return zzfwc.zzi();
            }
        }, this.zza.zzb()), zzfvyVar, this.zza.zzb());
    }
}
