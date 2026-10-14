package vc;

/* JADX INFO: loaded from: classes3.dex */
public class r extends q {
    public r(cd.d dVar, String str, String str2) {
        super(c.NO_RECEIVER, ((d) dVar).a(), str, str2, !(dVar instanceof cd.c) ? 1 : 0);
    }

    public r(Class cls, String str, String str2, int i10) {
        super(c.NO_RECEIVER, cls, str, str2, i10);
    }

    public r(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    public Object get() {
        return ((cd.g) getReflected()).c().call(new Object[0]);
    }
}
