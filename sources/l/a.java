package l;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f32075g = new HashMap<>();

    @Override // l.b
    public b.c<K, V> a(K k10) {
        return this.f32075g.get(k10);
    }

    public boolean contains(K k10) {
        return this.f32075g.containsKey(k10);
    }

    @Override // l.b
    public V f(K k10, V v10) {
        b.c<K, V> cVar = this.f32075g.get(k10);
        if (cVar != null) {
            return cVar.f32081d;
        }
        this.f32075g.put(k10, e(k10, v10));
        return null;
    }

    @Override // l.b
    public V g(K k10) {
        V v10 = (V) super.g(k10);
        this.f32075g.remove(k10);
        return v10;
    }
}
