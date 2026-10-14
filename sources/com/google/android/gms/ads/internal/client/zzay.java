package com.google.android.gms.ads.internal.client;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzbgr;
import com.google.android.gms.internal.ads.zzbrq;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzx;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class zzay {
    private static final zzay zza = new zzay();
    private final zzbzk zzb;
    private final zzaw zzc;
    private final String zzd;
    private final zzbzx zze;
    private final Random zzf;

    public zzay() {
        zzbzk zzbzkVar = new zzbzk();
        zzaw zzawVar = new zzaw(new zzk(), new zzi(), new zzeq(), new zzbgq(), new zzbvz(), new zzbrq(), new zzbgr());
        String strZzd = zzbzk.zzd();
        zzbzx zzbzxVar = new zzbzx(0, ModuleDescriptor.MODULE_VERSION, true, false, false);
        Random random = new Random();
        this.zzb = zzbzkVar;
        this.zzc = zzawVar;
        this.zzd = strZzd;
        this.zze = zzbzxVar;
        this.zzf = random;
    }

    public static zzaw zza() {
        return zza.zzc;
    }

    public static zzbzk zzb() {
        return zza.zzb;
    }

    public static zzbzx zzc() {
        return zza.zze;
    }

    public static String zzd() {
        return zza.zzd;
    }

    public static Random zze() {
        return zza.zzf;
    }
}
