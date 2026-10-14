package d7;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends vc.l implements uc.l<r6.c, Boolean> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f28838c = new s();

    public s() {
        super(1);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0030  */
    @Override // uc.l
    public Boolean invoke(r6.c cVar) {
        boolean z10;
        boolean z11;
        r6.c cVar2 = cVar;
        fd.j0.i(cVar2, "it");
        if (cVar2.d() != 1) {
            com.inscode.autoclicker.utils.b[] bVarArrValues = com.inscode.autoclicker.utils.b.values();
            int length = bVarArrValues.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z11 = false;
                    break;
                }
                if (bVarArrValues[i10].getType() == cVar2.d()) {
                    z11 = true;
                    break;
                }
                i10++;
            }
            z10 = z11;
        }
        return Boolean.valueOf(z10);
    }
}
