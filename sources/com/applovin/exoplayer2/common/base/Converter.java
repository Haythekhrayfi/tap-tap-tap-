package com.applovin.exoplayer2.common.base;

import java.io.Serializable;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class Converter<A, B> implements Function<A, B> {
    private final boolean handleNullAutomatically;

    @MonotonicNonNullDecl
    private transient Converter<B, A> reverse;

    public static final class a<A, B, C> extends Converter<A, C> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Converter<A, B> f4998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Converter<B, C> f4999b;

        public a(Converter<A, B> converter, Converter<B, C> converter2) {
            this.f4998a = converter;
            this.f4999b = converter2;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        public A correctedDoBackward(@NullableDecl C c10) {
            return (A) this.f4998a.correctedDoBackward(this.f4999b.correctedDoBackward(c10));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        public C correctedDoForward(@NullableDecl A a10) {
            return (C) this.f4999b.correctedDoForward(this.f4998a.correctedDoForward(a10));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public A doBackward(C c10) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public C doForward(A a10) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f4998a.equals(aVar.f4998a) && this.f4999b.equals(aVar.f4999b);
        }

        public int hashCode() {
            return this.f4999b.hashCode() + (this.f4998a.hashCode() * 31);
        }

        public String toString() {
            return this.f4998a + ".andThen(" + this.f4999b + ")";
        }
    }

    public static final class b<A, B> extends Converter<A, B> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Function<? super A, ? extends B> f5000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function<? super B, ? extends A> f5001b;

        private b(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
            this.f5000a = (Function) Preconditions.checkNotNull(function);
            this.f5001b = (Function) Preconditions.checkNotNull(function2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public A doBackward(B b10) {
            return this.f5001b.apply(b10);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public B doForward(A a10) {
            return this.f5000a.apply(a10);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5000a.equals(bVar.f5000a) && this.f5001b.equals(bVar.f5001b);
        }

        public int hashCode() {
            return this.f5001b.hashCode() + (this.f5000a.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("Converter.from(");
            sbA.append(this.f5000a);
            sbA.append(", ");
            sbA.append(this.f5001b);
            sbA.append(")");
            return sbA.toString();
        }
    }

    public static final class c<T> extends Converter<T, T> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f5002a = new c();

        private c() {
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c<T> reverse() {
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public <S> Converter<T, S> doAndThen(Converter<T, S> converter) {
            return (Converter) Preconditions.checkNotNull(converter, "otherConverter");
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public T doBackward(T t10) {
            return t10;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public T doForward(T t10) {
            return t10;
        }

        public String toString() {
            return "Converter.identity()";
        }
    }

    public static final class d<A, B> extends Converter<B, A> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Converter<A, B> f5003a;

        public d(Converter<A, B> converter) {
            this.f5003a = converter;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        public B correctedDoBackward(@NullableDecl A a10) {
            return this.f5003a.correctedDoForward(a10);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        @NullableDecl
        public A correctedDoForward(@NullableDecl B b10) {
            return this.f5003a.correctedDoBackward(b10);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public B doBackward(A a10) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public A doForward(B b10) {
            throw new AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof d) {
                return this.f5003a.equals(((d) obj).f5003a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f5003a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public Converter<A, B> reverse() {
            return this.f5003a;
        }

        public String toString() {
            return this.f5003a + ".reverse()";
        }
    }

    public Converter() {
        this(true);
    }

    public Converter(boolean z10) {
        this.handleNullAutomatically = z10;
    }

    public static <A, B> Converter<A, B> from(Function<? super A, ? extends B> function, Function<? super B, ? extends A> function2) {
        return new b(function, function2);
    }

    public static <T> Converter<T, T> identity() {
        return c.f5002a;
    }

    public final <C> Converter<A, C> andThen(Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    @NullableDecl
    @Deprecated
    public final B apply(@NullableDecl A a10) {
        return convert(a10);
    }

    @NullableDecl
    public final B convert(@NullableDecl A a10) {
        return correctedDoForward(a10);
    }

    public Iterable<B> convertAll(final Iterable<? extends A> iterable) {
        Preconditions.checkNotNull(iterable, "fromIterable");
        return new Iterable<B>() { // from class: com.applovin.exoplayer2.common.base.Converter.1
            @Override // java.lang.Iterable
            public Iterator<B> iterator() {
                return new Iterator<B>() { // from class: com.applovin.exoplayer2.common.base.Converter.1.1

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    private final Iterator<? extends A> f4997b;

                    {
                        this.f4997b = iterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.f4997b.hasNext();
                    }

                    @Override // java.util.Iterator
                    public B next() {
                        return (B) Converter.this.convert(this.f4997b.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.f4997b.remove();
                    }
                };
            }
        };
    }

    @NullableDecl
    public A correctedDoBackward(@NullableDecl B b10) {
        if (!this.handleNullAutomatically) {
            return doBackward(b10);
        }
        if (b10 == null) {
            return null;
        }
        return (A) Preconditions.checkNotNull(doBackward(b10));
    }

    @NullableDecl
    public B correctedDoForward(@NullableDecl A a10) {
        if (!this.handleNullAutomatically) {
            return doForward(a10);
        }
        if (a10 == null) {
            return null;
        }
        return (B) Preconditions.checkNotNull(doForward(a10));
    }

    public <C> Converter<A, C> doAndThen(Converter<B, C> converter) {
        return new a(this, (Converter) Preconditions.checkNotNull(converter));
    }

    public abstract A doBackward(B b10);

    public abstract B doForward(A a10);

    @Override // com.applovin.exoplayer2.common.base.Function
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    public Converter<B, A> reverse() {
        Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        d dVar = new d(this);
        this.reverse = dVar;
        return dVar;
    }
}
