package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcqj extends zzcpb {
    private final zzbgi zzc;
    private final Runnable zzd;
    private final Executor zze;

    public zzcqj(zzcrc zzcrcVar, zzbgi zzbgiVar, Runnable runnable, Executor executor) {
        super(zzcrcVar);
        this.zzc = zzbgiVar;
        this.zzd = runnable;
        this.zze = executor;
    }

    public static /* synthetic */ void zzi(AtomicReference atomicReference) {
        Runnable runnable = (Runnable) atomicReference.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcpb
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcpb
    public final View zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpb
    public final com.google.android.gms.ads.internal.client.zzdq zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpb
    public final zzezo zze() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpb
    public final zzezo zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcpb
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcpb
    public final void zzh(ViewGroup viewGroup, com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcrd
    public final void zzj() {
        final zzcqh zzcqhVar = new zzcqh(new AtomicReference(this.zzd));
        this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqi
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk(zzcqhVar);
            }
        });
    }

    public final /* synthetic */ void zzk(Runnable runnable) {
        try {
            if (this.zzc.zzb(ObjectWrapper.wrap(runnable))) {
                return;
            }
            zzi(((zzcqh) runnable).zza);
        } catch (RemoteException unused) {
            zzi(((zzcqh) runnable).zza);
        }
    }
}
