package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfpk implements Serializable, zzfpi {
    private final List zza;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfpk) {
            return this.zza.equals(((zzfpk) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z10 = true;
        for (Object obj : list) {
            if (!z10) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpi
    public final boolean zza(Object obj) {
        for (int i10 = 0; i10 < this.zza.size(); i10++) {
            if (!((zzfpi) this.zza.get(i10)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
