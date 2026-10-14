package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import ch.qos.logback.classic.Level;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaql implements zzaqo {
    private static zzaql zzb;
    private final Context zzc;
    private final zzfkq zzd;
    private final zzfkx zze;
    private final zzfkz zzf;
    private final zzarn zzg;
    private final zzfjb zzh;
    private final Executor zzi;
    private final zzfkw zzj;
    private final zzasc zzl;
    private final zzaru zzm;
    private final zzarl zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;
    public volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    public zzaql(Context context, zzfjb zzfjbVar, zzfkq zzfkqVar, zzfkx zzfkxVar, zzfkz zzfkzVar, zzarn zzarnVar, Executor executor, zzfiw zzfiwVar, int i10, zzasc zzascVar, zzaru zzaruVar, zzarl zzarlVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfjbVar;
        this.zzd = zzfkqVar;
        this.zze = zzfkxVar;
        this.zzf = zzfkzVar;
        this.zzg = zzarnVar;
        this.zzi = executor;
        this.zzr = i10;
        this.zzl = zzascVar;
        this.zzm = zzaruVar;
        this.zzn = zzarlVar;
        this.zzq = false;
        this.zzj = new zzaqj(this, zzfiwVar);
    }

    public static synchronized zzaql zza(String str, Context context, boolean z10, boolean z11) {
        return zzb(str, context, Executors.newCachedThreadPool(), z10, z11);
    }

    @Deprecated
    public static synchronized zzaql zzb(String str, Context context, Executor executor, boolean z10, boolean z11) {
        if (zzb == null) {
            zzfjc zzfjcVarZza = zzfjd.zza();
            zzfjcVarZza.zza(str);
            zzfjcVarZza.zzc(z10);
            zzfjd zzfjdVarZzd = zzfjcVarZza.zzd();
            zzfjb zzfjbVarZza = zzfjb.zza(context, executor, z11);
            zzaqw zzaqwVarZzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcZ)).booleanValue() ? zzaqw.zzc(context) : null;
            zzasc zzascVarZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzda)).booleanValue() ? zzasc.zzd(context, executor) : null;
            zzaru zzaruVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcp)).booleanValue() ? new zzaru() : null;
            zzarl zzarlVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcr)).booleanValue() ? new zzarl() : null;
            zzfju zzfjuVarZze = zzfju.zze(context, executor, zzfjbVarZza, zzfjdVarZzd);
            zzarm zzarmVar = new zzarm(context);
            zzarn zzarnVar = new zzarn(zzfjdVarZzd, zzfjuVarZze, new zzasa(context, zzarmVar), zzarmVar, zzaqwVarZzc, zzascVarZzd, zzaruVar, zzarlVar);
            int iZzb = zzfkd.zzb(context, zzfjbVarZza);
            zzfiw zzfiwVar = new zzfiw();
            zzaql zzaqlVar = new zzaql(context, zzfjbVarZza, new zzfkq(context, iZzb), new zzfkx(context, iZzb, new zzaqi(zzfjbVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbY)).booleanValue()), new zzfkz(context, zzarnVar, zzfjbVarZza, zzfiwVar), zzarnVar, executor, zzfiwVar, iZzb, zzascVarZzd, zzaruVar, zzarlVar);
            zzb = zzaqlVar;
            zzaqlVar.zzm();
            zzb.zzp();
        }
        return zzb;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fa A[Catch: all -> 0x0115, zzgpy -> 0x0117, TryCatch #0 {zzgpy -> 0x0117, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:27:0x009c, B:31:0x00b5, B:37:0x00ce, B:38:0x00d6, B:41:0x00e0, B:43:0x00e6, B:45:0x00ee, B:46:0x00f0, B:34:0x00bf, B:35:0x00c6, B:23:0x0074, B:25:0x008a, B:47:0x00fa, B:48:0x0103, B:49:0x010c), top: B:58:0x0021, outer: #1 }] */
    public static /* bridge */ /* synthetic */ void zzj(zzaql zzaqlVar) {
        String str;
        String strZzj;
        zzfjb zzfjbVar;
        int i10;
        long jCurrentTimeMillis;
        int length;
        boolean zZza;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        zzfkp zzfkpVarZzt = zzaqlVar.zzt(1);
        if (zzfkpVarZzt != null) {
            String strZzk = zzfkpVarZzt.zza().zzk();
            strZzj = zzfkpVarZzt.zza().zzj();
            str = strZzk;
        } else {
            str = null;
            strZzj = null;
        }
        try {
            try {
                zzfku zzfkuVarZza = zzfjl.zza(zzaqlVar.zzc, 1, zzaqlVar.zzr, str, strZzj, "1", zzaqlVar.zzh);
                byte[] bArr = zzfkuVarZza.zzb;
                if (bArr != null && (length = bArr.length) != 0) {
                    try {
                        zzatm zzatmVarZzc = zzatm.zzc(zzgoe.zzv(bArr, 0, length), zzgoy.zza());
                        if (zzatmVarZzc.zzd().zzk().isEmpty() || zzatmVarZzc.zzd().zzj().isEmpty() || zzatmVarZzc.zze().zzA().length == 0) {
                            zzfjbVar = zzaqlVar.zzh;
                            i10 = 5010;
                            jCurrentTimeMillis = System.currentTimeMillis();
                        } else {
                            zzfkp zzfkpVarZzt2 = zzaqlVar.zzt(1);
                            if (zzfkpVarZzt2 != null) {
                                zzatp zzatpVarZza = zzfkpVarZzt2.zza();
                                if (zzatmVarZzc.zzd().zzk().equals(zzatpVarZza.zzk()) && zzatmVarZzc.zzd().zzj().equals(zzatpVarZza.zzj())) {
                                    zzfjbVar = zzaqlVar.zzh;
                                    i10 = 5010;
                                    jCurrentTimeMillis = System.currentTimeMillis();
                                }
                            }
                            zzfkw zzfkwVar = zzaqlVar.zzj;
                            int i11 = zzfkuVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbW)).booleanValue()) {
                                zZza = zzaqlVar.zzd.zza(zzatmVarZzc, zzfkwVar);
                            } else if (i11 == 3) {
                                zZza = zzaqlVar.zze.zza(zzatmVarZzc);
                            } else {
                                if (i11 == 4) {
                                    zZza = zzaqlVar.zze.zzb(zzatmVarZzc, zzfkwVar);
                                }
                                zzfjbVar = zzaqlVar.zzh;
                                i10 = 4009;
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                            if (zZza) {
                                zzfkp zzfkpVarZzt3 = zzaqlVar.zzt(1);
                                if (zzfkpVarZzt3 != null) {
                                    if (zzaqlVar.zzf.zzc(zzfkpVarZzt3)) {
                                        zzaqlVar.zzq = true;
                                    }
                                    zzaqlVar.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                zzfjbVar = zzaqlVar.zzh;
                                i10 = 4009;
                                jCurrentTimeMillis = System.currentTimeMillis();
                            }
                        }
                    } catch (NullPointerException unused) {
                        zzfjbVar = zzaqlVar.zzh;
                        i10 = 2030;
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                }
                zzfjbVar = zzaqlVar.zzh;
                i10 = 5009;
                jCurrentTimeMillis = System.currentTimeMillis();
                zzfjbVar.zzd(i10, jCurrentTimeMillis - jCurrentTimeMillis2);
            } catch (zzgpy e10) {
                zzaqlVar.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis2, e10);
            }
        } finally {
            zzaqlVar.zzk.countDown();
        }
    }

    private final void zzs() {
        zzasc zzascVar = this.zzl;
        if (zzascVar != null) {
            zzascVar.zzh();
        }
    }

    private final zzfkp zzt(int i10) {
        if (zzfkd.zza(this.zzr)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbW)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcp)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfje zzfjeVarZza = this.zzf.zza();
        if (zzfjeVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfjeVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(Level.TRACE_INT, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zzg(Context context) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcp)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfje zzfjeVarZza = this.zzf.zza();
        if (zzfjeVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfjeVarZza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zzh(Context context, View view, Activity activity) {
        zzs();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzcp)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfje zzfjeVarZza = this.zzf.zza();
        if (zzfjeVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfjeVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzk(MotionEvent motionEvent) {
        zzfje zzfjeVarZza = this.zzf.zza();
        if (zzfjeVarZza != null) {
            try {
                zzfjeVarZza.zzd(null, motionEvent);
            } catch (zzfky e10) {
                this.zzh.zzc(e10.zza(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzl(int i10, int i11, int i12) {
    }

    public final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfkp zzfkpVarZzt = zzt(1);
        if (zzfkpVarZzt == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfkpVarZzt)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzarl zzarlVar = this.zzn;
        if (zzarlVar != null) {
            zzarlVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzo(View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            if (!this.zzp) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfkp zzfkpVarZzb = this.zzf.zzb();
                if ((zzfkpVarZzb == null || zzfkpVarZzb.zzd(3600L)) && zzfkd.zza(this.zzr)) {
                    this.zzi.execute(new zzaqk(this));
                }
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
