package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.Bf;
import com.yandex.metrica.impl.ob.C1958sf;
import com.yandex.metrica.impl.ob.C2033vf;
import com.yandex.metrica.impl.ob.Cf;
import com.yandex.metrica.impl.ob.Ef;
import com.yandex.metrica.impl.ob.Hf;
import com.yandex.metrica.impl.ob.InterfaceC1884pf;
import com.yandex.metrica.impl.ob.Pn;
import com.yandex.metrica.impl.ob.uo;

/* JADX INFO: loaded from: classes.dex */
public class StringAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Pn<String> f18119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2033vf f18120b;

    public StringAttribute(String str, Pn<String> pn, uo<String> uoVar, InterfaceC1884pf interfaceC1884pf) {
        this.f18120b = new C2033vf(str, uoVar, interfaceC1884pf);
        this.f18119a = pn;
    }

    public UserProfileUpdate<? extends Hf> withValue(String str) {
        return new UserProfileUpdate<>(new Ef(this.f18120b.a(), str, this.f18119a, this.f18120b.b(), new C1958sf(this.f18120b.c())));
    }

    public UserProfileUpdate<? extends Hf> withValueIfUndefined(String str) {
        return new UserProfileUpdate<>(new Ef(this.f18120b.a(), str, this.f18119a, this.f18120b.b(), new Cf(this.f18120b.c())));
    }

    public UserProfileUpdate<? extends Hf> withValueReset() {
        return new UserProfileUpdate<>(new Bf(0, this.f18120b.a(), this.f18120b.b(), this.f18120b.c()));
    }
}
