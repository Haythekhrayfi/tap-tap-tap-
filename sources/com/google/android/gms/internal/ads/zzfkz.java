package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfkz {
    private static final HashMap zza = new HashMap();
    private final Context zzb;
    private final zzfla zzc;
    private final zzfjb zzd;
    private final zzfiw zze;
    private zzfko zzf;
    private final Object zzg = new Object();

    public zzfkz(Context context, zzfla zzflaVar, zzfjb zzfjbVar, zzfiw zzfiwVar) {
        this.zzb = context;
        this.zzc = zzflaVar;
        this.zzd = zzfjbVar;
        this.zze = zzfiwVar;
    }

    private final synchronized Class zzd(zzfkp zzfkpVar) throws zzfky {
        String strZzk = zzfkpVar.zza().zzk();
        HashMap map = zza;
        Class cls = (Class) map.get(strZzk);
        if (cls != null) {
            return cls;
        }
        try {
            if (!this.zze.zza(zzfkpVar.zzc())) {
                throw new zzfky(2026, "VM did not pass signature verification");
            }
            try {
                File fileZzb = zzfkpVar.zzb();
                if (!fileZzb.exists()) {
                    fileZzb.mkdirs();
                }
                Class clsLoadClass = new DexClassLoader(zzfkpVar.zzc().getAbsolutePath(), fileZzb.getAbsolutePath(), null, this.zzb.getClassLoader()).loadClass("com.google.ccc.abuse.droidguard.DroidGuard");
                map.put(strZzk, clsLoadClass);
                return clsLoadClass;
            } catch (ClassNotFoundException | IllegalArgumentException | SecurityException e10) {
                throw new zzfky(AdError.REMOTE_ADS_SERVICE_ERROR, e10);
            }
        } catch (GeneralSecurityException e11) {
            throw new zzfky(2026, e11);
        }
    }

    public final zzfje zza() {
        zzfko zzfkoVar;
        synchronized (this.zzg) {
            zzfkoVar = this.zzf;
        }
        return zzfkoVar;
    }

    public final zzfkp zzb() {
        synchronized (this.zzg) {
            zzfko zzfkoVar = this.zzf;
            if (zzfkoVar == null) {
                return null;
            }
            return zzfkoVar.zzf();
        }
    }

    public final boolean zzc(zzfkp zzfkpVar) {
        int iZza;
        Exception exc;
        zzfjb zzfjbVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                zzfko zzfkoVar = new zzfko(zzd(zzfkpVar).getDeclaredConstructor(Context.class, String.class, byte[].class, Object.class, Bundle.class, Integer.TYPE).newInstance(this.zzb, "msa-r", zzfkpVar.zze(), null, new Bundle(), 2), zzfkpVar, this.zzc, this.zzd);
                if (!zzfkoVar.zzh()) {
                    throw new zzfky(4000, "init failed");
                }
                int iZze = zzfkoVar.zze();
                if (iZze != 0) {
                    throw new zzfky(4001, "ci: " + iZze);
                }
                synchronized (this.zzg) {
                    zzfko zzfkoVar2 = this.zzf;
                    if (zzfkoVar2 != null) {
                        try {
                            zzfkoVar2.zzg();
                        } catch (zzfky e10) {
                            this.zzd.zzc(e10.zza(), -1L, e10);
                        }
                        this.zzf = zzfkoVar;
                    } else {
                        this.zzf = zzfkoVar;
                    }
                    throw th;
                }
                this.zzd.zzd(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, System.currentTimeMillis() - jCurrentTimeMillis);
                return true;
            } catch (Exception e11) {
                throw new zzfky(AdError.INTERNAL_ERROR_2004, e11);
            }
        } catch (zzfky e12) {
            zzfjb zzfjbVar2 = this.zzd;
            iZza = e12.zza();
            zzfjbVar = zzfjbVar2;
            exc = e12;
            zzfjbVar.zzc(iZza, System.currentTimeMillis() - jCurrentTimeMillis, exc);
            return false;
        } catch (Exception e13) {
            iZza = 4010;
            zzfjbVar = this.zzd;
            exc = e13;
            zzfjbVar.zzc(iZza, System.currentTimeMillis() - jCurrentTimeMillis, exc);
            return false;
        }
    }
}
