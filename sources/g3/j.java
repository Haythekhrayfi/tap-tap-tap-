package g3;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<DataType> f29854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<? extends com.bumptech.glide.load.e<DataType, ResourceType>> f29855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t3.e<ResourceType, Transcode> f29856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0.e<List<Throwable>> f29857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f29858e;

    public interface a<ResourceType> {
    }

    public j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.e<DataType, ResourceType>> list, t3.e<ResourceType, Transcode> eVar, o0.e<List<Throwable>> eVar2) {
        this.f29854a = cls;
        this.f29855b = list;
        this.f29856c = eVar;
        this.f29857d = eVar2;
        StringBuilder sbA = defpackage.a.a("Failed DecodePath{");
        sbA.append(cls.getSimpleName());
        sbA.append("->");
        sbA.append(cls2.getSimpleName());
        sbA.append("->");
        sbA.append(cls3.getSimpleName());
        sbA.append("}");
        this.f29858e = sbA.toString();
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
    public u<Transcode> a(e3.e<DataType> eVar, int i10, int i11, d3.e eVar2, a<ResourceType> aVar) throws q {
        u<ResourceType> uVarB;
        d3.g gVar;
        com.bumptech.glide.load.c cVarA;
        d3.c eVar3;
        List<Throwable> listB = this.f29857d.b();
        Objects.requireNonNull(listB, "Argument must not be null");
        List<Throwable> list = listB;
        try {
            u<ResourceType> uVarB2 = b(eVar, i10, i11, eVar2, list);
            this.f29857d.a(list);
            i.c cVar = (i.c) aVar;
            i iVar = i.this;
            com.bumptech.glide.load.a aVar2 = cVar.f29846a;
            Objects.requireNonNull(iVar);
            Class<?> cls = uVarB2.get().getClass();
            d3.f fVarA = null;
            if (aVar2 != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
                d3.g gVarF = iVar.f29819c.f(cls);
                gVar = gVarF;
                uVarB = gVarF.b(iVar.f29826j, uVarB2, iVar.f29830n, iVar.f29831o);
            } else {
                uVarB = uVarB2;
                gVar = null;
            }
            if (!uVarB2.equals(uVarB)) {
                uVarB2.a();
            }
            boolean z10 = false;
            if (iVar.f29819c.f29803c.f38b.f49d.a(uVarB.b()) != null) {
                fVarA = iVar.f29819c.f29803c.f38b.f49d.a(uVarB.b());
                if (fVarA == null) {
                    throw new a3.h.d(uVarB.b());
                }
                cVarA = fVarA.a(iVar.f29833q);
            } else {
                cVarA = com.bumptech.glide.load.c.NONE;
            }
            d3.f fVar = fVarA;
            h<R> hVar = iVar.f29819c;
            d3.c cVar2 = iVar.f29842z;
            List<l3.n.a<?>> listC = hVar.c();
            int size = listC.size();
            for (int i12 = 0; i12 < size; i12++) {
                if (listC.get(i12).f32166a.equals(cVar2)) {
                    z10 = true;
                    break;
                }
            }
            Object obj = uVarB;
            if (iVar.f29832p.d(!z10, aVar2, cVarA)) {
                if (fVar == null) {
                    throw new a3.h.d(uVarB.get().getClass());
                }
                int i13 = i.a.f29845c[cVarA.ordinal()];
                if (i13 == 1) {
                    eVar3 = new e(iVar.f29842z, iVar.f29827k);
                } else {
                    if (i13 != 2) {
                        throw new IllegalArgumentException("Unknown strategy: " + cVarA);
                    }
                    eVar3 = new w(iVar.f29819c.f29803c.f37a, iVar.f29842z, iVar.f29827k, iVar.f29830n, iVar.f29831o, gVar, cls, iVar.f29833q);
                }
                t<Z> tVarC = t.c(uVarB);
                i.d<?> dVar = iVar.f29824h;
                dVar.f29848a = eVar3;
                dVar.f29849b = fVar;
                dVar.f29850c = tVarC;
                obj = tVarC;
            }
            return this.f29856c.a(obj, eVar2);
        } catch (Throwable th) {
            this.f29857d.a(list);
            throw th;
        }
    }

    public final u<ResourceType> b(e3.e<DataType> eVar, int i10, int i11, d3.e eVar2, List<Throwable> list) throws q {
        int size = this.f29855b.size();
        u<ResourceType> uVarA = null;
        for (int i12 = 0; i12 < size; i12++) {
            com.bumptech.glide.load.e<DataType, ResourceType> eVar3 = this.f29855b.get(i12);
            try {
                if (eVar3.b(eVar.a(), eVar2)) {
                    uVarA = eVar3.a(eVar.a(), i10, i11, eVar2);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + eVar3, e10);
                }
                list.add(e10);
            }
            if (uVarA != null) {
                break;
            }
        }
        if (uVarA != null) {
            return uVarA;
        }
        throw new q(this.f29858e, new ArrayList(list));
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("DecodePath{ dataClass=");
        sbA.append(this.f29854a);
        sbA.append(", decoders=");
        sbA.append(this.f29855b);
        sbA.append(", transcoder=");
        sbA.append(this.f29856c);
        sbA.append('}');
        return sbA.toString();
    }
}
