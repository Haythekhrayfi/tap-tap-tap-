package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaln {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaku zze;
    private final zzald zzf;
    private final zzale[] zzg;
    private zzakw zzh;
    private final List zzi;
    private final List zzj;
    private final zzalb zzk;

    public zzaln(zzaku zzakuVar, zzald zzaldVar, int i10) {
        zzalb zzalbVar = new zzalb(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzakuVar;
        this.zzf = zzaldVar;
        this.zzg = new zzale[4];
        this.zzk = zzalbVar;
    }

    public final zzalk zza(zzalk zzalkVar) {
        zzalkVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzalkVar);
        }
        zzalkVar.zzg(this.zza.incrementAndGet());
        zzalkVar.zzm("add-to-queue");
        zzc(zzalkVar, 0);
        this.zzc.add(zzalkVar);
        return zzalkVar;
    }

    public final void zzb(zzalk zzalkVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzalkVar);
        }
        synchronized (this.zzi) {
            Iterator it = this.zzi.iterator();
            while (it.hasNext()) {
                ((zzalm) it.next()).zza();
            }
        }
        zzc(zzalkVar, 5);
    }

    public final void zzc(zzalk zzalkVar, int i10) {
        synchronized (this.zzj) {
            Iterator it = this.zzj.iterator();
            while (it.hasNext()) {
                ((zzall) it.next()).zza();
            }
        }
    }

    public final void zzd() {
        zzakw zzakwVar = this.zzh;
        if (zzakwVar != null) {
            zzakwVar.zzb();
        }
        zzale[] zzaleVarArr = this.zzg;
        for (int i10 = 0; i10 < 4; i10++) {
            zzale zzaleVar = zzaleVarArr[i10];
            if (zzaleVar != null) {
                zzaleVar.zza();
            }
        }
        zzakw zzakwVar2 = new zzakw(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzakwVar2;
        zzakwVar2.start();
        for (int i11 = 0; i11 < 4; i11++) {
            zzale zzaleVar2 = new zzale(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i11] = zzaleVar2;
            zzaleVar2.start();
        }
    }
}
