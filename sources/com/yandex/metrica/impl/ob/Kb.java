package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Kb extends ECommerceEvent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Hb f14348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1780lb<Kb> f14349c;

    public Kb(Hb hb2, InterfaceC1780lb<Kb> interfaceC1780lb) {
        this.f14348b = hb2;
        this.f14349c = interfaceC1780lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "shown screen info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C1979tb<Rf, Fn>> toProto() {
        return this.f14349c.b(this);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ShownScreenInfoEvent{screen=");
        sbA.append(this.f14348b);
        sbA.append(", converter=");
        sbA.append(this.f14349c);
        sbA.append('}');
        return sbA.toString();
    }
}
