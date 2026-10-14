package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzjt {
    private static final zzjr zza = new zzjs();
    private static final zzjr zzb;

    static {
        zzjr zzjrVar;
        try {
            zzjrVar = (zzjr) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzjrVar = null;
        }
        zzb = zzjrVar;
    }

    public static zzjr zza() {
        zzjr zzjrVar = zzb;
        if (zzjrVar != null) {
            return zzjrVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzjr zzb() {
        return zza;
    }
}
