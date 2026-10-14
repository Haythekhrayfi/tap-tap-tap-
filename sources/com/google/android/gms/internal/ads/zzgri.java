package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
final class zzgri extends zzgnw {
    public final zzgrm zza;
    public zzgny zzb = zzb();
    public final /* synthetic */ zzgro zzc;

    public zzgri(zzgro zzgroVar) {
        this.zzc = zzgroVar;
        this.zza = new zzgrm(zzgroVar, null);
    }

    private final zzgny zzb() {
        zzgrm zzgrmVar = this.zza;
        if (zzgrmVar.hasNext()) {
            return zzgrmVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgny
    public final byte zza() {
        zzgny zzgnyVar = this.zzb;
        if (zzgnyVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgnyVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
