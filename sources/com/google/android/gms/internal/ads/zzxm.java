package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzxm {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzxn zzxnVar) {
        zzc(zzxnVar);
        this.zza.add(new zzxl(handler, zzxnVar));
    }

    public final void zzb(final int i10, final long j10, final long j11) {
        for (final zzxl zzxlVar : this.zza) {
            if (!zzxlVar.zzc) {
                zzxlVar.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxk
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzxl zzxlVar2 = zzxlVar;
                        zzxlVar2.zzb.zzV(i10, j10, j11);
                    }
                });
            }
        }
    }

    public final void zzc(zzxn zzxnVar) {
        for (zzxl zzxlVar : this.zza) {
            if (zzxlVar.zzb == zzxnVar) {
                zzxlVar.zzc();
                this.zza.remove(zzxlVar);
            }
        }
    }
}
