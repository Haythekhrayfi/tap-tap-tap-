package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzfmd;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzccb {
    private final Context zza;
    private final String zzb;
    private final zzbzx zzc;
    private final zzbcb zzd;
    private final zzbce zze;
    private final com.google.android.gms.ads.internal.util.zzbf zzf;
    private final long[] zzg;
    private final String[] zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private zzcbg zzn;
    private boolean zzo;
    private boolean zzp;
    private long zzq;

    public zzccb(Context context, zzbzx zzbzxVar, String str, zzbce zzbceVar, zzbcb zzbcbVar) {
        com.google.android.gms.ads.internal.util.zzbd zzbdVar = new com.google.android.gms.ads.internal.util.zzbd();
        zzbdVar.zza("min_1", Double.MIN_VALUE, 1.0d);
        zzbdVar.zza("1_5", 1.0d, 5.0d);
        zzbdVar.zza("5_10", 5.0d, 10.0d);
        zzbdVar.zza("10_20", 10.0d, 20.0d);
        zzbdVar.zza("20_30", 20.0d, 30.0d);
        zzbdVar.zza("30_max", 30.0d, Double.MAX_VALUE);
        this.zzf = zzbdVar.zzb();
        this.zzi = false;
        this.zzj = false;
        this.zzk = false;
        this.zzl = false;
        this.zzq = -1L;
        this.zza = context;
        this.zzc = zzbzxVar;
        this.zzb = str;
        this.zze = zzbceVar;
        this.zzd = zzbcbVar;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzA);
        if (str2 == null) {
            this.zzh = new String[0];
            this.zzg = new long[0];
            return;
        }
        String[] strArrSplit = TextUtils.split(str2, ",");
        int length = strArrSplit.length;
        this.zzh = new String[length];
        this.zzg = new long[length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                this.zzg[i10] = Long.parseLong(strArrSplit[i10]);
            } catch (NumberFormatException e10) {
                zzbzr.zzk("Unable to parse frame hash target time number.", e10);
                this.zzg[i10] = -1;
            }
        }
    }

    public final void zza(zzcbg zzcbgVar) {
        zzbbw.zza(this.zze, this.zzd, "vpc2");
        this.zzi = true;
        this.zze.zzd("vpn", zzcbgVar.zzj());
        this.zzn = zzcbgVar;
    }

    public final void zzb() {
        if (!this.zzi || this.zzj) {
            return;
        }
        zzbbw.zza(this.zze, this.zzd, "vfr2");
        this.zzj = true;
    }

    public final void zzc() {
        this.zzm = true;
        if (!this.zzj || this.zzk) {
            return;
        }
        zzbbw.zza(this.zze, this.zzd, "vfp2");
        this.zzk = true;
    }

    public final void zzd() {
        if (!((Boolean) zzbdt.zza.zze()).booleanValue() || this.zzo) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.zzb);
        bundle.putString("player", this.zzn.zzj());
        for (com.google.android.gms.ads.internal.util.zzbc zzbcVar : this.zzf.zza()) {
            String strValueOf = String.valueOf(zzbcVar.zza);
            bundle.putString("fps_c_".concat(strValueOf), Integer.toString(zzbcVar.zze));
            String strValueOf2 = String.valueOf(zzbcVar.zza);
            bundle.putString("fps_p_".concat(strValueOf2), Double.toString(zzbcVar.zzd));
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.zzg;
            if (i10 >= jArr.length) {
                com.google.android.gms.ads.internal.zzt.zzp();
                final Context context = this.zza;
                final String str = this.zzc.zza;
                com.google.android.gms.ads.internal.zzt.zzp();
                bundle.putString("device", com.google.android.gms.ads.internal.util.zzs.zzp());
                zzbbe zzbbeVar = zzbbm.zza;
                bundle.putString("eids", TextUtils.join(",", com.google.android.gms.ads.internal.client.zzba.zza().zza()));
                com.google.android.gms.ads.internal.client.zzay.zzb();
                zzbzk.zzw(context, str, "gmob-apps", bundle, true, new zzbzj() { // from class: com.google.android.gms.ads.internal.util.zzk
                    @Override // com.google.android.gms.internal.ads.zzbzj
                    public final boolean zza(String str2) {
                        Context context2 = context;
                        String str3 = str;
                        zzfmd zzfmdVar = zzs.zza;
                        com.google.android.gms.ads.internal.zzt.zzp();
                        zzs.zzH(context2, str3, str2);
                        return true;
                    }
                });
                this.zzo = true;
                return;
            }
            String str2 = this.zzh[i10];
            if (str2 != null) {
                bundle.putString("fh_".concat(Long.valueOf(jArr[i10]).toString()), str2);
            }
            i10++;
        }
    }

    public final void zze() {
        this.zzm = false;
    }

    public final void zzf(zzcbg zzcbgVar) {
        if (this.zzk && !this.zzl) {
            if (com.google.android.gms.ads.internal.util.zze.zzc() && !this.zzl) {
                com.google.android.gms.ads.internal.util.zze.zza("VideoMetricsMixin first frame");
            }
            zzbbw.zza(this.zze, this.zzd, "vff2");
            this.zzl = true;
        }
        long jNanoTime = com.google.android.gms.ads.internal.zzt.zzB().nanoTime();
        if (this.zzm && this.zzp && this.zzq != -1) {
            this.zzf.zzb(TimeUnit.SECONDS.toNanos(1L) / (jNanoTime - this.zzq));
        }
        this.zzp = this.zzm;
        this.zzq = jNanoTime;
        long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzB)).longValue();
        long jZza = zzcbgVar.zza();
        int i10 = 0;
        while (true) {
            String[] strArr = this.zzh;
            if (i10 >= strArr.length) {
                return;
            }
            if (strArr[i10] == null && jLongValue > Math.abs(jZza - this.zzg[i10])) {
                String[] strArr2 = this.zzh;
                int i11 = 8;
                Bitmap bitmap = zzcbgVar.getBitmap(8, 8);
                long j10 = 63;
                int i12 = 0;
                long j11 = 0;
                while (i12 < i11) {
                    int i13 = 0;
                    while (i13 < i11) {
                        int pixel = bitmap.getPixel(i13, i12);
                        j11 |= (Color.green(pixel) + (Color.red(pixel) + Color.blue(pixel)) > 128 ? 1L : 0L) << ((int) j10);
                        j10--;
                        i13++;
                        i11 = 8;
                    }
                    i12++;
                    i11 = 8;
                }
                strArr2[i10] = String.format("%016X", Long.valueOf(j11));
                return;
            }
            i10++;
        }
    }
}
