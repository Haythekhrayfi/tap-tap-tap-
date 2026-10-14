package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcnm implements zzcvg, zzcwu, zzcwa, com.google.android.gms.ads.internal.client.zza, zzcvw {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzezz zze;
    private final zzezn zzf;
    private final zzfgn zzg;
    private final zzfar zzh;
    private final zzaqs zzi;
    private final zzbco zzj;
    private final zzffy zzk;
    private final WeakReference zzl;
    private final WeakReference zzm;
    private final zzcui zzn;
    private boolean zzo;
    private final AtomicBoolean zzp = new AtomicBoolean();
    private final zzbcq zzq;

    public zzcnm(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzezz zzezzVar, zzezn zzeznVar, zzfgn zzfgnVar, zzfar zzfarVar, View view, zzcez zzcezVar, zzaqs zzaqsVar, zzbco zzbcoVar, zzbcq zzbcqVar, zzffy zzffyVar, zzcui zzcuiVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzezzVar;
        this.zzf = zzeznVar;
        this.zzg = zzfgnVar;
        this.zzh = zzfarVar;
        this.zzi = zzaqsVar;
        this.zzl = new WeakReference(view);
        this.zzm = new WeakReference(zzcezVar);
        this.zzj = zzbcoVar;
        this.zzq = zzbcqVar;
        this.zzk = zzffyVar;
        this.zzn = zzcuiVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzs() {
        int i10;
        List list;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzjY)).booleanValue() && ((list = this.zzf.zzd) == null || list.isEmpty())) {
            return;
        }
        String strZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdg)).booleanValue() ? this.zzi.zzc().zzh(this.zza, (View) this.zzl.get(), null) : null;
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) || !((Boolean) zzbde.zzh.zze()).booleanValue()) {
            zzfar zzfarVar = this.zzh;
            zzfgn zzfgnVar = this.zzg;
            zzezz zzezzVar = this.zze;
            zzezn zzeznVar = this.zzf;
            zzfarVar.zza(zzfgnVar.zzd(zzezzVar, zzeznVar, false, strZzh, null, zzeznVar.zzd));
            return;
        }
        if (((Boolean) zzbde.zzg.zze()).booleanValue() && ((i10 = this.zzf.zzb) == 1 || i10 == 2 || i10 == 5)) {
        }
        zzfwc.zzq((zzfvt) zzfwc.zzn(zzfvt.zzv(zzfwc.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzaS)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcnl(this, strZzh), this.zzb);
    }

    private final void zzt(final int i10, final int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.zzl.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzs();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzi(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzao)).booleanValue() && this.zze.zzb.zzb.zzg) && ((Boolean) zzbde.zzd.zze()).booleanValue()) {
            zzfwc.zzq(zzfwc.zze(zzfvt.zzv(this.zzj.zza()), Throwable.class, new zzfov() { // from class: com.google.android.gms.internal.ads.zzcng
                @Override // com.google.android.gms.internal.ads.zzfov
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcae.zzf), new zzcnk(this), this.zzb);
            return;
        }
        zzfar zzfarVar = this.zzh;
        zzfgn zzfgnVar = this.zzg;
        zzezz zzezzVar = this.zze;
        zzezn zzeznVar = this.zzf;
        zzfarVar.zzc(zzfgnVar.zzc(zzezzVar, zzeznVar, zzeznVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzbr() {
        zzfar zzfarVar = this.zzh;
        zzfgn zzfgnVar = this.zzg;
        zzezz zzezzVar = this.zze;
        zzezn zzeznVar = this.zzf;
        zzfarVar.zza(zzfgnVar.zzc(zzezzVar, zzeznVar, zzeznVar.zzh));
    }

    public final /* synthetic */ void zzg() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzs();
            }
        });
    }

    public final /* synthetic */ void zzh(int i10, int i11) {
        zzt(i10 - 1, i11);
    }

    public final /* synthetic */ void zzi(final int i10, final int i11) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnh
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzh(i10, i11);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvw
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzbr)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfgn.zzf(2, zzeVar.zza, this.zzf.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwa
    public final void zzl() {
        if (this.zzp.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdp)).intValue();
            if (iIntValue > 0) {
                zzt(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdq)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdo)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcni
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzg();
                    }
                });
            } else {
                zzs();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwu
    public final synchronized void zzn() {
        zzfar zzfarVar;
        List listZzc;
        zzcui zzcuiVar;
        if (this.zzo) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzg);
            zzfarVar = this.zzh;
            listZzc = this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList);
        } else {
            zzfar zzfarVar2 = this.zzh;
            zzfgn zzfgnVar = this.zzg;
            zzezz zzezzVar = this.zze;
            zzezn zzeznVar = this.zzf;
            zzfarVar2.zza(zzfgnVar.zzc(zzezzVar, zzeznVar, zzeznVar.zzn));
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbm.zzdl)).booleanValue() && (zzcuiVar = this.zzn) != null) {
                this.zzh.zza(this.zzg.zzc(this.zzn.zzc(), this.zzn.zzb(), zzfgn.zzg(zzcuiVar.zzb().zzn, zzcuiVar.zza().zzf())));
            }
            zzfarVar = this.zzh;
            zzfgn zzfgnVar2 = this.zzg;
            zzezz zzezzVar2 = this.zze;
            zzezn zzeznVar2 = this.zzf;
            listZzc = zzfgnVar2.zzc(zzezzVar2, zzeznVar2, zzeznVar2.zzg);
        }
        zzfarVar.zza(listZzc);
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzp(zzbuu zzbuuVar, String str, String str2) {
        zzfar zzfarVar = this.zzh;
        zzfgn zzfgnVar = this.zzg;
        zzezn zzeznVar = this.zzf;
        zzfarVar.zza(zzfgnVar.zze(zzeznVar, zzeznVar.zzi, zzbuuVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcvg
    public final void zzq() {
        zzfar zzfarVar = this.zzh;
        zzfgn zzfgnVar = this.zzg;
        zzezz zzezzVar = this.zze;
        zzezn zzeznVar = this.zzf;
        zzfarVar.zza(zzfgnVar.zzc(zzezzVar, zzeznVar, zzeznVar.zzj));
    }
}
