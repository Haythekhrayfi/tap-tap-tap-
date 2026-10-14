package com.google.android.gms.internal.ads;

import androidx.activity.j;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;
import y.q;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfuo extends zzfvs implements Runnable {

    @CheckForNull
    public zzfwm zza;

    @CheckForNull
    public Class zzb;

    @CheckForNull
    public Object zzc;

    public zzfuo(zzfwm zzfwmVar, Class cls, Object obj) {
        Objects.requireNonNull(zzfwmVar);
        this.zza = zzfwmVar;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable e10;
        Object objZzo;
        zzfwm zzfwmVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((zzfwmVar == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            e10 = zzfwmVar instanceof zzfxf ? ((zzfxf) zzfwmVar).zzm() : null;
            objZzo = e10 == null ? zzfwc.zzo(zzfwmVar) : null;
        } catch (Error e11) {
            e10 = e11;
        } catch (RuntimeException e12) {
            e10 = e12;
        } catch (ExecutionException e13) {
            Throwable cause = e13.getCause();
            if (cause == null) {
                cause = new NullPointerException(q.a("Future type ", String.valueOf(zzfwmVar.getClass()), " threw ", String.valueOf(e13.getClass()), " without a cause"));
            }
            e10 = cause;
        }
        if (e10 == null) {
            zzd(objZzo);
            return;
        }
        if (!cls.isInstance(e10)) {
            zzt(zzfwmVar);
            return;
        }
        try {
            Object objZzf = zzf(obj, e10);
            this.zzb = null;
            this.zzc = null;
            zzg(objZzf);
        } catch (Throwable th) {
            try {
                zzfwu.zza(th);
                zze(th);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    @CheckForNull
    public final String zza() {
        zzfwm zzfwmVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZza = super.zza();
        String strA = zzfwmVar != null ? j.a("inputFuture=[", zzfwmVar.toString(), "], ") : "";
        if (cls == null || obj == null) {
            if (strZza != null) {
                return strA.concat(strZza);
            }
            return null;
        }
        StringBuilder sbA = q2.a.a(strA, "exceptionType=[", cls.toString(), "], fallback=[", obj.toString());
        sbA.append("]");
        return sbA.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zzf(Object obj, Throwable th) throws Exception;

    public abstract void zzg(Object obj);
}
