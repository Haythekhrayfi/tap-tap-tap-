package f1;

import android.os.Bundle;
import android.os.Looper;
import androidx.activity.l;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.l0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import androidx.lifecycle.w;
import i.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Objects;
import q.i;

/* JADX INFO: loaded from: classes.dex */
public class b extends f1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f29193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f29194b;

    public static class a<D> extends v<D> implements g1.b.InterfaceC0264b<D> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f29195l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Bundle f29196m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final g1.b<D> f29197n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public p f29198o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public C0254b<D> f29199p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public g1.b<D> f29200q;

        public a(int i10, Bundle bundle, g1.b<D> bVar, g1.b<D> bVar2) {
            this.f29195l = i10;
            this.f29196m = bundle;
            this.f29197n = bVar;
            this.f29200q = bVar2;
            bVar.registerListener(i10, this);
        }

        @Override // androidx.lifecycle.LiveData
        public void f() {
            this.f29197n.startLoading();
        }

        @Override // androidx.lifecycle.LiveData
        public void g() {
            this.f29197n.stopLoading();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void h(w<? super D> wVar) {
            super.h(wVar);
            this.f29198o = null;
            this.f29199p = null;
        }

        @Override // androidx.lifecycle.v, androidx.lifecycle.LiveData
        public void i(D d10) {
            super.i(d10);
            g1.b<D> bVar = this.f29200q;
            if (bVar != null) {
                bVar.reset();
                this.f29200q = null;
            }
        }

        public g1.b<D> k(boolean z10) {
            this.f29197n.cancelLoad();
            this.f29197n.abandon();
            C0254b<D> c0254b = this.f29199p;
            if (c0254b != null) {
                super.h(c0254b);
                this.f29198o = null;
                this.f29199p = null;
                if (z10 && c0254b.f29203c) {
                    c0254b.f29202b.onLoaderReset(c0254b.f29201a);
                }
            }
            this.f29197n.unregisterListener(this);
            if ((c0254b == null || c0254b.f29203c) && !z10) {
                return this.f29197n;
            }
            this.f29197n.reset();
            return this.f29200q;
        }

        public void l() {
            p pVar = this.f29198o;
            C0254b<D> c0254b = this.f29199p;
            if (pVar == null || c0254b == null) {
                return;
            }
            super.h(c0254b);
            d(pVar, c0254b);
        }

        public void m(g1.b<D> bVar, D d10) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                j(d10);
                return;
            }
            super.i(d10);
            g1.b<D> bVar2 = this.f29200q;
            if (bVar2 != null) {
                bVar2.reset();
                this.f29200q = null;
            }
        }

        public g1.b<D> n(p pVar, f1.a.InterfaceC0253a<D> interfaceC0253a) {
            C0254b<D> c0254b = new C0254b<>(this.f29197n, interfaceC0253a);
            d(pVar, c0254b);
            C0254b<D> c0254b2 = this.f29199p;
            if (c0254b2 != null) {
                h(c0254b2);
            }
            this.f29198o = pVar;
            this.f29199p = c0254b;
            return this.f29197n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f29195l);
            sb2.append(" : ");
            l.a(this.f29197n, sb2);
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: f1.b$b, reason: collision with other inner class name */
    public static class C0254b<D> implements w<D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g1.b<D> f29201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f1.a.InterfaceC0253a<D> f29202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29203c = false;

        public C0254b(g1.b<D> bVar, f1.a.InterfaceC0253a<D> interfaceC0253a) {
            this.f29201a = bVar;
            this.f29202b = interfaceC0253a;
        }

        @Override // androidx.lifecycle.w
        public void a(D d10) {
            this.f29202b.onLoadFinished(this.f29201a, d10);
            this.f29203c = true;
        }

        public String toString() {
            return this.f29202b.toString();
        }
    }

    public static class c extends l0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m0.b f29204c = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public i<a> f29205a = new i<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f29206b = false;

        public static class a implements m0.b {
            @Override // androidx.lifecycle.m0.b
            public <T extends l0> T a(Class<T> cls) {
                return new c();
            }
        }

        @Override // androidx.lifecycle.l0
        public void onCleared() {
            super.onCleared();
            int i10 = this.f29205a.f34741e;
            for (int i11 = 0; i11 < i10; i11++) {
                ((a) this.f29205a.f34740d[i11]).k(true);
            }
            i<a> iVar = this.f29205a;
            int i12 = iVar.f34741e;
            Object[] objArr = iVar.f34740d;
            for (int i13 = 0; i13 < i12; i13++) {
                objArr[i13] = null;
            }
            iVar.f34741e = 0;
        }
    }

    public b(p pVar, n0 n0Var) {
        this.f29193a = pVar;
        this.f29194b = (c) new m0(n0Var, c.f29204c).a(c.class);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // f1.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        c cVar = this.f29194b;
        if (cVar.f29205a.f34741e <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            i<a> iVar = cVar.f29205a;
            if (i10 >= iVar.f34741e) {
                return;
            }
            a aVar = (a) iVar.f34740d[i10];
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f29205a.f34739c[i10]);
            printWriter.print(": ");
            printWriter.println(aVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(aVar.f29195l);
            printWriter.print(" mArgs=");
            printWriter.println(aVar.f29196m);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(aVar.f29197n);
            aVar.f29197n.dump(f.a(str2, "  "), fileDescriptor, printWriter, strArr);
            if (aVar.f29199p != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(aVar.f29199p);
                C0254b<D> c0254b = aVar.f29199p;
                Objects.requireNonNull(c0254b);
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(c0254b.f29203c);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            g1.b<D> bVar = aVar.f29197n;
            Object obj = aVar.f2141e;
            if (obj == LiveData.f2136k) {
                obj = null;
            }
            printWriter.println(bVar.dataToString(obj));
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(aVar.f2139c > 0);
            i10++;
        }
    }

    @Override // f1.a
    public <D> g1.b<D> c(int i10, Bundle bundle, f1.a.InterfaceC0253a<D> interfaceC0253a) {
        if (this.f29194b.f29206b) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        a aVarE = this.f29194b.f29205a.e(i10, null);
        if (aVarE != null) {
            return aVarE.n(this.f29193a, interfaceC0253a);
        }
        try {
            this.f29194b.f29206b = true;
            g1.b<D> bVarOnCreateLoader = interfaceC0253a.onCreateLoader(i10, null);
            if (bVarOnCreateLoader == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (bVarOnCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(bVarOnCreateLoader.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + bVarOnCreateLoader);
            }
            a aVar = new a(i10, null, bVarOnCreateLoader, null);
            this.f29194b.f29205a.g(i10, aVar);
            this.f29194b.f29206b = false;
            return aVar.n(this.f29193a, interfaceC0253a);
        } catch (Throwable th) {
            this.f29194b.f29206b = false;
            throw th;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        l.a(this.f29193a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
