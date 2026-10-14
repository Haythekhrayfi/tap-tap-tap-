package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12447a = new com.google.android.play.core.internal.af("SplitInstallInfoProvider");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f12448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12449c;

    public p(Context context) {
        this.f12448b = context;
        this.f12449c = context.getPackageName();
    }

    public p(Context context, String str) {
        this.f12448b = context;
        this.f12449c = str;
    }

    public static boolean a(String str) {
        return str.startsWith("config.");
    }

    public static boolean b(String str) {
        return a(str) || str.contains(".config.");
    }

    private final Set<String> d() {
        HashSet hashSet = new HashSet();
        Bundle bundleE = e();
        if (bundleE != null) {
            String string = bundleE.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f12447a.a("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = null;
        try {
            PackageInfo packageInfo = this.f12448b.getPackageManager().getPackageInfo(this.f12449c, 0);
            if (packageInfo != null) {
                strArr = packageInfo.splitNames;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            f12447a.d("App is not found in PackageManager", new Object[0]);
        }
        if (strArr != null) {
            f12447a.a("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            f12447a.a("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        n nVarA = o.a();
        if (nVarA != null) {
            hashSet.addAll(nVarA.a());
        }
        return hashSet;
    }

    private final Bundle e() {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = this.f12448b.getPackageManager().getApplicationInfo(this.f12449c, 128);
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                return bundle;
            }
            f12447a.a("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f12447a.d("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        for (String str : d()) {
            if (!b(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public final Set<String> b() {
        h hVarC = c();
        if (hVarC == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set<String> setD = d();
        setD.add("");
        Set<String> setA = a();
        setA.add("");
        for (Map.Entry<String, Set<String>> entry : hVarC.a(setA).entrySet()) {
            if (setD.containsAll(entry.getValue())) {
                hashSet.add(entry.getKey());
            }
        }
        return hashSet;
    }

    public final h c() {
        Bundle bundleE = e();
        if (bundleE == null) {
            f12447a.d("No metadata found in Context.", new Object[0]);
            return null;
        }
        int i10 = bundleE.getInt("com.android.vending.splits");
        if (i10 == 0) {
            f12447a.d("No metadata found in AndroidManifest.", new Object[0]);
            return null;
        }
        try {
            h hVarA = new az(this.f12448b.getResources().getXml(i10)).a();
            if (hVarA == null) {
                f12447a.d("Can't parse languages metadata.", new Object[0]);
            }
            return hVarA;
        } catch (Resources.NotFoundException unused) {
            f12447a.d("Resource with languages metadata doesn't exist.", new Object[0]);
            return null;
        }
    }
}
