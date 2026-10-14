package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f4363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f4364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AudioManager f4365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f4366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4369h;

    public interface a {
        void a(int i10, boolean z10);

        void f(int i10);
    }

    public final class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = ay.this.f4363b;
            final ay ayVar = ay.this;
            handler.post(new Runnable() { // from class: com.applovin.exoplayer2.c0
                @Override // java.lang.Runnable
                public final void run() {
                    ayVar.d();
                }
            });
        }
    }

    public ay(Context context, Handler handler, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f4362a = applicationContext;
        this.f4363b = handler;
        this.f4364c = aVar;
        AudioManager audioManager = (AudioManager) com.applovin.exoplayer2.l.a.a((AudioManager) applicationContext.getSystemService("audio"));
        this.f4365d = audioManager;
        this.f4367f = 3;
        this.f4368g = a(audioManager, 3);
        this.f4369h = b(audioManager, this.f4367f);
        b bVar = new b();
        try {
            applicationContext.registerReceiver(bVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f4366e = bVar;
        } catch (RuntimeException e10) {
            com.applovin.exoplayer2.l.q.b("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static int a(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            com.applovin.exoplayer2.l.q.b("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    private static boolean b(AudioManager audioManager, int i10) {
        if (com.applovin.exoplayer2.l.ai.f7595a >= 23) {
            return audioManager.isStreamMute(i10);
        }
        return a(audioManager, i10) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        int iA = a(this.f4365d, this.f4367f);
        boolean zB = b(this.f4365d, this.f4367f);
        if (this.f4368g == iA && this.f4369h == zB) {
            return;
        }
        this.f4368g = iA;
        this.f4369h = zB;
        this.f4364c.a(iA, zB);
    }

    public int a() {
        if (com.applovin.exoplayer2.l.ai.f7595a >= 28) {
            return this.f4365d.getStreamMinVolume(this.f4367f);
        }
        return 0;
    }

    public void a(int i10) {
        if (this.f4367f == i10) {
            return;
        }
        this.f4367f = i10;
        d();
        this.f4364c.f(i10);
    }

    public int b() {
        return this.f4365d.getStreamMaxVolume(this.f4367f);
    }

    public void c() {
        b bVar = this.f4366e;
        if (bVar != null) {
            try {
                this.f4362a.unregisterReceiver(bVar);
            } catch (RuntimeException e10) {
                com.applovin.exoplayer2.l.q.b("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f4366e = null;
        }
    }
}
