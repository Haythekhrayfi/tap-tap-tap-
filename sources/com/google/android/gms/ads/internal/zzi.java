package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzaql;
import com.google.android.gms.internal.ads.zzaqo;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzbbm;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzbzx;
import com.google.android.gms.internal.ads.zzcae;
import com.google.android.gms.internal.ads.zzfjb;
import com.google.android.gms.internal.ads.zzfkd;
import com.google.android.gms.internal.ads.zzfkx;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzi implements Runnable, zzaqo {
    public boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfjb zzi;
    private Context zzj;
    private final Context zzk;
    private zzbzx zzl;
    private final zzbzx zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    public final CountDownLatch zzb = new CountDownLatch(1);

    public zzi(Context context, zzbzx zzbzxVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzbzxVar;
        this.zzm = zzbzxVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzba.zzc().zzb(zzbbm.zzcb)).booleanValue();
        this.zzn = zBooleanValue;
        this.zzi = zzfjb.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzf = ((Boolean) zzba.zzc().zzb(zzbbm.zzbX)).booleanValue();
        this.zzg = ((Boolean) zzba.zzc().zzb(zzbbm.zzcc)).booleanValue();
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzca)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzdd)).booleanValue()) {
            this.zza = zzc();
        }
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzcW)).booleanValue()) {
            zzay.zzb();
            if (!zzbzk.zzu()) {
                run();
                return;
            }
        }
        zzcae.zza.execute(this);
    }

    private final zzaqo zzj() {
        return (zzaqo) (zzi() == 2 ? this.zze : this.zzd).get();
    }

    private final void zzm() {
        zzaqo zzaqoVarZzj = zzj();
        if (this.zzc.isEmpty() || zzaqoVarZzj == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzaqoVarZzj.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzaqoVarZzj.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzp(boolean z10) {
        this.zzd.set(zzaqr.zzu(this.zzl.zza, zzq(this.zzj), z10, this.zzo));
    }

    private static final Context zzq(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().zzb(zzbbm.zzdd)).booleanValue()) {
                this.zza = zzc();
            }
            boolean z10 = this.zzl.zzd;
            final boolean z11 = false;
            if (!((Boolean) zzba.zzc().zzb(zzbbm.zzaT)).booleanValue() && z10) {
                z11 = true;
            }
            if (zzi() == 1) {
                zzp(z11);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(z11);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzaql zzaqlVarZza = zzaql.zza(this.zzl.zza, zzq(this.zzj), z11, this.zzn);
                    this.zze.set(zzaqlVarZza);
                    if (this.zzg && !zzaqlVarZza.zzr()) {
                        this.zzo = 1;
                        zzp(z11);
                    }
                } catch (NullPointerException e10) {
                    this.zzo = 1;
                    zzp(z11);
                    this.zzi.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                }
            }
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
            throw th;
        }
    }

    public final /* synthetic */ void zzb(boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzaql.zza(this.zzm.zza, zzq(this.zzk), z10, this.zzn).zzp();
        } catch (NullPointerException e10) {
            this.zzi.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e10);
        }
    }

    public final boolean zzc() {
        Context context = this.zzj;
        zzfjb zzfjbVar = this.zzi;
        zzh zzhVar = new zzh(this);
        return new zzfkx(this.zzj, zzfkd.zzb(context, zzfjbVar), zzhVar, ((Boolean) zzba.zzc().zzb(zzbbm.zzbY)).booleanValue()).zzd(1);
    }

    public final boolean zzd() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e10) {
            zzbzr.zzk("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        zzaqo zzaqoVarZzj = zzj();
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzjn)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzF(view, 4, null);
        }
        if (zzaqoVarZzj == null) {
            return "";
        }
        zzm();
        return zzaqoVarZzj.zzf(zzq(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zzg(Context context) {
        zzaqo zzaqoVarZzj;
        if (!zzd() || (zzaqoVarZzj = zzj()) == null) {
            return "";
        }
        zzm();
        return zzaqoVarZzj.zzg(zzq(context));
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().zzb(zzbbm.zzjm)).booleanValue()) {
            zzaqo zzaqoVarZzj = zzj();
            if (((Boolean) zzba.zzc().zzb(zzbbm.zzjn)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
            }
            return zzaqoVarZzj != null ? zzaqoVarZzj.zzh(context, view, activity) : "";
        }
        if (!zzd()) {
            return "";
        }
        zzaqo zzaqoVarZzj2 = zzj();
        if (((Boolean) zzba.zzc().zzb(zzbbm.zzjn)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzs.zzF(view, 2, null);
        }
        return zzaqoVarZzj2 != null ? zzaqoVarZzj2.zzh(context, view, activity) : "";
    }

    public final int zzi() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzk(MotionEvent motionEvent) {
        zzaqo zzaqoVarZzj = zzj();
        if (zzaqoVarZzj == null) {
            this.zzc.add(new Object[]{motionEvent});
        } else {
            zzm();
            zzaqoVarZzj.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzl(int i10, int i11, int i12) {
        zzaqo zzaqoVarZzj = zzj();
        if (zzaqoVarZzj == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        } else {
            zzm();
            zzaqoVarZzj.zzl(i10, i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzaqo zzaqoVarZzj;
        if (!zzd() || (zzaqoVarZzj = zzj()) == null) {
            return;
        }
        zzaqoVarZzj.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaqo
    public final void zzo(View view) {
        zzaqo zzaqoVarZzj = zzj();
        if (zzaqoVarZzj != null) {
            zzaqoVarZzj.zzo(view);
        }
    }
}
