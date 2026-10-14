package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Jb extends ECommerceEvent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Eb f14313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Gb f14314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1780lb<Jb> f14315d;

    public Jb(Eb eb2, Gb gb2, InterfaceC1780lb<Jb> interfaceC1780lb) {
        this.f14313b = eb2;
        this.f14314c = gb2;
        this.f14315d = interfaceC1780lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "shown product details info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C1979tb<Rf, Fn>> toProto() {
        return this.f14315d.b(this);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("ShownProductDetailInfoEvent{product=");
        sbA.append(this.f14313b);
        sbA.append(", referrer=");
        sbA.append(this.f14314c);
        sbA.append(", converter=");
        sbA.append(this.f14315d);
        sbA.append('}');
        return sbA.toString();
    }
}
