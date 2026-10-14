package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
abstract class f<T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20415a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @CheckForNull
    private String f20416b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        int iA;
        int i10 = this.f20415a;
        if (!(i10 != 4)) {
            throw new IllegalStateException();
        }
        int iA2 = a6.a(i10);
        if (iA2 == 0) {
            return true;
        }
        if (iA2 == 2) {
            return false;
        }
        this.f20415a = 4;
        z31.a aVar = (z31.a) this;
        loop0: while (true) {
            int i11 = aVar.f27213f;
            while (true) {
                int i12 = aVar.f27213f;
                if (i12 == -1) {
                    aVar.f20415a = 3;
                    string = null;
                    break loop0;
                }
                x31 x31Var = (x31) aVar;
                iA = x31Var.f26416h.f26692a.a(x31Var.f27210c, i12);
                if (iA == -1) {
                    iA = aVar.f27210c.length();
                    aVar.f27213f = -1;
                } else {
                    aVar.f27213f = iA + 1;
                }
                int i13 = aVar.f27213f;
                if (i13 == i11) {
                    int i14 = i13 + 1;
                    aVar.f27213f = i14;
                    if (i14 > aVar.f27210c.length()) {
                        aVar.f27213f = -1;
                    }
                }
            }
            while (i11 < iA && aVar.f27211d.a(aVar.f27210c.charAt(i11))) {
                i11++;
            }
            while (iA > i11 && aVar.f27211d.a(aVar.f27210c.charAt(iA - 1))) {
                iA--;
            }
            if (!aVar.f27212e || i11 != iA) {
                int i15 = aVar.f27214g;
                if (i15 == 1) {
                    iA = aVar.f27210c.length();
                    aVar.f27213f = -1;
                    while (iA > i11 && aVar.f27211d.a(aVar.f27210c.charAt(iA - 1))) {
                        iA--;
                    }
                } else {
                    aVar.f27214g = i15 - 1;
                }
                string = aVar.f27210c.subSequence(i11, iA).toString();
                break;
            }
        }
        this.f20416b = string;
        if (this.f20415a == 3) {
            return false;
        }
        this.f20415a = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f20415a = 2;
        T t10 = (T) this.f20416b;
        this.f20416b = null;
        return t10;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
