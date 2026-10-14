package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzadl implements zzaaz {
    private final long zzb;
    private final zzaaz zzc;

    public zzadl(long j10, zzaaz zzaazVar) {
        this.zzb = j10;
        this.zzc = zzaazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzC() {
        this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final void zzN(zzabv zzabvVar) {
        this.zzc.zzN(new zzadk(this, zzabvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaaz
    public final zzabz zzv(int i10, int i11) {
        return this.zzc.zzv(i10, i11);
    }
}
