package com.yandex.metrica.impl.ob;

import org.joda.time.DateTimeConstants;

/* JADX INFO: renamed from: com.yandex.metrica.impl.ob.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1800m6 extends AbstractC1775l6 {
    public C1800m6(C1624f4 c1624f4, C1999u6 c1999u6) {
        this(c1624f4, c1999u6, new C2104y6(c1624f4.f(), "background"), Oh.a(), new Nm());
    }

    public C1800m6(C1624f4 c1624f4, C1999u6 c1999u6, C2104y6 c2104y6, W0 w10, Nm nm) {
        super(c1624f4, c1999u6, c2104y6, C1974t6.a(EnumC2129z6.BACKGROUND).a(DateTimeConstants.SECONDS_PER_HOUR).a(), w10, nm);
    }
}
