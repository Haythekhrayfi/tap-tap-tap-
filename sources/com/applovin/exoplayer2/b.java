package com.applovin.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4376c;

    public final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0072b f4378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f4379c;

        public a(Handler handler, InterfaceC0072b interfaceC0072b) {
            this.f4379c = handler;
            this.f4378b = interfaceC0072b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f4379c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f4376c) {
                this.f4378b.a();
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.exoplayer2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0072b {
        void a();
    }

    public b(Context context, Handler handler, InterfaceC0072b interfaceC0072b) {
        this.f4374a = context.getApplicationContext();
        this.f4375b = new a(handler, interfaceC0072b);
    }

    public void a(boolean z10) {
        boolean z11;
        if (z10 && !this.f4376c) {
            this.f4374a.registerReceiver(this.f4375b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z11 = true;
        } else {
            if (z10 || !this.f4376c) {
                return;
            }
            this.f4374a.unregisterReceiver(this.f4375b);
            z11 = false;
        }
        this.f4376c = z11;
    }
}
