package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.res.Configuration;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1870p1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile C1870p1 f17029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f17030d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<String> f17031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<a> f17032b = new ArrayList();

    /* JADX INFO: renamed from: com.yandex.metrica.impl.ob.p1$a */
    public interface a {
        void a();
    }

    public C1870p1(Context context) {
        synchronized (this) {
            this.f17031a = a(context.getResources().getConfiguration());
        }
    }

    public static C1870p1 a(Context context) {
        if (f17029c == null) {
            synchronized (f17030d) {
                if (f17029c == null) {
                    f17029c = new C1870p1(context.getApplicationContext());
                }
            }
        }
        return f17029c;
    }

    private List<String> a(Configuration configuration) {
        if (!U2.a(24)) {
            return Collections.singletonList(C1522b2.a(configuration.locale));
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        if (locales != null) {
            int size = locales.size();
            for (int i10 = 0; i10 < size; i10++) {
                Locale locale = locales.get(i10);
                if (locale != null) {
                    String strA = C1522b2.a(locale);
                    fd.j0.h(strA, "PhoneUtils.normalizedLocale(it)");
                    arrayList.add(strA);
                }
            }
        }
        return arrayList;
    }

    public List<String> a() {
        return this.f17031a;
    }

    public synchronized void a(a aVar) {
        this.f17032b.add(aVar);
    }

    public void b(Configuration configuration) {
        ArrayList arrayList;
        synchronized (this) {
            this.f17031a = a(configuration);
            arrayList = new ArrayList(this.f17032b);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }
}
