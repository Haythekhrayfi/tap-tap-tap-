package a3;

import a3.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<CHILD extends k<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z3.c<? super TranscodeType> f73c = (z3.c<? super TranscodeType>) z3.a.f45016b;

    public final CHILD b() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        try {
            return (k) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
