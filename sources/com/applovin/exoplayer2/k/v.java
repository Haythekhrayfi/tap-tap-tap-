package com.applovin.exoplayer2.k;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public interface v {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.j f7506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.applovin.exoplayer2.h.m f7507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f7508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7509d;

        public a(com.applovin.exoplayer2.h.j jVar, com.applovin.exoplayer2.h.m mVar, IOException iOException, int i10) {
            this.f7506a = jVar;
            this.f7507b = mVar;
            this.f7508c = iOException;
            this.f7509d = i10;
        }
    }

    int a(int i10);

    long a(a aVar);

    default void a(long j10) {
    }
}
