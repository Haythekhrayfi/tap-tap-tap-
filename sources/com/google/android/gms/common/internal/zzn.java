package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;

/* JADX INFO: loaded from: classes.dex */
public final class zzn {
    private static final Uri zza = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority("com.google.android.gms.chimera").build();
    private final String zzb;
    private final String zzc;
    private final ComponentName zzd;
    private final int zze;
    private final boolean zzf;

    public zzn(ComponentName componentName, int i10) {
        this.zzb = null;
        this.zzc = null;
        Preconditions.checkNotNull(componentName);
        this.zzd = componentName;
        this.zze = i10;
        this.zzf = false;
    }

    public zzn(String str, int i10, boolean z10) {
        this(str, "com.google.android.gms", i10, false);
    }

    public zzn(String str, String str2, int i10, boolean z10) {
        Preconditions.checkNotEmpty(str);
        this.zzb = str;
        Preconditions.checkNotEmpty(str2);
        this.zzc = str2;
        this.zzd = null;
        this.zze = i10;
        this.zzf = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzn)) {
            return false;
        }
        zzn zznVar = (zzn) obj;
        return Objects.equal(this.zzb, zznVar.zzb) && Objects.equal(this.zzc, zznVar.zzc) && Objects.equal(this.zzd, zznVar.zzd) && this.zze == zznVar.zze && this.zzf == zznVar.zzf;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb, this.zzc, this.zzd, Integer.valueOf(this.zze), Boolean.valueOf(this.zzf));
    }

    public final String toString() {
        String str = this.zzb;
        if (str != null) {
            return str;
        }
        Preconditions.checkNotNull(this.zzd);
        return this.zzd.flattenToString();
    }

    public final int zza() {
        return this.zze;
    }

    public final ComponentName zzb() {
        return this.zzd;
    }

    public final Intent zzc(Context context) {
        Bundle bundleCall;
        if (this.zzb == null) {
            return new Intent().setComponent(this.zzd);
        }
        Intent intent = null;
        if (this.zzf) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.zzb);
            try {
                bundleCall = context.getContentResolver().call(zza, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e10) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.zzb)));
            }
        }
        return intent != null ? intent : new Intent(this.zzb).setPackage(this.zzc);
    }

    public final String zzd() {
        return this.zzc;
    }
}
