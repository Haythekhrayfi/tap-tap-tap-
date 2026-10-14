package androidx.fragment.app;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2009e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2010f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f2011g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2013i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2014j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f2015k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2016l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f2017m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList<String> f2018n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList<String> f2019o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<a> f2005a = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2012h = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2020p = false;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2021a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Fragment f2022b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2023c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f2027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.lifecycle.i.c f2028h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public androidx.lifecycle.i.c f2029i;

        public a() {
        }

        public a(int i10, Fragment fragment) {
            this.f2021a = i10;
            this.f2022b = fragment;
            this.f2023c = false;
            androidx.lifecycle.i.c cVar = androidx.lifecycle.i.c.RESUMED;
            this.f2028h = cVar;
            this.f2029i = cVar;
        }

        public a(int i10, Fragment fragment, androidx.lifecycle.i.c cVar) {
            this.f2021a = i10;
            this.f2022b = fragment;
            this.f2023c = false;
            this.f2028h = fragment.mMaxState;
            this.f2029i = cVar;
        }

        public a(int i10, Fragment fragment, boolean z10) {
            this.f2021a = i10;
            this.f2022b = fragment;
            this.f2023c = z10;
            androidx.lifecycle.i.c cVar = androidx.lifecycle.i.c.RESUMED;
            this.f2028h = cVar;
            this.f2029i = cVar;
        }
    }

    @Deprecated
    public e0() {
    }

    public e0(r rVar, ClassLoader classLoader) {
    }

    public void b(a aVar) {
        this.f2005a.add(aVar);
        aVar.f2024d = this.f2006b;
        aVar.f2025e = this.f2007c;
        aVar.f2026f = this.f2008d;
        aVar.f2027g = this.f2009e;
    }

    public abstract int c();

    public abstract void d();

    public void e(int i10, Fragment fragment, String str, int i11) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            b1.b.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sbA = defpackage.a.a("Fragment ");
            sbA.append(cls.getCanonicalName());
            sbA.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sbA.toString());
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                throw new IllegalStateException(d0.a(sb2, fragment.mTag, " now ", str));
            }
            fragment.mTag = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i12 = fragment.mFragmentId;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i10);
            }
            fragment.mFragmentId = i10;
            fragment.mContainerId = i10;
        }
        b(new a(i11, fragment));
    }

    public e0 f(Fragment fragment) {
        b(new a(3, fragment));
        return this;
    }

    public e0 g(int i10, Fragment fragment) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        e(i10, fragment, null, 2);
        return this;
    }

    public e0 h(Fragment fragment, androidx.lifecycle.i.c cVar) {
        b(new a(10, fragment, cVar));
        return this;
    }
}
