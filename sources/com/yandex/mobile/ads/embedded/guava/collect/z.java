package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.n51;
import com.yandex.mobile.ads.impl.q80;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class z<K0, V0> {

    public static final class a<V> implements n51<List<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18400a;

        public a(int i10) {
            this.f18400a = h.a(i10, "expectedValuesPerKey");
        }

        @Override // com.yandex.mobile.ads.impl.n51
        public final Object get() {
            return new ArrayList(this.f18400a);
        }
    }

    public static abstract class b<K0, V0> extends z<K0, V0> {
        public b() {
            super(0);
        }

        public abstract <K extends K0, V extends V0> q80<K, V> b();
    }

    public static abstract class c<K0> {
        public final b<K0, Object> a() {
            h.a(2, "expectedValuesPerKey");
            return new a0(this);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> b();
    }

    private z() {
    }

    public /* synthetic */ z(int i10) {
        this();
    }

    public static c<Comparable> a() {
        c0 c0Var = c0.f18295a;
        Objects.requireNonNull(c0Var);
        return new y(c0Var);
    }
}
