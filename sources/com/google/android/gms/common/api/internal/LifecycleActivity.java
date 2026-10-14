package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.fragment.app.n;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    @KeepForSdk
    public LifecycleActivity(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public final Activity zza() {
        return (Activity) this.zza;
    }

    public final n zzb() {
        return (n) this.zza;
    }

    public final boolean zzc() {
        return this.zza instanceof Activity;
    }

    public final boolean zzd() {
        return this.zza instanceof n;
    }
}
