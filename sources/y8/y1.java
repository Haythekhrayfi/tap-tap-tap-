package y8;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f38936a = new y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38937b = "min";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38940e;

    static {
        x8.e eVar = x8.e.INTEGER;
        f38938c = kc.k.a(new x8.i(eVar, true));
        f38939d = eVar;
        f38940e = true;
    }

    public y1() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        fd.j0.i(list, "args");
        if (list.isEmpty()) {
            String str = f38937b;
            String str2 = String.format("Non empty argument list is required for function '%s'.", Arrays.copyOf(new Object[]{str}, 1));
            fd.j0.h(str2, "format(this, *args)");
            x8.c.f(str, list, str2, null, 8);
            throw null;
        }
        Long lValueOf = Long.valueOf(RecyclerView.FOREVER_NS);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            lValueOf = Long.valueOf(Math.min(lValueOf.longValue(), ((Long) it.next()).longValue()));
        }
        return lValueOf;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38938c;
    }

    @Override // x8.h
    public String c() {
        return f38937b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38939d;
    }

    @Override // x8.h
    public boolean f() {
        return f38940e;
    }
}
