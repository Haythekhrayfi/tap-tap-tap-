package id;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kd.z f31630a = new kd.z("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kd.z f31631b = new kd.z("PENDING");

    public static final <T> n<T> a(T t10) {
        if (t10 == null) {
            t10 = (T) jd.n.f31867a;
        }
        return new v(t10);
    }

    public static final <T> d<T> b(u<? extends T> uVar, mc.f fVar, int i10, hd.e eVar) {
        return (((i10 >= 0 && i10 < 2) || i10 == -2) && eVar == hd.e.DROP_OLDEST) ? uVar : s.a(uVar, fVar, i10, eVar);
    }
}
