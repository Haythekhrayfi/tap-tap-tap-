package com.applovin.exoplayer2.common.base;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class Predicates {

    public static class a<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends Predicate<? super T>> f5014a;

        private a(List<? extends Predicate<? super T>> list) {
            this.f5014a = list;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            for (int i10 = 0; i10 < this.f5014a.size(); i10++) {
                if (!this.f5014a.get(i10).apply(t10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof a) {
                return this.f5014a.equals(((a) obj).f5014a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5014a.hashCode() + 306654252;
        }

        public String toString() {
            return Predicates.toStringHelper("and", this.f5014a);
        }
    }

    public static class b<A, B> implements Predicate<A>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Predicate<B> f5015a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function<A, ? extends B> f5016b;

        private b(Predicate<B> predicate, Function<A, ? extends B> function) {
            this.f5015a = (Predicate) Preconditions.checkNotNull(predicate);
            this.f5016b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl A a10) {
            return this.f5015a.apply(this.f5016b.apply(a10));
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5016b.equals(bVar.f5016b) && this.f5015a.equals(bVar.f5015a);
        }

        public int hashCode() {
            return this.f5016b.hashCode() ^ this.f5015a.hashCode();
        }

        public String toString() {
            return this.f5015a + "(" + this.f5016b + ")";
        }
    }

    public static class c<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Collection<?> f5017a;

        private c(Collection<?> collection) {
            this.f5017a = (Collection) Preconditions.checkNotNull(collection);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            try {
                return this.f5017a.contains(t10);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof c) {
                return this.f5017a.equals(((c) obj).f5017a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5017a.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Predicates.in(");
            sbA.append(this.f5017a);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static class d implements Predicate<Object>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f5018a;

        private d(Class<?> cls) {
            this.f5018a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl Object obj) {
            return this.f5018a.isInstance(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof d) && this.f5018a == ((d) obj).f5018a;
        }

        public int hashCode() {
            return this.f5018a.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Predicates.instanceOf(");
            sbA.append(this.f5018a.getName());
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static class e<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final T f5019a;

        private e(T t10) {
            this.f5019a = t10;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(T t10) {
            return this.f5019a.equals(t10);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof e) {
                return this.f5019a.equals(((e) obj).f5019a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5019a.hashCode();
        }

        public String toString() {
            return o0.c.a(defpackage.a.a("Predicates.equalTo("), this.f5019a, ")");
        }
    }

    public static class f<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Predicate<T> f5020a;

        public f(Predicate<T> predicate) {
            this.f5020a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            return !this.f5020a.apply(t10);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof f) {
                return this.f5020a.equals(((f) obj).f5020a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f5020a.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Predicates.not(");
            sbA.append(this.f5020a);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public enum g implements Predicate<Object> {
        ALWAYS_TRUE { // from class: com.applovin.exoplayer2.common.base.Predicates.g.1
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        },
        ALWAYS_FALSE { // from class: com.applovin.exoplayer2.common.base.Predicates.g.2
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        },
        IS_NULL { // from class: com.applovin.exoplayer2.common.base.Predicates.g.3
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        },
        NOT_NULL { // from class: com.applovin.exoplayer2.common.base.Predicates.g.4
            @Override // com.applovin.exoplayer2.common.base.Predicate
            public boolean apply(@NullableDecl Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        };

        public <T> Predicate<T> a() {
            return this;
        }
    }

    public static class h<T> implements Predicate<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<? extends Predicate<? super T>> f5026a;

        private h(List<? extends Predicate<? super T>> list) {
            this.f5026a = list;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(@NullableDecl T t10) {
            for (int i10 = 0; i10 < this.f5026a.size(); i10++) {
                if (this.f5026a.get(i10).apply(t10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof h) {
                return this.f5026a.equals(((h) obj).f5026a);
            }
            return false;
        }

        public int hashCode() {
            return this.f5026a.hashCode() + 87855567;
        }

        public String toString() {
            return Predicates.toStringHelper("or", this.f5026a);
        }
    }

    public static class i implements Predicate<Class<?>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f5027a;

        private i(Class<?> cls) {
            this.f5027a = (Class) Preconditions.checkNotNull(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Class<?> cls) {
            return this.f5027a.isAssignableFrom(cls);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            return (obj instanceof i) && this.f5027a == ((i) obj).f5027a;
        }

        public int hashCode() {
            return this.f5027a.hashCode();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Predicates.subtypeOf(");
            sbA.append(this.f5027a.getName());
            sbA.append(")");
            return sbA.toString();
        }
    }

    private Predicates() {
    }

    public static <T> Predicate<T> alwaysFalse() {
        return g.ALWAYS_FALSE.a();
    }

    public static <T> Predicate<T> alwaysTrue() {
        return g.ALWAYS_TRUE.a();
    }

    public static <T> Predicate<T> and(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new a(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> and(Iterable<? extends Predicate<? super T>> iterable) {
        return new a(defensiveCopy(iterable));
    }

    @SafeVarargs
    public static <T> Predicate<T> and(Predicate<? super T>... predicateArr) {
        return new a(defensiveCopy(predicateArr));
    }

    private static <T> List<Predicate<? super T>> asList(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return Arrays.asList(predicate, predicate2);
    }

    public static <A, B> Predicate<A> compose(Predicate<B> predicate, Function<A, ? extends B> function) {
        return new b(predicate, function);
    }

    public static <T> List<T> defensiveCopy(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }

    private static <T> List<T> defensiveCopy(T... tArr) {
        return defensiveCopy(Arrays.asList(tArr));
    }

    public static <T> Predicate<T> equalTo(@NullableDecl T t10) {
        return t10 == null ? isNull() : new e(t10);
    }

    public static <T> Predicate<T> in(Collection<? extends T> collection) {
        return new c(collection);
    }

    public static Predicate<Object> instanceOf(Class<?> cls) {
        return new d(cls);
    }

    public static <T> Predicate<T> isNull() {
        return g.IS_NULL.a();
    }

    public static <T> Predicate<T> not(Predicate<T> predicate) {
        return new f(predicate);
    }

    public static <T> Predicate<T> notNull() {
        return g.NOT_NULL.a();
    }

    public static <T> Predicate<T> or(Predicate<? super T> predicate, Predicate<? super T> predicate2) {
        return new h(asList((Predicate) Preconditions.checkNotNull(predicate), (Predicate) Preconditions.checkNotNull(predicate2)));
    }

    public static <T> Predicate<T> or(Iterable<? extends Predicate<? super T>> iterable) {
        return new h(defensiveCopy(iterable));
    }

    @SafeVarargs
    public static <T> Predicate<T> or(Predicate<? super T>... predicateArr) {
        return new h(defensiveCopy(predicateArr));
    }

    public static Predicate<Class<?>> subtypeOf(Class<?> cls) {
        return new i(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String toStringHelper(String str, Iterable<?> iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(CoreConstants.COMMA_CHAR);
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb2.toString();
    }
}
