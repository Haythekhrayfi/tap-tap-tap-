package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class Equivalence<T> {

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;

        @NullableDecl
        private final T reference;

        private Wrapper(Equivalence<? super T> equivalence, @NullableDecl T t10) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = t10;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.equivalence);
            sb2.append(".wrap(");
            return o0.c.a(sb2, this.reference, ")");
        }
    }

    public static final class a extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5004a = new a();

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class b<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Equivalence<T> f5005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NullableDecl
        private final T f5006b;

        public b(Equivalence<T> equivalence, @NullableDecl T t10) {
            this.f5005a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.f5006b = t10;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            return this.f5005a.equivalent(t10, this.f5006b);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5005a.equals(bVar.f5005a) && Objects.equal(this.f5006b, bVar.f5006b);
        }

        public int hashCode() {
            return Objects.hashCode(this.f5005a, this.f5006b);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f5005a);
            sb2.append(".equivalentTo(");
            return o0.c.a(sb2, this.f5006b, ")");
        }
    }

    public static final class c extends Equivalence<Object> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5007a = new c();

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static Equivalence<Object> equals() {
        return a.f5004a;
    }

    public static Equivalence<Object> identity() {
        return c.f5007a;
    }

    public abstract boolean doEquivalent(T t10, T t11);

    public abstract int doHash(T t10);

    public final boolean equivalent(@NullableDecl T t10, @NullableDecl T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return doEquivalent(t10, t11);
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t10) {
        return new b(this, t10);
    }

    public final int hash(@NullableDecl T t10) {
        if (t10 == null) {
            return 0;
        }
        return doHash(t10);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s10) {
        return new Wrapper<>(s10);
    }
}
