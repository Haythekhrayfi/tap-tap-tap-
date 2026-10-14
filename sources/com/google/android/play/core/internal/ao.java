package com.google.android.play.core.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
final class ao implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ap f12251a;

    public /* synthetic */ ao(ap apVar) {
        this.f12251a = apVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f12251a.f12254c.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f12251a.b(new am(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f12251a.f12254c.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f12251a.b(new an(this));
    }
}
