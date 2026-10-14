package i3;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f31223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31224c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b3.a f31226e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f31225d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f31222a = new j();

    @Deprecated
    public e(File file, long j10) {
        this.f31223b = file;
        this.f31224c = j10;
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
    @Override // i3.a
    public void a(d3.c cVar, a.b bVar) {
        c.a aVarPoll;
        String strA = this.f31222a.a(cVar);
        c cVar2 = this.f31225d;
        synchronized (cVar2) {
            aVarPoll = cVar2.f31212a.get(strA);
            if (aVarPoll == null) {
                c.b bVar2 = cVar2.f31213b;
                synchronized (bVar2.f31216a) {
                    aVarPoll = bVar2.f31216a.poll();
                }
                if (aVarPoll == null) {
                    aVarPoll = new c.a();
                }
                cVar2.f31212a.put(strA, aVarPoll);
            }
            aVarPoll.f31215b++;
        }
        aVarPoll.f31214a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strA + " for for Key: " + cVar);
            }
            try {
                b3.a aVarC = c();
                if (aVarC.g(strA) == null) {
                    b3.a.c cVarE = aVarC.e(strA);
                    if (cVarE == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strA);
                    }
                    try {
                        g3.f fVar = (g3.f) bVar;
                        if (fVar.f29798a.b(fVar.f29799b, cVarE.b(0), fVar.f29800c)) {
                            b3.a.a(b3.a.this, cVarE, true);
                            cVarE.f3265c = true;
                        }
                        if (!cVarE.f3265c) {
                            try {
                                cVarE.a();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!cVarE.f3265c) {
                            try {
                                cVarE.a();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
            this.f31225d.a(strA);
        } catch (Throwable th2) {
            this.f31225d.a(strA);
            throw th2;
        }
    }

    @Override // i3.a
    public File b(d3.c cVar) {
        String strA = this.f31222a.a(cVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strA + " for for Key: " + cVar);
        }
        try {
            b3.a.e eVarG = c().g(strA);
            if (eVarG != null) {
                return eVarG.f3275a[0];
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    public final synchronized b3.a c() throws IOException {
        if (this.f31226e == null) {
            this.f31226e = b3.a.i(this.f31223b, 1, 1, this.f31224c);
        }
        return this.f31226e;
    }
}
