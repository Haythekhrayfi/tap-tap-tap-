package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3 f38730a = new m3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38731b = "trimLeft";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38734e;

    static {
        x8.e eVar = x8.e.STRING;
        f38732c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38733d = eVar;
        f38734e = true;
    }

    public m3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        CharSequence charSequenceSubSequence;
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        fd.j0.i(str, "<this>");
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (!ed.a.b(str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                return charSequenceSubSequence.toString();
            }
        }
        charSequenceSubSequence = "";
        return charSequenceSubSequence.toString();
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38732c;
    }

    @Override // x8.h
    public String c() {
        return f38731b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38733d;
    }

    @Override // x8.h
    public boolean f() {
        return f38734e;
    }
}
