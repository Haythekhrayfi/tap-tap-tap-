package a5;

import com.applovin.exoplayer2.b.z;

/* JADX INFO: loaded from: classes2.dex */
public class t<T> implements x5.b<T>, x5.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x5.a.InterfaceC0461a<Object> f127c = z.f4666v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x5.b<Object> f128d = i.f99c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x5.a.InterfaceC0461a<T> f129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile x5.b<T> f130b;

    public t(x5.a.InterfaceC0461a<T> interfaceC0461a, x5.b<T> bVar) {
        this.f129a = interfaceC0461a;
        this.f130b = bVar;
    }

    public void a(x5.a.InterfaceC0461a<T> interfaceC0461a) {
        x5.b<T> bVar;
        x5.b<T> bVar2 = this.f130b;
        x5.b<Object> bVar3 = f128d;
        if (bVar2 != bVar3) {
            interfaceC0461a.b(bVar2);
            return;
        }
        x5.b<T> bVar4 = null;
        synchronized (this) {
            bVar = this.f130b;
            if (bVar != bVar3) {
                bVar4 = bVar;
            } else {
                this.f129a = new com.applovin.exoplayer2.a.e(this.f129a, interfaceC0461a);
            }
        }
        if (bVar4 != null) {
            interfaceC0461a.b(bVar);
        }
    }

    @Override // x5.b
    public T get() {
        return this.f130b.get();
    }
}
