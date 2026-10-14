package com.applovin.exoplayer2.l;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static w f7680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f7681b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<b>> f7682c = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f7683d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7684e = 0;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static volatile boolean f7685a;
    }

    public interface b {
        void onNetworkTypeChanged(int i10);
    }

    public final class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iC = w.c(context);
            int i10 = ai.f7595a;
            if (i10 >= 29 && !a.f7685a && iC == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) com.applovin.exoplayer2.l.a.b((TelephonyManager) context.getSystemService("phone"));
                    d dVar = new d();
                    if (i10 < 31) {
                        telephonyManager.listen(dVar, 1);
                    } else {
                        telephonyManager.listen(dVar, 1048576);
                    }
                    telephonyManager.listen(dVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            w.this.a(iC);
        }
    }

    public class d extends PhoneStateListener {
        private d() {
        }

        @Override // android.telephony.PhoneStateListener
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            w.this.a(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(ServiceState serviceState) {
            String string = serviceState == null ? "" : serviceState.toString();
            w.this.a(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private w(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new c(), intentFilter);
    }

    private static int a(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
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
                return ai.f7595a >= 29 ? 9 : 0;
        }
    }

    public static synchronized w a(Context context) {
        if (f7680a == null) {
            f7680a = new w(context);
        }
        return f7680a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        synchronized (this.f7683d) {
            if (this.f7684e == i10) {
                return;
            }
            this.f7684e = i10;
            for (WeakReference<b> weakReference : this.f7682c) {
                b bVar = weakReference.get();
                if (bVar != null) {
                    bVar.onNetworkTypeChanged(i10);
                } else {
                    this.f7682c.remove(weakReference);
                }
            }
        }
    }

    private void b() {
        for (WeakReference<b> weakReference : this.f7682c) {
            if (weakReference.get() == null) {
                this.f7682c.remove(weakReference);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b bVar) {
        bVar.onNetworkTypeChanged(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return a(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    public int a() {
        int i10;
        synchronized (this.f7683d) {
            i10 = this.f7684e;
        }
        return i10;
    }

    public void a(b bVar) {
        b();
        this.f7682c.add(new WeakReference<>(bVar));
        this.f7681b.post(new androidx.appcompat.app.s(this, bVar));
    }
}
