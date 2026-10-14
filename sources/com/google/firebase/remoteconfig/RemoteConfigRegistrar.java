package com.google.firebase.remoteconfig;

import a5.d;
import a5.l;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import h6.j;
import java.util.Arrays;
import java.util.List;
import v4.c;
import y5.b;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static j lambda$getComponents$0(d dVar) {
        c cVar;
        Context context = (Context) dVar.a(Context.class);
        u4.d dVar2 = (u4.d) dVar.a(u4.d.class);
        b bVar = (b) dVar.a(b.class);
        w4.a aVar = (w4.a) dVar.a(w4.a.class);
        synchronized (aVar) {
            if (!aVar.f37106a.containsKey("frc")) {
                aVar.f37106a.put("frc", new c(aVar.f37107b, aVar.f37108c, "frc"));
            }
            cVar = aVar.f37106a.get("frc");
        }
        return new j(context, dVar2, bVar, cVar, dVar.b(y4.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a5.c<?>> getComponents() {
        a5.c.b bVarA = a5.c.a(j.class);
        bVarA.f86a = LIBRARY_NAME;
        bVarA.a(new l(Context.class, 1, 0));
        bVarA.a(new l(u4.d.class, 1, 0));
        bVarA.a(new l(b.class, 1, 0));
        bVarA.a(new l(w4.a.class, 1, 0));
        bVarA.a(new l(y4.a.class, 0, 1));
        bVarA.c(o5.a.f33965f);
        bVarA.d(2);
        return Arrays.asList(bVarA.b(), a5.c.b(new g6.a(LIBRARY_NAME, "21.2.0"), g6.d.class));
    }
}
