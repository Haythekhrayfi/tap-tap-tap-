package com.google.firebase;

import a5.c;
import a5.l;
import android.content.Context;
import android.os.Build;
import com.applovin.exoplayer2.a.p;
import com.applovin.exoplayer2.b.z;
import com.google.firebase.components.ComponentRegistrar;
import g6.d;
import g6.f;
import g6.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;
import o5.a;
import v5.e;
import v5.h;
import w4.b;

/* JADX INFO: loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        c.b bVarA = c.a(g.class);
        bVarA.a(new l(d.class, 2, 0));
        bVarA.c(a.f33964e);
        arrayList.add(bVarA.b());
        int i10 = v5.d.f36685f;
        String string = null;
        c.b bVar = new c.b(v5.d.class, new Class[]{v5.g.class, h.class}, null);
        bVar.a(new l(Context.class, 1, 0));
        bVar.a(new l(u4.d.class, 1, 0));
        bVar.a(new l(e.class, 2, 0));
        bVar.a(new l(g.class, 1, 1));
        bVar.c(b.f37110c);
        arrayList.add(bVar.b());
        arrayList.add(c.b(new g6.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)), d.class));
        arrayList.add(c.b(new g6.a("fire-core", "20.2.0"), d.class));
        arrayList.add(c.b(new g6.a("device-name", a(Build.PRODUCT)), d.class));
        arrayList.add(c.b(new g6.a("device-model", a(Build.DEVICE)), d.class));
        arrayList.add(c.b(new g6.a("device-brand", a(Build.BRAND)), d.class));
        arrayList.add(f.a("android-target-sdk", p.E));
        arrayList.add(f.a("android-min-sdk", z.f4663s));
        arrayList.add(f.a("android-platform", p.F));
        arrayList.add(f.a("android-installer", z.f4664t));
        try {
            string = KotlinVersion.CURRENT.toString();
        } catch (NoClassDefFoundError unused) {
        }
        if (string != null) {
            arrayList.add(c.b(new g6.a("kotlin", string), d.class));
        }
        return arrayList;
    }
}
