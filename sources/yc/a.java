package yc;

import cd.i;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<V> implements b<Object, V> {
    private V value;

    public a(V v10) {
        this.value = v10;
    }

    public void afterChange(i<?> iVar, V v10, V v11) {
        j0.i(iVar, "property");
    }

    public boolean beforeChange(i<?> iVar, V v10, V v11) {
        j0.i(iVar, "property");
        return true;
    }

    @Override // yc.b
    public V getValue(Object obj, i<?> iVar) {
        j0.i(iVar, "property");
        return this.value;
    }

    @Override // yc.b
    public void setValue(Object obj, i<?> iVar, V v10) {
        j0.i(iVar, "property");
        V v11 = this.value;
        if (beforeChange(iVar, v11, v10)) {
            this.value = v10;
            afterChange(iVar, v11, v10);
        }
    }
}
