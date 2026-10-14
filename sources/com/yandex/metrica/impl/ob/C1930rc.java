package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import com.yandex.metrica.identifiers.AdsIdentifiersProvider;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1930rc implements InterfaceC1557cc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C1906qc f17240b;

    public C1930rc(String str) {
        this(str, new C1906qc());
    }

    public C1930rc(String str, C1906qc c1906qc) {
        this.f17239a = str;
        this.f17240b = c1906qc;
    }

    private C1532bc b(Context context) throws Throwable {
        int i10 = AdsIdentifiersProvider.f13586a;
        Method method = AdsIdentifiersProvider.class.getMethod("requestIdentifiers", Context.class, Bundle.class);
        Bundle bundle = new Bundle();
        bundle.putString("com.yandex.metrica.identifiers.extra.PROVIDER", this.f17239a);
        C1906qc c1906qc = this.f17240b;
        Object[] objArr = {context, bundle};
        C1507ac c1507ac = null;
        Bundle bundle2 = (Bundle) method.invoke(null, objArr);
        Objects.requireNonNull(c1906qc);
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = bundle2.getBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO");
        if (bundle3 != null) {
            C1507ac.a aVar = C1881pc.f17070a.get(bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
            if (aVar == null) {
                StringBuilder sbA = defpackage.a.a("Provider ");
                sbA.append(bundle3.getString("com.yandex.metrica.identifiers.extra.PROVIDER"));
                sbA.append(" is invalid");
                throw new IllegalArgumentException(sbA.toString().toString());
            }
            c1507ac = new C1507ac(aVar, bundle3.getString("com.yandex.metrica.identifiers.extra.ID"), bundle3.containsKey("com.yandex.metrica.identifiers.extra.LIMITED") ? Boolean.valueOf(bundle3.getBoolean("com.yandex.metrica.identifiers.extra.LIMITED")) : null);
        }
        return new C1532bc(c1507ac, EnumC1596e1.a(bundle2.getString("com.yandex.metrica.identifiers.extra.STATUS")), bundle2.getString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE"));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1557cc
    public C1532bc a(Context context) {
        return a(context, new C1806mc());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC1557cc
    public C1532bc a(Context context, InterfaceC1831nc interfaceC1831nc) {
        C1532bc c1532bc;
        interfaceC1831nc.c();
        C1532bc c1532bc2 = null;
        while (interfaceC1831nc.b()) {
            try {
                return b(context);
            } catch (InvocationTargetException e10) {
                c1532bc = new C1532bc(null, EnumC1596e1.UNKNOWN, androidx.fragment.app.d0.a(defpackage.a.a("exception while fetching "), this.f17239a, " adv_id: ", e10.getTargetException() != null ? e10.getTargetException().getMessage() : null));
                c1532bc2 = c1532bc;
                try {
                    Thread.sleep(interfaceC1831nc.a());
                } catch (InterruptedException unused) {
                }
            } catch (Throwable th) {
                EnumC1596e1 enumC1596e1 = EnumC1596e1.UNKNOWN;
                StringBuilder sbA = defpackage.a.a("exception while fetching ");
                sbA.append(this.f17239a);
                sbA.append(" adv_id: ");
                sbA.append(th.getMessage());
                c1532bc = new C1532bc(null, enumC1596e1, sbA.toString());
                c1532bc2 = c1532bc;
                Thread.sleep(interfaceC1831nc.a());
            }
        }
        return c1532bc2 == null ? new C1532bc() : c1532bc2;
    }
}
