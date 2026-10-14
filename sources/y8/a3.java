package y8;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a3 f38458a = new a3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38459b = "encodeUri";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38462e;

    static {
        x8.e eVar = x8.e.STRING;
        f38460c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38461d = eVar;
        f38462e = true;
    }

    public a3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws UnsupportedEncodingException {
        fd.j0.i(list, "args");
        String strEncode = URLEncoder.encode((String) list.get(0), ed.c.f29139b.name());
        fd.j0.h(strEncode, "encode(str, Charsets.UTF_8.name())");
        return ed.q.q(ed.q.q(ed.q.q(ed.q.q(ed.q.q(ed.q.q(strEncode, "+", "%20", false, 4), "%21", "!", false, 4), "%7E", "~", false, 4), "%27", "'", false, 4), "%28", "(", false, 4), "%29", ")", false, 4);
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38460c;
    }

    @Override // x8.h
    public String c() {
        return f38459b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38461d;
    }

    @Override // x8.h
    public boolean f() {
        return f38462e;
    }
}
