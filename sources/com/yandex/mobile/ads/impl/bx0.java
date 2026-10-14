package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import com.yandex.mobile.ads.exo.scheduler.Requirements;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class bx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f19338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f19339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Requirements f19340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f19341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f19343f;

    public class a extends BroadcastReceiver {
        private a() {
        }

        public /* synthetic */ a(bx0 bx0Var, int i10) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            bx0.a(bx0.this);
        }
    }

    public interface b {
        void a(bx0 bx0Var, int i10);
    }

    public final class c extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f19345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f19346b;

        private c() {
        }

        public /* synthetic */ c(bx0 bx0Var, int i10) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (bx0.this.f19343f != null) {
                bx0.a(bx0.this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            if (bx0.this.f19343f != null) {
                bx0.d(bx0.this);
            }
        }

        private void c() {
            bx0.this.f19341d.post(new sn1(this, 1));
        }

        private void d() {
            bx0.this.f19341d.post(new sn1(this, 0));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            c();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onBlockedStatusChanged(Network network, boolean z10) {
            if (z10) {
                return;
            }
            d();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f19345a && this.f19346b == zHasCapability) {
                if (zHasCapability) {
                    d();
                }
            } else {
                this.f19345a = true;
                this.f19346b = zHasCapability;
                c();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            c();
        }
    }

    public bx0(Context context, b bVar) {
        Requirements requirements = com.yandex.mobile.ads.exo.offline.c.f18683j;
        this.f19338a = context.getApplicationContext();
        this.f19339b = bVar;
        this.f19340c = requirements;
        this.f19341d = da1.b();
    }

    public static void a(bx0 bx0Var) {
        int iA = bx0Var.f19340c.a(bx0Var.f19338a);
        if (bx0Var.f19342e != iA) {
            bx0Var.f19342e = iA;
            bx0Var.f19339b.a(bx0Var, iA);
        }
    }

    public static void d(bx0 bx0Var) {
        int iA;
        if ((bx0Var.f19342e & 3) == 0 || bx0Var.f19342e == (iA = bx0Var.f19340c.a(bx0Var.f19338a))) {
            return;
        }
        bx0Var.f19342e = iA;
        bx0Var.f19339b.a(bx0Var, iA);
    }

    public final int a() {
        String str;
        this.f19342e = this.f19340c.a(this.f19338a);
        IntentFilter intentFilter = new IntentFilter();
        int i10 = 0;
        if (this.f19340c.e()) {
            if (da1.f19803a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f19338a.getSystemService("connectivity");
                Objects.requireNonNull(connectivityManager);
                c cVar = new c(this, i10);
                this.f19343f = cVar;
                connectivityManager.registerDefaultNetworkCallback(cVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f19340c.c()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f19340c.d()) {
            if (da1.f19803a >= 23) {
                str = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                str = "android.intent.action.SCREEN_OFF";
            }
            intentFilter.addAction(str);
        }
        if (this.f19340c.f()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        this.f19338a.registerReceiver(new a(this, i10), intentFilter, null, this.f19341d);
        return this.f19342e;
    }
}
