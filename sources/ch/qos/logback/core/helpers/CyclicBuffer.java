package ch.qos.logback.core.helpers;

import android.support.v4.media.j;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CyclicBuffer<E> {

    /* JADX INFO: renamed from: ea, reason: collision with root package name */
    public E[] f3692ea;
    public int first;
    public int last;
    public int maxSize;
    public int numElems;

    public CyclicBuffer(int i10) throws IllegalArgumentException {
        if (i10 < 1) {
            throw new IllegalArgumentException(j.a("The maxSize argument (", i10, ") is not a positive integer."));
        }
        init(i10);
    }

    public CyclicBuffer(CyclicBuffer<E> cyclicBuffer) {
        int i10 = cyclicBuffer.maxSize;
        this.maxSize = i10;
        E[] eArr = (E[]) new Object[i10];
        this.f3692ea = eArr;
        System.arraycopy(cyclicBuffer.f3692ea, 0, eArr, 0, i10);
        this.last = cyclicBuffer.last;
        this.first = cyclicBuffer.first;
        this.numElems = cyclicBuffer.numElems;
    }

    private void init(int i10) {
        this.maxSize = i10;
        this.f3692ea = (E[]) new Object[i10];
        this.first = 0;
        this.last = 0;
        this.numElems = 0;
    }

    public void add(E e10) {
        E[] eArr = this.f3692ea;
        int i10 = this.last;
        eArr[i10] = e10;
        int i11 = i10 + 1;
        this.last = i11;
        int i12 = this.maxSize;
        if (i11 == i12) {
            this.last = 0;
        }
        int i13 = this.numElems;
        if (i13 < i12) {
            this.numElems = i13 + 1;
            return;
        }
        int i14 = this.first + 1;
        this.first = i14;
        if (i14 == i12) {
            this.first = 0;
        }
    }

    public List<E> asList() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < length(); i10++) {
            arrayList.add(get(i10));
        }
        return arrayList;
    }

    public void clear() {
        init(this.maxSize);
    }

    public E get() {
        int i10 = this.numElems;
        if (i10 <= 0) {
            return null;
        }
        this.numElems = i10 - 1;
        E[] eArr = this.f3692ea;
        int i11 = this.first;
        E e10 = eArr[i11];
        eArr[i11] = null;
        int i12 = i11 + 1;
        this.first = i12;
        if (i12 == this.maxSize) {
            this.first = 0;
        }
        return e10;
    }

    public E get(int i10) {
        if (i10 < 0 || i10 >= this.numElems) {
            return null;
        }
        return this.f3692ea[(this.first + i10) % this.maxSize];
    }

    public int getMaxSize() {
        return this.maxSize;
    }

    public int length() {
        return this.numElems;
    }

    public void resize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(j.a("Negative array size [", i10, "] not allowed."));
        }
        int i11 = this.numElems;
        if (i10 == i11) {
            return;
        }
        E[] eArr = (E[]) new Object[i10];
        if (i10 < i11) {
            i11 = i10;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            E[] eArr2 = this.f3692ea;
            int i13 = this.first;
            eArr[i12] = eArr2[i13];
            eArr2[i13] = null;
            int i14 = i13 + 1;
            this.first = i14;
            if (i14 == this.numElems) {
                this.first = 0;
            }
        }
        this.f3692ea = eArr;
        this.first = 0;
        this.numElems = i11;
        this.maxSize = i10;
        if (i11 == i10) {
            this.last = 0;
        } else {
            this.last = i11;
        }
    }
}
