package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.metadata.Metadata;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class xq0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final nc0.b f26588s = new nc0.b(new Object());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v61 f26589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nc0.b f26590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f26592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ns f26594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f26595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i71 f26596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p71 f26597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<Metadata> f26598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nc0.b f26599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f26600l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f26601m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zq0 f26602n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f26603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile long f26604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile long f26605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile long f26606r;

    public xq0(v61 v61Var, nc0.b bVar, long j10, long j11, int i10, ns nsVar, boolean z10, i71 i71Var, p71 p71Var, List<Metadata> list, nc0.b bVar2, boolean z11, int i11, zq0 zq0Var, long j12, long j13, long j14, boolean z12) {
        this.f26589a = v61Var;
        this.f26590b = bVar;
        this.f26591c = j10;
        this.f26592d = j11;
        this.f26593e = i10;
        this.f26594f = nsVar;
        this.f26595g = z10;
        this.f26596h = i71Var;
        this.f26597i = p71Var;
        this.f26598j = list;
        this.f26599k = bVar2;
        this.f26600l = z11;
        this.f26601m = i11;
        this.f26602n = zq0Var;
        this.f26604p = j12;
        this.f26605q = j13;
        this.f26606r = j14;
        this.f26603o = z12;
    }

    public static nc0.b a() {
        return f26588s;
    }

    public static xq0 a(p71 p71Var) {
        v61 v61Var = v61.f25844a;
        nc0.b bVar = f26588s;
        return new xq0(v61Var, bVar, -9223372036854775807L, 0L, 1, null, false, i71.f21617d, p71Var, com.yandex.mobile.ads.embedded.guava.collect.p.i(), bVar, false, 0, zq0.f27397d, 0L, 0L, 0L, false);
    }

    public final xq0 a(int i10) {
        return new xq0(this.f26589a, this.f26590b, this.f26591c, this.f26592d, i10, this.f26594f, this.f26595g, this.f26596h, this.f26597i, this.f26598j, this.f26599k, this.f26600l, this.f26601m, this.f26602n, this.f26604p, this.f26605q, this.f26606r, this.f26603o);
    }

    public final xq0 a(nc0.b bVar) {
        return new xq0(this.f26589a, this.f26590b, this.f26591c, this.f26592d, this.f26593e, this.f26594f, this.f26595g, this.f26596h, this.f26597i, this.f26598j, bVar, this.f26600l, this.f26601m, this.f26602n, this.f26604p, this.f26605q, this.f26606r, this.f26603o);
    }

    public final xq0 a(nc0.b bVar, long j10, long j11, long j12, long j13, i71 i71Var, p71 p71Var, List<Metadata> list) {
        return new xq0(this.f26589a, bVar, j11, j12, this.f26593e, this.f26594f, this.f26595g, i71Var, p71Var, list, this.f26599k, this.f26600l, this.f26601m, this.f26602n, this.f26604p, j13, j10, this.f26603o);
    }

    public final xq0 a(ns nsVar) {
        return new xq0(this.f26589a, this.f26590b, this.f26591c, this.f26592d, this.f26593e, nsVar, this.f26595g, this.f26596h, this.f26597i, this.f26598j, this.f26599k, this.f26600l, this.f26601m, this.f26602n, this.f26604p, this.f26605q, this.f26606r, this.f26603o);
    }

    public final xq0 a(v61 v61Var) {
        return new xq0(v61Var, this.f26590b, this.f26591c, this.f26592d, this.f26593e, this.f26594f, this.f26595g, this.f26596h, this.f26597i, this.f26598j, this.f26599k, this.f26600l, this.f26601m, this.f26602n, this.f26604p, this.f26605q, this.f26606r, this.f26603o);
    }
}
