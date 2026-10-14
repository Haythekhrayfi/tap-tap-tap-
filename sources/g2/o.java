package g2;

/* JADX INFO: loaded from: classes.dex */
public final class o implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.g f29735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.b<m> f29736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.g f29737c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1.g f29738d;

    public class a extends j1.b<m> {
        public a(o oVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j1.b
        public void d(n1.g gVar, m mVar) throws Throwable {
            m mVar2 = mVar;
            String str = mVar2.f29733a;
            if (str == null) {
                ((o1.e) gVar).f33885c.bindNull(1);
            } else {
                ((o1.e) gVar).f33885c.bindString(1, str);
            }
            byte[] bArrC = androidx.work.c.c(mVar2.f29734b);
            o1.e eVar = (o1.e) gVar;
            if (bArrC == null) {
                eVar.f33885c.bindNull(2);
            } else {
                eVar.f33885c.bindBlob(2, bArrC);
            }
        }
    }

    public class b extends j1.g {
        public b(o oVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    public class c extends j1.g {
        public c(o oVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(androidx.room.g gVar) {
        this.f29735a = gVar;
        this.f29736b = new a(this, gVar);
        this.f29737c = new b(this, gVar);
        this.f29738d = new c(this, gVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public void a(String str) {
        this.f29735a.b();
        n1.g gVarA = this.f29737c.a();
        if (str == null) {
            ((o1.e) gVarA).f33885c.bindNull(1);
        } else {
            ((o1.e) gVarA).f33885c.bindString(1, str);
        }
        this.f29735a.c();
        try {
            o1.f fVar = (o1.f) gVarA;
            fVar.a();
            this.f29735a.p();
            this.f29735a.g();
            this.f29737c.c(fVar);
        } catch (Throwable th) {
            this.f29735a.g();
            this.f29737c.c(gVarA);
            throw th;
        }
    }

    public void b() {
        this.f29735a.b();
        n1.g gVarA = this.f29738d.a();
        this.f29735a.c();
        try {
            o1.f fVar = (o1.f) gVarA;
            fVar.a();
            this.f29735a.p();
            this.f29735a.g();
            this.f29738d.c(fVar);
        } catch (Throwable th) {
            this.f29735a.g();
            this.f29738d.c(gVarA);
            throw th;
        }
    }
}
