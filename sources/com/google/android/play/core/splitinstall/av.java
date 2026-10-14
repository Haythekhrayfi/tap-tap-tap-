package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.internal.bu;
import com.google.android.play.core.internal.by;
import com.google.android.play.core.tasks.Task;
import com.google.android.play.core.tasks.Tasks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class av {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.android.play.core.internal.af f12413b = new com.google.android.play.core.internal.af("SplitInstallService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Intent f12414c = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.google.android.play.core.internal.ap<bu> f12415a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f12416d;

    public av(Context context) {
        this.f12416d = context.getPackageName();
        if (by.a(context)) {
            this.f12415a = new com.google.android.play.core.internal.ap<>(com.google.android.play.core.splitcompat.p.a(context), f12413b, "SplitInstallService", f12414c, ad.f12386a);
        }
    }

    public static /* synthetic */ ArrayList a(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("module_name", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static /* synthetic */ Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10800);
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList b(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        int size = collection.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) collection.get(i10);
            Bundle bundle = new Bundle();
            bundle.putString("language", str);
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private static <T> Task<T> d() {
        f12413b.b("onError(%d)", -14);
        return Tasks.a((Exception) new SplitInstallException(-14));
    }

    public final Task<List<SplitInstallSessionState>> a() {
        if (this.f12415a == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12413b, "getSessionStates", new Object[0]);
        this.f12415a.a(new ak(this, iVarA, iVarA));
        return iVarA.a();
    }

    public final Task<SplitInstallSessionState> a(int i10) {
        if (this.f12415a == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12413b, "getSessionState(%d)", new Object[]{Integer.valueOf(i10)});
        this.f12415a.a(new aj(this, iVarA, i10, iVarA));
        return iVarA.a();
    }

    public final Task<Integer> a(Collection<String> collection, Collection<String> collection2) {
        if (this.f12415a == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12413b, "startInstall(%s,%s)", new Object[]{collection, collection2});
        this.f12415a.a(new ae(this, iVarA, collection, collection2, iVarA));
        return iVarA.a();
    }

    public final Task<Void> a(List<String> list) {
        if (this.f12415a == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12413b, "deferredUninstall(%s)", new Object[]{list});
        this.f12415a.a(new af(this, iVarA, list, iVarA));
        return iVarA.a();
    }

    public final Task<Void> b(int i10) {
        if (this.f12415a == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12413b, "cancelInstall(%d)", new Object[]{Integer.valueOf(i10)});
        this.f12415a.a(new al(this, iVarA, i10, iVarA));
        return iVarA.a();
    }

    public final Task<Void> b(List<String> list) {
        if (this.f12415a == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12413b, "deferredInstall(%s)", new Object[]{list});
        this.f12415a.a(new ag(this, iVarA, list, iVarA));
        return iVarA.a();
    }

    public final Task<Void> c(List<String> list) {
        if (this.f12415a == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12413b, "deferredLanguageInstall(%s)", new Object[]{list});
        this.f12415a.a(new ah(this, iVarA, list, iVarA));
        return iVarA.a();
    }

    public final Task<Void> d(List<String> list) {
        if (this.f12415a == null) {
            return d();
        }
        com.google.android.play.core.tasks.i iVarA = com.google.android.play.core.appupdate.z.a(f12413b, "deferredLanguageUninstall(%s)", new Object[]{list});
        this.f12415a.a(new ai(this, iVarA, list, iVarA));
        return iVarA.a();
    }
}
