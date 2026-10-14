package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import androidx.activity.j;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
@VisibleForTesting
public final class zzjs extends zzf {
    private final zzjr zza;
    private zzee zzb;
    private volatile Boolean zzc;
    private final zzap zzd;
    private final zzkj zze;
    private final List zzf;
    private final zzap zzg;

    public zzjs(zzfy zzfyVar) {
        super(zzfyVar);
        this.zzf = new ArrayList();
        this.zze = new zzkj(zzfyVar.zzav());
        this.zza = new zzjr(this);
        this.zzd = new zzjc(this, zzfyVar);
        this.zzg = new zzje(this, zzfyVar);
    }

    private final zzq zzO(boolean z10) {
        Pair pairZza;
        this.zzs.zzaw();
        zzef zzefVarZzh = this.zzs.zzh();
        String strA = null;
        if (z10) {
            zzeo zzeoVarZzay = this.zzs.zzay();
            if (zzeoVarZzay.zzs.zzm().zzb != null && (pairZza = zzeoVarZzay.zzs.zzm().zzb.zza()) != null && pairZza != zzfd.zza) {
                strA = j.a(String.valueOf(pairZza.second), ":", (String) pairZza.first);
            }
        }
        return zzefVarZzh.zzj(strA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzP() {
        zzg();
        this.zzs.zzay().zzj().zzb("Processing queued up service tasks", Integer.valueOf(this.zzf.size()));
        Iterator it = this.zzf.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                this.zzs.zzay().zzd().zzb("Task exception while flushing queue", e10);
            }
        }
        this.zzf.clear();
        this.zzg.zzb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzQ() {
        zzg();
        this.zze.zzb();
        zzap zzapVar = this.zzd;
        this.zzs.zzf();
        zzapVar.zzd(((Long) zzeb.zzI.zza(null)).longValue());
    }

    private final void zzR(Runnable runnable) throws IllegalStateException {
        zzg();
        if (zzL()) {
            runnable.run();
            return;
        }
        int size = this.zzf.size();
        this.zzs.zzf();
        if (size >= 1000) {
            a.a(this.zzs, "Discarding data. Max runnable queue size reached");
            return;
        }
        this.zzf.add(runnable);
        this.zzg.zzd(60000L);
        zzr();
    }

    private final boolean zzS() {
        this.zzs.zzaw();
        return true;
    }

    public static /* bridge */ /* synthetic */ void zzo(zzjs zzjsVar, ComponentName componentName) {
        zzjsVar.zzg();
        if (zzjsVar.zzb != null) {
            zzjsVar.zzb = null;
            zzjsVar.zzs.zzay().zzj().zzb("Disconnected from device MeasurementService", componentName);
            zzjsVar.zzg();
            zzjsVar.zzr();
        }
    }

    public final void zzA(zzaw zzawVar, String str) {
        Preconditions.checkNotNull(zzawVar);
        zzg();
        zza();
        zzS();
        zzR(new zzjh(this, true, zzO(true), this.zzs.zzi().zzo(zzawVar), zzawVar, str));
    }

    public final void zzB(com.google.android.gms.internal.measurement.zzcf zzcfVar, zzaw zzawVar, String str) {
        zzg();
        zza();
        if (this.zzs.zzv().zzo(12451000) == 0) {
            zzR(new zzjd(this, zzawVar, str, zzcfVar));
        } else {
            this.zzs.zzay().zzk().zza("Not bundling data. Service unavailable or out of date");
            this.zzs.zzv().zzS(zzcfVar, new byte[0]);
        }
    }

    public final void zzC() {
        zzg();
        zza();
        zzq zzqVarZzO = zzO(false);
        zzS();
        this.zzs.zzi().zzj();
        zzR(new zziw(this, zzqVarZzO));
    }

    @VisibleForTesting
    public final void zzD(zzee zzeeVar, AbstractSafeParcelable abstractSafeParcelable, zzq zzqVar) {
        int size;
        zzem zzemVarZzd;
        String str;
        zzg();
        zza();
        zzS();
        this.zzs.zzf();
        int i10 = 0;
        int i11 = 100;
        while (i10 < 1001 && i11 == 100) {
            ArrayList arrayList = new ArrayList();
            List listZzi = this.zzs.zzi().zzi(100);
            if (listZzi != null) {
                arrayList.addAll(listZzi);
                size = listZzi.size();
            } else {
                size = 0;
            }
            if (abstractSafeParcelable != null && size < 100) {
                arrayList.add(abstractSafeParcelable);
            }
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList.get(i12);
                if (abstractSafeParcelable2 instanceof zzaw) {
                    try {
                        zzeeVar.zzk((zzaw) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e10) {
                        e = e10;
                        zzemVarZzd = this.zzs.zzay().zzd();
                        str = "Failed to send event to the service";
                        zzemVarZzd.zzb(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzlc) {
                    try {
                        zzeeVar.zzt((zzlc) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e11) {
                        e = e11;
                        zzemVarZzd = this.zzs.zzay().zzd();
                        str = "Failed to send user property to the service";
                        zzemVarZzd.zzb(str, e);
                    }
                } else if (abstractSafeParcelable2 instanceof zzac) {
                    try {
                        zzeeVar.zzn((zzac) abstractSafeParcelable2, zzqVar);
                    } catch (RemoteException e12) {
                        e = e12;
                        zzemVarZzd = this.zzs.zzay().zzd();
                        str = "Failed to send conditional user property to the service";
                        zzemVarZzd.zzb(str, e);
                    }
                } else {
                    a.a(this.zzs, "Discarding data. Unrecognized parcel type.");
                }
            }
            i10++;
            i11 = size;
        }
    }

    public final void zzE(zzac zzacVar) {
        Preconditions.checkNotNull(zzacVar);
        zzg();
        zza();
        this.zzs.zzaw();
        zzR(new zzji(this, true, zzO(true), this.zzs.zzi().zzn(zzacVar), new zzac(zzacVar), zzacVar));
    }

    public final void zzF(boolean z10) {
        zzg();
        zza();
        if (z10) {
            zzS();
            this.zzs.zzi().zzj();
        }
        if (zzM()) {
            zzR(new zzjg(this, zzO(false)));
        }
    }

    public final void zzG(zzik zzikVar) {
        zzg();
        zza();
        zzR(new zzja(this, zzikVar));
    }

    public final void zzH(Bundle bundle) {
        zzg();
        zza();
        zzR(new zzjb(this, zzO(false), bundle));
    }

    public final void zzI() {
        zzg();
        zza();
        zzR(new zzjf(this, zzO(true)));
    }

    @VisibleForTesting
    public final void zzJ(zzee zzeeVar) {
        zzg();
        Preconditions.checkNotNull(zzeeVar);
        this.zzb = zzeeVar;
        zzQ();
        zzP();
    }

    public final void zzK(zzlc zzlcVar) {
        zzg();
        zza();
        zzS();
        zzR(new zziu(this, zzO(true), this.zzs.zzi().zzp(zzlcVar), zzlcVar));
    }

    public final boolean zzL() {
        zzg();
        zza();
        return this.zzb != null;
    }

    public final boolean zzM() {
        zzg();
        zza();
        return !zzN() || this.zzs.zzv().zzm() >= ((Integer) zzeb.zzaf.zza(null)).intValue();
    }

    public final boolean zzN() {
        zzem zzemVarZzj;
        String str;
        zzem zzemVarZzk;
        String str2;
        zzg();
        zza();
        if (this.zzc == null) {
            zzg();
            zza();
            zzfd zzfdVarZzm = this.zzs.zzm();
            zzfdVarZzm.zzg();
            boolean z10 = false;
            Boolean boolValueOf = !zzfdVarZzm.zza().contains("use_service") ? null : Boolean.valueOf(zzfdVarZzm.zza().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                this.zzs.zzaw();
                if (this.zzs.zzh().zzh() == 1) {
                    z10 = true;
                } else {
                    this.zzs.zzay().zzj().zza("Checking service availability");
                    int iZzo = this.zzs.zzv().zzo(12451000);
                    if (iZzo == 0) {
                        zzemVarZzj = this.zzs.zzay().zzj();
                        str = "Service available";
                    } else if (iZzo == 1) {
                        this.zzs.zzay().zzj().zza("Service missing");
                    } else if (iZzo != 2) {
                        if (iZzo != 3) {
                            if (iZzo == 9) {
                                zzemVarZzk = this.zzs.zzay().zzk();
                                str2 = "Service invalid";
                            } else if (iZzo != 18) {
                                this.zzs.zzay().zzk().zzb("Unexpected service status", Integer.valueOf(iZzo));
                            } else {
                                zzemVarZzj = this.zzs.zzay().zzk();
                                str = "Service updating";
                            }
                            z11 = false;
                        } else {
                            zzemVarZzk = this.zzs.zzay().zzk();
                            str2 = "Service disabled";
                        }
                        zzemVarZzk.zza(str2);
                        z11 = false;
                    } else {
                        this.zzs.zzay().zzc().zza("Service container out of date");
                        if (this.zzs.zzv().zzm() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    zzemVarZzj.zza(str);
                    z10 = true;
                }
                if (!z10 && this.zzs.zzf().zzx()) {
                    a.a(this.zzs, "No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    zzfd zzfdVarZzm2 = this.zzs.zzm();
                    zzfdVarZzm2.zzg();
                    SharedPreferences.Editor editorEdit = zzfdVarZzm2.zza().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.zzc = Boolean.valueOf(z11);
        }
        return this.zzc.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    public final Boolean zzj() {
        return this.zzc;
    }

    public final void zzq() {
        zzg();
        zza();
        zzq zzqVarZzO = zzO(true);
        this.zzs.zzi().zzk();
        zzR(new zziz(this, zzqVarZzO));
    }

    public final void zzr() {
        zzg();
        zza();
        if (zzL()) {
            return;
        }
        if (zzN()) {
            this.zza.zzc();
            return;
        }
        if (this.zzs.zzf().zzx()) {
            return;
        }
        this.zzs.zzaw();
        List<ResolveInfo> listQueryIntentServices = this.zzs.zzau().getPackageManager().queryIntentServices(new Intent().setClassName(this.zzs.zzau(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            a.a(this.zzs, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextZzau = this.zzs.zzau();
        this.zzs.zzaw();
        intent.setComponent(new ComponentName(contextZzau, "com.google.android.gms.measurement.AppMeasurementService"));
        this.zza.zzb(intent);
    }

    public final void zzs() {
        zzg();
        zza();
        this.zza.zzd();
        try {
            ConnectionTracker.getInstance().unbindService(this.zzs.zzau(), this.zza);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.zzb = null;
    }

    public final void zzt(com.google.android.gms.internal.measurement.zzcf zzcfVar) {
        zzg();
        zza();
        zzR(new zziy(this, zzO(false), zzcfVar));
    }

    public final void zzu(AtomicReference atomicReference) {
        zzg();
        zza();
        zzR(new zzix(this, atomicReference, zzO(false)));
    }

    public final void zzv(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2) {
        zzg();
        zza();
        zzR(new zzjk(this, str, str2, zzO(false), zzcfVar));
    }

    public final void zzw(AtomicReference atomicReference, String str, String str2, String str3) {
        zzg();
        zza();
        zzR(new zzjj(this, atomicReference, null, str2, str3, zzO(false)));
    }

    public final void zzx(AtomicReference atomicReference, boolean z10) {
        zzg();
        zza();
        zzR(new zziv(this, atomicReference, zzO(false), z10));
    }

    public final void zzy(com.google.android.gms.internal.measurement.zzcf zzcfVar, String str, String str2, boolean z10) {
        zzg();
        zza();
        zzR(new zzit(this, str, str2, zzO(false), z10, zzcfVar));
    }

    public final void zzz(AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        zzg();
        zza();
        zzR(new zzjl(this, atomicReference, null, str2, str3, zzO(false), z10));
    }
}
