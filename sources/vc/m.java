package vc;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends o implements cd.f {
    public m() {
    }

    public m(Object obj) {
        super(obj);
    }

    public m(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // cd.h
    public cd.h.a c() {
        return ((cd.f) getReflected()).c();
    }

    @Override // vc.c
    public cd.b computeReflected() {
        Objects.requireNonNull(b0.f36991a);
        return this;
    }

    @Override // uc.l
    public Object invoke(Object obj) {
        return ((n) this).c().call(obj);
    }
}
