package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes2.dex */
final class zzlr {
    private static final zzlq zza;
    private static final zzlq zzb;

    static {
        zzlq zzlqVar;
        try {
            zzlqVar = (zzlq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzlqVar = null;
        }
        zza = zzlqVar;
        zzb = new zzlq();
    }

    public static zzlq zza() {
        return zza;
    }

    public static zzlq zzb() {
        return zzb;
    }
}
