package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes2.dex */
final class zzfvz implements Runnable {
    public final Future zza;
    public final zzfvy zzb;

    public zzfvz(Future future, zzfvy zzfvyVar) {
        this.zza = future;
        this.zzb = zzfvyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thZza;
        Object obj = this.zza;
        if ((obj instanceof zzfxf) && (thZza = zzfxg.zza((zzfxf) obj)) != null) {
            this.zzb.zza(thZza);
            return;
        }
        try {
            this.zzb.zzb(zzfwc.zzo(this.zza));
        } catch (Error e10) {
            e = e10;
            this.zzb.zza(e);
        } catch (RuntimeException e11) {
            e = e11;
            this.zzb.zza(e);
        } catch (ExecutionException e12) {
            this.zzb.zza(e12.getCause());
        }
    }

    public final String toString() {
        zzfpa zzfpaVarZza = zzfpb.zza(this);
        zzfpaVarZza.zza(this.zzb);
        return zzfpaVarZza.toString();
    }
}
