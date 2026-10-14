package com.yandex.metrica.impl.ob;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class Ll extends Zk<Kl> {
    public Ll(Kl kl) {
        this(kl, new Wk(102400, 200));
    }

    public Ll(Kl kl, Wk wk) {
        super(kl, wk);
    }

    @Override // com.yandex.metrica.impl.ob.Zk
    public List a(Kl kl) {
        return kl.f14374p;
    }

    @Override // com.yandex.metrica.impl.ob.Zk
    public int b(Kl kl) {
        return kl.f14369k;
    }
}
