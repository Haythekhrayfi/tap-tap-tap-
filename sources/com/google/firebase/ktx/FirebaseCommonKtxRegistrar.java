package com.google.firebase.ktx;

import a5.c;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import g6.a;
import g6.d;
import java.util.List;
import kc.k;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        return k.a(c.b(new a("fire-core-ktx", "20.2.0"), d.class));
    }
}
