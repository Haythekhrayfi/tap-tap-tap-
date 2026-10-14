package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgrc {
    private static final zzgrb zza;
    private static final zzgrb zzb;

    static {
        zzgrb zzgrbVar;
        try {
            zzgrbVar = (zzgrb) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgrbVar = null;
        }
        zza = zzgrbVar;
        zzb = new zzgrb();
    }

    public static zzgrb zza() {
        return zza;
    }

    public static zzgrb zzb() {
        return zzb;
    }
}
