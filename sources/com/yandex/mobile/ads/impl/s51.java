package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class s51 implements my {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ArrayList f24984b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f24985a;

    public static final class a implements my.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f24986a;

        private a() {
        }

        public /* synthetic */ a(int i10) {
            this();
        }

        public final a a(Message message) {
            this.f24986a = message;
            return this;
        }

        @Override // com.yandex.mobile.ads.impl.my.a
        public final void a() {
            Message message = this.f24986a;
            Objects.requireNonNull(message);
            message.sendToTarget();
            this.f24986a = null;
            s51.a(this);
        }

        public final boolean a(Handler handler) {
            Message message = this.f24986a;
            Objects.requireNonNull(message);
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            this.f24986a = null;
            s51.a(this);
            return zSendMessageAtFrontOfQueue;
        }
    }

    public s51(Handler handler) {
        this.f24985a = handler;
    }

    public static void a(a aVar) {
        ArrayList arrayList = f24984b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(aVar);
            }
        }
    }

    private static a d() {
        a aVar;
        ArrayList arrayList = f24984b;
        synchronized (arrayList) {
            aVar = arrayList.isEmpty() ? new a(0) : (a) arrayList.remove(arrayList.size() - 1);
        }
        return aVar;
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final my.a a(int i10, int i11) {
        return d().a(this.f24985a.obtainMessage(1, i10, i11));
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final my.a a(int i10, Object obj) {
        return d().a(this.f24985a.obtainMessage(i10, obj));
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final void a() {
        this.f24985a.removeCallbacksAndMessages(null);
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final boolean a(int i10) {
        return this.f24985a.sendEmptyMessage(i10);
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final boolean a(long j10) {
        return this.f24985a.sendEmptyMessageAtTime(2, j10);
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final boolean a(my.a aVar) {
        return ((a) aVar).a(this.f24985a);
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final boolean a(Runnable runnable) {
        return this.f24985a.post(runnable);
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final my.a b(int i10) {
        return d().a(this.f24985a.obtainMessage(i10));
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final boolean b() {
        return this.f24985a.hasMessages(0);
    }

    @Override // com.yandex.mobile.ads.impl.my
    public final void c() {
        this.f24985a.removeMessages(2);
    }
}
