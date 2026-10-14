package vc;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s extends u implements cd.h {
    public s() {
    }

    public s(Object obj) {
        super(obj);
    }

    public s(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // cd.h
    public cd.h.a c() {
        return ((cd.h) getReflected()).c();
    }

    @Override // vc.c
    public cd.b computeReflected() {
        Objects.requireNonNull(b0.f36991a);
        return this;
    }

    @Override // uc.l
    public Object invoke(Object obj) {
        return ((t) this).c().call(obj);
    }
}
