package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwx implements zzgwe {
    private final zzgwr zza;

    public zzcwx(zzgwr zzgwrVar) {
        this.zza = zzgwrVar;
    }

    public static zzcww zzc(Set set) {
        return new zzcww(set);
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcww zzb() {
        return new zzcww(((zzgwp) this.zza).zzb());
    }
}
