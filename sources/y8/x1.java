package y8;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class x1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x1 f38920a = new x1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38921b = "maxInteger";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38922c = kc.w.f32009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38923d = x8.e.INTEGER;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38924e = true;

    public x1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List list) {
        fd.j0.i(list, "args");
        return Long.valueOf(RecyclerView.FOREVER_NS);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38922c;
    }

    @Override // x8.h
    public String c() {
        return f38921b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38923d;
    }

    @Override // x8.h
    public boolean f() {
        return f38924e;
    }
}
