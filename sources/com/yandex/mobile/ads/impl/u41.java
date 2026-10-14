package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class u41 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f25547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f25548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioManager f25549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f25550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f25553h;

    public interface a {
    }

    public final class b extends BroadcastReceiver {
        private b() {
        }

        public /* synthetic */ b(u41 u41Var, int i10) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            u41.this.f25547b.post(new pp1(u41.this));
        }
    }

    public u41(Context context, Handler handler, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f25546a = applicationContext;
        this.f25547b = handler;
        this.f25548c = aVar;
        AudioManager audioManager = (AudioManager) pa.b((AudioManager) applicationContext.getSystemService("audio"));
        this.f25549d = audioManager;
        this.f25551f = 3;
        this.f25552g = b(audioManager, 3);
        this.f25553h = a(audioManager, this.f25551f);
        b bVar = new b(this, 0);
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f25550e = bVar;
        } catch (RuntimeException e10) {
            p90.b("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static boolean a(AudioManager audioManager, int i10) {
        if (da1.f19803a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return b(audioManager, i10) == 0;
    }

    private static int b(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            p90.b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static void b(u41 u41Var) {
        int iB = b(u41Var.f25549d, u41Var.f25551f);
        boolean zA = a(u41Var.f25549d, u41Var.f25551f);
        if (u41Var.f25552g == iB && u41Var.f25553h == zA) {
            return;
        }
        u41Var.f25552g = iB;
        u41Var.f25553h = zA;
        ((rs.b) u41Var.f25548c).a(zA, iB);
    }

    public final int a() {
        return this.f25549d.getStreamMaxVolume(this.f25551f);
    }

    public final void a(int i10) {
        if (this.f25551f == i10) {
            return;
        }
        this.f25551f = i10;
        int iB = b(this.f25549d, i10);
        boolean zA = a(this.f25549d, this.f25551f);
        if (this.f25552g != iB || this.f25553h != zA) {
            this.f25552g = iB;
            this.f25553h = zA;
            ((rs.b) this.f25548c).a(zA, iB);
        }
        ((rs.b) this.f25548c).c();
    }

    public final int b() {
        if (da1.f19803a >= 28) {
            return this.f25549d.getStreamMinVolume(this.f25551f);
        }
        return 0;
    }

    public final void c() {
        b bVar = this.f25550e;
        if (bVar != null) {
            try {
                this.f25546a.unregisterReceiver(bVar);
            } catch (RuntimeException e10) {
                p90.b("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f25550e = null;
        }
    }
}
