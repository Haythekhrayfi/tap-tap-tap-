package com.yandex.mobile.ads.video.parser.vmap.configurator;

import com.yandex.mobile.ads.impl.pt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static AdBreakParameters a(ArrayList arrayList) {
        AdBreakParameters.b bVar = new AdBreakParameters.b();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                return new AdBreakParameters(bVar, 0);
            }
            pt ptVar = (pt) it.next();
            String strA = ptVar.a();
            String strB = ptVar.b();
            Objects.requireNonNull(strA);
            switch (strA) {
                case "PageID":
                    bVar.b(strB);
                    break;
                case "SessionID":
                    bVar.c(strB);
                    break;
                case "CategoryID":
                    bVar.a(strB);
                    break;
            }
        }
    }
}
