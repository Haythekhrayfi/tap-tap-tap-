package com.applovin.exoplayer2.l;

import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f7575a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f7576b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7577c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f7575a) {
            this.f7576b.add(Integer.valueOf(i10));
            this.f7577c = Math.max(this.f7577c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f7575a) {
            this.f7576b.remove(Integer.valueOf(i10));
            this.f7577c = this.f7576b.isEmpty() ? Integer.MIN_VALUE : ((Integer) ai.a(this.f7576b.peek())).intValue();
            this.f7575a.notifyAll();
        }
    }
}
