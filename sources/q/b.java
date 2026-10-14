package q;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends g<Object, Object> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f34697d;

    public b(c cVar) {
        this.f34697d = cVar;
    }

    @Override // q.g
    public void a() {
        this.f34697d.clear();
    }

    @Override // q.g
    public Object b(int i10, int i11) {
        return this.f34697d.f34705d[i10];
    }

    @Override // q.g
    public Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    @Override // q.g
    public int d() {
        return this.f34697d.f34706e;
    }

    @Override // q.g
    public int e(Object obj) {
        return this.f34697d.indexOf(obj);
    }

    @Override // q.g
    public int f(Object obj) {
        return this.f34697d.indexOf(obj);
    }

    @Override // q.g
    public void g(Object obj, Object obj2) {
        this.f34697d.add(obj);
    }

    @Override // q.g
    public void h(int i10) {
        this.f34697d.f(i10);
    }

    @Override // q.g
    public Object i(int i10, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
