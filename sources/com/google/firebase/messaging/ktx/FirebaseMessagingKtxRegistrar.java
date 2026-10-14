package com.google.firebase.messaging.ktx;

import a5.c;
import com.google.firebase.components.ComponentRegistrar;
import g6.a;
import g6.d;
import java.util.List;
import kc.k;

/* JADX INFO: loaded from: classes2.dex */
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return k.a(c.b(new a("fire-fcm-ktx", "23.1.0"), d.class));
    }
}
