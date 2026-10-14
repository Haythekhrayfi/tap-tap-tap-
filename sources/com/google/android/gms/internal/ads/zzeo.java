package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes2.dex */
public final class zzeo {
    private final zzdz zza;
    private final zzei zzb;
    private final zzem zzc;
    private final CopyOnWriteArraySet zzd;
    private final ArrayDeque zze;
    private final ArrayDeque zzf;
    private final Object zzg;
    private boolean zzh;
    private boolean zzi;

    public zzeo(Looper looper, zzdz zzdzVar, zzem zzemVar) {
        this(new CopyOnWriteArraySet(), looper, zzdzVar, zzemVar, true);
    }

    private zzeo(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, zzdz zzdzVar, zzem zzemVar, boolean z10) {
        this.zza = zzdzVar;
        this.zzd = copyOnWriteArraySet;
        this.zzc = zzemVar;
        this.zzg = new Object();
        this.zze = new ArrayDeque();
        this.zzf = new ArrayDeque();
        this.zzb = zzdzVar.zzb(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.zzej
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                zzeo.zzg(this.zza, message);
                return true;
            }
        });
        this.zzi = z10;
    }

    public static /* synthetic */ boolean zzg(zzeo zzeoVar, Message message) {
        Iterator it = zzeoVar.zzd.iterator();
        while (it.hasNext()) {
            ((zzen) it.next()).zzb(zzeoVar.zzc);
            if (zzeoVar.zzb.zzg(0)) {
                return true;
            }
        }
        return true;
    }

    private final void zzh() {
        if (this.zzi) {
            zzdy.zzf(Thread.currentThread() == this.zzb.zza().getThread());
        }
    }

    public final zzeo zza(Looper looper, zzem zzemVar) {
        return new zzeo(this.zzd, looper, this.zza, zzemVar, this.zzi);
    }

    public final void zzb(Object obj) {
        synchronized (this.zzg) {
            if (this.zzh) {
                return;
            }
            this.zzd.add(new zzen(obj));
        }
    }

    public final void zzc() {
        zzh();
        if (this.zzf.isEmpty()) {
            return;
        }
        if (!this.zzb.zzg(0)) {
            zzei zzeiVar = this.zzb;
            zzeiVar.zzk(zzeiVar.zzb(0));
        }
        boolean z10 = !this.zze.isEmpty();
        this.zze.addAll(this.zzf);
        this.zzf.clear();
        if (z10) {
            return;
        }
        while (!this.zze.isEmpty()) {
            ((Runnable) this.zze.peekFirst()).run();
            this.zze.removeFirst();
        }
    }

    public final void zzd(final int i10, final zzel zzelVar) {
        zzh();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.zzd);
        this.zzf.add(new Runnable() { // from class: com.google.android.gms.internal.ads.zzek
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i11 = i10;
                zzel zzelVar2 = zzelVar;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    ((zzen) it.next()).zza(i11, zzelVar2);
                }
            }
        });
    }

    public final void zze() {
        zzh();
        synchronized (this.zzg) {
            this.zzh = true;
        }
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            ((zzen) it.next()).zzc(this.zzc);
        }
        this.zzd.clear();
    }

    public final void zzf(Object obj) {
        zzh();
        for (zzen zzenVar : this.zzd) {
            if (zzenVar.zza.equals(obj)) {
                zzenVar.zzc(this.zzc);
                this.zzd.remove(zzenVar);
            }
        }
    }
}
