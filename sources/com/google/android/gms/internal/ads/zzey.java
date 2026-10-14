package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class zzey {
    private static zzey zza;
    private final Handler zzb = new Handler(Looper.getMainLooper());
    private final CopyOnWriteArrayList zzc = new CopyOnWriteArrayList();
    private final Object zzd = new Object();
    private int zze = 0;

    private zzey(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new zzex(this, null), intentFilter);
    }

    public static synchronized zzey zzb(Context context) {
        if (zza == null) {
            zza = new zzey(context);
        }
        return zza;
    }

    public static /* synthetic */ void zzc(zzey zzeyVar, int i10) {
        synchronized (zzeyVar.zzd) {
            if (zzeyVar.zze == i10) {
                return;
            }
            zzeyVar.zze = i10;
            for (WeakReference weakReference : zzeyVar.zzc) {
                zzxq zzxqVar = (zzxq) weakReference.get();
                if (zzxqVar != null) {
                    zzxqVar.zza.zzk(i10);
                } else {
                    zzeyVar.zzc.remove(weakReference);
                }
            }
        }
    }

    public final int zza() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    public final void zzd(final zzxq zzxqVar) {
        for (WeakReference weakReference : this.zzc) {
            if (weakReference.get() == null) {
                this.zzc.remove(weakReference);
            }
        }
        this.zzc.add(new WeakReference(zzxqVar));
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeu
            @Override // java.lang.Runnable
            public final void run() {
                zzey zzeyVar = this.zza;
                zzxq zzxqVar2 = zzxqVar;
                zzxqVar2.zza.zzk(zzeyVar.zza());
            }
        });
    }
}
