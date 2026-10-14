package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzftu extends zzftl implements Serializable {
    public final zzftl zza;

    public zzftu(zzftl zzftlVar) {
        this.zza = zzftlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzftl, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftu) {
            return this.zza.equals(((zzftu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzftl
    public final zzftl zza() {
        return this.zza;
    }
}
