package com.applovin.exoplayer2.l;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class ae implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<a> f7583a = new ArrayList(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f7584b;

    public static final class a implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f7585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ae f7586b;

        private a() {
        }

        private void b() {
            this.f7585a = null;
            this.f7586b = null;
            ae.b(this);
        }

        public a a(Message message, ae aeVar) {
            this.f7585a = message;
            this.f7586b = aeVar;
            return this;
        }

        @Override // com.applovin.exoplayer2.l.o.a
        public void a() {
            ((Message) com.applovin.exoplayer2.l.a.b(this.f7585a)).sendToTarget();
            b();
        }

        public boolean a(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) com.applovin.exoplayer2.l.a.b(this.f7585a));
            b();
            return zSendMessageAtFrontOfQueue;
        }
    }

    public ae(Handler handler) {
        this.f7584b = handler;
    }

    private static a a() {
        a aVar;
        List<a> list = f7583a;
        synchronized (list) {
            aVar = list.isEmpty() ? new a() : list.remove(list.size() - 1);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(a aVar) {
        List<a> list = f7583a;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(aVar);
            }
        }
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i10, int i11, int i12) {
        return a().a(this.f7584b.obtainMessage(i10, i11, i12), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i10, int i11, int i12, Object obj) {
        return a().a(this.f7584b.obtainMessage(i10, i11, i12, obj), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a a(int i10, Object obj) {
        return a().a(this.f7584b.obtainMessage(i10, obj), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public void a(Object obj) {
        this.f7584b.removeCallbacksAndMessages(obj);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(int i10) {
        return this.f7584b.hasMessages(i10);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(int i10, long j10) {
        return this.f7584b.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(o.a aVar) {
        return ((a) aVar).a(this.f7584b);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean a(Runnable runnable) {
        return this.f7584b.post(runnable);
    }

    @Override // com.applovin.exoplayer2.l.o
    public o.a b(int i10) {
        return a().a(this.f7584b.obtainMessage(i10), this);
    }

    @Override // com.applovin.exoplayer2.l.o
    public boolean c(int i10) {
        return this.f7584b.sendEmptyMessage(i10);
    }

    @Override // com.applovin.exoplayer2.l.o
    public void d(int i10) {
        this.f7584b.removeMessages(i10);
    }
}
