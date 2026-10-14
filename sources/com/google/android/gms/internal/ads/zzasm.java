package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasm implements Callable {
    private final zzart zza;
    private final zzanq zzb;

    public zzasm(zzart zzartVar, zzanq zzanqVar) {
        this.zza = zzartVar;
        this.zzb = zzanqVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzaon zzaonVarZzc = this.zza.zzc();
        if (zzaonVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                try {
                    zzanq zzanqVar = this.zzb;
                    byte[] bArrZzax = zzaonVarZzc.zzax();
                    zzanqVar.zzak(bArrZzax, 0, bArrZzax.length, zzgoy.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzgpy | NullPointerException unused) {
            return null;
        }
    }
}
