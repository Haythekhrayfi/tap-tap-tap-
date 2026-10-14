package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgwf implements zzgwe, zzgvy {
    private static final zzgwf zza = new zzgwf(null);
    private final Object zzb;

    private zzgwf(Object obj) {
        this.zzb = obj;
    }

    public static zzgwe zza(Object obj) {
        zzgwm.zza(obj, "instance cannot be null");
        return new zzgwf(obj);
    }

    public static zzgwe zzc(Object obj) {
        return obj == null ? zza : new zzgwf(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwr
    public final Object zzb() {
        return this.zzb;
    }
}
