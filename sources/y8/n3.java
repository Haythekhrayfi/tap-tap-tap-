package y8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n3 extends x8.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n3 f38753a = new n3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38754b = "trimRight";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<x8.i> f38755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final x8.e f38756d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f38757e;

    static {
        x8.e eVar = x8.e.STRING;
        f38755c = kc.k.a(new x8.i(eVar, false, 2, null));
        f38756d = eVar;
        f38757e = true;
    }

    public n3() {
        super(null, 1, null);
    }

    @Override // x8.h
    public Object a(List<? extends Object> list) {
        CharSequence charSequenceSubSequence;
        fd.j0.i(list, "args");
        String str = (String) list.get(0);
        fd.j0.i(str, "<this>");
        int length = str.length() - 1;
        if (length < 0) {
            charSequenceSubSequence = "";
            break;
        }
        while (true) {
            int i10 = length - 1;
            if (!ed.a.b(str.charAt(length))) {
                charSequenceSubSequence = str.subSequence(0, length + 1);
                break;
            }
            if (i10 < 0) {
                charSequenceSubSequence = "";
                break;
            }
            length = i10;
        }
        return charSequenceSubSequence.toString();
    }

    @Override // x8.h
    public List<x8.i> b() {
        return f38755c;
    }

    @Override // x8.h
    public String c() {
        return f38754b;
    }

    @Override // x8.h
    public x8.e d() {
        return f38756d;
    }

    @Override // x8.h
    public boolean f() {
        return f38757e;
    }
}
