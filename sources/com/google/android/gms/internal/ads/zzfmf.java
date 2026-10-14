package com.google.android.gms.internal.ads;

import android.content.Context;
import android.support.v4.media.c;
import androidx.activity.j;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
class zzfmf {
    public static final String zza = new UUID(0, 0).toString();
    public final zzfmg zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final String zzg;

    public zzfmf(Context context, String str, String str2, String str3) {
        this.zzb = zzfmg.zzb(context);
        this.zzc = str;
        this.zzd = str.concat("_3p");
        this.zze = str2;
        this.zzf = str2.concat("_3p");
        this.zzg = str3;
    }

    private final String zzh(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            return UUID.nameUUIDFromBytes(j.a(str, str2, str3).getBytes(StandardCharsets.UTF_8)).toString();
        }
        StringBuilder sbA = c.a(this.zzg, ": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sbA.append(str2 == null ? "null" : "not null");
        sbA.append(", hashKey is ");
        sbA.append(str3 != null ? "not null" : "null");
        throw new IllegalArgumentException(sbA.toString());
    }

    public final long zza(boolean z10) {
        return this.zzb.zza(z10 ? this.zzf : this.zze, -1L);
    }

    public final zzfme zzb(String str, String str2, long j10, boolean z10) throws IOException {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(zza)) {
                    String strZze = zze(true);
                    String strZzc = this.zzb.zzc("paid_3p_hash_key", null);
                    if (strZze != null && strZzc != null && !strZze.equals(zzh(str, str2, strZzc))) {
                        return zzc(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new zzfme();
        }
        boolean z11 = str != null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long jZza = zza(z11);
        if (jZza != -1) {
            if (jCurrentTimeMillis < jZza) {
                this.zzb.zzd(z11 ? this.zzf : this.zze, Long.valueOf(jCurrentTimeMillis));
            } else if (jCurrentTimeMillis >= jZza + j10) {
                return zzc(str, str2);
            }
        }
        String strZze2 = zze(z11);
        return (strZze2 != null || z10) ? new zzfme(strZze2, zza(z11)) : zzc(str, str2);
    }

    public final zzfme zzc(String str, String str2) throws IOException {
        String strZzh;
        boolean z10;
        if (str == null) {
            strZzh = UUID.randomUUID().toString();
            z10 = false;
        } else {
            String string = UUID.randomUUID().toString();
            this.zzb.zzd("paid_3p_hash_key", string);
            strZzh = zzh(str, str2, string);
            z10 = true;
        }
        return zzd(strZzh, z10);
    }

    public final zzfme zzd(String str, boolean z10) throws IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < 0) {
            throw new IllegalStateException(this.zzg.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        this.zzb.zzd(z10 ? this.zzf : this.zze, Long.valueOf(jCurrentTimeMillis));
        this.zzb.zzd(z10 ? this.zzd : this.zzc, str);
        return new zzfme(str, jCurrentTimeMillis);
    }

    public final String zze(boolean z10) {
        return this.zzb.zzc(z10 ? this.zzd : this.zzc, null);
    }

    public final void zzf(boolean z10) throws IOException {
        this.zzb.zze(z10 ? this.zzf : this.zze);
        this.zzb.zze(z10 ? this.zzd : this.zzc);
    }

    public final boolean zzg(boolean z10) {
        return this.zzb.zzg(this.zzc);
    }
}
