package com.applovin.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes.dex */
final class bc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WifiManager f4712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WifiManager.WifiLock f4713b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4714c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4715d;

    public bc(Context context) {
        this.f4712a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void a() {
        WifiManager.WifiLock wifiLock = this.f4713b;
        if (wifiLock == null) {
            return;
        }
        if (this.f4714c && this.f4715d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f4713b == null) {
            WifiManager wifiManager = this.f4712a;
            if (wifiManager == null) {
                com.applovin.exoplayer2.l.q.c("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f4713b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f4714c = z10;
        a();
    }

    public void b(boolean z10) {
        this.f4715d = z10;
        a();
    }
}
