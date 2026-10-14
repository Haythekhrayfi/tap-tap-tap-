package y8;

import com.applovin.sdk.AppLovinMediationProvider;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class i0 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f38625a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38626b = AppLovinMediationProvider.MAX;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38629e;

    static {
        x8.e eVar = x8.e.NUMBER;
        f38627c = kc.k.a(new x8.i(eVar, true));
        f38628d = eVar;
        f38629e = true;
    }

    public i0() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        if (list.isEmpty()) {
            String str = f38626b;
            String str2 = String.format("Non empty argument list is required for function '%s'.", Arrays.copyOf(new Object[]{str}, 1));
            fd.j0.h(str2, "format(this, *args)");
            x8.c.f(str, list, str2, null, 8);
            throw null;
        }
        Object objR = kc.t.r(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            objR = Double.valueOf(Math.max(((Double) objR).doubleValue(), ((Double) it.next()).doubleValue()));
        }
        return objR;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38627c;
    }

    @Override // x8.h
    public String c() {
        return f38626b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38628d;
    }

    @Override // x8.h
    public boolean f() {
        return f38629e;
    }
}
