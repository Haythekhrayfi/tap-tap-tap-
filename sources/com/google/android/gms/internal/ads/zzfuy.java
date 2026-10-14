package com.google.android.gms.internal.ads;

import androidx.activity.j;
import androidx.fragment.app.w;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfuy extends zzfvs implements Runnable {
    public static final /* synthetic */ int zzc = 0;

    @CheckForNull
    public zzfwm zza;

    @CheckForNull
    public Object zzb;

    public zzfuy(zzfwm zzfwmVar, Object obj) {
        Objects.requireNonNull(zzfwmVar);
        this.zza = zzfwmVar;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfwm zzfwmVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (zzfwmVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzfwmVar.isCancelled()) {
            zzt(zzfwmVar);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzfwc.zzo(zzfwmVar));
                this.zzb = null;
                zzg(objZzf);
            } catch (Throwable th) {
                try {
                    zzfwu.zza(th);
                    zze(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zze(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e11) {
            zze(e11);
        } catch (ExecutionException e12) {
            zze(e12.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    @CheckForNull
    public final String zza() {
        zzfwm zzfwmVar = this.zza;
        Object obj = this.zzb;
        String strZza = super.zza();
        String strA = zzfwmVar != null ? j.a("inputFuture=[", zzfwmVar.toString(), "], ") : "";
        if (obj != null) {
            return w.a(strA, "function=[", obj.toString(), "]");
        }
        if (strZza != null) {
            return strA.concat(strZza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    public abstract void zzg(Object obj);
}
