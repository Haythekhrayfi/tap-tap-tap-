package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes2.dex */
@ParametersAreNonnullByDefault
public final class zzauu {
    private final Object zza = new Object();
    private zzaus zzb = null;
    private boolean zzc = false;

    public final Activity zza() {
        synchronized (this.zza) {
            zzaus zzausVar = this.zzb;
            if (zzausVar == null) {
                return null;
            }
            return zzausVar.zza();
        }
    }

    public final Context zzb() {
        synchronized (this.zza) {
            zzaus zzausVar = this.zzb;
            if (zzausVar == null) {
                return null;
            }
            return zzausVar.zzb();
        }
    }

    public final void zzc(zzaut zzautVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new zzaus();
            }
            this.zzb.zzf(zzautVar);
        }
    }

    public final void zzd(Context context) {
        synchronized (this.zza) {
            if (!this.zzc) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                if (application == null) {
                    zzbzr.zzj("Can not cast Context to Application");
                    return;
                }
                if (this.zzb == null) {
                    this.zzb = new zzaus();
                }
                this.zzb.zzg(application, context);
                this.zzc = true;
            }
        }
    }

    public final void zze(zzaut zzautVar) {
        synchronized (this.zza) {
            zzaus zzausVar = this.zzb;
            if (zzausVar == null) {
                return;
            }
            zzausVar.zzh(zzautVar);
        }
    }
}
