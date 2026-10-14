package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzalv {
    public static final boolean zza = zzalw.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzalw.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j10) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzalu(str, j10, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        long j10;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j10 = 0;
        } else {
            long j11 = ((zzalu) this.zzb.get(0)).zzc;
            List list = this.zzb;
            j10 = ((zzalu) list.get(list.size() - 1)).zzc - j11;
        }
        if (j10 <= 0) {
            return;
        }
        long j12 = ((zzalu) this.zzb.get(0)).zzc;
        zzalw.zza("(%-4d ms) %s", Long.valueOf(j10), str);
        for (zzalu zzaluVar : this.zzb) {
            long j13 = zzaluVar.zzc;
            zzalw.zza("(+%-4d) [%2d] %s", Long.valueOf(j13 - j12), Long.valueOf(zzaluVar.zzb), zzaluVar.zza);
            j12 = j13;
        }
    }
}
