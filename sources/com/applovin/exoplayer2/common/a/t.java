package com.applovin.exoplayer2.common.a;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public class t<K, V> extends v<K, V> implements z<K, V> {

    public static final class a<K, V> extends v.a<K, V> {
        @Override // com.applovin.exoplayer2.common.a.v.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(K k10, Iterable<? extends V> iterable) {
            super.b(k10, iterable);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.v.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(K k10, V... vArr) {
            super.b(k10, vArr);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.a.v.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public t<K, V> b() {
            return (t) super.b();
        }
    }

    public t(u<K, s<V>> uVar, int i10) {
        super(uVar, i10);
    }

    public static <K, V> t<K, V> a() {
        return o.f4917a;
    }

    public static <K, V> t<K, V> a(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return a();
        }
        u.a aVar = new u.a(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            s sVarA = comparator == null ? s.a((Collection) value) : s.a((Comparator) comparator, (Iterable) value);
            if (!sVarA.isEmpty()) {
                aVar.a(key, sVarA);
                size = sVarA.size() + size;
            }
        }
        return new t<>(aVar.a(), size);
    }

    public static <K, V> a<K, V> c() {
        return new a<>();
    }

    @Override // com.applovin.exoplayer2.common.a.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public s<V> b(@NullableDecl K k10) {
        s<V> sVar = (s) ((v) this).f4937b.get(k10);
        return sVar == null ? s.g() : sVar;
    }
}
