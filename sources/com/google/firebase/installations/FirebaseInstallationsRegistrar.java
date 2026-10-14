package com.google.firebase.installations;

import a5.l;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import v5.f;
import v5.g;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ y5.b lambda$getComponents$0(a5.d dVar) {
        return new b((u4.d) dVar.a(u4.d.class), dVar.b(g.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a5.c<?>> getComponents() {
        a5.c.b bVarA = a5.c.a(y5.b.class);
        bVarA.f86a = LIBRARY_NAME;
        bVarA.a(new l(u4.d.class, 1, 0));
        bVarA.a(new l(g.class, 0, 1));
        bVarA.c(o5.a.f33962c);
        return Arrays.asList(bVarA.b(), a5.c.b(new f(), v5.e.class), a5.c.b(new g6.a(LIBRARY_NAME, "17.1.0"), g6.d.class));
    }
}
