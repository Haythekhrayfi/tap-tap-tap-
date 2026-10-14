package com.google.android.gms.measurement.internal;

import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzju extends zzkn {
    public final zzez zza;
    public final zzez zzb;
    public final zzez zzc;
    public final zzez zzd;
    public final zzez zze;
    private final Map zzg;

    public zzju(zzkz zzkzVar) {
        super(zzkzVar);
        this.zzg = new HashMap();
        zzfd zzfdVarZzm = this.zzs.zzm();
        Objects.requireNonNull(zzfdVarZzm);
        this.zza = new zzez(zzfdVarZzm, "last_delete_stale", 0L);
        zzfd zzfdVarZzm2 = this.zzs.zzm();
        Objects.requireNonNull(zzfdVarZzm2);
        this.zzb = new zzez(zzfdVarZzm2, "backoff", 0L);
        zzfd zzfdVarZzm3 = this.zzs.zzm();
        Objects.requireNonNull(zzfdVarZzm3);
        this.zzc = new zzez(zzfdVarZzm3, "last_upload", 0L);
        zzfd zzfdVarZzm4 = this.zzs.zzm();
        Objects.requireNonNull(zzfdVarZzm4);
        this.zzd = new zzez(zzfdVarZzm4, "last_upload_attempt", 0L);
        zzfd zzfdVarZzm5 = this.zzs.zzm();
        Objects.requireNonNull(zzfdVarZzm5);
        this.zze = new zzez(zzfdVarZzm5, "midnight_offset", 0L);
    }

    @Deprecated
    public final Pair zza(String str) {
        zzjt zzjtVar;
        zzg();
        long jElapsedRealtime = this.zzs.zzav().elapsedRealtime();
        zzjt zzjtVar2 = (zzjt) this.zzg.get(str);
        if (zzjtVar2 != null && jElapsedRealtime < zzjtVar2.zzc) {
            return new Pair(zzjtVar2.zza, Boolean.valueOf(zzjtVar2.zzb));
        }
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        long jZzi = this.zzs.zzf().zzi(str, zzeb.zza) + jElapsedRealtime;
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.zzs.zzau());
            if (advertisingIdInfo == null) {
                return new Pair("", Boolean.FALSE);
            }
            String id2 = advertisingIdInfo.getId();
            zzjtVar = id2 != null ? new zzjt(id2, advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi) : new zzjt("", advertisingIdInfo.isLimitAdTrackingEnabled(), jZzi);
            this.zzg.put(str, zzjtVar);
            AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
            return new Pair(zzjtVar.zza, Boolean.valueOf(zzjtVar.zzb));
        } catch (Exception e10) {
            this.zzs.zzay().zzc().zzb("Unable to get advertising id", e10);
            zzjtVar = new zzjt("", false, jZzi);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkn
    public final boolean zzb() {
        return false;
    }

    public final Pair zzd(String str, zzai zzaiVar) {
        return zzaiVar.zzi(zzah.AD_STORAGE) ? zza(str) : new Pair("", Boolean.FALSE);
    }

    @Deprecated
    public final String zzf(String str, boolean z10) {
        zzg();
        String str2 = z10 ? (String) zza(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestZzF = zzlh.zzF();
        if (messageDigestZzF == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestZzF.digest(str2.getBytes())));
    }
}
