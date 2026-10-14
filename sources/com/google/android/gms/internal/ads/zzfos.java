package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzfos implements zzfpi {
    public static zzfos zzc(char c10) {
        return new zzfop(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}
