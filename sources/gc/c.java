package gc;

import lb.i;
import lb.k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c<T> extends i<T> implements k<T> {
    public final c<T> z() {
        return this instanceof b ? this : new b(this);
    }
}
