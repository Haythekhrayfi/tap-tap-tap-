package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.Bf;
import com.yandex.metrica.impl.ob.C1933rf;
import com.yandex.metrica.impl.ob.C1958sf;
import com.yandex.metrica.impl.ob.C2033vf;
import com.yandex.metrica.impl.ob.Cf;
import com.yandex.metrica.impl.ob.Hf;
import com.yandex.metrica.impl.ob.InterfaceC1884pf;
import com.yandex.metrica.impl.ob.uo;

/* JADX INFO: loaded from: classes.dex */
public class BooleanAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2033vf f18115a;

    public BooleanAttribute(String str, uo<String> uoVar, InterfaceC1884pf interfaceC1884pf) {
        this.f18115a = new C2033vf(str, uoVar, interfaceC1884pf);
    }

    public UserProfileUpdate<? extends Hf> withValue(boolean z10) {
        return new UserProfileUpdate<>(new C1933rf(this.f18115a.a(), z10, this.f18115a.b(), new C1958sf(this.f18115a.c())));
    }

    public UserProfileUpdate<? extends Hf> withValueIfUndefined(boolean z10) {
        return new UserProfileUpdate<>(new C1933rf(this.f18115a.a(), z10, this.f18115a.b(), new Cf(this.f18115a.c())));
    }

    public UserProfileUpdate<? extends Hf> withValueReset() {
        return new UserProfileUpdate<>(new Bf(3, this.f18115a.a(), this.f18115a.b(), this.f18115a.c()));
    }
}
