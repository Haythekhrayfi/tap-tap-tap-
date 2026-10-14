package y8;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class z2 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z2 f38957a = new z2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38958b = "decodeUri";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38961e;

    static {
        x8.e eVar = x8.e.STRING;
        f38959c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38960d = eVar;
        f38961e = true;
    }

    public z2() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) throws UnsupportedEncodingException {
        fd.j0.i(list, "args");
        String strDecode = URLDecoder.decode((String) list.get(0), ed.c.f29139b.name());
        fd.j0.h(strDecode, "decode(str, Charsets.UTF_8.name())");
        return strDecode;
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38959c;
    }

    @Override // x8.h
    public String c() {
        return f38958b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38960d;
    }

    @Override // x8.h
    public boolean f() {
        return f38961e;
    }
}
