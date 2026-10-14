package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfrn extends zzftl implements Serializable {
    public final Comparator zza;

    public zzfrn(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzftl, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrn) {
            return this.zza.equals(((zzfrn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
