package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class zzyt {
    private final zzzf zza;
    private final zzyu zzb;
    private final zzdj zze;
    private Handler zzf;
    private zzdl zzg;
    private CopyOnWriteArrayList zzh;
    private Pair zzi;
    private final ArrayDeque zzc = new ArrayDeque();
    private final ArrayDeque zzd = new ArrayDeque();
    private boolean zzj = true;
    private final zzdn zzk = zzdn.zza;

    public zzyt(zzdj zzdjVar, zzzf zzzfVar, zzyu zzyuVar) {
        this.zze = zzdjVar;
        this.zza = zzzfVar;
        this.zzb = zzyuVar;
    }

    public final void zza(String str) {
        Context context = this.zzb.zze;
        if (zzfj.zza >= 29) {
            int i10 = context.getApplicationContext().getApplicationInfo().targetSdkVersion;
        }
    }

    public final void zzb(Surface surface, zzfb zzfbVar) {
        Pair pair = this.zzi;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zzfb) this.zzi.second).equals(zzfbVar)) {
            return;
        }
        this.zzi = Pair.create(surface, zzfbVar);
    }

    public final void zzc(List list) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.zzh;
        if (copyOnWriteArrayList == null) {
            this.zzh = new CopyOnWriteArrayList(list);
        } else {
            copyOnWriteArrayList.clear();
            this.zzh.addAll(list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    public final boolean zzd(zzam zzamVar, long j10) throws zzih {
        Pair pairCreate;
        int i10;
        if (!this.zzj) {
            return false;
        }
        if (this.zzh == null) {
            this.zzj = false;
            return false;
        }
        this.zzf = zzfj.zzt(null);
        zzs zzsVar = zzamVar.zzy;
        zzs zzsVar2 = zzs.zza;
        if (zzsVar == null) {
            pairCreate = Pair.create(zzsVar2, zzsVar2);
        } else {
            int i11 = zzsVar.zzf;
            if (i11 == 7) {
                zzr zzrVarZzc = zzsVar.zzc();
                zzrVarZzc.zzc(6);
                pairCreate = Pair.create(zzsVar, zzrVarZzc.zzd());
            } else if (i11 == 6) {
                pairCreate = Pair.create(zzsVar, zzsVar);
            } else {
                pairCreate = Pair.create(zzsVar2, zzsVar2);
            }
        }
        try {
            if (!zzyu.zzaP() && (i10 = zzamVar.zzu) != 0) {
                this.zzh.add(0, zzys.zza(i10));
            }
            zzdj zzdjVar = this.zze;
            Context context = this.zzb.zze;
            CopyOnWriteArrayList copyOnWriteArrayList = this.zzh;
            Objects.requireNonNull(copyOnWriteArrayList);
            zzv zzvVar = zzv.zzb;
            zzs zzsVar3 = (zzs) pairCreate.first;
            zzs zzsVar4 = (zzs) pairCreate.second;
            final Handler handler = this.zzf;
            Objects.requireNonNull(handler);
            this.zzg = zzdjVar.zza(context, copyOnWriteArrayList, zzvVar, zzsVar3, zzsVar4, false, new Executor() { // from class: com.google.android.gms.internal.ads.zzyq
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    handler.post(runnable);
                }
            }, new zzyr(this, zzamVar));
            throw null;
        } catch (Exception e10) {
            throw this.zzb.zzbe(e10, zzamVar, false, 7000);
        }
    }
}
