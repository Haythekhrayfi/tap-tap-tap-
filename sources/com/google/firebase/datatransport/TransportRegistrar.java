package com.google.firebase.datatransport;

import a5.c;
import a5.d;
import a5.l;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o5.a;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ TransportFactory lambda$getComponents$0(d dVar) {
        TransportRuntime.initialize((Context) dVar.a(Context.class));
        return TransportRuntime.getInstance().newFactory(CCTDestination.LEGACY_INSTANCE);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        c.b bVarA = c.a(TransportFactory.class);
        bVarA.f86a = LIBRARY_NAME;
        bVarA.a(new l(Context.class, 1, 0));
        bVarA.c(a.f33961b);
        return Arrays.asList(bVarA.b(), c.b(new g6.a(LIBRARY_NAME, "18.1.7"), g6.d.class));
    }
}
