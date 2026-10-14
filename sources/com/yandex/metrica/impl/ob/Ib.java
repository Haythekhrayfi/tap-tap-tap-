package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Ib extends ECommerceEvent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb f14209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hb f14210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1780lb<Ib> f14211d;

    public Ib(Eb eb2, Hb hb2, InterfaceC1780lb<Ib> interfaceC1780lb) {
        this.f14209b = eb2;
        this.f14210c = hb2;
        this.f14211d = interfaceC1780lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "shown product card info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C1979tb<Rf, Fn>> toProto() {
        return this.f14211d.b(this);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ShownProductCardInfoEvent{product=");
        sbA.append(this.f14209b);
        sbA.append(", screen=");
        sbA.append(this.f14210c);
        sbA.append(", converter=");
        sbA.append(this.f14211d);
        sbA.append('}');
        return sbA.toString();
    }
}
