package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import w0.a;

/* JADX INFO: loaded from: classes.dex */
abstract class zzp<T> {
    public final int zza;
    public final TaskCompletionSource<T> zzb = new TaskCompletionSource<>();
    public final int zzc;
    public final Bundle zzd;

    public zzp(int i10, int i11, Bundle bundle) {
        this.zza = i10;
        this.zzc = i11;
        this.zzd = bundle;
    }

    public final String toString() {
        int i10 = this.zzc;
        int i11 = this.zza;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Request { what=");
        sb2.append(i10);
        sb2.append(" id=");
        sb2.append(i11);
        sb2.append(" oneWay=");
        sb2.append(zzb());
        sb2.append("}");
        return sb2.toString();
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzq zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(zzqVar);
            Log.d("MessengerIpcClient", a.a(new StringBuilder(strValueOf.length() + 14 + strValueOf2.length()), "Failing ", strValueOf, " with ", strValueOf2));
        }
        this.zzb.setException(zzqVar);
    }

    public final void zzd(T t10) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String strValueOf = String.valueOf(this);
            String strValueOf2 = String.valueOf(t10);
            Log.d("MessengerIpcClient", a.a(new StringBuilder(strValueOf.length() + 16 + strValueOf2.length()), "Finishing ", strValueOf, " with ", strValueOf2));
        }
        this.zzb.setResult(t10);
    }
}
