package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dn0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static dn0 f19913e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f19914a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<b>> f19915b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f19916c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19917d = 0;

    public static final class a {

        /* JADX INFO: renamed from: com.yandex.mobile.ads.impl.dn0$a$a, reason: collision with other inner class name */
        public static final class C0204a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final dn0 f19918a;

            public C0204a(dn0 dn0Var) {
                this.f19918a = dn0Var;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                dn0.a(this.f19918a, overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, dn0 dn0Var) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                Objects.requireNonNull(telephonyManager);
                C0204a c0204a = new C0204a(dn0Var);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), c0204a);
                telephonyManager.unregisterTelephonyCallback(c0204a);
            } catch (RuntimeException unused) {
                dn0.a(dn0Var, 5);
            }
        }
    }

    public interface b {
        void a(int i10);
    }

    public final class c extends BroadcastReceiver {
        private c() {
        }

        public /* synthetic */ c(dn0 dn0Var, int i10) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int iA = dn0.a(context);
            if (da1.f19803a < 31 || iA != 5) {
                dn0.a(dn0.this, iA);
            } else {
                a.a(context, dn0.this);
            }
        }
    }

    private dn0(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(this, 0), intentFilter);
    }

    public static int a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type == 9) {
                                return 7;
                            }
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    return 8;
                                }
                            }
                            return 5;
                        }
                        return 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            return 3;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return 4;
                        case 13:
                            return 5;
                        case 16:
                        case 19:
                        default:
                            return 6;
                        case 18:
                            return 2;
                        case 20:
                            if (da1.f19803a >= 29) {
                                return 9;
                            }
                            break;
                    }
                } else {
                    return 1;
                }
            } catch (SecurityException unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        bVar.a(a());
    }

    public static void a(dn0 dn0Var, int i10) {
        synchronized (dn0Var.f19916c) {
            if (dn0Var.f19917d == i10) {
                return;
            }
            dn0Var.f19917d = i10;
            for (WeakReference<b> weakReference : dn0Var.f19915b) {
                b bVar = weakReference.get();
                if (bVar != null) {
                    bVar.a(i10);
                } else {
                    dn0Var.f19915b.remove(weakReference);
                }
            }
        }
    }

    public static synchronized dn0 b(Context context) {
        if (f19913e == null) {
            f19913e = new dn0(context);
        }
        return f19913e;
    }

    public final int a() {
        int i10;
        synchronized (this.f19916c) {
            i10 = this.f19917d;
        }
        return i10;
    }

    public final void b(b bVar) {
        for (WeakReference<b> weakReference : this.f19915b) {
            if (weakReference.get() == null) {
                this.f19915b.remove(weakReference);
            }
        }
        this.f19915b.add(new WeakReference<>(bVar));
        this.f19914a.post(new do1(this, bVar));
    }
}
