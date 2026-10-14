package com.yandex.mobile.ads.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
final class vb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f25927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f25928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25929c;

    public final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f25930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f25931c;

        public a(Handler handler, b bVar) {
            this.f25931c = handler;
            this.f25930b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f25931c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (vb.this.f25929c) {
                rs.this.a(-1, 3, false);
            }
        }
    }

    public interface b {
    }

    public vb(Context context, Handler handler, b bVar) {
        this.f25927a = context.getApplicationContext();
        this.f25928b = new a(handler, bVar);
    }

    public final void a() {
        if (this.f25929c) {
            this.f25927a.unregisterReceiver(this.f25928b);
            this.f25929c = false;
        }
    }
}
