package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import d6.y;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class h implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager.WakeLock f12650d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FirebaseMessaging f12651e;

    @VisibleForTesting
    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f12652a;

        public a(h hVar) {
            this.f12652a = hVar;
        }

        public void a() {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f12652a.f12651e.f12594d.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            h hVar = this.f12652a;
            if (hVar != null && hVar.a()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                h hVar2 = this.f12652a;
                hVar2.f12651e.b(hVar2, 0L);
                this.f12652a.f12651e.f12594d.unregisterReceiver(this);
                this.f12652a = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public h(FirebaseMessaging firebaseMessaging, long j10) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f12651e = firebaseMessaging;
        this.f12649c = j10;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f12594d.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f12650d = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f12651e.f12594d.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public boolean b() throws IOException {
        String string;
        boolean z10 = true;
        try {
            if (this.f12651e.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
            }
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z10 = false;
            }
            if (z10) {
                StringBuilder sbA = defpackage.a.a("Token retrieval failed: ");
                sbA.append(e10.getMessage());
                sbA.append(". Will retry token retrieval");
                string = sbA.toString();
            } else {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                string = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", string);
            return false;
        } catch (SecurityException unused) {
            string = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", string);
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (y.a().c(this.f12651e.f12594d)) {
            this.f12650d.acquire();
        }
        try {
            this.f12651e.g(true);
            if (!this.f12651e.f12602l.d()) {
                this.f12651e.g(false);
            } else if (y.a().b(this.f12651e.f12594d) && !a()) {
                new a(this).a();
            } else {
                if (b()) {
                    this.f12651e.g(false);
                } else {
                    this.f12651e.i(this.f12649c);
                }
            }
        } catch (IOException e10) {
            Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
            this.f12651e.g(false);
        } finally {
            if (y.a().c(this.f12651e.f12594d)) {
                this.f12650d.release();
            }
        }
    }
}
