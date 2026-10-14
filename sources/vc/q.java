package vc;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q extends u implements cd.g {
    public q() {
    }

    public q(Object obj) {
        super(obj);
    }

    public q(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, i10);
    }

    @Override // cd.g
    public cd.g.a c() {
        return ((cd.g) getReflected()).c();
    }

    @Override // vc.c
    public cd.b computeReflected() {
        Objects.requireNonNull(b0.f36991a);
        return this;
    }

    @Override // uc.a
    public Object invoke() {
        return get();
    }
}
