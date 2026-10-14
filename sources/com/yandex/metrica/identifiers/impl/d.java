package com.yandex.metrica.identifiers.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public class d implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f13588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IBinder f13589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13590c = new Object();

    public d(Intent intent, String str) {
        this.f13588a = intent;
        String.format("[AdServiceConnection-%s]", str);
    }

    public void a(Context context) {
        synchronized (this.f13590c) {
            this.f13589b = null;
            this.f13590c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public void onBindingDied(ComponentName componentName) {
        synchronized (this.f13590c) {
            this.f13589b = null;
            this.f13590c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onNullBinding(ComponentName componentName) {
        synchronized (this.f13590c) {
            this.f13590c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f13590c) {
            this.f13589b = iBinder;
            this.f13590c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f13590c) {
            this.f13589b = null;
            this.f13590c.notifyAll();
        }
    }
}
