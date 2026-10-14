package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbke implements zzald {
    private volatile zzbjr zza;
    private final Context zzb;

    public zzbke(Context context) {
        this.zzb = context;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzbke zzbkeVar) {
        if (zzbkeVar.zza == null) {
            return;
        }
        zzbkeVar.zza.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzald
    public final zzalg zza(zzalk zzalkVar) throws zzalt {
        Parcelable.Creator<zzbjs> creator = zzbjs.CREATOR;
        Map mapZzl = zzalkVar.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        int i11 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i11] = (String) entry.getKey();
            strArr2[i11] = (String) entry.getValue();
            i11++;
        }
        zzbjs zzbjsVar = new zzbjs(zzalkVar.zzk(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        try {
            zzcaj zzcajVar = new zzcaj();
            this.zza = new zzbjr(this.zzb, com.google.android.gms.ads.internal.zzt.zzt().zzb(), new zzbkc(this, zzcajVar), new zzbkd(this, zzcajVar));
            this.zza.checkAvailabilityAndConnect();
            zzbka zzbkaVar = new zzbka(this, zzbjsVar);
            zzfwn zzfwnVar = zzcae.zza;
            zzfwm zzfwmVarZzn = zzfwc.zzn(zzfwc.zzm(zzcajVar, zzbkaVar, zzfwnVar), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzei)).intValue(), TimeUnit.MILLISECONDS, zzcae.zzd);
            zzfwmVarZzn.zzc(new zzbkb(this), zzfwnVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzfwmVarZzn.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            zzbju zzbjuVar = (zzbju) new zzbuc(parcelFileDescriptor).zza(zzbju.CREATOR);
            if (zzbjuVar == null) {
                return null;
            }
            if (zzbjuVar.zza) {
                throw new zzalt(zzbjuVar.zzb);
            }
            if (zzbjuVar.zze.length != zzbjuVar.zzf.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = zzbjuVar.zze;
                if (i10 >= strArr3.length) {
                    return new zzalg(zzbjuVar.zzc, zzbjuVar.zzd, map, zzbjuVar.zzg, zzbjuVar.zzh);
                }
                map.put(strArr3[i10], zzbjuVar.zzf[i10]);
                i10++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
