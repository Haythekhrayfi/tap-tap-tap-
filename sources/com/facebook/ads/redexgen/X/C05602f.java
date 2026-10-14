package com.facebook.ads.redexgen.X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C05602f<T> implements Iterator<T> {
    public int A00;
    public int A01;
    public boolean A02 = false;
    public final int A03;
    public final /* synthetic */ AbstractC05652k A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    public C05602f(AbstractC05652k abstractC05652k, int i10) {
        this.A04 = abstractC05652k;
        this.A03 = i10;
        this.A01 = abstractC05652k.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.A00 < this.A01;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            T t10 = (T) this.A04.A0B(this.A00, this.A03);
            this.A00++;
            this.A02 = true;
            return t10;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2f != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$ArrayIterator<T> */
    @Override // java.util.Iterator
    public final void remove() {
        if (this.A02) {
            int i10 = this.A00 - 1;
            this.A00 = i10;
            this.A01--;
            this.A02 = false;
            this.A04.A0E(i10);
            return;
        }
        throw new IllegalStateException();
    }
}
