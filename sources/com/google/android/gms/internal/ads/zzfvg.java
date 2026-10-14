package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvg extends zzfvd {
    private zzfvg() {
        super(null);
    }

    public /* synthetic */ zzfvg(zzfvf zzfvfVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final int zza(zzfvh zzfvhVar) {
        int i10;
        synchronized (zzfvhVar) {
            i10 = zzfvhVar.remaining - 1;
            zzfvhVar.remaining = i10;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfvd
    public final void zzb(zzfvh zzfvhVar, @CheckForNull Set set, Set set2) {
        synchronized (zzfvhVar) {
            if (zzfvhVar.seenExceptions == null) {
                zzfvhVar.seenExceptions = set2;
            }
        }
    }
}
