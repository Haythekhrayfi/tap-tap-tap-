package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzfxa extends zzfwl {
    public final /* synthetic */ zzfxc zza;
    private final zzfvi zzb;

    public zzfxa(zzfxc zzfxcVar, zzfvi zzfviVar) {
        this.zza = zzfxcVar;
        this.zzb = zzfviVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfwm zzfwmVarZza = this.zzb.zza();
        zzfph.zzd(zzfwmVarZza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zzfwmVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final String zzb() {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzt((zzfwm) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfwl
    public final boolean zzg() {
        return this.zza.isDone();
    }
}
