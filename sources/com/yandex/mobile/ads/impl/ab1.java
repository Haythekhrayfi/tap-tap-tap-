package com.yandex.mobile.ads.impl;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ab1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q1 f18831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f18832b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q1 f18833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<String, String> f18834b;

        public a(q1 q1Var) {
            this.f18833a = q1Var;
            ke1.a(q1Var);
        }

        public final ab1 a() {
            return new ab1(this, 0);
        }

        public final a b() {
            this.f18834b = null;
            return this;
        }
    }

    private ab1(a aVar) {
        this.f18831a = aVar.f18833a;
        this.f18832b = aVar.f18834b;
    }

    public /* synthetic */ ab1(a aVar, int i10) {
        this(aVar);
    }

    public final q1 a() {
        return this.f18831a;
    }

    public final Map<String, String> b() {
        return this.f18832b;
    }
}
