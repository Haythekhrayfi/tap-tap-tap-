package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f14656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final G9 f14657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f14658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Wn f14659d;

    public P(Context context, G9 g10) {
        this(context, g10, context.getPackageName(), new Wn());
    }

    public P(Context context, G9 g10, String str, Wn wn) {
        this.f14656a = context;
        this.f14657b = g10;
        this.f14658c = str;
        this.f14659d = wn;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public List<String> a() {
        Signature[] apkContentsSigners;
        String strReplaceAll;
        List<String> listG = this.f14657b.g();
        boolean zIsEmpty = listG.isEmpty();
        List<String> list = listG;
        if (zIsEmpty) {
            ArrayList arrayList = new ArrayList();
            try {
                if (U2.a(28)) {
                    SigningInfo signingInfo = this.f14659d.b(this.f14656a, this.f14658c, 134217728).signingInfo;
                    apkContentsSigners = signingInfo.hasMultipleSigners() ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
                } else {
                    apkContentsSigners = this.f14659d.b(this.f14656a, this.f14658c, 64).signatures;
                }
                if (apkContentsSigners != null) {
                    for (Signature signature : apkContentsSigners) {
                        try {
                            strReplaceAll = O2.a(MessageDigest.getInstance("SHA1").digest(signature.toByteArray())).toUpperCase(Locale.US).replaceAll("(.{2})(?=.+)", "$1:");
                        } catch (Throwable unused) {
                            strReplaceAll = null;
                        }
                        if (strReplaceAll != null) {
                            arrayList.add(strReplaceAll);
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            Collections.sort(arrayList);
            boolean zIsEmpty2 = arrayList.isEmpty();
            list = arrayList;
            if (!zIsEmpty2) {
                this.f14657b.a(arrayList).c();
                list = arrayList;
            }
        }
        return list;
    }
}
