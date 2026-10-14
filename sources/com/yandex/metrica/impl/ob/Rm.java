package com.yandex.metrica.impl.ob;

import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class Rm {
    public final String a() {
        String string = UUID.randomUUID().toString();
        fd.j0.h(string, "UUID.randomUUID().toString()");
        String strQ = ed.q.q(string, "-", "", false, 4);
        Locale locale = Locale.US;
        fd.j0.h(locale, "Locale.US");
        String lowerCase = strQ.toLowerCase(locale);
        fd.j0.h(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
