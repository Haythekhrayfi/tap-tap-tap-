package b4;

/* JADX INFO: loaded from: classes.dex */
public final class b<K, V> extends q.a<K, V> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f3289k;

    @Override // q.h, java.util.Map
    public void clear() {
        this.f3289k = 0;
        super.clear();
    }

    @Override // q.h, java.util.Map
    public int hashCode() {
        if (this.f3289k == 0) {
            this.f3289k = super.hashCode();
        }
        return this.f3289k;
    }

    @Override // q.h
    public void i(q.h<? extends K, ? extends V> hVar) {
        this.f3289k = 0;
        super.i(hVar);
    }

    @Override // q.h
    public V j(int i10) {
        this.f3289k = 0;
        return (V) super.j(i10);
    }

    @Override // q.h
    public V k(int i10, V v10) {
        this.f3289k = 0;
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f34736d;
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    @Override // q.h, java.util.Map
    public V put(K k10, V v10) {
        this.f3289k = 0;
        return (V) super.put(k10, v10);
    }
}
