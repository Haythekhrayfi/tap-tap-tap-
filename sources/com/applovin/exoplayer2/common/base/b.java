package com.applovin.exoplayer2.common.base;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
abstract class b<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f5041a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NullableDecl
    private T f5042b;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.common.base.b$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5043a;

        static {
            int[] iArr = new int[a.values().length];
            f5043a = iArr;
            try {
                iArr[a.READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5043a[a.DONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum a {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    private boolean c() {
        this.f5041a = a.FAILED;
        this.f5042b = a();
        if (this.f5041a == a.DONE) {
            return false;
        }
        this.f5041a = a.READY;
        return true;
    }

    public abstract T a();

    @NullableDecl
    public final T b() {
        this.f5041a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f5041a != a.FAILED);
        int i10 = AnonymousClass1.f5043a[this.f5041a.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 != 2) {
            return c();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f5041a = a.NOT_READY;
        T t10 = this.f5042b;
        this.f5042b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
