package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzgdv {
    public static final /* synthetic */ int[] zza;
    public static final /* synthetic */ int[] zzb;

    static {
        int[] iArr = new int[zzgkj.values().length];
        zzb = iArr;
        try {
            iArr[zzgkj.SYMMETRIC.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            zzb[zzgkj.ASYMMETRIC_PRIVATE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[zzglq.values().length];
        zza = iArr2;
        try {
            iArr2[zzglq.TINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            zza[zzglq.LEGACY.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            zza[zzglq.RAW.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            zza[zzglq.CRUNCHY.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
