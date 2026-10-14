package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqo {
    public final int zza;
    public final zzto zzb;
    private final CopyOnWriteArrayList zzc;

    public zzqo() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    private zzqo(CopyOnWriteArrayList copyOnWriteArrayList, int i10, zzto zztoVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zztoVar;
    }

    public final zzqo zza(int i10, zzto zztoVar) {
        return new zzqo(this.zzc, 0, zztoVar);
    }

    public final void zzb(Handler handler, zzqp zzqpVar) {
        this.zzc.add(new zzqn(handler, zzqpVar));
    }

    public final void zzc(zzqp zzqpVar) {
        for (zzqn zzqnVar : this.zzc) {
            if (zzqnVar.zzb == zzqpVar) {
                this.zzc.remove(zzqnVar);
            }
        }
    }
}
