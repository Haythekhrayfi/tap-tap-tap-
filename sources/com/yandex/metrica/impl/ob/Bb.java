package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Bb extends ECommerceEvent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cb f13715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1780lb<Bb> f13716d;

    public Bb(int i10, Cb cb2, InterfaceC1780lb<Bb> interfaceC1780lb) {
        this.f13714b = i10;
        this.f13715c = cb2;
        this.f13716d = interfaceC1780lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        return "order info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C1979tb<Rf, Fn>> toProto() {
        return this.f13716d.b(this);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("OrderInfoEvent{eventType=");
        sbA.append(this.f13714b);
        sbA.append(", order=");
        sbA.append(this.f13715c);
        sbA.append(", converter=");
        sbA.append(this.f13716d);
        sbA.append('}');
        return sbA.toString();
    }
}
