package com.yandex.metrica.impl.ob;

import android.app.Activity;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1641fl {

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fl$a */
    public class a implements com.yandex.metrica.uiaccessor.a.InterfaceC0188a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Um f16145a;

        public a(C1641fl c1641fl, Um um) {
            this.f16145a = um;
        }

        @Override // com.yandex.metrica.uiaccessor.a.InterfaceC0188a
        public void fragmentAttached(Activity activity) {
            this.f16145a.b(activity);
        }
    }

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.fl$b */
    public class b implements com.yandex.metrica.uiaccessor.b {
        public b(C1641fl c1641fl) {
        }

        @Override // com.yandex.metrica.uiaccessor.b
        public void subscribe(Activity activity) throws Throwable {
        }

        @Override // com.yandex.metrica.uiaccessor.b
        public void unsubscribe(Activity activity) throws Throwable {
        }
    }

    public com.yandex.metrica.uiaccessor.b a(Um<Activity> um) {
        com.yandex.metrica.uiaccessor.a aVar;
        try {
            aVar = new com.yandex.metrica.uiaccessor.a(new a(this, um));
        } catch (Throwable unused) {
            aVar = null;
        }
        return aVar == null ? new b(this) : aVar;
    }
}
