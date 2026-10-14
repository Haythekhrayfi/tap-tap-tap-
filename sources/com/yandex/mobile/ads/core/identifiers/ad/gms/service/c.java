package com.yandex.mobile.ads.core.identifiers.ad.gms.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.yandex.mobile.ads.impl.x60;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class c implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f18274a = new LinkedBlockingQueue();

    public final IBinder a() throws InterruptedException {
        return (IBinder) this.f18274a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f18274a.put(iBinder);
        } catch (InterruptedException e10) {
            x60.a(e10, "Exception during put into queue", new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f18274a.clear();
        } catch (UnsupportedOperationException e10) {
            x60.a(e10, "Exception during queue clear", new Object[0]);
        }
    }
}
