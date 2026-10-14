package com.google.firebase.crashlytics;

import a5.c;
import a5.l;
import b5.d;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        c.b bVarA = c.a(d.class);
        bVarA.f86a = "fire-cls";
        bVarA.a(new l(u4.d.class, 1, 0));
        bVarA.a(new l(y5.b.class, 1, 0));
        bVarA.a(new l(c5.a.class, 0, 2));
        bVarA.a(new l(y4.a.class, 0, 2));
        bVarA.f91f = new a5.b(this);
        bVarA.d(2);
        return Arrays.asList(bVarA.b(), c.b(new g6.a("fire-cls", "18.3.1"), g6.d.class));
    }
}
