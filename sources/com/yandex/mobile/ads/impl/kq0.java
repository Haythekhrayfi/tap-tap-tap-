package com.yandex.mobile.ads.impl;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class kq0 extends BroadcastReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile kq0 f22492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f22493e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakHashMap<a, Object> f22496c = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22495b = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22494a = false;

    public interface a {
        void a(Intent intent);
    }

    private kq0() {
    }

    public static kq0 a() {
        if (f22492d == null) {
            synchronized (f22493e) {
                if (f22492d == null) {
                    f22492d = new kq0();
                }
            }
        }
        return f22492d;
    }

    private synchronized boolean a(Context context) {
        boolean zIsKeyguardLocked;
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager != null) {
            zIsKeyguardLocked = keyguardManager.isKeyguardLocked();
        } else {
            zIsKeyguardLocked = this.f22495b == 2;
        }
        return zIsKeyguardLocked;
    }

    public final synchronized void a(Context context, a aVar) {
        if (context != null) {
            try {
                this.f22496c.put(aVar, null);
                if (!this.f22494a) {
                    Context applicationContext = context.getApplicationContext();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.USER_PRESENT");
                    applicationContext.registerReceiver(this, intentFilter);
                    this.f22494a = true;
                    x60.d("Phone state tracker was registered", new Object[0]);
                }
            } catch (Exception unused) {
                b(context, aVar);
            }
        }
    }

    public final synchronized void b(Context context, a aVar) {
        if (context != null) {
            this.f22496c.remove(aVar);
            try {
                if (this.f22494a && this.f22496c.isEmpty()) {
                    context.getApplicationContext().unregisterReceiver(this);
                    this.f22494a = false;
                    x60.d("Phone state tracker was unregistered", new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized boolean b(Context context) {
        boolean zIsInteractive;
        synchronized (this) {
            zIsInteractive = ((PowerManager) context.getSystemService("power")).isInteractive();
        }
        nz0 nz0VarA = i01.b().a(context);
        if (nz0VarA == null || !nz0VarA.O()) {
            return zIsInteractive && !a(context);
        }
        return zIsInteractive;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        if (intent != null) {
            x60.d("Phone state has changed, action: %s", intent.getAction());
            String action = intent.getAction();
            if ("android.intent.action.SCREEN_OFF".equals(action)) {
                this.f22495b = 2;
            } else if ("android.intent.action.USER_PRESENT".equals(action)) {
                this.f22495b = 3;
            } else if ("android.intent.action.SCREEN_ON".equals(action)) {
                this.f22495b = 1;
            }
            x60.d(fn1.a("handleIntent(), intent.getAction() = ", action), new Object[0]);
            synchronized (this) {
                Iterator<a> it = this.f22496c.keySet().iterator();
                while (it.hasNext()) {
                    it.next().a(intent);
                }
            }
        }
    }
}
