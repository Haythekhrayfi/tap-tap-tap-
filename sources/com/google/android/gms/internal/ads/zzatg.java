package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzatg {
    public static final String zza = "zzatg";
    private final zzart zzb;
    private final String zzc;
    private final String zzd;
    private final Class[] zzf;
    private volatile Method zze = null;
    private final CountDownLatch zzg = new CountDownLatch(1);

    public zzatg(zzart zzartVar, String str, String str2, Class... clsArr) {
        this.zzb = zzartVar;
        this.zzc = str;
        this.zzd = str2;
        this.zzf = clsArr;
        zzartVar.zzk().submit(new zzatf(this));
    }

    public static /* bridge */ /* synthetic */ void zzb(zzatg zzatgVar) {
        try {
            try {
                zzart zzartVar = zzatgVar.zzb;
                Class clsLoadClass = zzartVar.zzi().loadClass(zzatgVar.zzc(zzartVar.zzu(), zzatgVar.zzc));
                if (clsLoadClass != null) {
                    zzatgVar.zze = clsLoadClass.getMethod(zzatgVar.zzc(zzatgVar.zzb.zzu(), zzatgVar.zzd), zzatgVar.zzf);
                    Method method = zzatgVar.zze;
                }
            } finally {
                zzatgVar.zzg.countDown();
            }
        } catch (zzaqx | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        }
    }

    private final String zzc(byte[] bArr, String str) throws zzaqx, UnsupportedEncodingException {
        return new String(this.zzb.zze().zzb(bArr, str), "UTF-8");
    }

    public final Method zza() {
        if (this.zze != null) {
            return this.zze;
        }
        try {
            if (this.zzg.await(2L, TimeUnit.SECONDS)) {
                return this.zze;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
