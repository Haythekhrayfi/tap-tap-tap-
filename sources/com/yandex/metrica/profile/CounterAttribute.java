package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.C2008uf;
import com.yandex.metrica.impl.ob.C2033vf;
import com.yandex.metrica.impl.ob.Hf;
import com.yandex.metrica.impl.ob.InterfaceC1884pf;
import com.yandex.metrica.impl.ob.uo;

/* JADX INFO: loaded from: classes.dex */
public final class CounterAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2033vf f18116a;

    public CounterAttribute(String str, uo<String> uoVar, InterfaceC1884pf interfaceC1884pf) {
        this.f18116a = new C2033vf(str, uoVar, interfaceC1884pf);
    }

    public UserProfileUpdate<? extends Hf> withDelta(double d10) {
        return new UserProfileUpdate<>(new C2008uf(this.f18116a.a(), d10));
    }
}
