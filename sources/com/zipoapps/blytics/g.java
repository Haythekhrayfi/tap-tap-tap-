package com.zipoapps.blytics;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class g extends HandlerThread {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BLyticsEngine f28229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f28230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Message> f28231e;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                g.this.f28229c.c((ka.b) message.obj, true);
                return;
            }
            if (i10 != 2) {
                return;
            }
            if (message.arg2 != 1) {
                g.this.f28229c.c((ka.b) message.obj, true);
            }
            g gVar = g.this;
            Objects.requireNonNull(gVar);
            Message message2 = new Message();
            message2.what = 2;
            message2.obj = message.obj;
            message2.arg1 = message.arg1;
            gVar.f28230d.sendMessageDelayed(message2, message.arg1);
        }
    }

    public g(BLyticsEngine bLyticsEngine) {
        super("SessionThread");
        this.f28231e = new ArrayList();
        this.f28229c = bLyticsEngine;
    }

    @Override // android.os.HandlerThread
    public void onLooperPrepared() {
        xe.a.b("SessionThread").a("Session thread ready", new Object[0]);
        BLyticsEngine bLyticsEngine = this.f28229c;
        Iterator<com.zipoapps.blytics.a> it = bLyticsEngine.f28213f.iterator();
        while (it.hasNext()) {
            it.next().e(bLyticsEngine.f28211d);
        }
        synchronized (this) {
            this.f28230d = new a(getLooper());
            Iterator<Message> it2 = this.f28231e.iterator();
            while (it2.hasNext()) {
                this.f28230d.sendMessage(it2.next());
            }
            notifyAll();
        }
    }
}
