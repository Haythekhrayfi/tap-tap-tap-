package d6;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class d0 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f28669h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Boolean f28670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Boolean f28671j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f28672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f28673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f28674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.google.firebase.messaging.i f28675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f28676g;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d0 f28677a;

        public a(d0 d0Var) {
            this.f28677a = d0Var;
        }

        public void a() {
            Object obj = d0.f28669h;
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            d0.this.f28672c.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            d0 d0Var = this.f28677a;
            if (d0Var == null) {
                return;
            }
            Object obj = d0.f28669h;
            if (d0Var.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                d0 d0Var2 = this.f28677a;
                d0Var2.f28675f.f12660f.schedule(d0Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f28677a = null;
            }
        }
    }

    public d0(com.google.firebase.messaging.i iVar, Context context, r rVar, long j10) {
        this.f28675f = iVar;
        this.f28672c = context;
        this.f28676g = j10;
        this.f28673d = rVar;
        this.f28674e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f28669h) {
            Boolean bool = f28671j;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
            f28671j = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z10 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z10 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z10;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f28669h) {
            Boolean bool = f28670i;
            Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
            f28670i = boolValueOf;
            zBooleanValue = boolValueOf.booleanValue();
        }
        return zBooleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f28672c.getSystemService("connectivity");
        activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (c(this.f28672c)) {
            this.f28674e.acquire(b.f28653a);
        }
        try {
            try {
                try {
                    this.f28675f.e(true);
                    if (!this.f28673d.d()) {
                        this.f28675f.e(false);
                        if (c(this.f28672c)) {
                            try {
                                this.f28674e.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (a(this.f28672c) && !d()) {
                        new a(this).a();
                        if (c(this.f28672c)) {
                            try {
                                this.f28674e.release();
                                return;
                            } catch (RuntimeException unused2) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (this.f28675f.g()) {
                        this.f28675f.e(false);
                    } else {
                        this.f28675f.h(this.f28676g);
                    }
                    if (c(this.f28672c)) {
                        wakeLock = this.f28674e;
                        wakeLock.release();
                    }
                } catch (Throwable th) {
                    if (c(this.f28672c)) {
                        try {
                            this.f28674e.release();
                        } catch (RuntimeException unused3) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                    throw th;
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                this.f28675f.e(false);
                if (!c(this.f28672c)) {
                } else {
                    wakeLock = this.f28674e;
                }
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}
