package com.yandex.metrica.impl.ob;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class Am extends zo {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f13666c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f13667b;

    public Am(String str) {
        super(false);
        StringBuilder sbA = defpackage.a.a("[");
        sbA.append(U2.a(str));
        sbA.append("] ");
        this.f13667b = sbA.toString();
    }

    public static void a(Context context) {
        StringBuilder sbA = defpackage.a.a("[");
        sbA.append(context.getPackageName());
        sbA.append("] : ");
        f13666c = sbA.toString();
    }

    @Override // com.yandex.metrica.impl.ob.zo
    public String a() {
        String str = f13666c;
        int i10 = O2.f14603a;
        if (str == null) {
            str = "";
        }
        String str2 = this.f13667b;
        return i.f.a(str, str2 != null ? str2 : "");
    }
}
