package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzasz extends zzath {
    private final StackTraceElement[] zzi;

    public zzasz(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzartVar, "qzPpYppPAZhPHZoGToPEj4gLCkf1GlGnviIXlGI2ic/egZu+qobDN2aG3wSrxpBD", "7Q6sBeEdJYI+qvX8cIFUZRRQ8J+ckQm34FYdYCYSS2Q=", zzanqVar, i10, 45);
        this.zzi = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzi;
        if (stackTraceElementArr != null) {
            zzark zzarkVar = new zzark((String) this.zzf.invoke(null, stackTraceElementArr));
            synchronized (this.zze) {
                this.zze.zzF(zzarkVar.zza.longValue());
                if (zzarkVar.zzb.booleanValue()) {
                    this.zze.zzac(true != zzarkVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    this.zze.zzac(3);
                }
            }
        }
    }
}
