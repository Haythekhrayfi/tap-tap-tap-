package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdup implements zzgwe {
    private final zzgwr zza;

    public zzdup(zzgwr zzgwrVar) {
        this.zza = zzgwrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((zzcha) this.zza).zza().getPackageName();
        zzgwm.zzb(packageName);
        return packageName;
    }
}
