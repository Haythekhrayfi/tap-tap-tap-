package ka;

import android.os.Bundle;
import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f31963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f31964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<a> f31965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Pair<String, a>> f31966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<c> f31967f;

    public b(String str) {
        this.f31964c = new Bundle();
        this.f31965d = new ArrayList();
        this.f31966e = new ArrayList();
        this.f31967f = new ArrayList();
        this.f31962a = str;
        this.f31963b = true;
    }

    public b(String str, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        this.f31964c = bundle2;
        this.f31965d = new ArrayList();
        this.f31966e = new ArrayList();
        this.f31967f = new ArrayList();
        this.f31962a = str;
        this.f31963b = true;
        bundle2.putAll(bundle);
    }

    public b(String str, boolean z10) {
        this.f31964c = new Bundle();
        this.f31965d = new ArrayList();
        this.f31966e = new ArrayList();
        this.f31967f = new ArrayList();
        this.f31962a = str;
        this.f31963b = z10;
    }

    public b(b bVar) {
        Bundle bundle = new Bundle();
        this.f31964c = bundle;
        ArrayList arrayList = new ArrayList();
        this.f31965d = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f31966e = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.f31967f = arrayList3;
        this.f31962a = bVar.f31962a;
        this.f31963b = bVar.f31963b;
        bundle.putAll(bVar.f31964c);
        arrayList.addAll(bVar.f31965d);
        arrayList2.addAll(bVar.f31966e);
        arrayList3.addAll(bVar.f31967f);
    }

    public b a(String str, int i10) {
        this.f31965d.add(new a(this.f31962a, str, i10));
        return this;
    }

    public <T> b b(String str, T t10) {
        this.f31964c.putString(str, String.valueOf(t10));
        return this;
    }

    public b c(String str, String str2) {
        this.f31964c.putString(str, String.valueOf(str2));
        return this;
    }
}
