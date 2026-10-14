package com.google.firebase.abt.component;

import a5.c;
import a5.d;
import a5.l;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import w4.a;
import w4.b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.b(y4.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        c.b bVarA = c.a(a.class);
        bVarA.a(new l(Context.class, 1, 0));
        bVarA.a(new l(y4.a.class, 0, 1));
        bVarA.c(b.f37109b);
        return Arrays.asList(bVarA.b(), c.b(new g6.a("fire-abt", "21.0.2"), g6.d.class));
    }
}
