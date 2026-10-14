package com.google.android.gms.internal.consent_sdk;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcg<T> implements zzcl<T> {
    private static final Object zza = new Object();
    private volatile zzcl<T> zzb;
    private volatile Object zzc = zza;

    private zzcg(zzcl<T> zzclVar) {
        this.zzb = zzclVar;
    }

    public static <P extends zzcl<T>, T> zzcl<T> zza(P p10) {
        Objects.requireNonNull(p10);
        return p10 instanceof zzcg ? p10 : new zzcg(p10);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzcl
    public final T zzb() {
        T tZzb = (T) this.zzc;
        Object obj = zza;
        if (tZzb == obj) {
            synchronized (this) {
                tZzb = (T) this.zzc;
                if (tZzb == obj) {
                    tZzb = this.zzb.zzb();
                    Object obj2 = this.zzc;
                    if (obj2 != obj && !(obj2 instanceof zzcj) && obj2 != tZzb) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tZzb);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb2.append("Scoped provider was invoked recursively returning different results: ");
                        sb2.append(strValueOf);
                        sb2.append(" & ");
                        sb2.append(strValueOf2);
                        sb2.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    this.zzc = tZzb;
                    this.zzb = null;
                }
            }
        }
        return tZzb;
    }
}
