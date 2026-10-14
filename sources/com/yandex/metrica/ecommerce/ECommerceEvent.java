package com.yandex.metrica.ecommerce;

import com.yandex.metrica.impl.ob.C1979tb;
import com.yandex.metrica.impl.ob.Fb;
import com.yandex.metrica.impl.ob.Fn;
import com.yandex.metrica.impl.ob.Rf;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ECommerceEvent implements Fb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ECommerceEventProvider f13539a = new ECommerceEventProvider();

    public static ECommerceEvent addCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f13539a.addCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent beginCheckoutEvent(ECommerceOrder eCommerceOrder) {
        return f13539a.beginCheckoutEvent(eCommerceOrder);
    }

    public static ECommerceEvent purchaseEvent(ECommerceOrder eCommerceOrder) {
        return f13539a.purchaseEvent(eCommerceOrder);
    }

    public static ECommerceEvent removeCartItemEvent(ECommerceCartItem eCommerceCartItem) {
        return f13539a.removeCartItemEvent(eCommerceCartItem);
    }

    public static ECommerceEvent showProductCardEvent(ECommerceProduct eCommerceProduct, ECommerceScreen eCommerceScreen) {
        return f13539a.showProductCardEvent(eCommerceProduct, eCommerceScreen);
    }

    public static ECommerceEvent showProductDetailsEvent(ECommerceProduct eCommerceProduct, ECommerceReferrer eCommerceReferrer) {
        return f13539a.showProductDetailsEvent(eCommerceProduct, eCommerceReferrer);
    }

    public static ECommerceEvent showScreenEvent(ECommerceScreen eCommerceScreen) {
        return f13539a.showScreenEvent(eCommerceScreen);
    }

    public String getPublicDescription() {
        return "E-commerce base event";
    }

    @Override // com.yandex.metrica.impl.ob.Fb
    public abstract /* synthetic */ List<C1979tb<Rf, Fn>> toProto();
}
