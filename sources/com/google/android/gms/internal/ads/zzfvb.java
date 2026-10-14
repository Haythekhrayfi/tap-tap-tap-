package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzfvb extends zzfvh {
    private static final Logger zza = Logger.getLogger(zzfvb.class.getName());

    @CheckForNull
    private zzfrx zzb;
    private final boolean zzc;
    private final boolean zze;

    public zzfvb(zzfrx zzfrxVar, boolean z10, boolean z11) {
        super(zzfrxVar.size());
        this.zzb = zzfrxVar;
        this.zzc = z10;
        this.zze = z11;
    }

    private final void zzH(int i10, Future future) {
        try {
            zzg(i10, zzfwc.zzo(future));
        } catch (Error e10) {
            e = e10;
            zzJ(e);
        } catch (RuntimeException e11) {
            e = e11;
            zzJ(e);
        } catch (ExecutionException e12) {
            zzJ(e12.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzI, reason: merged with bridge method [inline-methods] */
    public final void zzy(@CheckForNull zzfrx zzfrxVar) {
        int iZzB = zzB();
        int i10 = 0;
        zzfph.zzi(iZzB >= 0, "Less than 0 remaining futures");
        if (iZzB == 0) {
            if (zzfrxVar != null) {
                zzfuc it = zzfrxVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzH(i10, future);
                    }
                    i10++;
                }
            }
            zzG();
            zzv();
            zzz(2);
        }
    }

    private final void zzJ(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zze(th) && zzL(zzD(), th)) {
            zzK(th);
        } else if (th instanceof Error) {
            zzK(th);
        }
    }

    private static void zzK(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    @CheckForNull
    public final String zza() {
        zzfrx zzfrxVar = this.zzb;
        return zzfrxVar != null ? "futures=".concat(zzfrxVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfuq
    public final void zzb() {
        zzfrx zzfrxVar = this.zzb;
        zzz(1);
        if ((zzfrxVar != null) && isCancelled()) {
            boolean zZzu = zzu();
            zzfuc it = zzfrxVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzu);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvh
    public final void zzf(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable thZzm = zzm();
        Objects.requireNonNull(thZzm);
        zzL(set, thZzm);
    }

    public abstract void zzg(int i10, Object obj);

    public abstract void zzv();

    public final void zzw() {
        zzfrx zzfrxVar = this.zzb;
        Objects.requireNonNull(zzfrxVar);
        if (zzfrxVar.isEmpty()) {
            zzv();
            return;
        }
        if (!this.zzc) {
            final zzfrx zzfrxVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfva
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzy(zzfrxVar2);
                }
            };
            zzfuc it = this.zzb.iterator();
            while (it.hasNext()) {
                ((zzfwm) it.next()).zzc(runnable, zzfvq.INSTANCE);
            }
            return;
        }
        zzfuc it2 = this.zzb.iterator();
        final int i10 = 0;
        while (it2.hasNext()) {
            final zzfwm zzfwmVar = (zzfwm) it2.next();
            zzfwmVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuz
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(zzfwmVar, i10);
                }
            }, zzfvq.INSTANCE);
            i10++;
        }
    }

    public final /* synthetic */ void zzx(zzfwm zzfwmVar, int i10) {
        try {
            if (zzfwmVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzH(i10, zzfwmVar);
            }
        } finally {
            zzy(null);
        }
    }

    public void zzz(int i10) {
        this.zzb = null;
    }
}
