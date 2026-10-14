package com.applovin.exoplayer2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: loaded from: classes.dex */
final class bb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PowerManager f4708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PowerManager.WakeLock f4709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4711d;

    public bb(Context context) {
        this.f4708a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @SuppressLint({"WakelockTimeout"})
    private void a() {
        PowerManager.WakeLock wakeLock = this.f4709b;
        if (wakeLock == null) {
            return;
        }
        if (this.f4710c && this.f4711d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f4709b == null) {
            PowerManager powerManager = this.f4708a;
            if (powerManager == null) {
                com.applovin.exoplayer2.l.q.c("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f4709b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f4710c = z10;
        a();
    }

    public void b(boolean z10) {
        this.f4711d = z10;
        a();
    }
}
