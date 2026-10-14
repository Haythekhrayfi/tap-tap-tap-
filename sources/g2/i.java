package g2;

import android.database.Cursor;

/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.room.g f29726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1.b<g> f29727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j1.g f29728c;

    public class a extends j1.b<g> {
        public a(i iVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j1.b
        public void d(n1.g gVar, g gVar2) {
            g gVar3 = gVar2;
            String str = gVar3.f29724a;
            if (str == null) {
                ((o1.e) gVar).f33885c.bindNull(1);
            } else {
                ((o1.e) gVar).f33885c.bindString(1, str);
            }
            ((o1.e) gVar).f33885c.bindLong(2, gVar3.f29725b);
        }
    }

    public class b extends j1.g {
        public b(i iVar, androidx.room.g gVar) {
            super(gVar);
        }

        @Override // j1.g
        public String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(androidx.room.g gVar) {
        this.f29726a = gVar;
        this.f29727b = new a(this, gVar);
        this.f29728c = new b(this, gVar);
    }

    public g a(String str) {
        j1.f fVarC = j1.f.c("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            fVarC.g(1);
        } else {
            fVarC.h(1, str);
        }
        this.f29726a.b();
        Cursor cursorC = l1.b.c(this.f29726a, fVarC, false, null);
        try {
            return cursorC.moveToFirst() ? new g(cursorC.getString(androidx.activity.i.k(cursorC, "work_spec_id")), cursorC.getInt(androidx.activity.i.k(cursorC, "system_id"))) : null;
        } finally {
            cursorC.close();
            fVarC.release();
        }
    }

    public void b(g gVar) {
        this.f29726a.b();
        this.f29726a.c();
        try {
            this.f29727b.e(gVar);
            this.f29726a.p();
        } finally {
            this.f29726a.g();
        }
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
    public void c(String str) {
        this.f29726a.b();
        n1.g gVarA = this.f29728c.a();
        if (str == null) {
            ((o1.e) gVarA).f33885c.bindNull(1);
        } else {
            ((o1.e) gVarA).f33885c.bindString(1, str);
        }
        this.f29726a.c();
        try {
            o1.f fVar = (o1.f) gVarA;
            fVar.a();
            this.f29726a.p();
            this.f29726a.g();
            this.f29728c.c(fVar);
        } catch (Throwable th) {
            this.f29726a.g();
            this.f29728c.c(gVarA);
            throw th;
        }
    }
}
