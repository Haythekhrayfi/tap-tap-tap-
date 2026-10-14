package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvp extends zzfvb {

    @CheckForNull
    private zzfvo zza;

    public zzfvp(zzfrx zzfrxVar, boolean z10, Executor executor, Callable callable) {
        super(zzfrxVar, z10, false);
        this.zza = new zzfvn(this, callable, executor);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final void zzg(int i10, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzr() {
        zzfvo zzfvoVar = this.zza;
        if (zzfvoVar != null) {
            zzfvoVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final void zzv() {
        zzfvo zzfvoVar = this.zza;
        if (zzfvoVar != null) {
            zzfvoVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvb
    public final void zzz(int i10) {
        super.zzz(i10);
        if (i10 == 1) {
            this.zza = null;
        }
    }
}
