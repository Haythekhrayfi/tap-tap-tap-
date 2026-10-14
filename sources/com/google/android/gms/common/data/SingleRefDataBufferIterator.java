package com.google.android.gms.common.data;

import androidx.fragment.app.d0;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class SingleRefDataBufferIterator<T> extends DataBufferIterator<T> {
    private T zac;

    public SingleRefDataBufferIterator(DataBuffer<T> dataBuffer) {
        super(dataBuffer);
    }

    @Override // com.google.android.gms.common.data.DataBufferIterator, java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException(a.a(46, "Cannot advance the iterator beyond ", this.zab));
        }
        int i10 = this.zab + 1;
        this.zab = i10;
        if (i10 == 0) {
            T t10 = (T) Preconditions.checkNotNull(this.zaa.get(0));
            this.zac = t10;
            if (!(t10 instanceof DataBufferRef)) {
                String strValueOf = String.valueOf(t10.getClass());
                throw new IllegalStateException(d0.a(new StringBuilder(strValueOf.length() + 44), "DataBuffer reference of type ", strValueOf, " is not movable"));
            }
        } else {
            ((DataBufferRef) Preconditions.checkNotNull(this.zac)).zaa(this.zab);
        }
        return this.zac;
    }
}
