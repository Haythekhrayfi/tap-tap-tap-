package com.yandex.mobile.ads.core.identifiers.ad.huawei;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.yandex.mobile.ads.impl.x60;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedBlockingQueue f18286a = new LinkedBlockingQueue();

    public final OpenDeviceIdentifierService a() throws InterruptedException {
        return (OpenDeviceIdentifierService) this.f18286a.poll(5L, TimeUnit.SECONDS);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            this.f18286a.put(OpenDeviceIdentifierService.Stub.asInterface(iBinder));
        } catch (Exception e10) {
            x60.a(e10, "Exception during put into queue", new Object[0]);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        try {
            this.f18286a.clear();
        } catch (UnsupportedOperationException e10) {
            x60.a(e10, "Exception during queue clear", new Object[0]);
        }
    }
}
