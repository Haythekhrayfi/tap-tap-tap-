package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfcg implements zzfce {
    private final String zza;

    public zzfcg(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfce
    public final boolean equals(Object obj) {
        if (obj instanceof zzfcg) {
            return this.zza.equals(((zzfcg) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfce
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
