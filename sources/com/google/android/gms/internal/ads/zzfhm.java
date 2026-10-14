package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfhm implements Application.ActivityLifecycleCallbacks {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfhm zza = new zzfhm();
    private boolean zzb;
    private boolean zzc;
    private zzfhr zzd;

    private zzfhm() {
    }

    public static zzfhm zza() {
        return zza;
    }

    private final void zze() {
        boolean z10 = this.zzc;
        Iterator it = zzfhl.zza().zzc().iterator();
        while (it.hasNext()) {
            zzfhx zzfhxVarZzg = ((zzfha) it.next()).zzg();
            if (zzfhxVarZzg.zzk()) {
                zzfhq.zza().zzb(zzfhxVarZzg.zza(), "setState", true != z10 ? "foregrounded" : "backgrounded");
            }
        }
    }

    private final void zzf(boolean z10) {
        if (this.zzc != z10) {
            this.zzc = z10;
            if (this.zzb) {
                zze();
                if (this.zzd != null) {
                    if (!z10) {
                        zzfin.zzd().zzi();
                    } else {
                        zzfin.zzd().zzh();
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzf(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        View viewZzf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i10 = runningAppProcessInfo.importance;
        boolean z10 = true;
        for (zzfha zzfhaVar : zzfhl.zza().zzb()) {
            if (zzfhaVar.zzj() && (viewZzf = zzfhaVar.zzf()) != null && viewZzf.hasWindowFocus()) {
                z10 = false;
            }
        }
        zzf(i10 != 100 && z10);
    }

    public final void zzb() {
        this.zzb = true;
        this.zzc = false;
        zze();
    }

    public final void zzc() {
        this.zzb = false;
        this.zzc = false;
        this.zzd = null;
    }

    public final void zzd(zzfhr zzfhrVar) {
        this.zzd = zzfhrVar;
    }
}
