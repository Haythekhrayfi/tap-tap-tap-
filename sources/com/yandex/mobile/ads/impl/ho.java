package com.yandex.mobile.ads.impl;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class ho implements nc0.a {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f21478a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final HashMap f21479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private lm.a f21480c;

        public a(yn ynVar) {
            new HashSet();
            this.f21479b = new HashMap();
        }

        public final void a(tn.a aVar) {
            if (aVar != this.f21480c) {
                this.f21480c = aVar;
                this.f21478a.clear();
                this.f21479b.clear();
            }
        }
    }

    public ho(tn.a aVar, yn ynVar) {
        new a(ynVar).a(aVar);
    }
}
