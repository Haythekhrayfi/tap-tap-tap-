package kc;

import java.util.AbstractList;
import java.util.List;

/* JADX WARN: Unexpected interfaces in signature: [wc.b] */
/* JADX INFO: loaded from: classes3.dex */
public abstract class d<E> extends AbstractList<E> implements List<E> {
    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i10) {
        f fVar = (f) this;
        c.f31992c.a(i10, fVar.size());
        if (i10 == l.b(fVar)) {
            return (E) fVar.j();
        }
        if (i10 == 0) {
            return (E) fVar.i();
        }
        int iH = fVar.h(fVar.f32003c + i10);
        E e10 = (E) fVar.f32004d[iH];
        if (i10 < (fVar.size() >> 1)) {
            int i11 = fVar.f32003c;
            if (iH >= i11) {
                Object[] objArr = fVar.f32004d;
                i.d(objArr, objArr, i11 + 1, i11, iH);
            } else {
                Object[] objArr2 = fVar.f32004d;
                i.d(objArr2, objArr2, 1, 0, iH);
                Object[] objArr3 = fVar.f32004d;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = fVar.f32003c;
                i.d(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = fVar.f32004d;
            int i13 = fVar.f32003c;
            objArr4[i13] = null;
            fVar.f32003c = fVar.e(i13);
        } else {
            int iH2 = fVar.h(l.b(fVar) + fVar.f32003c);
            Object[] objArr5 = fVar.f32004d;
            if (iH <= iH2) {
                i.d(objArr5, objArr5, iH, iH + 1, iH2 + 1);
            } else {
                i.d(objArr5, objArr5, iH, iH + 1, objArr5.length);
                Object[] objArr6 = fVar.f32004d;
                objArr6[objArr6.length - 1] = objArr6[0];
                i.d(objArr6, objArr6, 0, 1, iH2 + 1);
            }
            fVar.f32004d[iH2] = null;
        }
        fVar.f32005e = fVar.size() - 1;
        return e10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((f) this).f32005e;
    }
}
