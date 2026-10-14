package com.yandex.metrica.impl.ob;

import com.yandex.metrica.ecommerce.ECommerceEvent;
import java.util.List;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2134zb extends ECommerceEvent {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ab f18013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC1780lb<C2134zb> f18014d;

    public C2134zb(int i10, Ab ab2, InterfaceC1780lb<C2134zb> interfaceC1780lb) {
        this.f18012b = i10;
        this.f18013c = ab2;
        this.f18014d = interfaceC1780lb;
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent
    public String getPublicDescription() {
        int i10 = this.f18012b;
        if (i10 != 4) {
            return i10 != 5 ? "unknown cart action info" : "remove cart item info";
        }
        return "add cart item info";
    }

    @Override // com.yandex.metrica.ecommerce.ECommerceEvent, com.yandex.metrica.impl.ob.Fb
    public List<C1979tb<Rf, Fn>> toProto() {
        return this.f18014d.b(this);
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("CartActionInfoEvent{eventType=");
        sbA.append(this.f18012b);
        sbA.append(", cartItem=");
        sbA.append(this.f18013c);
        sbA.append(", converter=");
        sbA.append(this.f18014d);
        sbA.append('}');
        return sbA.toString();
    }
}
