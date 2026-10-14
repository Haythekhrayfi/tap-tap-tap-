package com.google.android.gms.internal.common;

import java.io.IOException;
import java.util.Iterator;
import o2.b;

/* JADX INFO: loaded from: classes2.dex */
final class zzv implements Iterable {
    public final /* synthetic */ CharSequence zza;
    public final /* synthetic */ zzx zzb;

    public zzv(zzx zzxVar, CharSequence charSequence) {
        this.zzb = zzxVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzh(this.zza);
    }

    public final String toString() {
        StringBuilder sbA = b.a('[');
        Iterator it = iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                while (true) {
                    sbA.append(zzq.zza(next, ", "));
                    if (!it.hasNext()) {
                        break;
                    }
                    sbA.append((CharSequence) ", ");
                    next = it.next();
                }
            }
            sbA.append(']');
            return sbA.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
