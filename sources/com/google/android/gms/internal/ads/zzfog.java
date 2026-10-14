package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
final class zzfog implements ServiceConnection {
    public final /* synthetic */ zzfoh zza;

    public /* synthetic */ zzfog(zzfoh zzfohVar, zzfof zzfofVar) {
        this.zza = zzfohVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.zza.zzc.zzc("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.zza.zzc().post(new zzfod(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zza.zzc.zzc("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.zza.zzc().post(new zzfoe(this));
    }
}
