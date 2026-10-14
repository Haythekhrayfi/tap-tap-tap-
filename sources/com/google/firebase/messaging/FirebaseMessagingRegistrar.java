package com.google.firebase.messaging;

import a5.l;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(a5.d dVar) {
        return new FirebaseMessaging((u4.d) dVar.a(u4.d.class), (w5.a) dVar.a(w5.a.class), dVar.b(g6.g.class), dVar.b(v5.h.class), (y5.b) dVar.a(y5.b.class), (TransportFactory) dVar.a(TransportFactory.class), (u5.d) dVar.a(u5.d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<a5.c<?>> getComponents() {
        a5.c.b bVarA = a5.c.a(FirebaseMessaging.class);
        bVarA.f86a = LIBRARY_NAME;
        bVarA.a(new l(u4.d.class, 1, 0));
        bVarA.a(new l(w5.a.class, 0, 0));
        bVarA.a(new l(g6.g.class, 0, 1));
        bVarA.a(new l(v5.h.class, 0, 1));
        bVarA.a(new l(TransportFactory.class, 0, 0));
        bVarA.a(new l(y5.b.class, 1, 0));
        bVarA.a(new l(u5.d.class, 1, 0));
        bVarA.f91f = o5.a.f33963d;
        bVarA.d(1);
        return Arrays.asList(bVarA.b(), a5.c.b(new g6.a(LIBRARY_NAME, "23.1.0"), g6.d.class));
    }
}
