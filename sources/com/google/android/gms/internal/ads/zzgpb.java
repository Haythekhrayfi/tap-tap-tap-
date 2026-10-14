package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgpb {
    private static final zzgoz zza = new zzgpa();
    private static final zzgoz zzb;

    static {
        zzgoz zzgozVar;
        try {
            zzgozVar = (zzgoz) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgozVar = null;
        }
        zzb = zzgozVar;
    }

    public static zzgoz zza() {
        zzgoz zzgozVar = zzb;
        if (zzgozVar != null) {
            return zzgozVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzgoz zzb() {
        return zza;
    }
}
