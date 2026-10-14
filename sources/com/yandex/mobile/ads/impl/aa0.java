package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakQueue;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class aa0<T> implements InstreamAdBreakQueue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<T> f18824a;

    public aa0(Queue<T> queue) {
        this.f18824a = queue;
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final int getCount() {
        return this.f18824a.size();
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreakQueue
    public final T poll() {
        return this.f18824a.poll();
    }
}
