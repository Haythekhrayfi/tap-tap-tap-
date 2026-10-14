package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatc extends zzath {
    private static volatile Long zzi;
    private static final Object zzj = new Object();

    public zzatc(zzart zzartVar, String str, String str2, zzanq zzanqVar, int i10, int i11) {
        super(zzartVar, "pFqkMlhSSaQ2eu0bhmIAWpk2TrQlPQpWFME4RoGI1ncpKXXKi44CuFe8cYNKvx1r", "fb3OlLRM7e1GWXw1pgCRp7yxLrLt+HeY8mbhCjTXXm8=", zzanqVar, i10, 33);
    }

    @Override // com.google.android.gms.internal.ads.zzath
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzi == null) {
            synchronized (zzj) {
                if (zzi == null) {
                    zzi = (Long) this.zzf.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.zze) {
            this.zze.zzV(zzi.longValue());
        }
    }
}
