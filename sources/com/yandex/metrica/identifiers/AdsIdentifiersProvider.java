package com.yandex.metrica.identifiers;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import com.yandex.metrica.identifiers.impl.f;
import com.yandex.metrica.identifiers.impl.g;
import com.yandex.metrica.identifiers.impl.h;
import com.yandex.metrica.identifiers.impl.i;
import fd.j0;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AdsIdentifiersProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f13586a = 0;
    private static final h retriever = new h(null, 1);

    public static Bundle requestIdentifiers(Context context, Bundle bundle) {
        g gVarA;
        String string = bundle.getString("com.yandex.metrica.identifiers.extra.PROVIDER");
        h hVar = retriever;
        Objects.requireNonNull(hVar);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        i iVar = (i) hVar.f13601a.get(string);
        if (iVar == null || (gVarA = iVar.a(context)) == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        f fVar = gVarA.f13599b;
        if (fVar != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("com.yandex.metrica.identifiers.extra.PROVIDER", fVar.f13595a);
            bundle3.putString("com.yandex.metrica.identifiers.extra.ID", fVar.f13596b);
            Boolean bool = fVar.f13597c;
            if (bool != null) {
                bundle3.putBoolean("com.yandex.metrica.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("com.yandex.metrica.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("com.yandex.metrica.identifiers.extra.STATUS", gVarA.f13598a.a());
        bundle2.putString("com.yandex.metrica.identifiers.extra.ERROR_MESSAGE", gVarA.f13600c);
        return bundle2;
    }
}
