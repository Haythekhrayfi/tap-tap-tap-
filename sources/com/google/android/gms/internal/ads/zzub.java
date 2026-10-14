package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzub implements zzxa {
    private final zzxa zza;
    private final zzcy zzb;

    public zzub(zzxa zzxaVar, zzcy zzcyVar) {
        this.zza = zzxaVar;
        this.zzb = zzcyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzub)) {
            return false;
        }
        zzub zzubVar = (zzub) obj;
        return this.zza.equals(zzubVar.zza) && this.zzb.equals(zzubVar.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + 527) * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final int zza(int i10) {
        return this.zza.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final int zzb(int i10) {
        return this.zza.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final zzam zzd(int i10) {
        return this.zza.zzd(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzxe
    public final zzcy zze() {
        return this.zzb;
    }
}
