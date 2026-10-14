package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzchb implements zzgwe {
    private final zzcgx zza;

    public zzchb(zzcgx zzcgxVar) {
        this.zza = zzcgxVar;
    }

    public final WeakReference zza() {
        WeakReference weakReferenceZzf = this.zza.zzf();
        zzgwm.zzb(weakReferenceZzf);
        return weakReferenceZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final /* synthetic */ Object zzb() {
        WeakReference weakReferenceZzf = this.zza.zzf();
        zzgwm.zzb(weakReferenceZzf);
        return weakReferenceZzf;
    }
}
