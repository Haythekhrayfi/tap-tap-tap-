package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.Bf;
import com.yandex.metrica.impl.ob.C1958sf;
import com.yandex.metrica.impl.ob.C2033vf;
import com.yandex.metrica.impl.ob.C2063wf;
import com.yandex.metrica.impl.ob.C2088xf;
import com.yandex.metrica.impl.ob.C2138zf;
import com.yandex.metrica.impl.ob.Cf;
import com.yandex.metrica.impl.ob.Gn;
import com.yandex.metrica.impl.ob.Hf;
import com.yandex.metrica.impl.ob.InterfaceC1884pf;
import com.yandex.metrica.impl.ob.uo;

/* JADX INFO: loaded from: classes.dex */
public final class NumberAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2033vf f18118a;

    public NumberAttribute(String str, uo<String> uoVar, InterfaceC1884pf interfaceC1884pf) {
        this.f18118a = new C2033vf(str, uoVar, interfaceC1884pf);
    }

    public UserProfileUpdate<? extends Hf> withValue(double d10) {
        return new UserProfileUpdate<>(new C2138zf(this.f18118a.a(), d10, new C2063wf(), new C1958sf(new C2088xf(new Gn(100)))));
    }

    public UserProfileUpdate<? extends Hf> withValueIfUndefined(double d10) {
        return new UserProfileUpdate<>(new C2138zf(this.f18118a.a(), d10, new C2063wf(), new Cf(new C2088xf(new Gn(100)))));
    }

    public UserProfileUpdate<? extends Hf> withValueReset() {
        return new UserProfileUpdate<>(new Bf(1, this.f18118a.a(), new C2063wf(), new C2088xf(new Gn(100))));
    }
}
