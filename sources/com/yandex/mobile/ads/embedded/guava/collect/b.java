package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.a6;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> extends p0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18292a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private T f18293b;

    @CheckForNull
    public abstract T a();

    @CheckForNull
    public final void b() {
        this.f18292a = 3;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f18292a;
        if (!(i10 != 4)) {
            throw new IllegalStateException();
        }
        int iA = a6.a(i10);
        if (iA == 0) {
            return true;
        }
        if (iA == 2) {
            return false;
        }
        this.f18292a = 4;
        this.f18293b = a();
        if (this.f18292a == 3) {
            return false;
        }
        this.f18292a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f18292a = 2;
        T t10 = this.f18293b;
        this.f18293b = null;
        return t10;
    }
}
