package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class zzgph implements zzgqu {
    private static final zzgph zza = new zzgph();

    private zzgph() {
    }

    public static zzgph zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgqu
    public final zzgqt zzb(Class cls) {
        if (!zzgpm.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzgqt) zzgpm.zzaC(cls.asSubclass(zzgpm.class)).zzb(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgqu
    public final boolean zzc(Class cls) {
        return zzgpm.class.isAssignableFrom(cls);
    }
}
