package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
class zzftv extends zzfra implements Set {
    public zzftv(Set set, zzfpi zzfpiVar) {
        super(set, zzfpiVar);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return zzfty.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzfty.zza(this);
    }
}
