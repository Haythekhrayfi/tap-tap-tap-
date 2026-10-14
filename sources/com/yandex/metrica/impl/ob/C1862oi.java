package com.yandex.metrica.impl.ob;

import android.util.Pair;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1862oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Pair<String, a>> f17022a;

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.oi$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17023a;

        public a(String str) {
            this.f17023a = str;
        }

        public String toString() {
            return this.f17023a;
        }
    }

    public C1862oi(List<Pair<String, a>> list) {
        this.f17022a = list;
    }

    public String toString() {
        return l1.f.a(defpackage.a.a("AttributionConfig{deeplinkConditions="), this.f17022a, '}');
    }
}
