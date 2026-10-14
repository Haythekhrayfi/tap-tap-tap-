package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.ads.AdError;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class zzfko implements zzfje {
    private final Object zza;
    private final zzfkp zzb;
    private final zzfla zzc;
    private final zzfjb zzd;

    public zzfko(Object obj, zzfkp zzfkpVar, zzfla zzflaVar, zzfjb zzfjbVar) {
        this.zza = obj;
        this.zzb = zzfkpVar;
        this.zzc = zzflaVar;
        this.zzd = zzfjbVar;
    }

    private static String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        zzaoz zzaozVarZza = zzapa.zza();
        zzaozVarZza.zzc(5);
        zzaozVarZza.zza(zzgoe.zzv(bArr, 0, bArr.length));
        return Base64.encodeToString(((zzapa) zzaozVarZza.zzal()).zzax(), 11);
    }

    private final synchronized byte[] zzj(Map map, Map map2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e10) {
            this.zzd.zzc(2007, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            return null;
        }
        return (byte[]) this.zza.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zza, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map mapZza;
        mapZza = this.zzc.zza();
        mapZza.put("f", "c");
        mapZza.put("ctx", context);
        mapZza.put("cs", str2);
        mapZza.put("aid", null);
        mapZza.put("view", view);
        mapZza.put("act", activity);
        return zzi(zzj(null, mapZza));
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map mapZzc;
        mapZzc = this.zzc.zzc();
        mapZzc.put("f", "v");
        mapZzc.put("ctx", context);
        mapZzc.put("aid", null);
        mapZzc.put("view", view);
        mapZzc.put("act", activity);
        return zzi(zzj(null, mapZzc));
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final synchronized String zzc(Context context, String str) {
        Map mapZzb;
        mapZzb = this.zzc.zzb();
        mapZzb.put("f", "q");
        mapZzb.put("ctx", context);
        mapZzb.put("aid", null);
        return zzi(zzj(null, mapZzb));
    }

    @Override // com.google.android.gms.internal.ads.zzfje
    public final synchronized void zzd(String str, MotionEvent motionEvent) throws zzfky {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap map = new HashMap();
            map.put("t", new Throwable());
            map.put("aid", null);
            map.put("evt", motionEvent);
            this.zza.getClass().getDeclaredMethod("he", Map.class).invoke(this.zza, map);
            this.zzd.zzd(AuthApiStatusCodes.AUTH_API_SERVER_ERROR, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfky(2005, e10);
        }
    }

    public final synchronized int zze() throws zzfky {
        try {
        } catch (Exception e10) {
            throw new zzfky(AdError.INTERNAL_ERROR_2006, e10);
        }
        return ((Integer) this.zza.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zza, new Object[0])).intValue();
    }

    public final zzfkp zzf() {
        return this.zzb;
    }

    public final synchronized void zzg() throws zzfky {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.zza.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zza, new Object[0]);
            this.zzd.zzd(3001, System.currentTimeMillis() - jCurrentTimeMillis);
        } catch (Exception e10) {
            throw new zzfky(AdError.INTERNAL_ERROR_2003, e10);
        }
    }

    public final synchronized boolean zzh() throws zzfky {
        try {
        } catch (Exception e10) {
            throw new zzfky(AdError.INTERNAL_ERROR_CODE, e10);
        }
        return ((Boolean) this.zza.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zza, new Object[0])).booleanValue();
    }
}
