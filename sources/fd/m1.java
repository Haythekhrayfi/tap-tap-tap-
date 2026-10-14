package fd;

/* JADX INFO: loaded from: classes3.dex */
public class m1 extends o1 implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f29594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(j1 j1Var) {
        super(true);
        boolean z10 = true;
        h0(j1Var);
        o oVarD0 = d0();
        p pVar = oVarD0 instanceof p ? (p) oVarD0 : null;
        if (pVar != null) {
            do {
                o1 o1VarX = pVar.x();
                if (!o1VarX.Z()) {
                    o oVarD1 = o1VarX.d0();
                    pVar = oVarD1 instanceof p ? (p) oVarD1 : null;
                }
            } while (pVar != null);
            z10 = false;
        } else {
            z10 = false;
        }
        this.f29594d = z10;
    }

    @Override // fd.o1
    public boolean Z() {
        return this.f29594d;
    }

    @Override // fd.o1
    public boolean a0() {
        return true;
    }
}
