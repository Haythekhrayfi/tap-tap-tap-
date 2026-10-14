package com.applovin.exoplayer2.common.a;

import com.applovin.exoplayer2.common.base.Preconditions;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> extends ax<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f4836a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NullableDecl
    private T f4837b;

    /* JADX INFO: renamed from: com.applovin.exoplayer2.common.a.b$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4838a;

        static {
            int[] iArr = new int[a.values().length];
            f4838a = iArr;
            try {
                iArr[a.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4838a[a.READY.ordinal()] = 2;
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
        this.f4836a = a.FAILED;
        this.f4837b = a();
        if (this.f4836a == a.DONE) {
            return false;
        }
        this.f4836a = a.READY;
        return true;
    }

    public abstract T a();

    public final T b() {
        this.f4836a = a.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Preconditions.checkState(this.f4836a != a.FAILED);
        int i10 = AnonymousClass1.f4838a[this.f4836a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4836a = a.NOT_READY;
        T t10 = this.f4837b;
        this.f4837b = null;
        return t10;
    }
}
